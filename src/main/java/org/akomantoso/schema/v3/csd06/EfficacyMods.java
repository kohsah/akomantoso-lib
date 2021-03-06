//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:21 PM EAT 
//


package org.akomantoso.schema.v3.csd06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EfficacyMods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EfficacyMods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="entryIntoEfficacy"/>
 *     &lt;enumeration value="endOfEfficacy"/>
 *     &lt;enumeration value="inapplication"/>
 *     &lt;enumeration value="retroactivity"/>
 *     &lt;enumeration value="extraefficacy"/>
 *     &lt;enumeration value="postponementOfEfficacy"/>
 *     &lt;enumeration value="prorogationOfEfficacy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EfficacyMods")
@XmlEnum
public enum EfficacyMods {

    @XmlEnumValue("entryIntoEfficacy")
    ENTRY_INTO_EFFICACY("entryIntoEfficacy"),
    @XmlEnumValue("endOfEfficacy")
    END_OF_EFFICACY("endOfEfficacy"),
    @XmlEnumValue("inapplication")
    INAPPLICATION("inapplication"),
    @XmlEnumValue("retroactivity")
    RETROACTIVITY("retroactivity"),
    @XmlEnumValue("extraefficacy")
    EXTRAEFFICACY("extraefficacy"),
    @XmlEnumValue("postponementOfEfficacy")
    POSTPONEMENT_OF_EFFICACY("postponementOfEfficacy"),
    @XmlEnumValue("prorogationOfEfficacy")
    PROROGATION_OF_EFFICACY("prorogationOfEfficacy");
    private final String value;

    EfficacyMods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EfficacyMods fromValue(String v) {
        for (EfficacyMods c: EfficacyMods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
