//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:36 PM IST 
//


package org.akomantoso.schema.v3.csd11;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="removed"/>
 *     &lt;enumeration value="temporarilyRemoved"/>
 *     &lt;enumeration value="translated"/>
 *     &lt;enumeration value="editorial"/>
 *     &lt;enumeration value="edited"/>
 *     &lt;enumeration value="verbatim"/>
 *     &lt;enumeration value="incomplete"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="ignored"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusType")
@XmlEnum
public enum StatusType {

    @XmlEnumValue("removed")
    REMOVED("removed"),
    @XmlEnumValue("temporarilyRemoved")
    TEMPORARILY_REMOVED("temporarilyRemoved"),
    @XmlEnumValue("translated")
    TRANSLATED("translated"),
    @XmlEnumValue("editorial")
    EDITORIAL("editorial"),
    @XmlEnumValue("edited")
    EDITED("edited"),
    @XmlEnumValue("verbatim")
    VERBATIM("verbatim"),
    @XmlEnumValue("incomplete")
    INCOMPLETE("incomplete"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("ignored")
    IGNORED("ignored");
    private final String value;

    StatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusType fromValue(String v) {
        for (StatusType c: StatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
