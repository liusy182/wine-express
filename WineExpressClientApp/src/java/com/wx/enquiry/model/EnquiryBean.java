/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquiry.model;

import com.wx.common.enumation.UserState;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;  
import java.util.Date;  
import java.util.List;
import javax.annotation.PostConstruct;
import com.wx.main.controller.MainController;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author liusi
 */
public class EnquiryBean implements Serializable{
    
    @ManagedProperty("#{mainController}")
    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
    
    public EnquiryBean() {
    }
    
    @PostConstruct
    public void init() {
        switch (mainController.getUserState()) {
            case MEMBER:
                isAdmin = false;
            case ADMIN:
                isAdmin = true;
                break;
            case GUEST:
                throw new IllegalStateException("This method is not valid for Guest State");
           
        }
    }

    private boolean isAdmin;
    private String enquiry;
    
    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean val) {
        this.isAdmin = val;
    }
    
    public String getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }
   
    
}
