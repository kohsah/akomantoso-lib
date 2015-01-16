//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;judgmentStructure&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the type judgmentStructure specifies the overall content model of the document types that describe judgments&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for judgmentStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="judgmentStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}meta"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}coverPage" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}header"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}judgmentBody"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}conclusions" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}attachments" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}components" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}name"/>
 *       &lt;attribute name="contains" type="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}versionType" default="originalVersion" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "judgmentStructure", propOrder = {
    "meta",
    "coverPage",
    "header",
    "judgmentBody",
    "conclusions",
    "attachments",
    "components"
})
public class JudgmentStructure {

    @XmlElement(required = true)
    protected Meta meta;
    protected Basicopt coverPage;
    @XmlElement(required = true)
    protected Blocksopt header;
    @XmlElement(required = true)
    protected JudgmentBodyType judgmentBody;
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
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Blocksopt }
     *     
     */
    public Blocksopt getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocksopt }
     *     
     */
    public void setHeader(Blocksopt value) {
        this.header = value;
    }

    /**
     * Gets the value of the judgmentBody property.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentBodyType }
     *     
     */
    public JudgmentBodyType getJudgmentBody() {
        return judgmentBody;
    }

    /**
     * Sets the value of the judgmentBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentBodyType }
     *     
     */
    public void setJudgmentBody(JudgmentBodyType value) {
        this.judgmentBody = value;
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
