
package com.wx.account.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activateAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activateAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountInfoDTO" type="{http://service.account.wx.com/}accountInfoDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activateAccount", propOrder = {
    "accountInfoDTO"
})
public class ActivateAccount {

    protected AccountInfoDTO accountInfoDTO;

    /**
     * Gets the value of the accountInfoDTO property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoDTO }
     *     
     */
    public AccountInfoDTO getAccountInfoDTO() {
        return accountInfoDTO;
    }

    /**
     * Sets the value of the accountInfoDTO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoDTO }
     *     
     */
    public void setAccountInfoDTO(AccountInfoDTO value) {
        this.accountInfoDTO = value;
    }

}
