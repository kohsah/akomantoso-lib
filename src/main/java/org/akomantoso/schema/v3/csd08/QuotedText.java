//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.16 at 01:25:33 AM IST 
//


package org.akomantoso.schema.v3.csd08;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08}inline">
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD08}quote"/>
 *       &lt;attribute name="for" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "quotedText")
public class QuotedText
    extends ComplexTypeInline
{

    @XmlAttribute(name = "for")
    @XmlSchemaType(name = "anyURI")
    protected String _for;
    @XmlAttribute(name = "startQuote")
    protected String startQuote;
    @XmlAttribute(name = "endQuote")
    protected String endQuote;

    /**
     * Gets the value of the for property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFor() {
        return _for;
    }

    /**
     * Sets the value of the for property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFor(String value) {
        this._for = value;
    }

    /**
     * Gets the value of the startQuote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartQuote() {
        return startQuote;
    }

    /**
     * Sets the value of the startQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartQuote(String value) {
        this.startQuote = value;
    }

    /**
     * Gets the value of the endQuote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndQuote() {
        return endQuote;
    }

    /**
     * Sets the value of the endQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndQuote(String value) {
        this.endQuote = value;
    }

}
