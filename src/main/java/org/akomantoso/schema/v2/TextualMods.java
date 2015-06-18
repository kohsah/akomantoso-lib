//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:37 PM EAT 
//


package org.akomantoso.schema.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextualMods.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TextualMods">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="repeal"/>
 *     &lt;enumeration value="substitution"/>
 *     &lt;enumeration value="insertion"/>
 *     &lt;enumeration value="replacement"/>
 *     &lt;enumeration value="renumbering"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TextualMods")
@XmlEnum
public enum TextualMods {

    @XmlEnumValue("repeal")
    REPEAL("repeal"),
    @XmlEnumValue("substitution")
    SUBSTITUTION("substitution"),
    @XmlEnumValue("insertion")
    INSERTION("insertion"),
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),
    @XmlEnumValue("renumbering")
    RENUMBERING("renumbering");
    private final String value;

    TextualMods(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextualMods fromValue(String v) {
        for (TextualMods c: TextualMods.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
