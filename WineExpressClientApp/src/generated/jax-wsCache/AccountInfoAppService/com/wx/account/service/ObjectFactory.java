
package com.wx.account.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wx.account.service package. 
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

    private final static QName _GetAllMemberAccountInfoResponse_QNAME = new QName("http://service.account.wx.com/", "getAllMemberAccountInfoResponse");
    private final static QName _GetAccountInfo_QNAME = new QName("http://service.account.wx.com/", "getAccountInfo");
    private final static QName _LoginExistingAccountResponse_QNAME = new QName("http://service.account.wx.com/", "loginExistingAccountResponse");
    private final static QName _RegisterAccountResponse_QNAME = new QName("http://service.account.wx.com/", "registerAccountResponse");
    private final static QName _ActivateAccount_QNAME = new QName("http://service.account.wx.com/", "activateAccount");
    private final static QName _LoginExistingAccount_QNAME = new QName("http://service.account.wx.com/", "loginExistingAccount");
    private final static QName _UpdateAccount_QNAME = new QName("http://service.account.wx.com/", "updateAccount");
    private final static QName _GetAllMemberAccountInfo_QNAME = new QName("http://service.account.wx.com/", "getAllMemberAccountInfo");
    private final static QName _UpdateAccountResponse_QNAME = new QName("http://service.account.wx.com/", "updateAccountResponse");
    private final static QName _FatalException_QNAME = new QName("http://service.account.wx.com/", "FatalException");
    private final static QName _ActivateAccountResponse_QNAME = new QName("http://service.account.wx.com/", "activateAccountResponse");
    private final static QName _RegisterAccount_QNAME = new QName("http://service.account.wx.com/", "registerAccount");
    private final static QName _GetAccountInfoResponse_QNAME = new QName("http://service.account.wx.com/", "getAccountInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wx.account.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActivateAccountResponse }
     * 
     */
    public ActivateAccountResponse createActivateAccountResponse() {
        return new ActivateAccountResponse();
    }

    /**
     * Create an instance of {@link LoginExistingAccount }
     * 
     */
    public LoginExistingAccount createLoginExistingAccount() {
        return new LoginExistingAccount();
    }

    /**
     * Create an instance of {@link RegisterAccount }
     * 
     */
    public RegisterAccount createRegisterAccount() {
        return new RegisterAccount();
    }

    /**
     * Create an instance of {@link GetAccountInfoResponse }
     * 
     */
    public GetAccountInfoResponse createGetAccountInfoResponse() {
        return new GetAccountInfoResponse();
    }

    /**
     * Create an instance of {@link FatalException }
     * 
     */
    public FatalException createFatalException() {
        return new FatalException();
    }

    /**
     * Create an instance of {@link UpdateAccountResponse }
     * 
     */
    public UpdateAccountResponse createUpdateAccountResponse() {
        return new UpdateAccountResponse();
    }

    /**
     * Create an instance of {@link GetAllMemberAccountInfo }
     * 
     */
    public GetAllMemberAccountInfo createGetAllMemberAccountInfo() {
        return new GetAllMemberAccountInfo();
    }

    /**
     * Create an instance of {@link UpdateAccount }
     * 
     */
    public UpdateAccount createUpdateAccount() {
        return new UpdateAccount();
    }

    /**
     * Create an instance of {@link LoginExistingAccountResponse }
     * 
     */
    public LoginExistingAccountResponse createLoginExistingAccountResponse() {
        return new LoginExistingAccountResponse();
    }

    /**
     * Create an instance of {@link ActivateAccount }
     * 
     */
    public ActivateAccount createActivateAccount() {
        return new ActivateAccount();
    }

    /**
     * Create an instance of {@link RegisterAccountResponse }
     * 
     */
    public RegisterAccountResponse createRegisterAccountResponse() {
        return new RegisterAccountResponse();
    }

    /**
     * Create an instance of {@link GetAllMemberAccountInfoResponse }
     * 
     */
    public GetAllMemberAccountInfoResponse createGetAllMemberAccountInfoResponse() {
        return new GetAllMemberAccountInfoResponse();
    }

    /**
     * Create an instance of {@link GetAccountInfo }
     * 
     */
    public GetAccountInfo createGetAccountInfo() {
        return new GetAccountInfo();
    }

    /**
     * Create an instance of {@link AccountInfoDTO }
     * 
     */
    public AccountInfoDTO createAccountInfoDTO() {
        return new AccountInfoDTO();
    }

    /**
     * Create an instance of {@link AccountStateDTO }
     * 
     */
    public AccountStateDTO createAccountStateDTO() {
        return new AccountStateDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMemberAccountInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "getAllMemberAccountInfoResponse")
    public JAXBElement<GetAllMemberAccountInfoResponse> createGetAllMemberAccountInfoResponse(GetAllMemberAccountInfoResponse value) {
        return new JAXBElement<GetAllMemberAccountInfoResponse>(_GetAllMemberAccountInfoResponse_QNAME, GetAllMemberAccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "getAccountInfo")
    public JAXBElement<GetAccountInfo> createGetAccountInfo(GetAccountInfo value) {
        return new JAXBElement<GetAccountInfo>(_GetAccountInfo_QNAME, GetAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginExistingAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "loginExistingAccountResponse")
    public JAXBElement<LoginExistingAccountResponse> createLoginExistingAccountResponse(LoginExistingAccountResponse value) {
        return new JAXBElement<LoginExistingAccountResponse>(_LoginExistingAccountResponse_QNAME, LoginExistingAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "registerAccountResponse")
    public JAXBElement<RegisterAccountResponse> createRegisterAccountResponse(RegisterAccountResponse value) {
        return new JAXBElement<RegisterAccountResponse>(_RegisterAccountResponse_QNAME, RegisterAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "activateAccount")
    public JAXBElement<ActivateAccount> createActivateAccount(ActivateAccount value) {
        return new JAXBElement<ActivateAccount>(_ActivateAccount_QNAME, ActivateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginExistingAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "loginExistingAccount")
    public JAXBElement<LoginExistingAccount> createLoginExistingAccount(LoginExistingAccount value) {
        return new JAXBElement<LoginExistingAccount>(_LoginExistingAccount_QNAME, LoginExistingAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "updateAccount")
    public JAXBElement<UpdateAccount> createUpdateAccount(UpdateAccount value) {
        return new JAXBElement<UpdateAccount>(_UpdateAccount_QNAME, UpdateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMemberAccountInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "getAllMemberAccountInfo")
    public JAXBElement<GetAllMemberAccountInfo> createGetAllMemberAccountInfo(GetAllMemberAccountInfo value) {
        return new JAXBElement<GetAllMemberAccountInfo>(_GetAllMemberAccountInfo_QNAME, GetAllMemberAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "updateAccountResponse")
    public JAXBElement<UpdateAccountResponse> createUpdateAccountResponse(UpdateAccountResponse value) {
        return new JAXBElement<UpdateAccountResponse>(_UpdateAccountResponse_QNAME, UpdateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FatalException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "FatalException")
    public JAXBElement<FatalException> createFatalException(FatalException value) {
        return new JAXBElement<FatalException>(_FatalException_QNAME, FatalException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "activateAccountResponse")
    public JAXBElement<ActivateAccountResponse> createActivateAccountResponse(ActivateAccountResponse value) {
        return new JAXBElement<ActivateAccountResponse>(_ActivateAccountResponse_QNAME, ActivateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "registerAccount")
    public JAXBElement<RegisterAccount> createRegisterAccount(RegisterAccount value) {
        return new JAXBElement<RegisterAccount>(_RegisterAccount_QNAME, RegisterAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.account.wx.com/", name = "getAccountInfoResponse")
    public JAXBElement<GetAccountInfoResponse> createGetAccountInfoResponse(GetAccountInfoResponse value) {
        return new JAXBElement<GetAccountInfoResponse>(_GetAccountInfoResponse_QNAME, GetAccountInfoResponse.class, null, value);
    }

}
