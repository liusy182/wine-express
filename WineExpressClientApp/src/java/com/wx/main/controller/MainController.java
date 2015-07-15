/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.main.controller;

import com.wx.common.enumation.MenuItems;
import com.wx.common.enumation.UserState;
import com.wx.main.model.MainBean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@SessionScoped
public class MainController {

    private UserState userState;

    public UserState getUserState() {
        return userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    @ManagedProperty("#{mainBean}")
    private MainBean mainBean;

    public void setMainBean(MainBean mainBean) {
        this.mainBean = mainBean;
    }

    /**
     * Creates a new instance of mainController
     */
    public MainController() {
        userState = UserState.GUEST;
    }

    public final void addPage(MenuItems menuItem) {
        switch (menuItem) {
            case PRODUCT_LIST:
                mainBean.setRenderProductList(true);
                break;
            case PRODUCT_RESULT:
                mainBean.setRenderProductResult(true);
                break;
        }
    }

    public final void openPage(MenuItems menuItem) {
        closeAllCenterPages();
        switch (menuItem) {
            case CHANGE_PASSWORD:
                mainBean.setRenderChangePassword(true);
                break;
            case REGISTER_FORM:
                mainBean.setRenderRegisterForm(true);
                break;
            case PHOTO_GALLERY:
                mainBean.setRenderGallery(true);
                break;
            case PURCHASE_HISTORY:
                mainBean.setRenderPurchaseHistory(true);
                break;
            case ACCOUNT_ACTIVATION:
                mainBean.setRenderPurchaseHistory(true);
                break;
            case CHANGE_PATICULARS:
                mainBean.setRenderParticulars(true);
                break;
            case MANAGE_CATALOG:
                mainBean.setRenderManageCatalog(true);
                break;
            case PAYMENT_INFO:
                mainBean.setRenderPaymentInfo(true);
                break;
            case REPORT_MANAGEMENT:
                mainBean.setRenderReportManagement(true);
                break;
            case ENQUIRY:
                mainBean.setRenderEnquiry(true);
                break;
            case SHOPPING_CART:
                mainBean.setRenderShoppingCart(true);
                break;
            case CONTENT:
                mainBean.setRenderContent(true);
                break;
            case PRODUCT_SEARCH:
                mainBean.setRenderProductSearch(true);
                break;
            case PRODUCT_BROWSE:
                mainBean.setRenderProductBrowse(true);
                break;
            case PRODUCT_RESULT:
                mainBean.setRenderProductResult(true);
                break;
            case PRODUCT_LIST:
                mainBean.setRenderProductList(true);
                break;
            case PRODUCT_DETAIL:
                mainBean.setRenderProductDetail(true);
                break;
            case PRODUCT_ENTRY:
                mainBean.setRenderProductEntry(true);
                break;
            case PRODUCT_CATEGORY:
                mainBean.setRenderProductCategory(true);
                break;
            default:
                mainBean.setRenderGallery(true);
        }
    }

    private void closeAllCenterPages() {
        mainBean.setRenderChangePassword(false);
        mainBean.setRenderContent(false);
        mainBean.setRenderEnquiry(false);
        mainBean.setRenderGallery(false);
        mainBean.setRenderManageCatalog(false);
        mainBean.setRenderPaymentInfo(false);
        mainBean.setRenderPurchaseHistory(false);
        mainBean.setRenderRegisterForm(false);
        mainBean.setRenderReportManagement(false);
        mainBean.setRenderShoppingCart(false);
        mainBean.setRenderProductSearch(false);
        mainBean.setRenderProductBrowse(false);
        mainBean.setRenderProductList(false);
        mainBean.setRenderProductDetail(false);
        mainBean.setRenderProductEntry(false);
        mainBean.setRenderProductResult(false);
        mainBean.setRenderParticulars(false);
        mainBean.setRenderProductCategory(false);
    }

    public void openMenu() {
        mainBean.setRenderMenu(true);
    }

    public void closeMenu() {
        mainBean.setRenderMenu(true);
    }

    public String backHome() {
        openPage(MenuItems.PHOTO_GALLERY);
        return "main.xhtml?faces-redirect=true";
    }

    public void prepareGuestState() {
        setUserState(UserState.GUEST);
        mainBean.setRenderMenu(false);
        openPage(MenuItems.PHOTO_GALLERY);
    }

    public void prepareMemberState() {
        setUserState(UserState.MEMBER);
        mainBean.setRenderMenu(true);
        //Render 
    }

    public void prepareAdminState() {
        setUserState(UserState.ADMIN);
        mainBean.setRenderMenu(false);
    }
    
    public String getUserStateString(){
        return userState.getStateName();
    }
}
