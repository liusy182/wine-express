/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquire.dto;

import com.wx.common.infra.BaseDTO;
import java.util.Date;

/**
 *
 * @author guyan_000
 */
public class EnquiryDTO extends BaseDTO {
    private static final long serialVersionUID = 2L;
    private String sender_email;
    private String enquiry_msg;
    private String reply_msg;
    private Date submit_datetime;
    private String status;
    
    public String getSendEmail(){
        return this.sender_email;
    }
    
    public void setSendEmail(String email){
        this.sender_email = email;
    }
    
    public String getEnquiryMsg(){
        return this.enquiry_msg;
    }
    
    public void setEnquiryMsg(String msg){
        this.enquiry_msg = msg;
    }
    
    public String getReplyMsg(){
        return this.reply_msg;
    }
    
    public void setReplyMsg(String msg){
        this.reply_msg = msg;
    }
    
    public Date getSubmitDatetime(){
        return this.submit_datetime;
    }
    
    public void setSubmitDatetime(Date submit){
        this.submit_datetime = submit;
    }
    
    public String getEnquiryStatus(){
        return this.status;
    }
    
    public void setEnquiryStatus(String status){
        this.status = status;
    }
}
