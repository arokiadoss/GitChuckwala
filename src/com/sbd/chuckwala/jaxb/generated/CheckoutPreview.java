//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.20 at 04:03:16 PM EDT 
//


package com.sbd.chuckwala.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaAssetID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="strSessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="renditionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mediaAssetID",
    "strSessionID",
    "renditionType",
    "versionNumber"
})
@XmlRootElement(name = "CheckoutPreview")
public class CheckoutPreview {

    @XmlElement(name = "MediaAssetID")
    protected int mediaAssetID;
    @XmlElement(required = true)
    protected String strSessionID;
    @XmlElement(required = true)
    protected String renditionType;
    protected byte versionNumber;

    /**
     * Gets the value of the mediaAssetID property.
     * 
     */
    public int getMediaAssetID() {
        return mediaAssetID;
    }

    /**
     * Sets the value of the mediaAssetID property.
     * 
     */
    public void setMediaAssetID(int value) {
    	if(value==0)
    		throw new RuntimeException("TEst");
        this.mediaAssetID = value;
    }

    /**
     * Gets the value of the strSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSessionID() {
        return strSessionID;
    }

    /**
     * Sets the value of the strSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSessionID(String value) {
        this.strSessionID = value;
    }

    /**
     * Gets the value of the renditionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenditionType() {
        return renditionType;
    }

    /**
     * Sets the value of the renditionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenditionType(String value) {
        this.renditionType = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     */
    public byte getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(byte value) {
        this.versionNumber = value;
    }

}
