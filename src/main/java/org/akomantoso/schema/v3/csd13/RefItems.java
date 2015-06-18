//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.16 at 12:57:08 PM IST 
//


package org.akomantoso.schema.v3.csd13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;refItems&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * The complex type refItems is a list of types of references used in the references section.&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for refItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="refItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}docRefs"/>
 *         &lt;group ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}TLCs"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13}source"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refItems", propOrder = {
    "originalOrPassiveRefOrActiveRef"
})
public class RefItems {

    @XmlElementRefs({
        @XmlElementRef(name = "activeRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCLocation", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "passiveRef", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCProcess", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCObject", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCTerm", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "original", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCEvent", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "attachmentOf", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = AttachmentOf.class, required = false),
        @XmlElementRef(name = "TLCPerson", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "jurisprudence", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCOrganization", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCConcept", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TLCRole", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hasAttachment", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = HasAttachment.class, required = false),
        @XmlElementRef(name = "TLCReference", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD13", type = TLCReference.class, required = false)
    })
    protected List<Object> originalOrPassiveRefOrActiveRef;
    @XmlAttribute(name = "source", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String source;

    /**
     * Gets the value of the originalOrPassiveRefOrActiveRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalOrPassiveRefOrActiveRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalOrPassiveRefOrActiveRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link AttachmentOf }
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link HasAttachment }
     * {@link TLCReference }
     * 
     * 
     */
    public List<Object> getOriginalOrPassiveRefOrActiveRef() {
        if (originalOrPassiveRefOrActiveRef == null) {
            originalOrPassiveRefOrActiveRef = new ArrayList<Object>();
        }
        return this.originalOrPassiveRefOrActiveRef;
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
