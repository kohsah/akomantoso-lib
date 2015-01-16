//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:57:08 PM IST 
//


package org.akomantoso.schema.v3.csd13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;docContainerType&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the complex type docContainerType defines a shared content model for elements that contain whole documents, namely attachment, collectionItem, component.&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for docContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="docContainerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}basehierarchy">
 *       &lt;choice>
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}documentType"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}interstitial"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}toc"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}documentRef"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}corereq"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "docContainerType", propOrder = {
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
    "portion",
    "doc",
    "interstitial",
    "toc",
    "documentRef"
})
public class DocContainerType
    extends Basehierarchy
{

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
    protected PortionStructure portion;
    protected OpenStructure doc;
    protected Blocksreq interstitial;
    protected Toc toc;
    protected LinkType documentRef;
    @XmlAttribute(name = "alternativeTo")
    @XmlSchemaType(name = "anyURI")
    protected String alternativeTo;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String titleAttr;
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
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String space;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the portion property.
     * 
     * @return
     *     possible object is
     *     {@link PortionStructure }
     *     
     */
    public PortionStructure getPortion() {
        return portion;
    }

    /**
     * Sets the value of the portion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortionStructure }
     *     
     */
    public void setPortion(PortionStructure value) {
        this.portion = value;
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
     * Gets the value of the interstitial property.
     * 
     * @return
     *     possible object is
     *     {@link Blocksreq }
     *     
     */
    public Blocksreq getInterstitial() {
        return interstitial;
    }

    /**
     * Sets the value of the interstitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Blocksreq }
     *     
     */
    public void setInterstitial(Blocksreq value) {
        this.interstitial = value;
    }

    /**
     * Gets the value of the toc property.
     * 
     * @return
     *     possible object is
     *     {@link Toc }
     *     
     */
    public Toc getToc() {
        return toc;
    }

    /**
     * Sets the value of the toc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Toc }
     *     
     */
    public void setToc(Toc value) {
        this.toc = value;
    }

    /**
     * Gets the value of the documentRef property.
     * 
     * @return
     *     possible object is
     *     {@link LinkType }
     *     
     */
    public LinkType getDocumentRef() {
        return documentRef;
    }

    /**
     * Sets the value of the documentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkType }
     *     
     */
    public void setDocumentRef(LinkType value) {
        this.documentRef = value;
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
