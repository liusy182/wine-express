/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.model;

import com.wx.account.service.AccountInfoDTO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Hao
 */
@ManagedBean
@SessionScoped
public class AccountInfoBean {

    /**
     * Creates a new instance of AccountInfoBean
     */
    public AccountInfoBean() {
    }

    private AccountInfoDTO accountInfoDTO;

    public AccountInfoDTO getAccountInfoDTO() {
        return accountInfoDTO;
    }

    public void setAccountInfoDTO(AccountInfoDTO accountInfoDTO) {
        this.accountInfoDTO = accountInfoDTO;
    }

    public String getEmail() {
        if (accountInfoDTO != null) {
            return accountInfoDTO.getEmail();
        } else {
            return null;
        }
    }

    public String getBirthday() {
        String SEPERATOR = "-";
        if (accountInfoDTO != null) {
            XMLGregorianCalendar birthday = accountInfoDTO.getBirthday();
            StringBuilder bdStringBuilder = new StringBuilder("");
            if (birthday != null) {
                bdStringBuilder.append(birthday.getYear()).append(SEPERATOR).append(birthday.getMonth()).append(SEPERATOR).append(birthday.getDay());
                return bdStringBuilder.toString();
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public String getSex() {
        if (accountInfoDTO != null) {
            return accountInfoDTO.getSex();
        } else {
            return null;
        }
    }

}
