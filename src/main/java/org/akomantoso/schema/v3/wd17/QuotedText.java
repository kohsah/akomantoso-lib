//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.09 at 12:35:58 PM IST 
//


package org.akomantoso.schema.v3.wd17;

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
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/WD17}inline">
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/WD17}quote"/>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/WD17}for"/>
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

    @XmlAttribute(name = "startQuote")
    protected String startQuote;
    @XmlAttribute(name = "endQuote")
    protected String endQuote;
    @XmlAttribute(name = "inlineQuote")
    protected String inlineQuote;
    @XmlAttribute(name = "for")
    protected String _for;

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

    /**
     * Gets the value of the inlineQuote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInlineQuote() {
        return inlineQuote;
    }

    /**
     * Sets the value of the inlineQuote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInlineQuote(String value) {
        this.inlineQuote = value;
    }

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

}
