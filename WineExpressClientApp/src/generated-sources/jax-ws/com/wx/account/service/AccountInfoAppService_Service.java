
package com.wx.account.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AccountInfoAppService", targetNamespace = "http://service.account.wx.com/", wsdlLocation = "http://localhost:8080/AccountInfoAppService/AccountInfoAppService?wsdl")
public class AccountInfoAppService_Service
    extends Service
{

    private final static URL ACCOUNTINFOAPPSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTINFOAPPSERVICE_EXCEPTION;
    private final static QName ACCOUNTINFOAPPSERVICE_QNAME = new QName("http://service.account.wx.com/", "AccountInfoAppService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AccountInfoAppService/AccountInfoAppService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTINFOAPPSERVICE_WSDL_LOCATION = url;
        ACCOUNTINFOAPPSERVICE_EXCEPTION = e;
    }

    public AccountInfoAppService_Service() {
        super(__getWsdlLocation(), ACCOUNTINFOAPPSERVICE_QNAME);
    }

    public AccountInfoAppService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTINFOAPPSERVICE_QNAME, features);
    }

    public AccountInfoAppService_Service(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTINFOAPPSERVICE_QNAME);
    }

    public AccountInfoAppService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTINFOAPPSERVICE_QNAME, features);
    }

    public AccountInfoAppService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountInfoAppService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccountInfoAppService
     */
    @WebEndpoint(name = "AccountInfoAppServicePort")
    public AccountInfoAppService getAccountInfoAppServicePort() {
        return super.getPort(new QName("http://service.account.wx.com/", "AccountInfoAppServicePort"), AccountInfoAppService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountInfoAppService
     */
    @WebEndpoint(name = "AccountInfoAppServicePort")
    public AccountInfoAppService getAccountInfoAppServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.account.wx.com/", "AccountInfoAppServicePort"), AccountInfoAppService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTINFOAPPSERVICE_EXCEPTION!= null) {
            throw ACCOUNTINFOAPPSERVICE_EXCEPTION;
        }
        return ACCOUNTINFOAPPSERVICE_WSDL_LOCATION;
    }

}
