
package com.wx.enquiry.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "addEnquiry", namespace = "http://service.enquiry.wx.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addEnquiry", namespace = "http://service.enquiry.wx.com/")
public class AddEnquiry {

    @XmlElement(name = "arg0", namespace = "")
    private com.wx.enquire.dto.EnquiryDTO arg0;

    /**
     * 
     * @return
     *     returns EnquiryDTO
     */
    public com.wx.enquire.dto.EnquiryDTO getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.wx.enquire.dto.EnquiryDTO arg0) {
        this.arg0 = arg0;
    }

}
