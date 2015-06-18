//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}activeModifications" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}passiveModifications" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}restrictions" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}judicial" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}parliamentary" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}mappings" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}otherAnalysis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}source"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activeModifications",
    "passiveModifications",
    "restrictions",
    "judicial",
    "parliamentary",
    "mappings",
    "otherAnalysis"
})
@XmlRootElement(name = "analysis")
public class Analysis {

    protected Amendments activeModifications;
    protected Amendments passiveModifications;
    protected Restrictions restrictions;
    protected JudicialArguments judicial;
    protected ParliamentaryAnalysis parliamentary;
    protected Mappings mappings;
    protected List<OtherAnalysis> otherAnalysis;
    @XmlAttribute(name = "source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String source;

    /**
     * Gets the value of the activeModifications property.
     * 
     * @return
     *     possible object is
     *     {@link Amendments }
     *     
     */
    public Amendments getActiveModifications() {
        return activeModifications;
    }

    /**
     * Sets the value of the activeModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendments }
     *     
     */
    public void setActiveModifications(Amendments value) {
        this.activeModifications = value;
    }

    /**
     * Gets the value of the passiveModifications property.
     * 
     * @return
     *     possible object is
     *     {@link Amendments }
     *     
     */
    public Amendments getPassiveModifications() {
        return passiveModifications;
    }

    /**
     * Sets the value of the passiveModifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendments }
     *     
     */
    public void setPassiveModifications(Amendments value) {
        this.passiveModifications = value;
    }

    /**
     * Gets the value of the restrictions property.
     * 
     * @return
     *     possible object is
     *     {@link Restrictions }
     *     
     */
    public Restrictions getRestrictions() {
        return restrictions;
    }

    /**
     * Sets the value of the restrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Restrictions }
     *     
     */
    public void setRestrictions(Restrictions value) {
        this.restrictions = value;
    }

    /**
     * Gets the value of the judicial property.
     * 
     * @return
     *     possible object is
     *     {@link JudicialArguments }
     *     
     */
    public JudicialArguments getJudicial() {
        return judicial;
    }

    /**
     * Sets the value of the judicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudicialArguments }
     *     
     */
    public void setJudicial(JudicialArguments value) {
        this.judicial = value;
    }

    /**
     * Gets the value of the parliamentary property.
     * 
     * @return
     *     possible object is
     *     {@link ParliamentaryAnalysis }
     *     
     */
    public ParliamentaryAnalysis getParliamentary() {
        return parliamentary;
    }

    /**
     * Sets the value of the parliamentary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParliamentaryAnalysis }
     *     
     */
    public void setParliamentary(ParliamentaryAnalysis value) {
        this.parliamentary = value;
    }

    /**
     * Gets the value of the mappings property.
     * 
     * @return
     *     possible object is
     *     {@link Mappings }
     *     
     */
    public Mappings getMappings() {
        return mappings;
    }

    /**
     * Sets the value of the mappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mappings }
     *     
     */
    public void setMappings(Mappings value) {
        this.mappings = value;
    }

    /**
     * Gets the value of the otherAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAnalysis }
     * 
     * 
     */
    public List<OtherAnalysis> getOtherAnalysis() {
        if (otherAnalysis == null) {
            otherAnalysis = new ArrayList<OtherAnalysis>();
        }
        return this.otherAnalysis;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
