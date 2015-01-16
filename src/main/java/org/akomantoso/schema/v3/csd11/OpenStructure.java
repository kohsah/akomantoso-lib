//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:36 PM IST 
//


package org.akomantoso.schema.v3.csd11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;openStructure&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the type openStructure specifies the overall content model of all the document types that do not have a specific and peculiar structure&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for openStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="openStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}meta"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}coverPage" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}preface" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}preamble" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}mainBody"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}conclusions" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}attachments" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}components" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}name"/>
 *       &lt;attribute name="contains" type="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD11}versionType" default="originalVersion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "openStructure", propOrder = {
    "meta",
    "coverPage",
    "preface",
    "preamble",
    "mainBody",
    "conclusions",
    "attachments",
    "components"
})
public class OpenStructure {

    @XmlElement(required = true)
    protected Meta meta;
    protected Basicopt coverPage;
    protected Prefaceopt preface;
    protected Preambleopt preamble;
    @XmlElement(required = true)
    protected Maincontent mainBody;
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
     * Gets the value of the preamble property.
     * 
     * @return
     *     possible object is
     *     {@link Preambleopt }
     *     
     */
    public Preambleopt getPreamble() {
        return preamble;
    }

    /**
     * Sets the value of the preamble property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preambleopt }
     *     
     */
    public void setPreamble(Preambleopt value) {
        this.preamble = value;
    }

    /**
     * Gets the value of the mainBody property.
     * 
     * @return
     *     possible object is
     *     {@link Maincontent }
     *     
     */
    public Maincontent getMainBody() {
        return mainBody;
    }

    /**
     * Sets the value of the mainBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Maincontent }
     *     
     */
    public void setMainBody(Maincontent value) {
        this.mainBody = value;
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
