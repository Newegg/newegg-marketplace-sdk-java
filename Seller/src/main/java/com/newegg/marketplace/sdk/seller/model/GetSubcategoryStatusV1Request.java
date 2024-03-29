//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.20 at 03:44:59 PM CST 
//


package com.newegg.marketplace.sdk.seller.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;
 * &lt;xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema" elementFormDefault="qualified" attributeFormDefault="unqualified"&gt;
 *	&lt;xs:element name="NeweggAPIRequest"&gt;
 *		&lt;xs:annotation&gt;
 *			&lt;xs:documentation&gt;Comment describing your root element&lt;/xs:documentation&gt;
 *		&lt;/xs:annotation&gt;
 *		&lt;xs:complexType&gt;
 *			&lt;xs:all&gt;
 *				&lt;xs:element name="OperationType"&gt;
 *					&lt;xs:simpleType&gt;
 *						&lt;xs:restriction base="xs:string"&gt;
 *							&lt;xs:enumeration value="GetSellerSubcategoryRequest"/&gt;
 *						&lt;/xs:restriction&gt;
 *					&lt;/xs:simpleType&gt;
 *				&lt;/xs:element&gt;
 *				&lt;xs:element name="RequestBody"&gt;
 *					&lt;xs:complexType&gt;
 *						&lt;xs:sequence&gt;
 *              &lt;xs:element name="CountryCode" minOccurs="0"&gt;
 *                &lt;xs:simpleType&gt;
 *                  &lt;xs:restriction base="xs:string"&gt;
 *                    &lt;xs:length value="3"/&gt;
 *                  &lt;/xs:restriction&gt;
 *                &lt;/xs:simpleType&gt;
 *              &lt;/xs:element&gt;
 *							&lt;xs:element name="GetItemSubcategory"&gt;
 *								&lt;xs:complexType&gt;
 *									&lt;xs:all&gt;
 *										&lt;xs:element name="SubcategoryIDList" minOccurs="0"&gt;
 *											&lt;xs:complexType&gt;
 *												&lt;xs:sequence&gt;
 *													&lt;xs:element name="SubcategoryID" type="xs:int" maxOccurs="unbounded"/&gt;
 *												&lt;/xs:sequence&gt;
 *											&lt;/xs:complexType&gt;
 *										&lt;/xs:element&gt;
 *										&lt;xs:element name="IndustryCodeList" minOccurs="0"&gt;
 *											&lt;xs:complexType&gt;
 *												&lt;xs:sequence&gt;
 *													&lt;xs:element name="IndustryCode" maxOccurs="unbounded"&gt;
 *														&lt;xs:simpleType&gt;
 *															&lt;xs:restriction base="xs:string"&gt;
 *																&lt;xs:maxLength value="2"/&gt;
 *																&lt;xs:minLength value="1"/&gt;
 *															&lt;/xs:restriction&gt;
 *														&lt;/xs:simpleType&gt;
 *													&lt;/xs:element&gt;
 *												&lt;/xs:sequence&gt;
 *											&lt;/xs:complexType&gt;
 *										&lt;/xs:element&gt;
 *										&lt;xs:element name="Enabled" default="0" minOccurs="0"&gt;
 *											&lt;xs:simpleType&gt;
 *												&lt;xs:restriction base="xs:int"&gt;
 *													&lt;xs:minInclusive value="0"/&gt;
 *													&lt;xs:maxInclusive value="1"/&gt;
 *												&lt;/xs:restriction&gt;
 *											&lt;/xs:simpleType&gt;
 *										&lt;/xs:element&gt;
 *										&lt;xs:element name="WebSiteCategoryIDList" minOccurs="0"&gt;
 *											&lt;xs:complexType&gt;
 *												&lt;xs:sequence&gt;
 *													&lt;xs:element name="WebSiteCategoryID" type="xs:int" maxOccurs="unbounded"/&gt;
 *												&lt;/xs:sequence&gt;
 *											&lt;/xs:complexType&gt;
 *										&lt;/xs:element&gt;
 *										&lt;xs:element name="WebSiteCatalogName" type="xs:string"/&gt;
 *									&lt;/xs:all&gt;
 *								&lt;/xs:complexType&gt;
 *							&lt;/xs:element&gt;
 *						&lt;/xs:sequence&gt;
 *					&lt;/xs:complexType&gt;
 *				&lt;/xs:element&gt;
 *			&lt;/xs:all&gt;
 *		&lt;/xs:complexType&gt;
 *	&lt;/xs:element&gt;
 *&lt;/xs:schema&gt;
 * </pre>
 * 
 * 
 */
public class GetSubcategoryStatusV1Request {

    @JsonProperty("OperationType")
    protected String operationType="GetSellerSubcategoryRequest";
    @JsonProperty("RequestBody")
    protected GetSubcategoryStatusV1Request.RequestBody requestBody;

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
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link GetSubcategoryStatusV1Request.RequestBody }
     *     
     */
    public GetSubcategoryStatusV1Request.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSubcategoryStatusV1Request.RequestBody }
     *     
     */
    public void setRequestBody(GetSubcategoryStatusV1Request.RequestBody value) {
        this.requestBody = value;
    }


    public static class RequestBody {

        @JsonProperty("GetItemSubcategory")
        protected GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory getItemSubcategory;

        /**
         * Gets the value of the getItemSubcategory property.
         * 
         * @return
         *     possible object is
         *     {@link GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory }
         *     
         */
        public GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory getGetItemSubcategory() {
            return getItemSubcategory;
        }

        /**
         * Sets the value of the getItemSubcategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory }
         *     
         */
        public void setGetItemSubcategory(GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory value) {
            this.getItemSubcategory = value;
        }


        public static class GetItemSubcategory {

            @JsonProperty("GetItemSubcategory")
            protected GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList subcategoryIDList;
            @JsonProperty(value="Enabled", defaultValue="0")
            protected Integer enabled;

            /**
             * Gets the value of the subcategoryIDList property.
             * 
             * @return
             *     possible object is
             *     {@link GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList }
             *     
             */
            public GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList getSubcategoryIDList() {
                return subcategoryIDList;
            }

            /**
             * Sets the value of the subcategoryIDList property.
             * 
             * @param value
             *     allowed object is
             *     {@link GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList }
             *     
             */
            public void setSubcategoryIDList(GetSubcategoryStatusV1Request.RequestBody.GetItemSubcategory.SubcategoryIDList value) {
                this.subcategoryIDList = value;
            }


            /**
             * Gets the value of the enabled property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getEnabled() {
                return enabled;
            }

            /**
             * Sets the value of the enabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setEnabled(Integer value) {
                this.enabled = value;
            }


            public static class SubcategoryIDList {

                @JsonProperty("WebSiteCategoryIDList")
                protected List<Integer> webSiteCategoryID;
                @JsonProperty("WebSiteCatalogName")
                protected String webSiteCatalogName;
           
				public String getWebSiteCatalogName() {
					return webSiteCatalogName;
				}
				public void setWebSiteCatalogName(String webSiteCatalogName) {
					this.webSiteCatalogName = webSiteCatalogName;
				}
				public List<Integer> getWebSiteCategoryID() {
					return webSiteCategoryID;
				}
				public void setWebSiteCategoryID(List<Integer> webSiteCategoryID) {
					this.webSiteCategoryID = webSiteCategoryID;
				}

            }

        }

    }

}
