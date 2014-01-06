//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 03:51:15 PM EAT 
//


package org.akomantoso.schema.v3.csd07;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalSystemMods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalSystemMods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="staticReference"/>
 *     &lt;enumeration value="implementation"/>
 *     &lt;enumeration value="ratification"/>
 *     &lt;enumeration value="application"/>
 *     &lt;enumeration value="legislativeDelegation"/>
 *     &lt;enumeration value="deregulation"/>
 *     &lt;enumeration value="conversion"/>
 *     &lt;enumeration value="expiration"/>
 *     &lt;enumeration value="reiteration"/>
 *     &lt;enumeration value="remaking"/>
 *     &lt;enumeration value="republication"/>
 *     &lt;enumeration value="coordination"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LegalSystemMods")
@XmlEnum
public enum LegalSystemMods {

    @XmlEnumValue("staticReference")
    STATIC_REFERENCE("staticReference"),
    @XmlEnumValue("implementation")
    IMPLEMENTATION("implementation"),
    @XmlEnumValue("ratification")
    RATIFICATION("ratification"),
    @XmlEnumValue("application")
    APPLICATION("application"),
    @XmlEnumValue("legislativeDelegation")
    LEGISLATIVE_DELEGATION("legislativeDelegation"),
    @XmlEnumValue("deregulation")
    DEREGULATION("deregulation"),
    @XmlEnumValue("conversion")
    CONVERSION("conversion"),
    @XmlEnumValue("expiration")
    EXPIRATION("expiration"),
    @XmlEnumValue("reiteration")
    REITERATION("reiteration"),
    @XmlEnumValue("remaking")
    REMAKING("remaking"),
    @XmlEnumValue("republication")
    REPUBLICATION("republication"),
    @XmlEnumValue("coordination")
    COORDINATION("coordination");
    private final String value;

    LegalSystemMods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegalSystemMods fromValue(String v) {
        for (LegalSystemMods c: LegalSystemMods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
