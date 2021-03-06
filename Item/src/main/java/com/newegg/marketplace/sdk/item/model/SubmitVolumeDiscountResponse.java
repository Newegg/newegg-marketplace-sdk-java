//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.13 at 11:10:58 AM CST 
//


package com.newegg.marketplace.sdk.item.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="ItemVolumeDiscountInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DiscountSetting"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Tier" maxOccurs="3"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                                 &lt;element name="Quantity"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SellingPrice"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="EnableFreeShipping"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "NeweggAPIResponse")
@JsonRootName("NeweggAPIResponse")
public class SubmitVolumeDiscountResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected boolean isSuccess;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "SubmitVolumeDiscountRespons";
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected SubmitVolumeDiscountResponse.ResponseBody responseBody;

    /**
     * Gets the value of the isSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link boolean }
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * Sets the value of the isSuccess property.
     * @param value
     *     allowed object is
     *     {@link  }
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
     *     {@link SubmitVolumeDiscountResponse.ResponseBody }
     *     
     */
    public SubmitVolumeDiscountResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * Sets the value of the responseBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitVolumeDiscountResponse.ResponseBody }
     *     
     */
    public void setResponseBody(SubmitVolumeDiscountResponse.ResponseBody value) {
        this.responseBody = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="ItemVolumeDiscountInfo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DiscountSetting"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Tier" maxOccurs="3"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                                       &lt;element name="Quantity"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SellingPrice"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="EnableFreeShipping"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ResponseBody {

        @XmlElement(name = "ItemVolumeDiscountInfo", required = true)
        @JsonProperty("ItemVolumeDiscountInfo")
        protected SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo itemVolumeDiscountInfo;

        /**
         * Gets the value of the itemVolumeDiscountInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo }
         *     
         */
        public SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo getItemVolumeDiscountInfo() {
            return itemVolumeDiscountInfo;
        }

        /**
         * Sets the value of the itemVolumeDiscountInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo }
         *     
         */
        public void setItemVolumeDiscountInfo(SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo value) {
            this.itemVolumeDiscountInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DiscountSetting"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Tier" maxOccurs="3"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                             &lt;element name="Quantity"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="SellingPrice"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="EnableFreeShipping"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class ItemVolumeDiscountInfo {

            @XmlElement(name = "SellerPartNumber", required = true)
            @JsonProperty("SellerPartNumber")
            protected String sellerPartNumber;
            @XmlElement(name = "NeweggItemNumber", required = true)
            @JsonProperty("NeweggItemNumber")
            protected String neweggItemNumber;
            @XmlElement(name = "DiscountSetting", required = true)
            //@JsonProperty("DiscountSetting")
            @JsonUnwrapped
            protected SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting discountSetting;

            /**
             * Gets the value of the sellerPartNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSellerPartNumber() {
                return sellerPartNumber;
            }

            /**
             * Sets the value of the sellerPartNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSellerPartNumber(String value) {
                this.sellerPartNumber = value;
            }

            /**
             * Gets the value of the neweggItemNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNeweggItemNumber() {
                return neweggItemNumber;
            }

            /**
             * Sets the value of the neweggItemNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNeweggItemNumber(String value) {
                this.neweggItemNumber = value;
            }

            /**
             * Gets the value of the discountSetting property.
             * 
             * @return
             *     possible object is
             *     {@link SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting }
             *     
             */
            public SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting getDiscountSetting() {
                return discountSetting;
            }

            /**
             * Sets the value of the discountSetting property.
             * 
             * @param value
             *     allowed object is
             *     {@link SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting }
             *     
             */
            public void setDiscountSetting(SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting value) {
                this.discountSetting = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Tier" maxOccurs="3"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *                   &lt;element name="Quantity"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="SellingPrice"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="EnableFreeShipping"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "tier"
            })
            public static class DiscountSetting {

                @XmlElement(name = "Tier", required = true)
                @JsonProperty("DiscountSetting")
                protected List<SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting.Tier> tier;

                /**
                 * Gets the value of the tier property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tier property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTier().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting.Tier }
                 * 
                 * @return
                 * Objects of the following type(s) are allowed in the list
                 * {@link SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting.Tier }
                 * 
                 */
                public List<SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting.Tier> getTier() {
                    if (tier == null) {
                        tier = new ArrayList<SubmitVolumeDiscountResponse.ResponseBody.ItemVolumeDiscountInfo.DiscountSetting.Tier>();
                    }
                    return this.tier;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
                 *         &lt;element name="Quantity"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="SellingPrice"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="EnableFreeShipping"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "priority",
                    "quantity",
                    "sellingPrice",
                    "enableFreeShipping"
                })
                public static class Tier {

                    @XmlElement(name = "Priority")
                    @JsonProperty("Priority")
                    protected int priority;
                    @XmlElement(name = "Quantity")
                    @JsonProperty("Quantity")
                    protected int quantity;
                    @XmlElement(name = "SellingPrice", required = true)
                    @JsonProperty("SellingPrice")
                    protected BigDecimal sellingPrice;
                    @XmlElement(name = "EnableFreeShipping")
                    @JsonProperty("EnableFreeShipping")
                    protected int enableFreeShipping;

                    /**
                     * Gets the value of the priority property.
                     * @return
                     * possible object is 
                     *     {@link int }
                     * 
                     */
                    public int getPriority() {
                        return priority;
                    }

                    /**
                     * Sets the value of the priority property.
                     * @param value
                     *     allowed object is
                     *     {@link  }
                     * 
                     */
                    public void setPriority(int value) {
                        this.priority = value;
                    }

                    /**
                     * Gets the value of the quantity property.
                     * @return
                     * possible object is 
                     *     {@link int }
                     * 
                     */
                    public int getQuantity() {
                        return quantity;
                    }

                    /**
                     * Sets the value of the quantity property.
                     * @param value
                     *     allowed object is
                     *     {@link  }
                     * 
                     */
                    public void setQuantity(int value) {
                        this.quantity = value;
                    }

                    /**
                     * Gets the value of the sellingPrice property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSellingPrice() {
                        return sellingPrice;
                    }

                    /**
                     * Sets the value of the sellingPrice property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSellingPrice(BigDecimal value) {
                        this.sellingPrice = value;
                    }

                    /**
                     * Gets the value of the enableFreeShipping property.
                     * @return
                     * possible object is 
                     *     {@link int }
                     * 
                     */
                    public int getEnableFreeShipping() {
                        return enableFreeShipping;
                    }

                    /**
                     * Sets the value of the enableFreeShipping property.
                     * @param value
                     *     allowed object is
                     *     {@link  }
                     * 
                     */
                    public void setEnableFreeShipping(int value) {
                        this.enableFreeShipping = value;
                    }

                }

            }

        }

    }

}
