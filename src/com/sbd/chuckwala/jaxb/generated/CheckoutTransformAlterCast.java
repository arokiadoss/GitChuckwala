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
 *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetFolderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetFilename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imageFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scaling">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nImageWidthPixels" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nImageHeightPixels" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fImageWidthInches" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fImageHeightInches" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nResolutionDPI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nScalingPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rotationDegree" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fileSizeInMegabytes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="transformColorSpace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bApplyClippingPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bRetainClippingPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "versionNumber",
    "targetFolderName",
    "targetFilename",
    "imageFormat",
    "scaling",
    "rotationDegree",
    "fileSizeInMegabytes",
    "transformColorSpace",
    "bApplyClippingPath",
    "bRetainClippingPath"
})
@XmlRootElement(name = "CheckoutTransformAlterCast")
public class CheckoutTransformAlterCast {

    @XmlElement(name = "MediaAssetID")
    protected int mediaAssetID;
    @XmlElement(required = true)
    protected String strSessionID;
    protected int versionNumber;
    @XmlElement(required = true)
    protected String targetFolderName;
    @XmlElement(required = true)
    protected String targetFilename;
    @XmlElement(required = true)
    protected String imageFormat;
    @XmlElement(required = true)
    protected CheckoutTransformAlterCast.Scaling scaling;
    protected int rotationDegree;
    protected int fileSizeInMegabytes;
    @XmlElement(required = true)
    protected String transformColorSpace;
    @XmlElement(required = true)
    protected String bApplyClippingPath;
    @XmlElement(required = true)
    protected String bRetainClippingPath;

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
     * Gets the value of the versionNumber property.
     * 
     */
    public int getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(int value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the targetFolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFolderName() {
        return targetFolderName;
    }

    /**
     * Sets the value of the targetFolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFolderName(String value) {
        this.targetFolderName = value;
    }

    /**
     * Gets the value of the targetFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFilename() {
        return targetFilename;
    }

    /**
     * Sets the value of the targetFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFilename(String value) {
        this.targetFilename = value;
    }

    /**
     * Gets the value of the imageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFormat() {
        return imageFormat;
    }

    /**
     * Sets the value of the imageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFormat(String value) {
        this.imageFormat = value;
    }

    /**
     * Gets the value of the scaling property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutTransformAlterCast.Scaling }
     *     
     */
    public CheckoutTransformAlterCast.Scaling getScaling() {
        return scaling;
    }

    /**
     * Sets the value of the scaling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutTransformAlterCast.Scaling }
     *     
     */
    public void setScaling(CheckoutTransformAlterCast.Scaling value) {
        this.scaling = value;
    }

    /**
     * Gets the value of the rotationDegree property.
     * 
     */
    public int getRotationDegree() {
        return rotationDegree;
    }

    /**
     * Sets the value of the rotationDegree property.
     * 
     */
    public void setRotationDegree(int value) {
        this.rotationDegree = value;
    }

    /**
     * Gets the value of the fileSizeInMegabytes property.
     * 
     */
    public int getFileSizeInMegabytes() {
        return fileSizeInMegabytes;
    }

    /**
     * Sets the value of the fileSizeInMegabytes property.
     * 
     */
    public void setFileSizeInMegabytes(int value) {
        this.fileSizeInMegabytes = value;
    }

    /**
     * Gets the value of the transformColorSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransformColorSpace() {
        return transformColorSpace;
    }

    /**
     * Sets the value of the transformColorSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransformColorSpace(String value) {
        this.transformColorSpace = value;
    }

    /**
     * Gets the value of the bApplyClippingPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBApplyClippingPath() {
        return bApplyClippingPath;
    }

    /**
     * Sets the value of the bApplyClippingPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBApplyClippingPath(String value) {
        this.bApplyClippingPath = value;
    }

    /**
     * Gets the value of the bRetainClippingPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRetainClippingPath() {
        return bRetainClippingPath;
    }

    /**
     * Sets the value of the bRetainClippingPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRetainClippingPath(String value) {
        this.bRetainClippingPath = value;
    }


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
     *         &lt;element name="nImageWidthPixels" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nImageHeightPixels" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="fImageWidthInches" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="fImageHeightInches" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nResolutionDPI" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nScalingPercent" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "nImageWidthPixels",
        "nImageHeightPixels",
        "fImageWidthInches",
        "fImageHeightInches",
        "nResolutionDPI",
        "nScalingPercent"
    })
    public static class Scaling {

        protected int nImageWidthPixels;
        protected int nImageHeightPixels;
        protected int fImageWidthInches;
        protected int fImageHeightInches;
        protected int nResolutionDPI;
        protected int nScalingPercent;

        /**
         * Gets the value of the nImageWidthPixels property.
         * 
         */
        public int getNImageWidthPixels() {
            return nImageWidthPixels;
        }

        /**
         * Sets the value of the nImageWidthPixels property.
         * 
         */
        public void setNImageWidthPixels(int value) {
            this.nImageWidthPixels = value;
        }

        /**
         * Gets the value of the nImageHeightPixels property.
         * 
         */
        public int getNImageHeightPixels() {
            return nImageHeightPixels;
        }

        /**
         * Sets the value of the nImageHeightPixels property.
         * 
         */
        public void setNImageHeightPixels(int value) {
            this.nImageHeightPixels = value;
        }

        /**
         * Gets the value of the fImageWidthInches property.
         * 
         */
        public int getFImageWidthInches() {
            return fImageWidthInches;
        }

        /**
         * Sets the value of the fImageWidthInches property.
         * 
         */
        public void setFImageWidthInches(int value) {
            this.fImageWidthInches = value;
        }

        /**
         * Gets the value of the fImageHeightInches property.
         * 
         */
        public int getFImageHeightInches() {
            return fImageHeightInches;
        }

        /**
         * Sets the value of the fImageHeightInches property.
         * 
         */
        public void setFImageHeightInches(int value) {
            this.fImageHeightInches = value;
        }

        /**
         * Gets the value of the nResolutionDPI property.
         * 
         */
        public int getNResolutionDPI() {
            return nResolutionDPI;
        }

        /**
         * Sets the value of the nResolutionDPI property.
         * 
         */
        public void setNResolutionDPI(int value) {
            this.nResolutionDPI = value;
        }

        /**
         * Gets the value of the nScalingPercent property.
         * 
         */
        public int getNScalingPercent() {
            return nScalingPercent;
        }

        /**
         * Sets the value of the nScalingPercent property.
         * 
         */
        public void setNScalingPercent(int value) {
            this.nScalingPercent = value;
        }

    }

}
