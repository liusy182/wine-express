
package com.wx.csm.appservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GeneratePasssord", namespace = "http://appservice.csm.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneratePasssord", namespace = "http://appservice.csm.wx.com/")
public class GeneratePasssord {

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
