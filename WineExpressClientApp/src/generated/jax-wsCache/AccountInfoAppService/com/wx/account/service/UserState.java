
package com.wx.account.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="userState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GUEST"/>
 *     &lt;enumeration value="MEMBER"/>
 *     &lt;enumeration value="ADMIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "userState")
@XmlEnum
public enum UserState {

    GUEST,
    MEMBER,
    ADMIN;

    public String value() {
        return name();
    }

    public static UserState fromValue(String v) {
        return valueOf(v);
    }

}
