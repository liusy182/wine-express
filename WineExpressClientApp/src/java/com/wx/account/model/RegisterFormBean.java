/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.account.model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@ViewScoped
public class RegisterFormBean {

    /**
     * Creates a new instance of registerFormBean
     */
    public RegisterFormBean() {
    }
    
    private String email;
    private String sex;
    private String password;
    private String passwordCfm;
    private Date birthday;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPasswordCfm() {
        return passwordCfm;
    }

    public void setPasswordCfm(String passwordCfm) {
        this.passwordCfm = passwordCfm;
    }
}
