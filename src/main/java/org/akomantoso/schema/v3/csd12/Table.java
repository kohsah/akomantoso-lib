//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}caption" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}tr" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}corereq"/>
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="border" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cellspacing" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="cellpadding" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caption",
    "tr"
})
@XmlRootElement(name = "table")
public class Table {

    protected ComplexTypeInline caption;
    @XmlElement(required = true)
    protected List<Tr> tr;
    @XmlAttribute(name = "width")
    protected BigInteger width;
    @XmlAttribute(name = "border")
    protected BigInteger border;
    @XmlAttribute(name = "cellspacing")
    protected BigInteger cellspacing;
    @XmlAttribute(name = "cellpadding")
    protected BigInteger cellpadding;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String space;
    @XmlAttribute(name = "alternativeTo")
    @XmlSchemaType(name = "anyURI")
    protected String alternativeTo;
    @XmlAttribute(name = "status")
    protected StatusType status;
    @XmlAttribute(name = "period")
    @XmlSchemaType(name = "anyURI")
    protected String period;
    @XmlAttribute(name = "eId")
    protected String eId;
    @XmlAttribute(name = "wId")
    protected String wId;
    @XmlAttribute(name = "GUID")
    protected String guid;
    @XmlAttribute(name = "refersTo")
    protected List<String> refersTo;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexTypeInline }
     *     
     */
    public ComplexTypeInline getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexTypeInline }
     *     
     */
    public void setCaption(ComplexTypeInline value) {
        this.caption = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tr }
     * 
     * 
     */
    public List<Tr> getTr() {
        if (tr == null) {
            tr = new ArrayList<Tr>();
        }
        return this.tr;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBorder(BigInteger value) {
        this.border = value;
    }

    /**
     * Gets the value of the cellspacing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCellspacing() {
        return cellspacing;
    }

    /**
     * Sets the value of the cellspacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCellspacing(BigInteger value) {
        this.cellspacing = value;
    }

    /**
     * Gets the value of the cellpadding property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCellpadding() {
        return cellpadding;
    }

    /**
     * Sets the value of the cellpadding property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCellpadding(BigInteger value) {
        this.cellpadding = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the alternativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeTo() {
        return alternativeTo;
    }

    /**
     * Sets the value of the alternativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeTo(String value) {
        this.alternativeTo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the eId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEId() {
        return eId;
    }

    /**
     * Sets the value of the eId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEId(String value) {
        this.eId = value;
    }

    /**
     * Gets the value of the wId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWId() {
        return wId;
    }

    /**
     * Sets the value of the wId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWId(String value) {
        this.wId = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the refersTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refersTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefersTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefersTo() {
        if (refersTo == null) {
            refersTo = new ArrayList<String>();
        }
        return this.refersTo;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the titleAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAttr() {
        return titleAttr;
    }

    /**
     * Sets the value of the titleAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttr(String value) {
        this.titleAttr = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
