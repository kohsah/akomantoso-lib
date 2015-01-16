//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:56:53 PM IST 
//


package org.akomantoso.schema.v3.csd12;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;inlinereq&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * the complex type inlinereq defines the content model and attributes shared by all blocks and inlines. Here the eId attribute is required&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for inlinereq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inlinereq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}inlineCM"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12}corereq"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inlinereq", propOrder = {
    "content"
})
@XmlSeeAlso({
    Ref.class,
    Rref.class
})
public class Inlinereq {

    @XmlElementRefs({
        @XmlElementRef(name = "object", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Remark.class, required = false),
        @XmlElementRef(name = "def", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lawyer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Lawyer.class, required = false),
        @XmlElementRef(name = "opinion", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Opinion.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "placeholder", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Placeholder.class, required = false),
        @XmlElementRef(name = "docPurpose", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subFlow", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "change", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "organization", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "event", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docIntroducer", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = A.class, required = false),
        @XmlElementRef(name = "docStage", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "role", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "term", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recordedTime", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = RecordedTime.class, required = false),
        @XmlElementRef(name = "process", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "shortTitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "relatedDocument", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = RelatedDocument.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quantity", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Quantity.class, required = false),
        @XmlElementRef(name = "neutralCitation", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Ref.class, required = false),
        @XmlElementRef(name = "authorialNote", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = AuthorialNote.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "session", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Session.class, required = false),
        @XmlElementRef(name = "argument", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "u", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docTitle", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docJurisdiction", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ins", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docProponent", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = DocProponent.class, required = false),
        @XmlElementRef(name = "entity", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Entity.class, required = false),
        @XmlElementRef(name = "rref", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Rref.class, required = false),
        @XmlElementRef(name = "eol", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "marker", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Marker.class, required = false),
        @XmlElementRef(name = "docAuthority", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inline", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = ElementInline.class, required = false),
        @XmlElementRef(name = "docCommittee", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = DocCommittee.class, required = false),
        @XmlElementRef(name = "signature", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "noteRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = NoteRef.class, required = false),
        @XmlElementRef(name = "del", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docDate", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = DocDate.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Person.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mref", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "legislature", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Legislature.class, required = false),
        @XmlElementRef(name = "mod", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mmod", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "eop", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "courtType", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Img.class, required = false),
        @XmlElementRef(name = "concept", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "affectedDocument", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = AffectedDocument.class, required = false),
        @XmlElementRef(name = "fillIn", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = FillIn.class, required = false),
        @XmlElementRef(name = "rmod", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Rmod.class, required = false),
        @XmlElementRef(name = "docketNumber", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "docStatus", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "embeddedText", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = EmbeddedText.class, required = false),
        @XmlElementRef(name = "time", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Time.class, required = false),
        @XmlElementRef(name = "party", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Party.class, required = false),
        @XmlElementRef(name = "docType", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "omissis", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "decoration", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Date.class, required = false),
        @XmlElementRef(name = "docNumber", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "judge", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Judge.class, required = false),
        @XmlElementRef(name = "vote", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = Vote.class, required = false),
        @XmlElementRef(name = "embeddedStructure", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = EmbeddedStructure.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outcome", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
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
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;inlinereq&lt;/name&gt;
     * </pre>
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD12" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
     * the complex type inlinereq defines the content model and attributes shared by all blocks and inlines. Here the eId attribute is required&lt;/comment&gt;
     * </pre>
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link Remark }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Lawyer }
     * {@link Opinion }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Placeholder }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link SubFlowStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link A }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link RecordedTime }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link RelatedDocument }
     * {@link JAXBElement }{@code <}{@link Markeropt }{@code >}
     * {@link Quantity }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link String }
     * {@link Ref }
     * {@link AuthorialNote }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Session }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link DocProponent }
     * {@link Entity }
     * {@link Rref }
     * {@link JAXBElement }{@code <}{@link EolType }{@code >}
     * {@link Marker }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link ElementInline }
     * {@link DocCommittee }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link NoteRef }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link DocDate }
     * {@link Person }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Legislature }
     * {@link JAXBElement }{@code <}{@link ModType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModType }{@code >}
     * {@link JAXBElement }{@code <}{@link EolType }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Img }
     * {@link JAXBElement }{@code <}{@link Inlinereqreq }{@code >}
     * {@link AffectedDocument }
     * {@link FillIn }
     * {@link Rmod }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link EmbeddedText }
     * {@link Time }
     * {@link Party }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Date }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link Judge }
     * {@link Vote }
     * {@link EmbeddedStructure }
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * {@link JAXBElement }{@code <}{@link ComplexTypeInline }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
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
