/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.common.enumation;

/**
 *
 * @author Hao
 */
public enum MenuItems {
    CHANGE_PASSWORD("ChangePassword"),
    REGISTER_FORM("RegisterForm"),
    ACCOUNT_ACTIVATION("AccountActivation"),
    CHANGE_PATICULARS("ChangePariculars"),
    PHOTO_GALLERY("PhotoGallery"),
    ENQUIRY("Enquiry"),
    MANAGE_CATALOG("ManageCatalog"),
    PAYMENT_INFO("PaymentInfo"),
    PURCHASE_HISTORY("PurchaseHistory"),
    CONTENT("Content"),
    REPORT_MANAGEMENT("ReportManagement"),
    SHOPPING_CART("ShoppingCart"),
    PRODUCT_SEARCH("ProductSearch"),
    PRODUCT_BROWSE("ProductBrowse"),
    PRODUCT_RESULT("ProductResult"),
    PRODUCT_LIST("ProductList"),
    PRODUCT_DETAIL("ProductDetail"),
    PRODUCT_ENTRY("ProductEntry"),
    PRODUCT_CATEGORY("ProductCategory");
    
    private String itemName;
    
    private MenuItems(String itemName){
        this.itemName = itemName;
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public MenuItems fromString(String itemName){
        MenuItems menuItems = null;
        for(MenuItems m : MenuItems.values()){
            if(m.getItemName().equals(itemName)){
                menuItems = m;
                break;
            }
        }
        return menuItems;
    }
}
