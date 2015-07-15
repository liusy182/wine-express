/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseRecord.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author WYY
 */
public class PurchaseRecordDTO implements Serializable {
    
    private static final long serialVersionUID = -1670403984970871164L;
    
    private String email;
    private Date purchaseDate;
    private String purchaseProductName;

    public PurchaseRecordDTO() {
    }

    public PurchaseRecordDTO(String email, Date purchaseDate, String purchaseProductName) {
        this.email = email;
        this.purchaseDate = purchaseDate;
        this.purchaseProductName = purchaseProductName;
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

    public String getPurchaseProductName() {
        return purchaseProductName;
    }

    public void setPurchaseProductName(String purchaseProductName) {
        this.purchaseProductName = purchaseProductName;
    }
    
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseRecordDTO)) {
            return false;
        }
        PurchaseRecordDTO other = (PurchaseRecordDTO) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wx.purchaseRecord.dto.PurchaseRecordDTO[ email=" + email + " ]";
    }
    
}
