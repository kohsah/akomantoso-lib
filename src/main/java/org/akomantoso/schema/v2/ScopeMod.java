//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:37 PM EAT 
//


package org.akomantoso.schema.v2;

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
 *     &lt;extension base="{http://www.akomantoso.org/2.0}modificationType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.akomantoso.org/2.0}domain" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.akomantoso.org/2.0}ScopeMods" />
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
@XmlRootElement(name = "scopeMod")
public class ScopeMod
    extends ModificationType
{

    protected AnyOtherType domain;
    @XmlAttribute(name = "type", required = true)
    protected ScopeMods type;

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
     *     {@link ScopeMods }
     *     
     */
    public ScopeMods getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeMods }
     *     
     */
    public void setType(ScopeMods value) {
        this.type = value;
    }

}
