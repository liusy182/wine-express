
package com.wx.account.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "loginExistingAccountResponse", namespace = "http://service.account.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginExistingAccountResponse", namespace = "http://service.account.wx.com/")
public class LoginExistingAccountResponse {

    @XmlElement(name = "return", namespace = "")
    private com.wx.account.dto.AccountStateDTO _return;

    /**
     * 
     * @return
     *     returns AccountStateDTO
     */
    public com.wx.account.dto.AccountStateDTO getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.wx.account.dto.AccountStateDTO _return) {
        this._return = _return;
    }

}
