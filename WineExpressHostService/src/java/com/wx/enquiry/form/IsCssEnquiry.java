/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquiry.form;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guyan_000
 */
@Entity
@Table(name = "is_css_enquiry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IsCssEnquiry.findAll", query = "SELECT i FROM IsCssEnquiry i"),
    @NamedQuery(name = "IsCssEnquiry.findBySenderEmail", query = "SELECT i FROM IsCssEnquiry i WHERE i.isCssEnquiryPK.senderEmail = :senderEmail"),
    @NamedQuery(name = "IsCssEnquiry.findByEnquiryMsg", query = "SELECT i FROM IsCssEnquiry i WHERE i.enquiryMsg = :enquiryMsg"),
    @NamedQuery(name = "IsCssEnquiry.findByReplyMsg", query = "SELECT i FROM IsCssEnquiry i WHERE i.replyMsg = :replyMsg"),
    @NamedQuery(name = "IsCssEnquiry.findBySubmitDatetime", query = "SELECT i FROM IsCssEnquiry i WHERE i.isCssEnquiryPK.submitDatetime = :submitDatetime"),
    @NamedQuery(name = "IsCssEnquiry.findByStatus", query = "SELECT i FROM IsCssEnquiry i WHERE i.status = :status")})
public class IsCssEnquiry implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IsCssEnquiryPK isCssEnquiryPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "enquiry_msg")
    private String enquiryMsg;
    @Size(max = 1000)
    @Column(name = "reply_msg")
    private String replyMsg;
    @Size(max = 10)
    @Column(name = "status")
    private String status;

    public IsCssEnquiry() {
    }

    public IsCssEnquiry(IsCssEnquiryPK isCssEnquiryPK) {
        this.isCssEnquiryPK = isCssEnquiryPK;
    }

    public IsCssEnquiry(IsCssEnquiryPK isCssEnquiryPK, String enquiryMsg) {
        this.isCssEnquiryPK = isCssEnquiryPK;
        this.enquiryMsg = enquiryMsg;
    }

    public IsCssEnquiry(String senderEmail, Date submitDatetime) {
        this.isCssEnquiryPK = new IsCssEnquiryPK(senderEmail, submitDatetime);
    }

    public IsCssEnquiryPK getIsCssEnquiryPK() {
        return isCssEnquiryPK;
    }

    public void setIsCssEnquiryPK(IsCssEnquiryPK isCssEnquiryPK) {
        this.isCssEnquiryPK = isCssEnquiryPK;
    }

    public String getEnquiryMsg() {
        return enquiryMsg;
    }

    public void setEnquiryMsg(String enquiryMsg) {
        this.enquiryMsg = enquiryMsg;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isCssEnquiryPK != null ? isCssEnquiryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IsCssEnquiry)) {
            return false;
        }
        IsCssEnquiry other = (IsCssEnquiry) object;
        if ((this.isCssEnquiryPK == null && other.isCssEnquiryPK != null) || (this.isCssEnquiryPK != null && !this.isCssEnquiryPK.equals(other.isCssEnquiryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wx.enquiry.form.IsCssEnquiry[ isCssEnquiryPK=" + isCssEnquiryPK + " ]";
    }
    
}
