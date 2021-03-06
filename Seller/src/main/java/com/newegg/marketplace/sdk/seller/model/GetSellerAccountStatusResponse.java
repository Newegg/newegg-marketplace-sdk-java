//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.11 at 02:00:33 PM CST 
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
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

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
 *               &lt;enumeration value="GetSellerAccountStatusResponse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Status">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Active"/>
 *                         &lt;enumeration value="Suspended"/>
 *                         &lt;enumeration value="InActive"/>
 *                         &lt;enumeration value="Terminated"/>
 *                         &lt;enumeration value="Closed"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Membership">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FufillmentCenterList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FufillmentCenter" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="WarehouseType">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                             &lt;enumeration value="0"/>
 *                                             &lt;enumeration value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ShippingDestinationList">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
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
public class GetSellerAccountStatusResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected boolean isSuccess;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetSellerAccountStatusResponse.ResponseBody responseBody;

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
     *     {@link GetSellerAccountStatusResponse.ResponseBody }
     *     
     */
    public GetSellerAccountStatusResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSellerAccountStatusResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetSellerAccountStatusResponse.ResponseBody value) {
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
     *         &lt;element name="SellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Status">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Active"/>
     *               &lt;enumeration value="Suspended"/>
     *               &lt;enumeration value="InActive"/>
     *               &lt;enumeration value="Terminated"/>
     *               &lt;enumeration value="Closed"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Membership">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FufillmentCenterList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FufillmentCenter" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="WarehouseType">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                   &lt;enumeration value="0"/>
     *                                   &lt;enumeration value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ShippingDestinationList">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
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
        "sellerName",
        "status",
        "membership",
        "fufillmentCenterList"
    })
    public static class ResponseBody {

        @XmlElement(name = "SellerName", required = true)
        @JsonProperty("SellerName")
        protected String sellerName;
        @XmlElement(name = "Status", required = true)
        @JsonProperty("Status")
        protected String status;
        @XmlElement(name = "Membership")
        @JsonProperty("Membership")
        protected int membership;
        @XmlElement(name = "FufillmentCenterList", required = false)
        @JsonUnwrapped
        //@JsonProperty("FufillmentCenterList")
        protected GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList fufillmentCenterList;

        /**
         * Gets the value of the sellerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSellerName() {
            return sellerName;
        }

        /**
         * Sets the value of the sellerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSellerName(String value) {
            this.sellerName = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the membership property.
         * 
         */
        public int getMembership() {
            return membership;
        }

        /**
         * Sets the value of the membership property.
         * 
         */
        public void setMembership(int value) {
            this.membership = value;
        }

        /**
         * Gets the value of the fufillmentCenterList property.
         * 
         * @return
         *     possible object is
         *     {@link GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList }
         *     
         */
        public GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList getFufillmentCenterList() {
            return fufillmentCenterList;
        }

        /**
         * Sets the value of the fufillmentCenterList property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList }
         *     
         */
        public void setFufillmentCenterList(GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList value) {
            this.fufillmentCenterList = value;
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
         *         &lt;element name="FufillmentCenter" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="WarehouseType">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ShippingDestinationList">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
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
            "fufillmentCenter"
        })
        public static class FufillmentCenterList {

            @XmlElement(name = "FufillmentCenter")
            @JsonProperty("FufillmentCenterList")
            protected List<GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter> fufillmentCenter;

            /**
             * Gets the value of the fufillmentCenter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fufillmentCenter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFufillmentCenter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter }
             * 
             * 
             */
            public List<GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter> getFufillmentCenter() {
                if (fufillmentCenter == null) {
                    fufillmentCenter = new ArrayList<GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter>();
                }
                return this.fufillmentCenter;
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
             *         &lt;element name="WarehouseLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="WarehouseType">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ShippingDestinationList">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            public static class FufillmentCenter {

                @XmlElement(name = "WarehouseLocation", required = true)
                @JsonProperty("WarehouseLocation")
                protected String warehouseLocation;
                @XmlElement(name = "WarehouseType")
                @JsonProperty("WarehouseType")
                protected int warehouseType;
                @XmlElement(name = "ShippingDestinationList", required = true)
                @JsonUnwrapped
                //@JsonProperty("ShippingDestinationList")
                protected GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter.ShippingDestinationList shippingDestinationList;

                /**
                 * Gets the value of the warehouseLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWarehouseLocation() {
                    return warehouseLocation;
                }

                /**
                 * Sets the value of the warehouseLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWarehouseLocation(String value) {
                    this.warehouseLocation = value;
                }

                /**
                 * Gets the value of the warehouseType property.
                 * 
                 */
                public int getWarehouseType() {
                    return warehouseType;
                }

                /**
                 * Sets the value of the warehouseType property.
                 * 
                 */
                public void setWarehouseType(int value) {
                    this.warehouseType = value;
                }

                /**
                 * Gets the value of the shippingDestinationList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter.ShippingDestinationList }
                 *     
                 */
                public GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter.ShippingDestinationList getShippingDestinationList() {
                    return shippingDestinationList;
                }

                /**
                 * Sets the value of the shippingDestinationList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter.ShippingDestinationList }
                 *     
                 */
                public void setShippingDestinationList(GetSellerAccountStatusResponse.ResponseBody.FufillmentCenterList.FufillmentCenter.ShippingDestinationList value) {
                    this.shippingDestinationList = value;
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
                 *         &lt;element name="ShipToCountry" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                    "shipToCountry"
                })
                public static class ShippingDestinationList {

                    @XmlElement(name = "ShipToCountry")
                    @JsonProperty("ShippingDestinationList")
                    protected List<String> shipToCountry;

                    /**
                     * Gets the value of the shipToCountry property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the shipToCountry property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getShipToCountry().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getShipToCountry() {
                        if (shipToCountry == null) {
                            shipToCountry = new ArrayList<String>();
                        }
                        return this.shipToCountry;
                    }

                }

            }

        }

    }

}
