//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:57:08 PM IST 
//


package org.akomantoso.schema.v3.csd13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;coreProperties&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * The complexType coreProperties lists the identifying properties available at any of the FRBR hierarchy levels.&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for coreProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coreProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}FRBRthis"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}FRBRuri" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}FRBRalias" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}FRBRdate" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}FRBRauthor" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}componentInfo" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}preservation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coreProperties", propOrder = {
    "frbRthis",
    "frbRuri",
    "frbRalias",
    "frbRdate",
    "frbRauthor",
    "componentInfo",
    "preservation"
})
@XmlSeeAlso({
    FRBRManifestation.class,
    FRBRExpression.class,
    FRBRWork.class
})
public class CoreProperties {

    @XmlElement(name = "FRBRthis", required = true)
    protected ValueType frbRthis;
    @XmlElement(name = "FRBRuri", required = true)
    protected List<ValueType> frbRuri;
    @XmlElement(name = "FRBRalias")
    protected List<FRBRalias> frbRalias;
    @XmlElement(name = "FRBRdate", required = true)
    protected List<FRBRdate> frbRdate;
    @XmlElement(name = "FRBRauthor", required = true)
    protected List<FRBRauthor> frbRauthor;
    protected ComponentInfo componentInfo;
    protected AnyOtherType preservation;

    /**
     * Gets the value of the frbRthis property.
     * 
     * @return
     *     possible object is
     *     {@link ValueType }
     *     
     */
    public ValueType getFRBRthis() {
        return frbRthis;
    }

    /**
     * Sets the value of the frbRthis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueType }
     *     
     */
    public void setFRBRthis(ValueType value) {
        this.frbRthis = value;
    }

    /**
     * Gets the value of the frbRuri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRuri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRuri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueType }
     * 
     * 
     */
    public List<ValueType> getFRBRuri() {
        if (frbRuri == null) {
            frbRuri = new ArrayList<ValueType>();
        }
        return this.frbRuri;
    }

    /**
     * Gets the value of the frbRalias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRalias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRalias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FRBRalias }
     * 
     * 
     */
    public List<FRBRalias> getFRBRalias() {
        if (frbRalias == null) {
            frbRalias = new ArrayList<FRBRalias>();
        }
        return this.frbRalias;
    }

    /**
     * Gets the value of the frbRdate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRdate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRdate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FRBRdate }
     * 
     * 
     */
    public List<FRBRdate> getFRBRdate() {
        if (frbRdate == null) {
            frbRdate = new ArrayList<FRBRdate>();
        }
        return this.frbRdate;
    }

    /**
     * Gets the value of the frbRauthor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frbRauthor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFRBRauthor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FRBRauthor }
     * 
     * 
     */
    public List<FRBRauthor> getFRBRauthor() {
        if (frbRauthor == null) {
            frbRauthor = new ArrayList<FRBRauthor>();
        }
        return this.frbRauthor;
    }

    /**
     * Gets the value of the componentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentInfo }
     *     
     */
    public ComponentInfo getComponentInfo() {
        return componentInfo;
    }

    /**
     * Sets the value of the componentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentInfo }
     *     
     */
    public void setComponentInfo(ComponentInfo value) {
        this.componentInfo = value;
    }

    /**
     * Gets the value of the preservation property.
     * 
     * @return
     *     possible object is
     *     {@link AnyOtherType }
     *     
     */
    public AnyOtherType getPreservation() {
        return preservation;
    }

    /**
     * Sets the value of the preservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyOtherType }
     *     
     */
    public void setPreservation(AnyOtherType value) {
        this.preservation = value;
    }

}
