/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.menu.model;

import com.wx.main.controller.MainController;
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
public class MenuController {

    @ManagedProperty("#{mainController}")
    private MainController mainController;
    
    public void setMainBean(MainController mainController) {
        this.mainController = mainController;
    }
    
    /**
     * Creates a new instance of menuBean
     */
    public MenuController() {
    
    }

    @PostConstruct
    public void initialize() {
        switch (mainController.getUserState()) {
            case GUEST:
                initializeGuestMenu();
                break;
            case MEMBER:
                initializeMemberMenu();
                break;
            case ADMIN:
                initializeAdminMenu();
                break;
        }
    }
    


    private void initializeGuestMenu() {
        mainController.closeMenu();
    }

    private void initializeMemberMenu() {
        mainController.openMenu();
    }

    private void initializeAdminMenu() {
        mainController.openMenu();
    }

}
