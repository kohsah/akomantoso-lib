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
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/WD17}voteAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "vote")
public class Vote
    extends ComplexTypeInline
{

    @XmlAttribute(name = "choice")
    protected String choice;
    @XmlAttribute(name = "as")
    protected String as;
    @XmlAttribute(name = "by", required = true)
    protected String by;

    /**
     * Gets the value of the choice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoice() {
        return choice;
    }

    /**
     * Sets the value of the choice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoice(String value) {
        this.choice = value;
    }

    /**
     * Gets the value of the as property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAs() {
        return as;
    }

    /**
     * Sets the value of the as property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAs(String value) {
        this.as = value;
    }

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBy(String value) {
        this.by = value;
    }

}
