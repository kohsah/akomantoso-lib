//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:59:01 AM IST 
//


package org.akomantoso.schema.v3.csd10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;debateStructure&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the type debateStructure specifies the overall content model of the document types that describe debates&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for debateStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="debateStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}meta"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}coverPage" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}preface" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}debateBody"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}conclusions" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}attachments" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}components" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}name"/>
 *       &lt;attribute name="contains" type="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD10}versionType" default="originalVersion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debateStructure", propOrder = {
    "meta",
    "coverPage",
    "preface",
    "debateBody",
    "conclusions",
    "attachments",
    "components"
})
public class DebateStructure {

    @XmlElement(required = true)
    protected Meta meta;
    protected Basicopt coverPage;
    protected Prefaceopt preface;
    @XmlElement(required = true)
    protected DebateBodyType debateBody;
    protected Basicopt conclusions;
    protected Attachments attachments;
    protected Components components;
    @XmlAttribute(name = "contains")
    protected VersionType contains;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link Meta }
     *     
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta }
     *     
     */
    public void setMeta(Meta value) {
        this.meta = value;
    }

    /**
     * Gets the value of the coverPage property.
     * 
     * @return
     *     possible object is
     *     {@link Basicopt }
     *     
     */
    public Basicopt getCoverPage() {
        return coverPage;
    }

    /**
     * Sets the value of the coverPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Basicopt }
     *     
     */
    public void setCoverPage(Basicopt value) {
        this.coverPage = value;
    }

    /**
     * Gets the value of the preface property.
     * 
     * @return
     *     possible object is
     *     {@link Prefaceopt }
     *     
     */
    public Prefaceopt getPreface() {
        return preface;
    }

    /**
     * Sets the value of the preface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prefaceopt }
     *     
     */
    public void setPreface(Prefaceopt value) {
        this.preface = value;
    }

    /**
     * Gets the value of the debateBody property.
     * 
     * @return
     *     possible object is
     *     {@link DebateBodyType }
     *     
     */
    public DebateBodyType getDebateBody() {
        return debateBody;
    }

    /**
     * Sets the value of the debateBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebateBodyType }
     *     
     */
    public void setDebateBody(DebateBodyType value) {
        this.debateBody = value;
    }

    /**
     * Gets the value of the conclusions property.
     * 
     * @return
     *     possible object is
     *     {@link Basicopt }
     *     
     */
    public Basicopt getConclusions() {
        return conclusions;
    }

    /**
     * Sets the value of the conclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Basicopt }
     *     
     */
    public void setConclusions(Basicopt value) {
        this.conclusions = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link Attachments }
     *     
     */
    public Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachments }
     *     
     */
    public void setAttachments(Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link Components }
     *     
     */
    public Components getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link Components }
     *     
     */
    public void setComponents(Components value) {
        this.components = value;
    }

    /**
     * Gets the value of the contains property.
     * 
     * @return
     *     possible object is
     *     {@link VersionType }
     *     
     */
    public VersionType getContains() {
        if (contains == null) {
            return VersionType.ORIGINAL_VERSION;
        } else {
            return contains;
        }
    }

    /**
     * Sets the value of the contains property.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionType }
     *     
     */
    public void setContains(VersionType value) {
        this.contains = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
