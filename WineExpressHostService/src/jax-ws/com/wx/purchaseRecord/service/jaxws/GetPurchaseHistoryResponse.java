
package com.wx.purchaseRecord.service.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getPurchaseHistoryResponse", namespace = "http://service.purchaseRecord.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPurchaseHistoryResponse", namespace = "http://service.purchaseRecord.wx.com/")
public class GetPurchaseHistoryResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.wx.purchaseRecord.dto.PurchaseRecordDTO> _return;

    /**
     * 
     * @return
     *     returns List<PurchaseRecordDTO>
     */
    public List<com.wx.purchaseRecord.dto.PurchaseRecordDTO> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.wx.purchaseRecord.dto.PurchaseRecordDTO> _return) {
        this._return = _return;
    }

}
