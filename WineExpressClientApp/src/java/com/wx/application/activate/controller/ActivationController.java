/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.application.activate.controller;

import com.wx.account.model.AccountInfoBean;
import com.wx.account.service.AccountInfoDTO;
import com.wx.account.service.AccountStateDTO;
import com.wx.account.utility.AccountHostCall;
import com.wx.application.activate.model.ActivationBean;
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
public class ActivationController {

    /**
     * Creates a new instance of ActivationController
     */
    @ManagedProperty("#{accountInfoBean}")
    private AccountInfoBean accountInfoBean;

    @ManagedProperty("#{activationBean}")
    private ActivationBean activationBean;

    public void setAccountInfoBean(AccountInfoBean accountInfoBean) {
        this.accountInfoBean = accountInfoBean;
    }

    public void setActivationBean(ActivationBean activationBean) {
        this.activationBean = activationBean;
    }

    public ActivationController() {
    }

    public void activateAccount(ActionEvent event) {
        AccountInfoDTO accountInfoDTO = new AccountInfoDTO();
        accountInfoDTO.setEmail(accountInfoBean.getAccountInfoDTO().getEmail());
        accountInfoDTO.setActivationCode(activationBean.getActivationCode());
        AccountStateDTO accountStateDTO = AccountHostCall.callActiveAccountService(accountInfoDTO);
        FacesContext context = FacesContext.getCurrentInstance();
        if (accountStateDTO.isActivationSuccessed() == false) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, accountStateDTO.getFailCode(), accountStateDTO.getFailMassage()));
        } else {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "SUCCESS",
                    "Activation Successful"));
        }

    }

}
