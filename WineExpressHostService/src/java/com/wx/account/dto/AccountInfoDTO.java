/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.dto;

import com.wx.common.enumation.UserState;
import com.wx.common.infra.BaseDTO;
import java.util.Date;

/**
 *
 * @author Hao
 */
public class AccountInfoDTO extends BaseDTO {

    private static final long serialVersionUID = -17023947294478373L;
    private String email;
    private String sex;
    private Date birthday;
    private String password;
    private UserState state;
    private boolean loginSuccessed;
    private boolean activated;
    private String activationCode;

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activationSuccessed) {
        this.activated = activationSuccessed;
    }

}
