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
 * <p>Java class for versionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="versionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="originalVersion"/>
 *     &lt;enumeration value="singleVersion"/>
 *     &lt;enumeration value="multipleVersions"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "versionType")
@XmlEnum
public enum VersionType {

    @XmlEnumValue("originalVersion")
    ORIGINAL_VERSION("originalVersion"),
    @XmlEnumValue("singleVersion")
    SINGLE_VERSION("singleVersion"),
    @XmlEnumValue("multipleVersions")
    MULTIPLE_VERSIONS("multipleVersions");
    private final String value;

    VersionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionType fromValue(String v) {
        for (VersionType c: VersionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
