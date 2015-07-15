/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.application.activate.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@ViewScoped
public class ActivationBean {

    /**
     * Creates a new instance of ActivationBean
     */
    public ActivationBean() {
    }
    
    public String activationCode;

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }
}
