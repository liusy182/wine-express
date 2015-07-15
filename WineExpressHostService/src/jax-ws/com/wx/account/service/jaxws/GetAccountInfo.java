
package com.wx.account.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAccountInfo", namespace = "http://service.account.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAccountInfo", namespace = "http://service.account.wx.com/")
public class GetAccountInfo {

    @XmlElement(name = "email", namespace = "")
    private String email;

    /**
     * 
     * @return
     *     returns String
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * 
     * @param email
     *     the value for the email property
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
