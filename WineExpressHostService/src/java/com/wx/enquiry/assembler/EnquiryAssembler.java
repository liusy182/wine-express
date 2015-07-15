/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquiry.assembler;


import com.wx.enquire.dto.EnquiryDTO;
import com.wx.enquiry.form.IsCssEnquiry;
import com.wx.enquiry.form.IsCssEnquiryPK;

/**
 *
 * @author guyan_000
 */
public class EnquiryAssembler {
    public static EnquiryDTO covertEntityToDTO(IsCssEnquiry enquiry) {
        EnquiryDTO enquiryDTO = null;
        if (enquiry != null) {
            enquiryDTO = new EnquiryDTO();
            enquiryDTO.setSendEmail(enquiry.getIsCssEnquiryPK().getSenderEmail());
            enquiryDTO.setEnquiryMsg(enquiry.getEnquiryMsg());
            enquiryDTO.setReplyMsg(enquiry.getReplyMsg());
            enquiryDTO.setSubmitDatetime(enquiry.getIsCssEnquiryPK().getSubmitDatetime());
            enquiryDTO.setEnquiryStatus(enquiry.getStatus());
        }
        return enquiryDTO;
    }

    public static IsCssEnquiry covertDTOtoEntity(EnquiryDTO enquiryDTO) {
        IsCssEnquiry isCssEnquiry = null;
        IsCssEnquiryPK isCssEnquiryPK = null;
        if (enquiryDTO != null) {
            isCssEnquiry = new IsCssEnquiry();
            isCssEnquiryPK = new IsCssEnquiryPK();
            isCssEnquiryPK.setSenderEmail(enquiryDTO.getSendEmail());
            isCssEnquiryPK.setSubmitDatetime(enquiryDTO.getSubmitDatetime());
            isCssEnquiry.setIsCssEnquiryPK(isCssEnquiryPK);
            isCssEnquiry.setEnquiryMsg(enquiryDTO.getEnquiryMsg());
            isCssEnquiry.setReplyMsg(enquiryDTO.getReplyMsg());
            isCssEnquiry.setStatus(enquiryDTO.getEnquiryStatus());
            
        }
        return isCssEnquiry;
    }
}
