//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:58:34 AM IST 
//


package org.akomantoso.schema.v3.csd09;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opinionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="opinionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dissenting"/>
 *     &lt;enumeration value="agreeing"/>
 *     &lt;enumeration value="null"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "opinionType")
@XmlEnum
public enum OpinionType {

    @XmlEnumValue("dissenting")
    DISSENTING("dissenting"),
    @XmlEnumValue("agreeing")
    AGREEING("agreeing"),
    @XmlEnumValue("null")
    NULL("null");
    private final String value;

    OpinionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpinionType fromValue(String v) {
        for (OpinionType c: OpinionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
