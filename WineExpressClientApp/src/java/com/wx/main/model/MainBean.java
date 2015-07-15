/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.main.model;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Hao
 */
@ManagedBean
@SessionScoped
public class MainBean implements Serializable{
    private static final long serialVersionUID = 6802294692552506228L;

    
    private boolean renderGallery = true;
    private boolean renderMenu = false;
    private boolean renderRegisterForm = false;
    private boolean renderChangePassword = false;
    private boolean renderPurchaseHistory = false;
    private boolean renderManageCatalog = false;
    private boolean renderAccountActivation = false;
    private boolean renderContent = false;
    private boolean renderEnquiry = false;
    private boolean renderShoppingCart = false;
    private boolean renderPaymentInfo = false;
    private boolean renderReportManagement = false;
    private boolean renderParticulars = false;
    
    /* Product Management System*/
    private boolean renderProductSearch = false;
    private boolean renderProductBrowse = false;
    private boolean renderProductList = false;
    private boolean renderProductDetail = false;
    private boolean renderProductEntry = false;
    private boolean renderProductResult = false; 
    private boolean renderProductCategory = false; 


    /**
     * Creates a new instance of stateBean
     */
    public MainBean() {
    }
    
    public boolean isRenderMenu() {
        return renderMenu;
    }

    public void setRenderMenu(boolean renderMenu) {
        this.renderMenu = renderMenu;
    }

    public boolean isRenderGallery() {
        return renderGallery;
    }

    public void setRenderGallery(boolean renderGallery) {
        this.renderGallery = renderGallery;
    }

    public boolean isRenderRegisterForm() {
        return renderRegisterForm;
    }

    public void setRenderRegisterForm(boolean renderRegisterForm) {
        this.renderRegisterForm = renderRegisterForm;
    }

    public boolean isRenderChangePassword() {
        return renderChangePassword;
    }

    public void setRenderChangePassword(boolean renderChangePassword) {
        this.renderChangePassword = renderChangePassword;
    }
    
    public boolean isRenderPurchaseHistory() {
        return renderPurchaseHistory;
    }

    public void setRenderPurchaseHistory(boolean renderPurchaseHistory) {
        this.renderPurchaseHistory = renderPurchaseHistory;
    }

    public boolean isRenderManageCatalog() {
        return renderManageCatalog;
    }

    public void setRenderManageCatalog(boolean renderManageCatalog) {
        this.renderManageCatalog = renderManageCatalog;
    }

    public boolean isRenderContent() {
        return renderContent;
    }

    public void setRenderContent(boolean renderContent) {
        this.renderContent = renderContent;
    }

    public boolean isRenderEnquiry() {
        return renderEnquiry;
    }

    public void setRenderEnquiry(boolean renderEnquiry) {
        this.renderEnquiry = renderEnquiry;
    }

    public boolean isRenderShoppingCart() {
        return renderShoppingCart;
    }

    public void setRenderShoppingCart(boolean renderShoppingCart) {
        this.renderShoppingCart = renderShoppingCart;
    }

    public boolean isRenderPaymentInfo() {
        return renderPaymentInfo;
    }

    public void setRenderPaymentInfo(boolean renderPaymentInfo) {
        this.renderPaymentInfo = renderPaymentInfo;
    }

    public boolean isRenderReportManagement() {
        return renderReportManagement;
    }

    public void setRenderReportManagement(boolean renderReportManagement) {
        this.renderReportManagement = renderReportManagement;
    }

    public boolean isRenderProductSearch() {
        return renderProductSearch;
    }

    public void setRenderProductSearch(boolean renderProductSearch) {
        this.renderProductSearch = renderProductSearch;
    }

    public boolean isRenderProductBrowse() {
        return renderProductBrowse;
    }

    public void setRenderProductBrowse(boolean renderProductBrowse) {
        this.renderProductBrowse = renderProductBrowse;
    }

    public boolean isRenderProductList() {
        return renderProductList;
    }

    public void setRenderProductList(boolean renderProductList) {
        this.renderProductList = renderProductList;
    }

    public boolean isRenderProductDetail() {
        return renderProductDetail;
    }

    public void setRenderProductDetail(boolean renderProductDetail) {
        this.renderProductDetail = renderProductDetail;
    }

    public boolean isRenderProductEntry() {
        return renderProductEntry;
    }

    public void setRenderProductEntry(boolean renderProductEntry) {
        this.renderProductEntry = renderProductEntry;
    }

    public boolean isRenderProductResult() {
        return renderProductResult;
    }

    public void setRenderProductResult(boolean renderProductResult) {
        this.renderProductResult = renderProductResult;
    }

    public boolean isRenderParticulars() {
        return renderParticulars;
    }

    public void setRenderParticulars(boolean renderParticulars) {
        this.renderParticulars = renderParticulars;
    }

    public boolean isRenderAccountActivation() {
        return renderAccountActivation;
    }

    public void setRenderAccountActivation(boolean renderAccountActivation) {
        this.renderAccountActivation = renderAccountActivation;
    }

    public boolean isRenderProductCategory() {
        return renderProductCategory;
    }

    public void setRenderProductCategory(boolean renderProductCategory) {
        this.renderProductCategory = renderProductCategory;
    }
    
    

}
