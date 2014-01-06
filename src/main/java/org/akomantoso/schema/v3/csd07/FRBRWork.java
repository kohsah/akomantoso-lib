//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.06 at 03:51:15 PM EAT 
//


package org.akomantoso.schema.v3.csd07;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD07}coreProperties">
 *       &lt;sequence>
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD07}workProperties"/>
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
    "frbRname",
    "frbRprescriptive",
    "frbRauthoritative"
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
    protected List<ValueType> frbRnumber;
    @XmlElement(name = "FRBRname")
    protected List<ValueType> frbRname;
    @XmlElement(name = "FRBRprescriptive")
    protected BooleanValueType frbRprescriptive;
    @XmlElement(name = "FRBRauthoritative")
    protected BooleanValueType frbRauthoritative;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRnumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getFRBRnumber() {
        if (frbRnumber == null) {
            frbRnumber = new ArrayList<ValueType>();
        }
        return this.frbRnumber;
    }

    /**
     * Gets the value of the frbRname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getFRBRname() {
        if (frbRname == null) {
            frbRname = new ArrayList<ValueType>();
        }
        return this.frbRname;
    }

    /**
     * Gets the value of the frbRprescriptive property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanValueType }
     *     
     */
    public BooleanValueType getFRBRprescriptive() {
        return frbRprescriptive;
    }

    /**
     * Sets the value of the frbRprescriptive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanValueType }
     *     
     */
    public void setFRBRprescriptive(BooleanValueType value) {
        this.frbRprescriptive = value;
    }

    /**
     * Gets the value of the frbRauthoritative property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanValueType }
     *     
     */
    public BooleanValueType getFRBRauthoritative() {
        return frbRauthoritative;
    }

    /**
     * Sets the value of the frbRauthoritative property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanValueType }
     *     
     */
    public void setFRBRauthoritative(BooleanValueType value) {
        this.frbRauthoritative = value;
    }

}
