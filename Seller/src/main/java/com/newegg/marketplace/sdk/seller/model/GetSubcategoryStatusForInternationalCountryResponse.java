//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.20 at 05:31:08 PM CST 
//


package com.newegg.marketplace.sdk.seller.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IsSuccess">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="true"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GetSellerSubcategoryResponse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CountryCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="SubcategoryList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Subcategory" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="IndustryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="IndustryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Enabled">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;minInclusive value="0"/>
 *                                             &lt;maxInclusive value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "NeweggAPIResponse")
public class GetSubcategoryStatusForInternationalCountryResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected boolean isSuccess;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetSellerSubcategoryResponse";
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetSubcategoryStatusForInternationalCountryResponse.ResponseBody responseBody;

    /**
     * Gets the value of the isSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public boolean getIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the sellerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * Sets the value of the sellerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * Gets the value of the responseBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubcategoryStatusForInternationalCountryResponse.ResponseBody }
     *     
     */
    public GetSubcategoryStatusForInternationalCountryResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubcategoryStatusForInternationalCountryResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetSubcategoryStatusForInternationalCountryResponse.ResponseBody value) {
        this.responseBody = value;
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
     *         &lt;element name="CountryCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="SubcategoryList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Subcategory" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="IndustryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="IndustryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Enabled">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                   &lt;minInclusive value="0"/>
     *                                   &lt;maxInclusive value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/all>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "countryCode",
        "subcategoryList"
    })
    public static class ResponseBody {

        @XmlElement(name = "CountryCode", required = true)
        @JsonProperty("CountryCode")
        protected String countryCode;
        @XmlElement(name = "SubcategoryList", required = true)
        @JsonUnwrapped
        protected GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList subcategoryList;

        /**
         * Gets the value of the countryCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the subcategoryList property.
         * 
         * @return
         *     possible object is
         *     {@link GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList }
         *     
         */
        public GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList getSubcategoryList() {
            return subcategoryList;
        }

        /**
         * Sets the value of the subcategoryList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList }
         *     
         */
        public void setSubcategoryList(GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList value) {
            this.subcategoryList = value;
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
         *         &lt;element name="Subcategory" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="IndustryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="IndustryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Enabled">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                         &lt;minInclusive value="0"/>
         *                         &lt;maxInclusive value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/all>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "subcategory"
        })
        public static class SubcategoryList {

            @XmlElement(name = "Subcategory", required = true)
            @JsonProperty("SubcategoryList")
            protected List<GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList.Subcategory> subcategory;

            /**
             * Gets the value of the subcategory property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the subcategory property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubcategory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList.Subcategory }
             * 
             * 
             */
            public List<GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList.Subcategory> getSubcategory() {
                if (subcategory == null) {
                    subcategory = new ArrayList<GetSubcategoryStatusForInternationalCountryResponse.ResponseBody.SubcategoryList.Subcategory>();
                }
                return this.subcategory;
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
             *       &lt;all>
             *         &lt;element name="IndustryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="IndustryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SubcategoryID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="SubcategoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Enabled">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *               &lt;minInclusive value="0"/>
             *               &lt;maxInclusive value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/all>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class Subcategory {

                @XmlElement(name = "IndustryCode", required = true)
                @JsonProperty("IndustryCode")
                protected String industryCode;
                @XmlElement(name = "IndustryName", required = true)
                @JsonProperty("IndustryName")
                protected String industryName;
                @XmlElement(name = "SubcategoryID")
                @JsonProperty("SubcategoryID")
                protected int subcategoryID;
                @XmlElement(name = "SubcategoryName", required = true)
                @JsonProperty("SubcategoryName")
                protected String subcategoryName;
                @XmlElement(name = "Enabled")
                @JsonProperty("Enabled")
                protected int enabled;

                /**
                 * Gets the value of the industryCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndustryCode() {
                    return industryCode;
                }

                /**
                 * Sets the value of the industryCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndustryCode(String value) {
                    this.industryCode = value;
                }

                /**
                 * Gets the value of the industryName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndustryName() {
                    return industryName;
                }

                /**
                 * Sets the value of the industryName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndustryName(String value) {
                    this.industryName = value;
                }

                /**
                 * Gets the value of the subcategoryID property.
                 * 
                 */
                public int getSubcategoryID() {
                    return subcategoryID;
                }

                /**
                 * Sets the value of the subcategoryID property.
                 * 
                 */
                public void setSubcategoryID(int value) {
                    this.subcategoryID = value;
                }

                /**
                 * Gets the value of the subcategoryName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSubcategoryName() {
                    return subcategoryName;
                }

                /**
                 * Sets the value of the subcategoryName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSubcategoryName(String value) {
                    this.subcategoryName = value;
                }

                /**
                 * Gets the value of the enabled property.
                 * 
                 */
                public int getEnabled() {
                    return enabled;
                }

                /**
                 * Sets the value of the enabled property.
                 * 
                 */
                public void setEnabled(int value) {
                    this.enabled = value;
                }

            }

        }

    }

}