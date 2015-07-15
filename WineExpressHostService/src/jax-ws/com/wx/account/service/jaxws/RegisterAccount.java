
package com.wx.account.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "registerAccount", namespace = "http://service.account.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerAccount", namespace = "http://service.account.wx.com/")
public class RegisterAccount {

    @XmlElement(name = "accountInfoDTO", namespace = "")
    private com.wx.account.dto.AccountInfoDTO accountInfoDTO;

    /**
     * 
     * @return
     *     returns AccountInfoDTO
     */
    public com.wx.account.dto.AccountInfoDTO getAccountInfoDTO() {
        return this.accountInfoDTO;
    }

    /**
     * 
     * @param accountInfoDTO
     *     the value for the accountInfoDTO property
     */
    public void setAccountInfoDTO(com.wx.account.dto.AccountInfoDTO accountInfoDTO) {
        this.accountInfoDTO = accountInfoDTO;
    }

}
