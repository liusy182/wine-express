
package com.wx.purchaseHistory.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPurchaseHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPurchaseHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPurchaseHistory", propOrder = {
    "userAccountId"
})
public class GetPurchaseHistory {

    protected String userAccountId;

    /**
     * Gets the value of the userAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccountId() {
        return userAccountId;
    }

    /**
     * Sets the value of the userAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccountId(String value) {
        this.userAccountId = value;
    }

}
