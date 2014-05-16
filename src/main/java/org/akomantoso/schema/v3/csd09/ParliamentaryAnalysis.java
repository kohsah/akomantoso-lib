//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.16 at 11:58:34 AM IST 
//


package org.akomantoso.schema.v3.csd09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;type xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Complex&lt;/type&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;name xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;parliamentaryAnalysis&lt;/name&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;comment xmlns="http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;
 * The complex type parliamentaryAnalysis is a list of all the parliamentary analysis elements that can be used on the analysis of a debate&lt;/comment&gt;
 * </pre>
 * 
 * 
 * <p>Java class for parliamentaryAnalysis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parliamentaryAnalysis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}quorumVerification"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}voting"/>
 *         &lt;element ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09}recount"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parliamentaryAnalysis", propOrder = {
    "quorumVerificationOrVotingOrRecount"
})
public class ParliamentaryAnalysis {

    @XmlElementRefs({
        @XmlElementRef(name = "voting", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "recount", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quorumVerification", namespace = "http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD09", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<ParliamentaryAnalysisType>> quorumVerificationOrVotingOrRecount;

    /**
     * Gets the value of the quorumVerificationOrVotingOrRecount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quorumVerificationOrVotingOrRecount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuorumVerificationOrVotingOrRecount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ParliamentaryAnalysisType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParliamentaryAnalysisType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParliamentaryAnalysisType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ParliamentaryAnalysisType>> getQuorumVerificationOrVotingOrRecount() {
        if (quorumVerificationOrVotingOrRecount == null) {
            quorumVerificationOrVotingOrRecount = new ArrayList<JAXBElement<ParliamentaryAnalysisType>>();
        }
        return this.quorumVerificationOrVotingOrRecount;
    }

}
