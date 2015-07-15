/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseRecord;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yiyuan
 */
@Entity
@Table(name = "purchase_record")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PurchaseRecord.findAll", query = "SELECT p FROM PurchaseRecord p"),
    @NamedQuery(name = "PurchaseRecord.findByEmail", query = "SELECT p FROM PurchaseRecord p WHERE p.email = :email"),
    @NamedQuery(name = "PurchaseRecord.findByPurchaseDate", query = "SELECT p FROM PurchaseRecord p WHERE p.purchaseDate = :purchaseDate"),
    @NamedQuery(name = "PurchaseRecord.findByPurchaseProductName", query = "SELECT p FROM PurchaseRecord p WHERE p.purchaseProductName = :purchaseProductName")})
public class PurchaseRecord implements Serializable {
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "PurchaseRecordId")
    private String purchaseRecordId;
    
    private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email")
    private String email;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "PurchaseDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseDate;
    
    @Size(max = 100)
    @Column(name = "PurchaseProductName")
    private String purchaseProductName;

    public PurchaseRecord() {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PurchaseRecord)) {
            return false;
        }
        PurchaseRecord other = (PurchaseRecord) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wx.purchaseRecord.PurchaseRecord[ email=" + email + " ]";
    }

    public PurchaseRecord(String purchaseRecordId) {
        this.purchaseRecordId = purchaseRecordId;
    }

    public String getPurchaseRecordId() {
        return purchaseRecordId;
    }

    public void setPurchaseRecordId(String purchaseRecordId) {
        this.purchaseRecordId = purchaseRecordId;
    }
    
}
