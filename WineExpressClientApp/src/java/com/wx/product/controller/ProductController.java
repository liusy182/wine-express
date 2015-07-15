/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.product.controller;

import com.wx.common.enumation.MenuItems;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
import com.wx.main.controller.MainController;
import com.wx.product.model.ProductDetailsBean;
import com.wx.product.model.ProductListBean;


/**
 *
 * @author Zhou Wenyi
 */
@ManagedBean
@RequestScoped
public class ProductController {
    
    @ManagedProperty("#{mainController}")
    private MainController mainController;
    
    @ManagedProperty("#{productListBean}")
    private ProductListBean productListBean;
    
    @ManagedProperty("#{productDetailsBean}")
    private ProductDetailsBean productDetailsBean;
    
    

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    public void setProductListBean(ProductListBean productListBean) {
        this.productListBean = productListBean;
    }

    public void setProductDetailsBean(ProductDetailsBean productDetailsBean) {
        this.productDetailsBean = productDetailsBean;
    }
     
    
    
    /**
     * Creates a new instance of ProductController
     */
    public ProductController() {
    }
    
    public String search() {
        mainController.openPage(MenuItems.PRODUCT_SEARCH);
        return "main.xhtml?faces-redirect=true";
    }
    
    public String browse() {
        mainController.openPage(MenuItems.PRODUCT_BROWSE);
        return "main.xhtml?faces-redirect=true";
    }
    
    public String result(){
        mainController.addPage(MenuItems.PRODUCT_RESULT);
        return "main.xhtml?faces-redirect=true";
    }
    
    public String detail(){
        mainController.openPage(MenuItems.PRODUCT_DETAIL);
        return "main.xhtml?faces-redirect=true";
    }
    
    public String list(){
        mainController.openPage(MenuItems.PRODUCT_LIST);
        return "main.xhtml?faces-redirect=true";
    }
    
    public String entry(){
        mainController.openPage(MenuItems.PRODUCT_ENTRY);
        return "main.xhtml?faces-redirect=true";
    }
    
    public String category(){
        mainController.openPage(MenuItems.PRODUCT_CATEGORY);
        return "main.xhtml?faces-redirect=true";
    }
    
}
