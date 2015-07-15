/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseHistory.model;

import com.wx.common.enumation.MenuItems;
import com.wx.purchaseHistory.client.FatalException_Exception;
import com.wx.purchaseHistory.client.PurchaseRecordDTO;
import com.wx.purchaseHistory.client.PurchaseRecordService;
import com.wx.purchaseHistory.client.PurchaseRecordService_Service;
import static com.wx.purchaseHistory.controller.PurchaseHistoryAssembler.convertDTOToBean;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author yiyuan
 */
@ManagedBean(name = "purchaseHistoryBean")
@SessionScoped
public class PurchaseHistoryBean {
     
    private List<PurchaseItem> purchaseItemsList;
    
    /**
     * Creates a new instance of PurchaseHistoryBean
     */
    public PurchaseHistoryBean() {
    }

    public List<PurchaseItem> getPurchaseItemsList() {
        return purchaseItemsList;
    }

    public void setPurchaseItemsList(List<PurchaseItem> purchaseItemsList) {
        this.purchaseItemsList = purchaseItemsList;
    }
    
    public static class PurchaseItem {
        private String email;
        private Date purchaseDate;
        private String productName; 

        public PurchaseItem() {
        }

        public PurchaseItem(String email, Date purchaseDate, String productName) {
            this.email = email;
            this.purchaseDate = purchaseDate;
            this.productName = productName;
        }
        
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Date getPurchaseDate() {
            return purchaseDate;
        }

        public void setPurchaseDate(Date purchaseDate) {
            this.purchaseDate = purchaseDate;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }
    }
}
