//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:36 PM IST 
//


package org.akomantoso.schema.v3.csd11;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;hierarchy&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * The complex type hierarchy is used by most or all the hierarchical elements of act-like documents.&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for hierarchy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hierarchy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}basehierarchy">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}intro" minOccurs="0"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}componentRef"/>
 *             &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}hierElements"/>
 *           &lt;/choice>
 *           &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}wrapUp" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}content"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}corereq"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hierarchy", propOrder = {
    "intro",
    "componentRefOrClauseOrSection",
    "wrapUp",
    "content"
})
@XmlSeeAlso({
    Hcontainer.class
})
public class Hierarchy
    extends Basehierarchy
{

    protected Blocksreq intro;
    @XmlElementRefs({
        @XmlElementRef(name = "subdivision", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sublist", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "part", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "chapter", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subsection", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "book", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "alinea", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "list", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "proviso", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subpart", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subparagraph", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transitional", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subchapter", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "componentRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "indent", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subtitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subrule", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hcontainer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = Hcontainer.class, required = false),
        @XmlElementRef(name = "point", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "article", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subclause", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "division", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "section", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tome", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "clause", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rule", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paragraph", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11", type = JAXBElement.class, required = false)
    })
    protected List<Object> componentRefOrClauseOrSection;
    protected Blocksreq wrapUp;
    protected Blocksreq content;
    @XmlAttribute(name = "refersTo")
    protected List<String> refersTo;
    @XmlAttribute(name = "eId")
    protected String eId;
    @XmlAttribute(name = "wId")
    protected String wId;
    @XmlAttribute(name = "GUID")
    protected String guid;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String space;
    @XmlAttribute(name = "status")
    protected StatusType status;
    @XmlAttribute(name = "period")
    @XmlSchemaType(name = "anyURI")
    protected String period;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
    @XmlAttribute(name = "alternativeTo")
    @XmlSchemaType(name = "anyURI")
    protected String alternativeTo;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the intro property.
     * 
     * @return
     *     possible object is
     *     {@link Blocksreq }
     *     
     */
    public Blocksreq getIntro() {
        return intro;
    }

    /**
     * Sets the value of the intro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocksreq }
     *     
     */
    public void setIntro(Blocksreq value) {
        this.intro = value;
    }

    /**
     * Gets the value of the componentRefOrClauseOrSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRefOrClauseOrSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRefOrClauseOrSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link SrcType }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link Hcontainer }
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * {@link JAXBElement }{@code <}{@link Hierarchy }{@code >}
     * 
     * 
     */
    public List<Object> getComponentRefOrClauseOrSection() {
        if (componentRefOrClauseOrSection == null) {
            componentRefOrClauseOrSection = new ArrayList<Object>();
        }
        return this.componentRefOrClauseOrSection;
    }

    /**
     * Gets the value of the wrapUp property.
     * 
     * @return
     *     possible object is
     *     {@link Blocksreq }
     *     
     */
    public Blocksreq getWrapUp() {
        return wrapUp;
    }

    /**
     * Sets the value of the wrapUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocksreq }
     *     
     */
    public void setWrapUp(Blocksreq value) {
        this.wrapUp = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link Blocksreq }
     *     
     */
    public Blocksreq getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocksreq }
     *     
     */
    public void setContent(Blocksreq value) {
        this.content = value;
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
