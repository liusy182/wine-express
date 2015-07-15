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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author guyan_000
 */
@Embeddable
public class IsCssEnquiryPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "sender_email")
    private String senderEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "submit_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submitDatetime;

    public IsCssEnquiryPK() {
    }

    public IsCssEnquiryPK(String senderEmail, Date submitDatetime) {
        this.senderEmail = senderEmail;
        this.submitDatetime = submitDatetime;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public Date getSubmitDatetime() {
        return submitDatetime;
    }

    public void setSubmitDatetime(Date submitDatetime) {
        this.submitDatetime = submitDatetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (senderEmail != null ? senderEmail.hashCode() : 0);
        hash += (submitDatetime != null ? submitDatetime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IsCssEnquiryPK)) {
            return false;
        }
        IsCssEnquiryPK other = (IsCssEnquiryPK) object;
        if ((this.senderEmail == null && other.senderEmail != null) || (this.senderEmail != null && !this.senderEmail.equals(other.senderEmail))) {
            return false;
        }
        if ((this.submitDatetime == null && other.submitDatetime != null) || (this.submitDatetime != null && !this.submitDatetime.equals(other.submitDatetime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wx.enquiry.form.IsCssEnquiryPK[ senderEmail=" + senderEmail + ", submitDatetime=" + submitDatetime + " ]";
    }

    public void setSubmitDatetime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
