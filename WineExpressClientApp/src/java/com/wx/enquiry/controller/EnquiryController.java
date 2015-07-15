/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquiry.controller;

import com.wx.account.model.AccountBean;
import com.wx.account.model.AccountInfoBean;
import com.wx.common.enumation.MenuItems;
import com.wx.common.enumation.UserState;
import com.wx.enquiry.model.EnquiryBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
import com.wx.main.controller.MainController;
import com.wx.main.model.MainBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author liusi
 */
@ManagedBean
@RequestScoped
public class EnquiryController {
    
     @ManagedProperty("#{mainController}")
    private MainController mainController;
     
    @ManagedProperty("#{enquiryBean}")
    private EnquiryBean enquiryBean;
    /**
     * Creates a new instance of EnquiryController
     */
    public EnquiryController() {
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
    
    public void setEnquiryBean(EnquiryBean enquiryBean) {
        this.enquiryBean = enquiryBean;
    }

    public String display() {
        if (mainController.getUserState().equals(UserState.GUEST)) {
            throw new IllegalStateException("This method is not valid for Guest State");
        }
        mainController.openPage(MenuItems.ENQUIRY);
        return "main.xhtml?faces-redirect=true";
    }
    
    public void submit(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();  
          
        //TODO: call service to submit query
    } 
}
