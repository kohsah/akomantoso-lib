//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.05 at 10:55:21 PM EAT 
//


package org.akomantoso.schema.v3.csd06;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}blocksopt">
 *       &lt;attGroup ref="{http://docs.oasis-open.org/legaldocml/ns/akn/3.0/CSD06}cellattrs"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "td")
public class Td
    extends Blocksopt
{

    @XmlAttribute(name = "rowspan")
    protected BigInteger rowspan;
    @XmlAttribute(name = "colspan")
    protected BigInteger colspan;

    /**
     * Gets the value of the rowspan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowspan() {
        if (rowspan == null) {
            return new BigInteger("1");
        } else {
            return rowspan;
        }
    }

    /**
     * Sets the value of the rowspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowspan(BigInteger value) {
        this.rowspan = value;
    }

    /**
     * Gets the value of the colspan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColspan() {
        if (colspan == null) {
            return new BigInteger("1");
        } else {
            return colspan;
        }
    }

    /**
     * Sets the value of the colspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColspan(BigInteger value) {
        this.colspan = value;
    }

}
