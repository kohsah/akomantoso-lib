//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:57:08 PM IST 
//


package org.akomantoso.schema.v3.csd13;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for posType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="posType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="before"/>
 *     &lt;enumeration value="inside"/>
 *     &lt;enumeration value="after"/>
 *     &lt;enumeration value="end"/>
 *     &lt;enumeration value="unspecified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "posType")
@XmlEnum
public enum PosType {

    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("before")
    BEFORE("before"),
    @XmlEnumValue("inside")
    INSIDE("inside"),
    @XmlEnumValue("after")
    AFTER("after"),
    @XmlEnumValue("end")
    END("end"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified");
    private final String value;

    PosType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PosType fromValue(String v) {
        for (PosType c: PosType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
