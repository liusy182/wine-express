/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.application.password.controller;

import com.wx.account.model.AccountInfoBean;
import com.wx.account.service.AccountInfoDTO;
import com.wx.account.utility.AccountHostCall;
import com.wx.application.password.model.PasswordBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Hao
 */
@ManagedBean
@RequestScoped
public class PasswordController {

    @ManagedProperty("#{accountInfoBean}")
    private AccountInfoBean accountInfoBean;

    @ManagedProperty("#{passwordBean}")
    private PasswordBean passwordBean;

    public void setAccountInfoBean(AccountInfoBean accountInfoBean) {
        this.accountInfoBean = accountInfoBean;
    }

    public void setPasswordBean(PasswordBean passwordBean) {
        this.passwordBean = passwordBean;
    }

    /**
     * Creates a new instance of PasswordChangeController
     */
    public PasswordController() {

    }

    public void changePassword(ActionEvent event) {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail(accountInfoBean.getAccountInfoDTO().getEmail());
        accountInfoDTO.setPassword(passwordBean.getNewPassword());
        boolean updateSuccessed = AccountHostCall.callUpdateAccountService(accountInfoDTO);
         FacesContext context = FacesContext.getCurrentInstance();
        if (updateSuccessed) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "FAILURE" , "Password Change fail, please check host response"));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "SUCCESS",
                    "Account register successful, activation code is already sent to your email. you need to activate your account before using it"));
        }
    }
}
