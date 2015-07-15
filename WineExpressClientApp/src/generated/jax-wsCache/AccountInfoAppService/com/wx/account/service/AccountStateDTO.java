
package com.wx.account.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountStateDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="accountStateDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://service.account.wx.com/}baseDTO">
 *       &lt;sequence>
 *         &lt;element name="activationSuccessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="failCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="failMassage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginSuccessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="registerSuccessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="state" type="{http://service.account.wx.com/}userState" minOccurs="0"/>
 *         &lt;element name="updateSuccessed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accountStateDTO", propOrder = {
    "activationSuccessed",
    "failCode",
    "failMassage",
    "loginSuccessed",
    "registerSuccessed",
    "state",
    "updateSuccessed"
})
public class AccountStateDTO
    extends BaseDTO
{

    protected boolean activationSuccessed;
    protected String failCode;
    protected String failMassage;
    protected boolean loginSuccessed;
    protected boolean registerSuccessed;
    protected UserState state;
    protected boolean updateSuccessed;

    /**
     * Gets the value of the activationSuccessed property.
     * 
     */
    public boolean isActivationSuccessed() {
        return activationSuccessed;
    }

    /**
     * Sets the value of the activationSuccessed property.
     * 
     */
    public void setActivationSuccessed(boolean value) {
        this.activationSuccessed = value;
    }

    /**
     * Gets the value of the failCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailCode() {
        return failCode;
    }

    /**
     * Sets the value of the failCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailCode(String value) {
        this.failCode = value;
    }

    /**
     * Gets the value of the failMassage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailMassage() {
        return failMassage;
    }

    /**
     * Sets the value of the failMassage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailMassage(String value) {
        this.failMassage = value;
    }

    /**
     * Gets the value of the loginSuccessed property.
     * 
     */
    public boolean isLoginSuccessed() {
        return loginSuccessed;
    }

    /**
     * Sets the value of the loginSuccessed property.
     * 
     */
    public void setLoginSuccessed(boolean value) {
        this.loginSuccessed = value;
    }

    /**
     * Gets the value of the registerSuccessed property.
     * 
     */
    public boolean isRegisterSuccessed() {
        return registerSuccessed;
    }

    /**
     * Sets the value of the registerSuccessed property.
     * 
     */
    public void setRegisterSuccessed(boolean value) {
        this.registerSuccessed = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link UserState }
     *     
     */
    public UserState getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserState }
     *     
     */
    public void setState(UserState value) {
        this.state = value;
    }

    /**
     * Gets the value of the updateSuccessed property.
     * 
     */
    public boolean isUpdateSuccessed() {
        return updateSuccessed;
    }

    /**
     * Sets the value of the updateSuccessed property.
     * 
     */
    public void setUpdateSuccessed(boolean value) {
        this.updateSuccessed = value;
    }

}
