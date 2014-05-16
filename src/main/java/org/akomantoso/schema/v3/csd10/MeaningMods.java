//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:59:01 AM IST 
//


package org.akomantoso.schema.v3.csd10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeaningMods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeaningMods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="variation"/>
 *     &lt;enumeration value="termModification"/>
 *     &lt;enumeration value="authenticInterpretation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MeaningMods")
@XmlEnum
public enum MeaningMods {

    @XmlEnumValue("variation")
    VARIATION("variation"),
    @XmlEnumValue("termModification")
    TERM_MODIFICATION("termModification"),
    @XmlEnumValue("authenticInterpretation")
    AUTHENTIC_INTERPRETATION("authenticInterpretation");
    private final String value;

    MeaningMods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeaningMods fromValue(String v) {
        for (MeaningMods c: MeaningMods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
