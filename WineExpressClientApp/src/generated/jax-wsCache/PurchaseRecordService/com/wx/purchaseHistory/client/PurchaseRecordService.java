
package com.wx.purchaseHistory.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PurchaseRecordService", targetNamespace = "http://service.purchaseRecord.wx.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PurchaseRecordService {


    /**
     * 
     * @param userAccountId
     * @return
     *     returns java.util.List<com.wx.purchaseHistory.client.PurchaseRecordDTO>
     * @throws FatalException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPurchaseHistory", targetNamespace = "http://service.purchaseRecord.wx.com/", className = "com.wx.purchaseHistory.client.GetPurchaseHistory")
    @ResponseWrapper(localName = "getPurchaseHistoryResponse", targetNamespace = "http://service.purchaseRecord.wx.com/", className = "com.wx.purchaseHistory.client.GetPurchaseHistoryResponse")
    @Action(input = "http://service.purchaseRecord.wx.com/PurchaseRecordService/getPurchaseHistoryRequest", output = "http://service.purchaseRecord.wx.com/PurchaseRecordService/getPurchaseHistoryResponse", fault = {
        @FaultAction(className = FatalException_Exception.class, value = "http://service.purchaseRecord.wx.com/PurchaseRecordService/getPurchaseHistory/Fault/FatalException")
    })
    public List<PurchaseRecordDTO> getPurchaseHistory(
        @WebParam(name = "userAccountId", targetNamespace = "")
        String userAccountId)
        throws FatalException_Exception
    ;

}