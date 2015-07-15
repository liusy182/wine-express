/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.enquiry.service;

import com.wx.enquire.dto.EnquiryDTO;
import com.wx.enquiry.assembler.EnquiryAssembler;
import com.wx.enquiry.dao.IsCssEnquiryJpaController;
import com.wx.enquiry.form.IsCssEnquiry;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.UserTransaction;

/**
 *
 * @author guyan_000
 */
@WebService(serviceName = "EnquiryService")
@Stateless()
public class EnquiryService {

    @PersistenceUnit(unitName="WineExpressHostServicePU") //inject from your application server 
    EntityManagerFactory emf; 
    @Resource //inject from your application server 
    UserTransaction utx; 
    /**
     * Web service operation
     */
    @WebMethod(operationName = "addEnquiry")
    public boolean addEnquiry(EnquiryDTO enquiry) throws Exception {
        
        //TODO write your implementation code here:
        try {
            IsCssEnquiry isCssEnquiry = EnquiryAssembler.covertDTOtoEntity(enquiry);
            IsCssEnquiryJpaController isCssEnquiryJpaController = new IsCssEnquiryJpaController(utx, emf);
            isCssEnquiryJpaController.create(isCssEnquiry);
            return true;
        } catch (Exception exception) {
            throw exception;
        }
    }
}
