
package com.wx.purchaseHistory.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wx.purchaseHistory.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPurchaseHistory_QNAME = new QName("http://service.purchaseRecord.wx.com/", "getPurchaseHistory");
    private final static QName _FatalException_QNAME = new QName("http://service.purchaseRecord.wx.com/", "FatalException");
    private final static QName _GetPurchaseHistoryResponse_QNAME = new QName("http://service.purchaseRecord.wx.com/", "getPurchaseHistoryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wx.purchaseHistory.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FatalException }
     * 
     */
    public FatalException createFatalException() {
        return new FatalException();
    }

    /**
     * Create an instance of {@link GetPurchaseHistory }
     * 
     */
    public GetPurchaseHistory createGetPurchaseHistory() {
        return new GetPurchaseHistory();
    }

    /**
     * Create an instance of {@link GetPurchaseHistoryResponse }
     * 
     */
    public GetPurchaseHistoryResponse createGetPurchaseHistoryResponse() {
        return new GetPurchaseHistoryResponse();
    }

    /**
     * Create an instance of {@link PurchaseRecordDTO }
     * 
     */
    public PurchaseRecordDTO createPurchaseRecordDTO() {
        return new PurchaseRecordDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchaseRecord.wx.com/", name = "getPurchaseHistory")
    public JAXBElement<GetPurchaseHistory> createGetPurchaseHistory(GetPurchaseHistory value) {
        return new JAXBElement<GetPurchaseHistory>(_GetPurchaseHistory_QNAME, GetPurchaseHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FatalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchaseRecord.wx.com/", name = "FatalException")
    public JAXBElement<FatalException> createFatalException(FatalException value) {
        return new JAXBElement<FatalException>(_FatalException_QNAME, FatalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchaseRecord.wx.com/", name = "getPurchaseHistoryResponse")
    public JAXBElement<GetPurchaseHistoryResponse> createGetPurchaseHistoryResponse(GetPurchaseHistoryResponse value) {
        return new JAXBElement<GetPurchaseHistoryResponse>(_GetPurchaseHistoryResponse_QNAME, GetPurchaseHistoryResponse.class, null, value);
    }

}
