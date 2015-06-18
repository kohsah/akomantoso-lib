//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;akomaNtosoType&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the complex type akomaNtosoType is the type for the root element in Akoma Ntoso.&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for akomaNtosoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akomaNtosoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}documentType"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}components" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "akomaNtosoType", propOrder = {
    "amendmentList",
    "officialGazette",
    "documentCollection",
    "act",
    "bill",
    "debateReport",
    "debate",
    "statement",
    "amendment",
    "judgment",
    "fragment",
    "doc",
    "components"
})
public class AkomaNtosoType {

    protected CollectionStructure amendmentList;
    protected CollectionStructure officialGazette;
    protected CollectionStructure documentCollection;
    protected HierarchicalStructure act;
    protected HierarchicalStructure bill;
    protected OpenStructure debateReport;
    protected DebateStructure debate;
    protected OpenStructure statement;
    protected AmendmentStructure amendment;
    protected JudgmentStructure judgment;
    protected FragmentStructure fragment;
    protected OpenStructure doc;
    protected Components components;

    /**
     * Gets the value of the amendmentList property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getAmendmentList() {
        return amendmentList;
    }

    /**
     * Sets the value of the amendmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setAmendmentList(CollectionStructure value) {
        this.amendmentList = value;
    }

    /**
     * Gets the value of the officialGazette property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getOfficialGazette() {
        return officialGazette;
    }

    /**
     * Sets the value of the officialGazette property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setOfficialGazette(CollectionStructure value) {
        this.officialGazette = value;
    }

    /**
     * Gets the value of the documentCollection property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionStructure }
     *     
     */
    public CollectionStructure getDocumentCollection() {
        return documentCollection;
    }

    /**
     * Sets the value of the documentCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionStructure }
     *     
     */
    public void setDocumentCollection(CollectionStructure value) {
        this.documentCollection = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalStructure }
     *     
     */
    public HierarchicalStructure getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalStructure }
     *     
     */
    public void setAct(HierarchicalStructure value) {
        this.act = value;
    }

    /**
     * Gets the value of the bill property.
     * 
     * @return
     *     possible object is
     *     {@link HierarchicalStructure }
     *     
     */
    public HierarchicalStructure getBill() {
        return bill;
    }

    /**
     * Sets the value of the bill property.
     * 
     * @param value
     *     allowed object is
     *     {@link HierarchicalStructure }
     *     
     */
    public void setBill(HierarchicalStructure value) {
        this.bill = value;
    }

    /**
     * Gets the value of the debateReport property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getDebateReport() {
        return debateReport;
    }

    /**
     * Sets the value of the debateReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setDebateReport(OpenStructure value) {
        this.debateReport = value;
    }

    /**
     * Gets the value of the debate property.
     * 
     * @return
     *     possible object is
     *     {@link DebateStructure }
     *     
     */
    public DebateStructure getDebate() {
        return debate;
    }

    /**
     * Sets the value of the debate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebateStructure }
     *     
     */
    public void setDebate(DebateStructure value) {
        this.debate = value;
    }

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setStatement(OpenStructure value) {
        this.statement = value;
    }

    /**
     * Gets the value of the amendment property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentStructure }
     *     
     */
    public AmendmentStructure getAmendment() {
        return amendment;
    }

    /**
     * Sets the value of the amendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentStructure }
     *     
     */
    public void setAmendment(AmendmentStructure value) {
        this.amendment = value;
    }

    /**
     * Gets the value of the judgment property.
     * 
     * @return
     *     possible object is
     *     {@link JudgmentStructure }
     *     
     */
    public JudgmentStructure getJudgment() {
        return judgment;
    }

    /**
     * Sets the value of the judgment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JudgmentStructure }
     *     
     */
    public void setJudgment(JudgmentStructure value) {
        this.judgment = value;
    }

    /**
     * Gets the value of the fragment property.
     * 
     * @return
     *     possible object is
     *     {@link FragmentStructure }
     *     
     */
    public FragmentStructure getFragment() {
        return fragment;
    }

    /**
     * Sets the value of the fragment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FragmentStructure }
     *     
     */
    public void setFragment(FragmentStructure value) {
        this.fragment = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link OpenStructure }
     *     
     */
    public OpenStructure getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenStructure }
     *     
     */
    public void setDoc(OpenStructure value) {
        this.doc = value;
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

}
