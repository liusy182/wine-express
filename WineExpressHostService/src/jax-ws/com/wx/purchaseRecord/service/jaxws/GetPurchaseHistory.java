
package com.wx.purchaseRecord.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPurchaseHistory", namespace = "http://service.purchaseRecord.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPurchaseHistory", namespace = "http://service.purchaseRecord.wx.com/")
public class GetPurchaseHistory {

    @XmlElement(name = "userAccountId", namespace = "")
    private String userAccountId;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUserAccountId() {
        return this.userAccountId;
    }

    /**
     * 
     * @param userAccountId
     *     the value for the userAccountId property
     */
    public void setUserAccountId(String userAccountId) {
        this.userAccountId = userAccountId;
    }

}
