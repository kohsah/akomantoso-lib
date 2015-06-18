//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:21 PM EAT 
//


package org.akomantoso.schema.v3.csd06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;debateBodyType&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the type debateBodyType specifies a content model of the main hierarchy of a debate&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for debateBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="debateBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}speechSection"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}coreopt"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debateBodyType", propOrder = {
    "administrationOfOathOrRollCallOrPrayers"
})
public class DebateBodyType {

    @XmlElementRefs({
        @XmlElementRef(name = "questions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oralStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "personalStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ministerialStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nationalInterest", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pointOfOrder", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "papers", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "debateSection", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = DebateSection.class, required = false),
        @XmlElementRef(name = "noticesOfMotion", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "communication", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "administrationOfOath", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "writtenStatements", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "declarationOfVote", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "proceduralMotions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "resolutions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prayers", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "petitions", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rollCall", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "adjournment", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06", type = JAXBElement.class, required = false)
    })
    protected List<Object> administrationOfOathOrRollCallOrPrayers;
    @XmlAttribute(name = "refersTo")
    protected List<String> refersTo;
    @XmlAttribute(name = "alternativeTo")
    @XmlSchemaType(name = "anyURI")
    protected String alternativeTo;
    @XmlAttribute(name = "currentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String currentId;
    @XmlAttribute(name = "originalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String originalId;
    @XmlAttribute(name = "GUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String guid;
    @XmlAttribute(name = "status")
    protected StatusType status;
    @XmlAttribute(name = "period")
    @XmlSchemaType(name = "anyURI")
    protected String period;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String space;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the administrationOfOathOrRollCallOrPrayers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the administrationOfOathOrRollCallOrPrayers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdministrationOfOathOrRollCallOrPrayers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link DebateSection }
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Althierarchy }{@code >}
     * 
     * 
     */
    public List<Object> getAdministrationOfOathOrRollCallOrPrayers() {
        if (administrationOfOathOrRollCallOrPrayers == null) {
            administrationOfOathOrRollCallOrPrayers = new ArrayList<Object>();
        }
        return this.administrationOfOathOrRollCallOrPrayers;
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
     * Gets the value of the currentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentId() {
        return currentId;
    }

    /**
     * Sets the value of the currentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentId(String value) {
        this.currentId = value;
    }

    /**
     * Gets the value of the originalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalId() {
        return originalId;
    }

    /**
     * Sets the value of the originalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalId(String value) {
        this.originalId = value;
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
