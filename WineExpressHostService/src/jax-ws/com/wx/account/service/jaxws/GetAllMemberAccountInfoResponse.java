
package com.wx.account.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllMemberAccountInfoResponse", namespace = "http://service.account.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMemberAccountInfoResponse", namespace = "http://service.account.wx.com/")
public class GetAllMemberAccountInfoResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.wx.account.dto.AccountInfoDTO> _return;

    /**
     * 
     * @return
     *     returns List<AccountInfoDTO>
     */
    public List<com.wx.account.dto.AccountInfoDTO> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.wx.account.dto.AccountInfoDTO> _return) {
        this._return = _return;
    }

}
