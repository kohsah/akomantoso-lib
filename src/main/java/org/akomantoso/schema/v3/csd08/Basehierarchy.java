//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.16 at 01:25:33 AM IST 
//


package org.akomantoso.schema.v3.csd08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;basehierarchy&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * The complex type basehierarchy is not used by any element, but is derived by other types to contain the basic structure of hierarchical elements&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for basehierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basehierarchy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08}num" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08}heading" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08}subheading" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basehierarchy", propOrder = {
    "num",
    "heading",
    "subheading"
})
@XmlSeeAlso({
    ItemType.class,
    BlockContainerType.class,
    SpeechType.class,
    RecitalHierarchy.class,
    CitationHierarchy.class,
    Hierarchy.class,
    Althierarchy.class
})
public class Basehierarchy {

    protected ComplexTypeInline num;
    protected Inlinereq heading;
    protected ComplexTypeInline subheading;

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeInline }
     *     
     */
    public ComplexTypeInline getNum() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeInline }
     *     
     */
    public void setNum(ComplexTypeInline value) {
        this.num = value;
    }

    /**
     * Gets the value of the heading property.
     * 
     * @return
     *     possible object is
     *     {@link Inlinereq }
     *     
     */
    public Inlinereq getHeading() {
        return heading;
    }

    /**
     * Sets the value of the heading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inlinereq }
     *     
     */
    public void setHeading(Inlinereq value) {
        this.heading = value;
    }

    /**
     * Gets the value of the subheading property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeInline }
     *     
     */
    public ComplexTypeInline getSubheading() {
        return subheading;
    }

    /**
     * Sets the value of the subheading property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeInline }
     *     
     */
    public void setSubheading(ComplexTypeInline value) {
        this.subheading = value;
    }

}
