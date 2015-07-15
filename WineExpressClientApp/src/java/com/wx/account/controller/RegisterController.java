/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.controller;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.wx.account.model.RegisterFormBean;
import com.wx.account.service.AccountInfoDTO;
import com.wx.account.service.AccountStateDTO;
import com.wx.account.utility.AccountHostCall;
import java.util.Calendar;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Hao
 */
@ManagedBean
@RequestScoped
public class RegisterController {

    @ManagedProperty("#{registerFormBean}")
    private RegisterFormBean registerFormBean;

    /**
     * Creates a new instance of RegisterController
     */
    public RegisterController() {
    }

    public void setRegisterFormBean(RegisterFormBean registerFormBean) {
        this.registerFormBean = registerFormBean;
    }

    public void register(ActionEvent e) {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setActivated(false);
        Calendar calender = Calendar.getInstance();
        calender.set(1988, 8, 24);
        Date birthday = registerFormBean.getBirthday();
        XMLGregorianCalendar birthday_;
        birthday_ = new XMLGregorianCalendarImpl();
        birthday_.setMillisecond((int) birthday.getTime());

        accountInfoDTO.setBirthday(birthday_);
        accountInfoDTO.setEmail(registerFormBean.getEmail());
        accountInfoDTO.setSex(registerFormBean.getSex());
        accountInfoDTO.setState(com.wx.account.service.UserState.MEMBER);
        accountInfoDTO.setPassword(registerFormBean.getPassword());

        AccountStateDTO accountStateDTO = AccountHostCall.callRegisterService(accountInfoDTO);
        FacesContext context = FacesContext.getCurrentInstance();
        if (accountStateDTO.isRegisterSuccessed() == false) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, accountStateDTO.getFailCode(), accountStateDTO.getFailMassage()));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "SUCCESS", 
                    "Account register successful, activation code is already sent to your email. you need to activate your account before using it"));
        }
    }
}
