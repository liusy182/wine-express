/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.account.model;

import com.wx.main.controller.MainController;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@ViewScoped
public class AccountBean implements Serializable{
    private static final long serialVersionUID = -510551936423004039L;

    @ManagedProperty("#{mainController}")
    private MainController mainController;

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private boolean renderLoginPanel = false;
    private boolean renderAccountInfoPanel = false;
  

    private String userName;
    private String password;

  
    /**
     * Creates a new instance of accountBacking
     */
    public AccountBean() {
    }

    @PostConstruct
    public void init() {
        switch (mainController.getUserState()) {
            case GUEST:
                initializeGuestState();
                break;
            case MEMBER:
            case ADMIN:
                initializeLoggedInState();
                break;
        }
    }

    private void initializeGuestState() {
        renderAccountInfoPanel = false;
        renderLoginPanel = true;
    }

    private void initializeLoggedInState() {
        renderAccountInfoPanel = true;
        renderLoginPanel = false;
    }

      public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRenderLoginPanel() {
        return renderLoginPanel;
    }

    public void setRenderLoginPanel(boolean renderLoginPanel) {
        this.renderLoginPanel = renderLoginPanel;
    }

    public boolean isRenderAccountInfoPanel() {
        return renderAccountInfoPanel;
    }

    public void setRenderAccountInfoPanel(boolean renderAccountInfoPanel) {
        this.renderAccountInfoPanel = renderAccountInfoPanel;
    }

  
}
