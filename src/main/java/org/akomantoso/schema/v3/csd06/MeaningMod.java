//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:21 PM EAT 
//


package org.akomantoso.schema.v3.csd06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}modificationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}domain" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}MeaningMods" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "domain"
})
@XmlRootElement(name = "meaningMod")
public class MeaningMod
    extends ModificationType
{

    protected AnyOtherType domain;
    @XmlAttribute(name = "type", required = true)
    protected MeaningMods type;

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherType }
     *     
     */
    public AnyOtherType getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherType }
     *     
     */
    public void setDomain(AnyOtherType value) {
        this.domain = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link MeaningMods }
     *     
     */
    public MeaningMods getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeaningMods }
     *     
     */
    public void setType(MeaningMods value) {
        this.type = value;
    }

}
