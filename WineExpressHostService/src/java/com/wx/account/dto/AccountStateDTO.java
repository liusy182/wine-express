/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.account.dto;

import com.wx.common.enumation.UserState;
import com.wx.common.infra.BaseDTO;

/**
 *
 * @author Hao
 */
public class AccountStateDTO extends BaseDTO {
    private static final long serialVersionUID = 845062553077748976L;
    private UserState state;
    private boolean registerSuccessed;
    private boolean updateSuccessed;
    private boolean loginSuccessed;
    private boolean activationSuccessed;
    private String failCode;
    private String failMassage;

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public boolean isLoginSuccessed() {
        return loginSuccessed;
    }

    public void setLoginSuccessed(boolean loginSuccessed) {
        this.loginSuccessed = loginSuccessed;
    }

    public String getFailMassage() {
        return failMassage;
    }

    public void setFailMassage(String failMassage) {
        this.failMassage = failMassage;
    }

    public String getFailCode() {
        return failCode;
    }

    public void setFailCode(String failCode) {
        this.failCode = failCode;
    }

    public boolean isActivationSuccessed() {
        return activationSuccessed;
    }

    public void setActivationSuccessed(boolean activationSuccessed) {
        this.activationSuccessed = activationSuccessed;
    }

    public boolean isRegisterSuccessed() {
        return registerSuccessed;
    }

    public void setRegisterSuccessed(boolean registerSuccessed) {
        this.registerSuccessed = registerSuccessed;
    }

    public boolean isUpdateSuccessed() {
        return updateSuccessed;
    }

    public void setUpdateSuccessed(boolean updateSuccessed) {
        this.updateSuccessed = updateSuccessed;
    }
}
