/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.application.password.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@ViewScoped
public class PasswordBean implements Serializable {
    private static final long serialVersionUID = 7384969050213846181L;

    /**
     * Creates a new instance of passwordBean
     */
    public PasswordBean() {
    }

    private String oldPassword;
    private String newPassword;
    private String confirmNewpassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmNewpassword() {
        return confirmNewpassword;
    }

    public void setConfirmNewpassword(String confirmNewpassword) {
        this.confirmNewpassword = confirmNewpassword;
    }
}
