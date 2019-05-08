//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.22 於 01:16:12 PM CST 
//

package com.newegg.marketplace.sdk.order.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element name="PackageProcessingSummary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="TotalPackageCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="SuccessCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="FailCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="OrderStatus">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Shipped"/>
 *                         &lt;enumeration value="PartiallyShipped"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Shipment">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="PackageList">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Package" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;all>
 *                                                 &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ProcessStatus">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="true"/>
 *                                                       &lt;enumeration value="false"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="ProcessResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="ItemList">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ItemDes" maxOccurs="unbounded">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;all>
 *                                                                     &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                                                                   &lt;/all>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/all>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                 &lt;/all>
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
@XmlRootElement(name = "UpdateOrderStatusInfo")
@JsonRootName("UpdateOrderStatusInfo")
public class ShipOrderResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "PackageProcessingSummary", required = true)
    @JsonProperty("PackageProcessingSummary")
    protected ShipOrderResponse.PackageProcessingSummary packageProcessingSummary;
    @XmlElement(name = "Result", required = true)
    @JsonProperty("Result")
    protected ShipOrderResponse.Result result;

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
     * 取得 packageProcessingSummary 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderStatusInfo.PackageProcessingSummary }
     *     
     */
    public ShipOrderResponse.PackageProcessingSummary getPackageProcessingSummary() {
        return packageProcessingSummary;
    }

    /**
     * 設定 packageProcessingSummary 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderStatusInfo.PackageProcessingSummary }
     *     
     */
    public void setPackageProcessingSummary(ShipOrderResponse.PackageProcessingSummary value) {
        this.packageProcessingSummary = value;
    }

    /**
     * 取得 result 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderStatusInfo.Result }
     *     
     */
    public ShipOrderResponse.Result getResult() {
        return result;
    }

    /**
     * 設定 result 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderStatusInfo.Result }
     *     
     */
    public void setResult(ShipOrderResponse.Result value) {
        this.result = value;
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
     *         &lt;element name="TotalPackageCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="SuccessCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="FailCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    public static class PackageProcessingSummary {

        @XmlElement(name = "TotalPackageCount", required = true)
        @JsonProperty("TotalPackageCount")
        protected BigInteger totalPackageCount;
        @XmlElement(name = "SuccessCount", required = true)
        @JsonProperty("SuccessCount")
        protected BigInteger successCount;
        @XmlElement(name = "FailCount", required = true)
        @JsonProperty("FailCount")
        protected BigInteger failCount;

        /**
         * 取得 totalPackageCount 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalPackageCount() {
            return totalPackageCount;
        }

        /**
         * 設定 totalPackageCount 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalPackageCount(BigInteger value) {
            this.totalPackageCount = value;
        }

        /**
         * 取得 successCount 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSuccessCount() {
            return successCount;
        }

        /**
         * 設定 successCount 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSuccessCount(BigInteger value) {
            this.successCount = value;
        }

        /**
         * 取得 failCount 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFailCount() {
            return failCount;
        }

        /**
         * 設定 failCount 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFailCount(BigInteger value) {
            this.failCount = value;
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
     *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="OrderStatus">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Shipped"/>
     *               &lt;enumeration value="PartiallyShipped"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Shipment">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="PackageList">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Package" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;all>
     *                                       &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ProcessStatus">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="true"/>
     *                                             &lt;enumeration value="false"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="ProcessResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="ItemList">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ItemDes" maxOccurs="unbounded">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;all>
     *                                                           &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                                                         &lt;/all>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
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
     *                 &lt;/all>
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
    public static class Result {

        @XmlElement(name = "OrderNumber", required = true)
        @JsonProperty("OrderNumber")
        protected BigInteger orderNumber;
        @XmlElement(name = "SellerID", required = true)
        @JsonProperty("SellerID")
        protected String sellerID;
        @XmlElement(name = "OrderStatus", required = true)
        @JsonProperty("OrderStatus")
        protected String orderStatus;
        @XmlElement(name = "Shipment", required = true)
        @JsonProperty("Shipment")
        protected ShipOrderResponse.Result.Shipment shipment;

        /**
         * 取得 orderNumber 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrderNumber() {
            return orderNumber;
        }

        /**
         * 設定 orderNumber 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrderNumber(BigInteger value) {
            this.orderNumber = value;
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
         * 取得 orderStatus 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderStatus() {
            return orderStatus;
        }

        /**
         * 設定 orderStatus 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderStatus(String value) {
            this.orderStatus = value;
        }

        /**
         * 取得 shipment 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link UpdateOrderStatusInfo.Result.Shipment }
         *     
         */
        public ShipOrderResponse.Result.Shipment getShipment() {
            return shipment;
        }

        /**
         * 設定 shipment 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateOrderStatusInfo.Result.Shipment }
         *     
         */
        public void setShipment(ShipOrderResponse.Result.Shipment value) {
            this.shipment = value;
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
         *         &lt;element name="PackageList">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Package" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;all>
         *                             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ProcessStatus">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="true"/>
         *                                   &lt;enumeration value="false"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="ProcessResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="ItemList">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ItemDes" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;all>
         *                                                 &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *                                               &lt;/all>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
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
        public static class Shipment {

            @XmlElement(name = "PackageList", required = true)
            @JsonProperty("PackageList")
            @JsonUnwrapped
            protected ShipOrderResponse.Result.Shipment.PackageList packageList;

            /**
             * 取得 packageList 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link UpdateOrderStatusInfo.Result.Shipment.PackageList }
             *     
             */
            public ShipOrderResponse.Result.Shipment.PackageList getPackageList() {
                return packageList;
            }

            /**
             * 設定 packageList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link UpdateOrderStatusInfo.Result.Shipment.PackageList }
             *     
             */
            public void setPackageList(ShipOrderResponse.Result.Shipment.PackageList value) {
                this.packageList = value;
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
             *         &lt;element name="Package" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;all>
             *                   &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ProcessStatus">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="true"/>
             *                         &lt;enumeration value="false"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="ProcessResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="ItemList">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ItemDes" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;all>
             *                                       &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                "_package"
            })
            public static class PackageList {

                @XmlElement(name = "Package", required = true)
                @JsonProperty("Package")
                protected List<ShipOrderResponse.Result.Shipment.PackageList.Package> _package;

                /**
                 * Gets the value of the package property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the package property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPackage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UpdateOrderStatusInfo.Result.Shipment.PackageList.Package }
                 * 
                 * 
                 */
                public List<ShipOrderResponse.Result.Shipment.PackageList.Package> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<ShipOrderResponse.Result.Shipment.PackageList.Package>();
                    }
                    return this._package;
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
                 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ProcessStatus">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="true"/>
                 *               &lt;enumeration value="false"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="ProcessResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="ItemList">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ItemDes" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;all>
                 *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                public static class Package {

                    @XmlElement(name = "TrackingNumber", required = true)
                    @JsonProperty("TrackingNumber")
                    protected String trackingNumber;
                    @XmlElement(name = "ShipDate", required = true)
                    @JsonProperty("ShipDate")
                    protected String shipDate;
                    @XmlElement(name = "ProcessStatus", required = true)
                    @JsonProperty("ProcessStatus")
                    protected String processStatus;
                    @XmlElement(name = "ProcessResult", required = true)
                    @JsonProperty("ProcessResult")
                    protected String processResult;
                    @XmlElement(name = "ItemList", required = true)
                    @JsonProperty("ItemList")
                    protected ShipOrderResponse.Result.Shipment.PackageList.Package.ItemList itemList;

                    /**
                     * 取得 trackingNumber 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTrackingNumber() {
                        return trackingNumber;
                    }

                    /**
                     * 設定 trackingNumber 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTrackingNumber(String value) {
                        this.trackingNumber = value;
                    }

                    /**
                     * 取得 shipDate 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getShipDate() {
                        return shipDate;
                    }

                    /**
                     * 設定 shipDate 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setShipDate(String value) {
                        this.shipDate = value;
                    }

                    /**
                     * 取得 processStatus 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProcessStatus() {
                        return processStatus;
                    }

                    /**
                     * 設定 processStatus 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProcessStatus(String value) {
                        this.processStatus = value;
                    }

                    /**
                     * 取得 processResult 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProcessResult() {
                        return processResult;
                    }

                    /**
                     * 設定 processResult 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProcessResult(String value) {
                        this.processResult = value;
                    }

                    /**
                     * 取得 itemList 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UpdateOrderStatusInfo.Result.Shipment.PackageList.Package.ItemList }
                     *     
                     */
                    public ShipOrderResponse.Result.Shipment.PackageList.Package.ItemList getItemList() {
                        return itemList;
                    }

                    /**
                     * 設定 itemList 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UpdateOrderStatusInfo.Result.Shipment.PackageList.Package.ItemList }
                     *     
                     */
                    public void setItemList(ShipOrderResponse.Result.Shipment.PackageList.Package.ItemList value) {
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
                     *         &lt;element name="ItemDes" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;all>
                     *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                        "itemDes"
                    })
                    public static class ItemList {

                        @XmlElement(name = "ItemDes", required = true)
                        @JsonProperty("ItemDes")
                        protected List<ShipOrderResponse.Result.Shipment.PackageList.Package.ItemList.ItemDes> itemDes;

                        /**
                         * Gets the value of the itemDes property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the itemDes property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getItemDes().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link UpdateOrderStatusInfo.Result.Shipment.PackageList.Package.ItemList.ItemDes }
                         * 
                         * 
                         */
                        public List<ShipOrderResponse.Result.Shipment.PackageList.Package.ItemList.ItemDes> getItemDes() {
                            if (itemDes == null) {
                                itemDes = new ArrayList<ShipOrderResponse.Result.Shipment.PackageList.Package.ItemList.ItemDes>();
                            }
                            return this.itemDes;
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
                         *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                        public static class ItemDes {

                            @XmlElement(name = "SellerPartNumber", required = true)
                            @JsonProperty("SellerPartNumber")
                            protected String sellerPartNumber;
                            @XmlElement(name = "NeweggItemNumber", required = true)
                            @JsonProperty("NeweggItemNumber")
                            protected String neweggItemNumber;
                            @XmlElement(name = "ShippedQty", required = true)
                            @JsonProperty("ShippedQty")
                            protected BigInteger shippedQty;

                            /**
                             * 取得 sellerPartNumber 特性的值.
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
                             * 設定 sellerPartNumber 特性的值.
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
                             * 取得 shippedQty 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link BigInteger }
                             *     
                             */
                            public BigInteger getShippedQty() {
                                return shippedQty;
                            }

                            /**
                             * 設定 shippedQty 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link BigInteger }
                             *     
                             */
                            public void setShippedQty(BigInteger value) {
                                this.shippedQty = value;
                            }

                        }

                    }

                }

            }

        }

    }
}
