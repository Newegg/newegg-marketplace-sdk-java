//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 04:55:42 PM CST 
//
package com.newegg.marketplace.sdk.report.model.get;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * <p>anonymous complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
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
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="ItemLookupResponse"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PageInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="TotalCount">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="TotalPageCount">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PageSize">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PageIndex">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ItemList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="PacksOrSets" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                       &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ManufacturerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="WebsiteShortTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@JsonRootName("NeweggAPIResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemLookupResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType;
    @XmlElement(name = "ResponseDate", required = true)
    @JsonProperty("ResponseDate")
    protected String responseDate;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected ItemLookupResponse.ResponseBody responseBody;

    /**
     * 取得 isSuccess 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    /**
     * 設定 isSuccess 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuccess(String value) {
        this.isSuccess = value;
    }

    /**
     * 取得 sellerID 特性的值.
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
     * 設定 sellerID 特性的值.
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
     * 取得 operationType 特性的值.
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
     * 設定 operationType 特性的值.
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
     * 取得 responseDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDate() {
        return responseDate;
    }

    /**
     * 設定 responseDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDate(String value) {
        this.responseDate = value;
    }

    /**
     * 取得 responseBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link NeweggAPIResponse.ResponseBody }
     *     
     */
    public ItemLookupResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link NeweggAPIResponse.ResponseBody }
     *     
     */
    public void setResponseBody(ItemLookupResponse.ResponseBody value) {
        this.responseBody = value;
    }


    /**
     * <p>anonymous complex type 的 Java 類別.
     * 
     * <p>下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PageInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="TotalCount">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="TotalPageCount">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PageSize">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PageIndex">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ItemList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="PacksOrSets" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                             &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ManufacturerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="WebsiteShortTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "pageInfo",
        "requestID",
        "requestDate",
        "itemList"
    })
    public static class ResponseBody {

        @XmlElement(name = "PageInfo", required = true)
        @JsonProperty("PageInfo")
        protected ItemLookupResponse.ResponseBody.PageInfo pageInfo;
        @XmlElement(name = "RequestID", required = true)
        @JsonProperty("RequestID")
        protected String requestID;
        @XmlElement(name = "RequestDate", required = true)
        @JsonProperty("RequestDate")
        protected String requestDate;
        @XmlElement(name = "ItemList", required = true)
        @JsonProperty("ItemList")
        @JsonUnwrapped
        protected ItemLookupResponse.ResponseBody.ItemList itemList;

        /**
         * 取得 pageInfo 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIResponse.ResponseBody.PageInfo }
         *     
         */
        public ItemLookupResponse.ResponseBody.PageInfo getPageInfo() {
            return pageInfo;
        }

        /**
         * 設定 pageInfo 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIResponse.ResponseBody.PageInfo }
         *     
         */
        public void setPageInfo(ItemLookupResponse.ResponseBody.PageInfo value) {
            this.pageInfo = value;
        }

        /**
         * 取得 requestID 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestID() {
            return requestID;
        }

        /**
         * 設定 requestID 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestID(String value) {
            this.requestID = value;
        }

        /**
         * 取得 requestDate 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestDate() {
            return requestDate;
        }

        /**
         * 設定 requestDate 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestDate(String value) {
            this.requestDate = value;
        }

        /**
         * 取得 itemList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIResponse.ResponseBody.ItemList }
         *     
         */
        public ItemLookupResponse.ResponseBody.ItemList getItemList() {
            return itemList;
        }

        /**
         * 設定 itemList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIResponse.ResponseBody.ItemList }
         *     
         */
        public void setItemList(ItemLookupResponse.ResponseBody.ItemList value) {
            this.itemList = value;
        }


        /**
         * <p>anonymous complex type 的 Java 類別.
         * 
         * <p>下列綱要片段會指定此類別中包含的預期內容.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="PacksOrSets" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                   &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ManufacturerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="WebsiteShortTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "item"
        })
        public static class ItemList {

            @XmlElement(name = "Item")
            @JsonProperty("Item")
            protected List<ItemLookupResponse.ResponseBody.ItemList.Item> item;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NeweggAPIResponse.ResponseBody.ItemList.Item }
             * 
             * 
             */
            public List<ItemLookupResponse.ResponseBody.ItemList.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<ItemLookupResponse.ResponseBody.ItemList.Item>();
                }
                return this.item;
            }


            /**
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;all>
             *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="PacksOrSets" type="{http://www.w3.org/2001/XMLSchema}integer"/>
             *         &lt;element name="ManufacturerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ManufacturerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="WebsiteShortTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            public static class Item {

                @XmlElement(name = "NeweggItemNumber")
                @JsonProperty("NeweggItemNumber")
                protected String neweggItemNumber;
                @XmlElement(name = "UPC")
                @JsonProperty("UPC")
                protected String upc;
                @XmlElement(name = "Condition", required = true)
                @JsonProperty("Condition")
                protected BigInteger condition;
                @XmlElement(name = "PacksOrSets", required = true)
                @JsonProperty("PacksOrSets")
                protected BigInteger packsOrSets;
                @XmlElement(name = "ManufacturerName")
                @JsonProperty("ManufacturerName")
                protected String manufacturerName;
                @XmlElement(name = "ManufacturerPartNumber")
                @JsonProperty("ManufacturerPartNumber")
                protected String manufacturerPartNumber;
                @XmlElement(name = "WebsiteShortTitle")
                @JsonProperty("WebsiteShortTitle")
                protected String websiteShortTitle;
                @XmlElement(name = "Note")
                @JsonProperty("Note")
                protected String note;

                /**
                 * 取得 neweggItemNumber 特性的值.
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
                 * 設定 neweggItemNumber 特性的值.
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
                 * 取得 upc 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUPC() {
                    return upc;
                }

                /**
                 * 設定 upc 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUPC(String value) {
                    this.upc = value;
                }

                /**
                 * 取得 condition 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCondition() {
                    return condition;
                }

                /**
                 * 設定 condition 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCondition(BigInteger value) {
                    this.condition = value;
                }

                /**
                 * 取得 packsOrSets 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getPacksOrSets() {
                    return packsOrSets;
                }

                /**
                 * 設定 packsOrSets 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setPacksOrSets(BigInteger value) {
                    this.packsOrSets = value;
                }

                /**
                 * 取得 manufacturerName 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManufacturerName() {
                    return manufacturerName;
                }

                /**
                 * 設定 manufacturerName 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManufacturerName(String value) {
                    this.manufacturerName = value;
                }

                /**
                 * 取得 manufacturerPartNumber 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManufacturerPartNumber() {
                    return manufacturerPartNumber;
                }

                /**
                 * 設定 manufacturerPartNumber 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManufacturerPartNumber(String value) {
                    this.manufacturerPartNumber = value;
                }

                /**
                 * 取得 websiteShortTitle 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getWebsiteShortTitle() {
                    return websiteShortTitle;
                }

                /**
                 * 設定 websiteShortTitle 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setWebsiteShortTitle(String value) {
                    this.websiteShortTitle = value;
                }

                /**
                 * 取得 note 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNote() {
                    return note;
                }

                /**
                 * 設定 note 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNote(String value) {
                    this.note = value;
                }

            }

        }


        /**
         * <p>anonymous complex type 的 Java 類別.
         * 
         * <p>下列綱要片段會指定此類別中包含的預期內容.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="TotalCount">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="TotalPageCount">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PageSize">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PageIndex">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
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
        public static class PageInfo {

            @XmlElement(name = "TotalCount", required = true)
            @JsonProperty("TotalCount")
            protected BigInteger totalCount;
            @XmlElement(name = "TotalPageCount", required = true)
            @JsonProperty("TotalPageCount")
            protected BigInteger totalPageCount;
            @XmlElement(name = "PageSize", required = true)
            @JsonProperty("PageSize")
            protected BigInteger pageSize;
            @XmlElement(name = "PageIndex", required = true)
            @JsonProperty("PageIndex")
            protected BigInteger pageIndex;

            /**
             * 取得 totalCount 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalCount() {
                return totalCount;
            }

            /**
             * 設定 totalCount 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalCount(BigInteger value) {
                this.totalCount = value;
            }

            /**
             * 取得 totalPageCount 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getTotalPageCount() {
                return totalPageCount;
            }

            /**
             * 設定 totalPageCount 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setTotalPageCount(BigInteger value) {
                this.totalPageCount = value;
            }

            /**
             * 取得 pageSize 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPageSize() {
                return pageSize;
            }

            /**
             * 設定 pageSize 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPageSize(BigInteger value) {
                this.pageSize = value;
            }

            /**
             * 取得 pageIndex 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPageIndex() {
                return pageIndex;
            }

            /**
             * 設定 pageIndex 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPageIndex(BigInteger value) {
                this.pageIndex = value;
            }

        }

    }
}
