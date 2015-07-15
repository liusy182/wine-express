/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.purchaseRecord.service;

import static com.wx.common.constant.ErrorMassageCode.INVALID_INPUT;
import com.wx.common.exception.FatalException;
import com.wx.common.exception.ValidationFailedException;
import com.wx.common.singleton.ValidationErrorMsg;
import com.wx.purchaseRecord.PurchaseRecord;
import com.wx.purchaseRecord.dao.PurchaseRecordDAOImpl;
import com.wx.purchaseRecord.dto.PurchaseRecordDTO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author WYY
 */
@WebService(serviceName = "PurchaseRecordService")
@Stateless()
public class PurchaseRecordService {

     /**
     * Web service operation
     * @throws com.wx.common.exception.FatalException
     */
    @WebMethod(operationName = "addPurchaseHistory")
    public boolean addPurchaseHistory(@WebParam(name = "purchaseRecord") PurchaseRecordDTO purchaseRecord) 
            throws FatalException {
        
        if (purchaseRecord == null || purchaseRecord.getEmail() == null || purchaseRecord.getPurchaseDate() == null){
            Logger.getLogger(PurchaseRecordService.class.getName()).log(Level.SEVERE, ValidationErrorMsg.getInstance().getErrorMesage(INVALID_INPUT));
            return false;
        }
        return PurchaseRecordDAOImpl.INSTANCE.addRecord(PurchaseRecordAssembler.fromPurchaseRecordDTO(purchaseRecord));
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPurchaseHistory")
    public List<PurchaseRecordDTO> getPurchaseHistory(@WebParam(name = "userAccountId") String userAccountId) 
            throws FatalException {
        List<PurchaseRecord> purchaseRecordsList = PurchaseRecordDAOImpl.INSTANCE.loadRecordList(userAccountId);
        List<PurchaseRecordDTO> purchaseRecordResultList = PurchaseRecordAssembler.toPurchaseRecordDTOList(purchaseRecordsList);
        return purchaseRecordResultList;
    }
    
    
}

