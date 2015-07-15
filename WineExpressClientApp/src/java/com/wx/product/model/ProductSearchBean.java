/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.product.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;  
/**
 *
 * @author Zhou Wenyi
 */
@ManagedBean
@RequestScoped
public class ProductSearchBean implements Serializable{
    private static final long serialVersionUID = 3971116703948302042L;
    
    private boolean displayProductList; 
    /**
     * Creates a new instance of ProductSearchBean
     */
    public ProductSearchBean() {
        displayProductList = true;
    }

    public boolean isDisplayProductList() {
        return displayProductList;
    }

    public void setDisplayProductList(boolean displayProductList) {
        this.displayProductList = displayProductList;
    }
    
    
    
}
