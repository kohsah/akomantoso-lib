//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:37 PM EAT 
//


package org.akomantoso.schema.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.akomantoso.org/2.0}coreProperties">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.akomantoso.org/2.0}workProperties"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "frbRcountry",
    "frbRsubtype",
    "frbRnumber",
    "frbRname"
})
@XmlRootElement(name = "FRBRWork")
public class FRBRWork
    extends CoreProperties
{

    @XmlElement(name = "FRBRcountry", required = true)
    protected ValueType frbRcountry;
    @XmlElement(name = "FRBRsubtype")
    protected ValueType frbRsubtype;
    @XmlElement(name = "FRBRnumber")
    protected ValueType frbRnumber;
    @XmlElement(name = "FRBRname")
    protected ValueType frbRname;

    /**
     * Gets the value of the frbRcountry property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getFRBRcountry() {
        return frbRcountry;
    }

    /**
     * Sets the value of the frbRcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setFRBRcountry(ValueType value) {
        this.frbRcountry = value;
    }

    /**
     * Gets the value of the frbRsubtype property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getFRBRsubtype() {
        return frbRsubtype;
    }

    /**
     * Sets the value of the frbRsubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setFRBRsubtype(ValueType value) {
        this.frbRsubtype = value;
    }

    /**
     * Gets the value of the frbRnumber property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getFRBRnumber() {
        return frbRnumber;
    }

    /**
     * Sets the value of the frbRnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setFRBRnumber(ValueType value) {
        this.frbRnumber = value;
    }

    /**
     * Gets the value of the frbRname property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getFRBRname() {
        return frbRname;
    }

    /**
     * Sets the value of the frbRname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setFRBRname(ValueType value) {
        this.frbRname = value;
    }

}
