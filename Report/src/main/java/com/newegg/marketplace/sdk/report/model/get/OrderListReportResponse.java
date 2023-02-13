//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 11:30:42 AM CST 
//


package com.newegg.marketplace.sdk.report.model.get;

import java.math.BigDecimal;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IsSuccess"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PageInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OrderInfoList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OrderInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="SellerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="OrderDownloaded" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="true"/&gt;
 *                                             &lt;enumeration value="false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="OrderStatus" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                             &lt;enumeration value="3"/&gt;
 *                                             &lt;enumeration value="4"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="OrderStatusDescription" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="Unshipped"/&gt;
 *                                             &lt;enumeration value="Partially Shipped"/&gt;
 *                                             &lt;enumeration value="Shipped"/&gt;
 *                                             &lt;enumeration value="Invoiced"/&gt;
 *                                             &lt;enumeration value="Voided"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="CustomerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToCityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ShipToCompany" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="OrderItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="ShippingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="VATTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="DutyTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                                       &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="OrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="OrderTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="IsAutoVoid" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="true"/&gt;
 *                                             &lt;enumeration value="false"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="SalesChannel" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="2"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="FulfillmentOption" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                             &lt;enumeration value="0"/&gt;
 *                                             &lt;enumeration value="1"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ItemInfoList"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;all&gt;
 *                                                           &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="OrderedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                           &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                           &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="ExtendUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="ExtendShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="ExtendSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="ExtendVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="ExtendDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                                           &lt;element name="Status" minOccurs="0"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                                                 &lt;enumeration value="1"/&gt;
 *                                                                 &lt;enumeration value="2"/&gt;
 *                                                                 &lt;enumeration value="3"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                         &lt;/all&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PackageInfoList"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="PackageInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;all&gt;
 *                                                           &lt;element name="PackageType" minOccurs="0"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                 &lt;enumeration value="Shipped"/&gt;
 *                                                                 &lt;enumeration value="Unshipped"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="ShipCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                           &lt;element name="ItemInfoList"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
 *                                                                       &lt;complexType&gt;
 *                                                                         &lt;complexContent&gt;
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                             &lt;all&gt;
 *                                                                               &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                               &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                                               &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                                             &lt;/all&gt;
 *                                                                           &lt;/restriction&gt;
 *                                                                         &lt;/complexContent&gt;
 *                                                                       &lt;/complexType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/all&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/all&gt;
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
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderListReportResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OperationType", defaultValue = "GetOrderInfoResponse", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetOrderInfoResponse";
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected OrderListReportResponse.ResponseBody responseBody;
    @XmlElement(name = "Memo", required = true)
    @JsonProperty("Memo")
    protected String memo;
    @XmlElement(name = "ResponseDate", required = true)
    @JsonProperty("ResponseDate")
    protected String responseDate;

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
     * 取得 responseBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link OrderListReportResponse.ResponseBody }
     *     
     */
    public OrderListReportResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderListReportResponse.ResponseBody }
     *     
     */
    public void setResponseBody(OrderListReportResponse.ResponseBody value) {
        this.responseBody = value;
    }

    /**
     * 取得 memo 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 設定 memo 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
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
     * <p>anonymous complex type 的 Java 類別.
     * 
     * <p>下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="PageInfo"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OrderInfoList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OrderInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="SellerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="OrderDownloaded" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="true"/&gt;
     *                                   &lt;enumeration value="false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="OrderStatus" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                   &lt;enumeration value="3"/&gt;
     *                                   &lt;enumeration value="4"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OrderStatusDescription" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="Unshipped"/&gt;
     *                                   &lt;enumeration value="Partially Shipped"/&gt;
     *                                   &lt;enumeration value="Shipped"/&gt;
     *                                   &lt;enumeration value="Invoiced"/&gt;
     *                                   &lt;enumeration value="Voided"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="CustomerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToCityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ShipToCompany" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="OrderItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="ShippingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="VATTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="DutyTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *                             &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="OrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="OrderTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="IsAutoVoid" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="true"/&gt;
     *                                   &lt;enumeration value="false"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="SalesChannel" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="2"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="FulfillmentOption" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                   &lt;enumeration value="0"/&gt;
     *                                   &lt;enumeration value="1"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="ItemInfoList"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;all&gt;
     *                                                 &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="OrderedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                                 &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                                 &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="ExtendUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="ExtendShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="ExtendSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="ExtendVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="ExtendDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                                                 &lt;element name="Status" minOccurs="0"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                                       &lt;enumeration value="1"/&gt;
     *                                                       &lt;enumeration value="2"/&gt;
     *                                                       &lt;enumeration value="3"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                               &lt;/all&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PackageInfoList"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="PackageInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;all&gt;
     *                                                 &lt;element name="PackageType" minOccurs="0"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                       &lt;enumeration value="Shipped"/&gt;
     *                                                       &lt;enumeration value="Unshipped"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="ShipCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                 &lt;element name="ItemInfoList"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
     *                                                             &lt;complexType&gt;
     *                                                               &lt;complexContent&gt;
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                                   &lt;all&gt;
     *                                                                     &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                                     &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                                                     &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                                                   &lt;/all&gt;
     *                                                                 &lt;/restriction&gt;
     *                                                               &lt;/complexContent&gt;
     *                                                             &lt;/complexType&gt;
     *                                                           &lt;/element&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/all&gt;
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
    public static class ResponseBody {

        @XmlElement(name = "PageInfo", required = true)
        @JsonProperty("PageInfo")
        protected OrderListReportResponse.ResponseBody.PageInfo pageInfo;
        @XmlElement(name = "RequestID", required = true)
        @JsonProperty("RequestID")
        protected String requestID;
        @XmlElement(name = "RequestDate", required = true)
        @JsonProperty("RequestDate")
        protected String requestDate;
        @XmlElement(name = "OrderInfoList", required = true)
        @JsonProperty("OrderInfoList")
        @JsonUnwrapped
        protected OrderListReportResponse.ResponseBody.OrderInfoList orderInfoList;

        /**
         * 取得 pageInfo 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link OrderListReportResponse.ResponseBody.PageInfo }
         *     
         */
        public OrderListReportResponse.ResponseBody.PageInfo getPageInfo() {
            return pageInfo;
        }

        /**
         * 設定 pageInfo 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderListReportResponse.ResponseBody.PageInfo }
         *     
         */
        public void setPageInfo(OrderListReportResponse.ResponseBody.PageInfo value) {
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
         * 取得 orderInfoList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link OrderListReportResponse.ResponseBody.OrderInfoList }
         *     
         */
        public OrderListReportResponse.ResponseBody.OrderInfoList getOrderInfoList() {
            return orderInfoList;
        }

        /**
         * 設定 orderInfoList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderListReportResponse.ResponseBody.OrderInfoList }
         *     
         */
        public void setOrderInfoList(OrderListReportResponse.ResponseBody.OrderInfoList value) {
            this.orderInfoList = value;
        }


        /**
         * <p>anonymous complex type 的 Java 類別.
         * 
         * <p>下列綱要片段會指定此類別中包含的預期內容.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="OrderInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="SellerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="OrderDownloaded" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="true"/&gt;
         *                         &lt;enumeration value="false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="OrderStatus" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                         &lt;enumeration value="3"/&gt;
         *                         &lt;enumeration value="4"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="OrderStatusDescription" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="Unshipped"/&gt;
         *                         &lt;enumeration value="Partially Shipped"/&gt;
         *                         &lt;enumeration value="Shipped"/&gt;
         *                         &lt;enumeration value="Invoiced"/&gt;
         *                         &lt;enumeration value="Voided"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="CustomerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToCityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ShipToCompany" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="OrderItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="ShippingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="VATTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="DutyTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
         *                   &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="OrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="OrderTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="IsAutoVoid" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="true"/&gt;
         *                         &lt;enumeration value="false"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="SalesChannel" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="2"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="FulfillmentOption" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                         &lt;enumeration value="0"/&gt;
         *                         &lt;enumeration value="1"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="ItemInfoList"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;all&gt;
         *                                       &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="OrderedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                                       &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                                       &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="ExtendUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="ExtendShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="ExtendSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="ExtendVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="ExtendDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                                       &lt;element name="Status" minOccurs="0"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                                             &lt;enumeration value="1"/&gt;
         *                                             &lt;enumeration value="2"/&gt;
         *                                             &lt;enumeration value="3"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                     &lt;/all&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PackageInfoList"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="PackageInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;all&gt;
         *                                       &lt;element name="PackageType" minOccurs="0"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                             &lt;enumeration value="Shipped"/&gt;
         *                                             &lt;enumeration value="Unshipped"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="ShipCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                       &lt;element name="ItemInfoList"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
         *                                                   &lt;complexType&gt;
         *                                                     &lt;complexContent&gt;
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                                         &lt;all&gt;
         *                                                           &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                           &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                                                           &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                                                         &lt;/all&gt;
         *                                                       &lt;/restriction&gt;
         *                                                     &lt;/complexContent&gt;
         *                                                   &lt;/complexType&gt;
         *                                                 &lt;/element&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/all&gt;
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
            "orderInfo"
        })
        public static class OrderInfoList {

            @XmlElement(name = "OrderInfo")
            @JsonProperty("OrderInfo")
            protected List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo> orderInfo;

            /**
             * Gets the value of the orderInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the orderInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOrderInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo }
             * 
             * @return
             * Objects of the following type(s) are allowed in the list
             * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo }
             * 
             */
            public List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo> getOrderInfo() {
                if (orderInfo == null) {
                    orderInfo = new ArrayList<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo>();
                }
                return this.orderInfo;
            }


            /**
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;all&gt;
             *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="SellerOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="OrderDownloaded" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="true"/&gt;
             *               &lt;enumeration value="false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="OrderStatus" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *               &lt;enumeration value="3"/&gt;
             *               &lt;enumeration value="4"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="OrderStatusDescription" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="Unshipped"/&gt;
             *               &lt;enumeration value="Partially Shipped"/&gt;
             *               &lt;enumeration value="Shipped"/&gt;
             *               &lt;enumeration value="Invoiced"/&gt;
             *               &lt;enumeration value="Voided"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CustomerPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="CustomerEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToCityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToStateCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ShipToCompany" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="OrderItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="ShippingAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="SalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="VATTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="DutyTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
             *         &lt;element name="DiscountAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="OrderQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="OrderTotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="IsAutoVoid" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="true"/&gt;
             *               &lt;enumeration value="false"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SalesChannel" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="2"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="FulfillmentOption" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *               &lt;enumeration value="0"/&gt;
             *               &lt;enumeration value="1"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="ItemInfoList"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;all&gt;
             *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="OrderedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                             &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                             &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="ExtendUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="ExtendShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="ExtendSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="ExtendVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="ExtendDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *                             &lt;element name="Status" minOccurs="0"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *                                   &lt;enumeration value="1"/&gt;
             *                                   &lt;enumeration value="2"/&gt;
             *                                   &lt;enumeration value="3"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                           &lt;/all&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="PackageInfoList"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="PackageInfo" maxOccurs="unbounded" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;all&gt;
             *                             &lt;element name="PackageType" minOccurs="0"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                   &lt;enumeration value="Shipped"/&gt;
             *                                   &lt;enumeration value="Unshipped"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="ShipCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                             &lt;element name="ItemInfoList"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
             *                                         &lt;complexType&gt;
             *                                           &lt;complexContent&gt;
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                               &lt;all&gt;
             *                                                 &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                                 &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                                                 &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                                               &lt;/all&gt;
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
            public static class OrderInfo {

                @XmlElement(name = "SellerID", required = true)
                @JsonProperty("SellerID")
                protected String sellerID;
                @XmlElement(name = "OrderNumber", required = true)
                @JsonProperty("OrderNumber")
                protected BigInteger orderNumber;
                @XmlElement(name = "SellerOrderNumber", required = true)
                @JsonProperty("SellerOrderNumber")
                protected String sellerOrderNumber;
                @XmlElement(name = "InvoiceNumber", required = true)
                @JsonProperty("InvoiceNumber")
                protected BigInteger invoiceNumber;
                @XmlElement(name = "OrderDownloaded")
                @JsonProperty("OrderDownloaded")
                protected String orderDownloaded;
                @XmlElement(name = "OrderDate", required = true)
                @JsonProperty("OrderDate")
                protected String orderDate;
                @XmlElement(name = "OrderStatus")
                @JsonProperty("OrderStatus")
                protected BigInteger orderStatus;
                @XmlElement(name = "OrderStatusDescription")
                @JsonProperty("OrderStatusDescription")
                protected String orderStatusDescription;
                @XmlElement(name = "CustomerName", required = true)
                @JsonProperty("CustomerName")
                protected String customerName;
                @XmlElement(name = "CustomerPhoneNumber", required = true)
                @JsonProperty("CustomerPhoneNumber")
                protected String customerPhoneNumber;
                @XmlElement(name = "CustomerEmailAddress", required = true)
                @JsonProperty("CustomerEmailAddress")
                protected String customerEmailAddress;
                @XmlElement(name = "ShipToAddress1", required = true)
                @JsonProperty("ShipToAddress1")
                protected String shipToAddress1;
                @XmlElement(name = "ShipToAddress2", required = true)
                @JsonProperty("ShipToAddress2")
                protected String shipToAddress2;
                @XmlElement(name = "ShipToCityName", required = true)
                @JsonProperty("ShipToCityName")
                protected String shipToCityName;
                @XmlElement(name = "ShipToStateCode", required = true)
                @JsonProperty("ShipToStateCode")
                protected String shipToStateCode;
                @XmlElement(name = "ShipToZipCode", required = true)
                @JsonProperty("ShipToZipCode")
                protected String shipToZipCode;
                @XmlElement(name = "ShipToCountryCode", required = true)
                @JsonProperty("ShipToCountryCode")
                protected String shipToCountryCode;
                @XmlElement(name = "ShipService", required = true)
                @JsonProperty("ShipService")
                protected String shipService;
                @XmlElement(name = "ShipToFirstName", required = true)
                @JsonProperty("ShipToFirstName")
                protected String shipToFirstName;
                @XmlElement(name = "ShipToLastName", required = true)
                @JsonProperty("ShipToLastName")
                protected String shipToLastName;
                @XmlElement(name = "ShipToCompany", required = true)
                @JsonProperty("ShipToCompany")
                protected String shipToCompany;
                @XmlElement(name = "OrderItemAmount", required = true)
                @JsonProperty("OrderItemAmount")
                protected BigDecimal orderItemAmount;
                @XmlElement(name = "ShippingAmount", required = true)
                @JsonProperty("ShippingAmount")
                protected BigDecimal shippingAmount;
                @XmlElement(name = "SalesTax")
                @JsonProperty("SalesTax")
                protected BigDecimal salesTax;
                @XmlElement(name = "VATTotal")
                @JsonProperty("VATTotal")
                protected BigDecimal vatTotal;
                @XmlElement(name = "DutyTotal")
                @JsonProperty("DutyTotal")
                protected BigDecimal dutyTotal;
                @XmlElement(name = "DiscountAmount", required = true)
                @JsonProperty("DiscountAmount")
                protected BigDecimal discountAmount;
                @XmlElement(name = "OrderQty", required = true)
                @JsonProperty("OrderQty")
                protected BigInteger orderQty;
                @XmlElement(name = "RefundAmount", required = true)
                @JsonProperty("RefundAmount")
                protected BigDecimal refundAmount;
                @XmlElement(name = "RecyclingFeeAmount")
                @JsonProperty("RecyclingFeeAmount")
                protected BigDecimal  recyclingFeeAmount;
                @XmlElement(name = "OrderTotalAmount", required = true)
                @JsonProperty("OrderTotalAmount")
                protected BigDecimal orderTotalAmount;
                @XmlElement(name = "IsAutoVoid")
                @JsonProperty("IsAutoVoid")
                protected String isAutoVoid;
                @XmlElement(name = "SalesChannel")
                @JsonProperty("SalesChannel")
                protected Integer salesChannel;
                @XmlElement(name = "FulfillmentOption")
                @JsonProperty("FulfillmentOption")
                protected Integer fulfillmentOption;
                @XmlElement(name = "ItemInfoList", required = true)
                @JsonProperty("ItemInfoList")
                protected OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList itemInfoList;
                @XmlElement(name = "PackageInfoList", required = true)
                @JsonProperty("PackageInfoList")
                protected OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList packageInfoList;

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
                 * 取得 sellerOrderNumber 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSellerOrderNumber() {
                    return sellerOrderNumber;
                }

                /**
                 * 設定 sellerOrderNumber 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSellerOrderNumber(String value) {
                    this.sellerOrderNumber = value;
                }

                /**
                 * 取得 invoiceNumber 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getInvoiceNumber() {
                    return invoiceNumber;
                }

                /**
                 * 設定 invoiceNumber 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setInvoiceNumber(BigInteger value) {
                    this.invoiceNumber = value;
                }

                /**
                 * 取得 orderDownloaded 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderDownloaded() {
                    return orderDownloaded;
                }

                /**
                 * 設定 orderDownloaded 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderDownloaded(String value) {
                    this.orderDownloaded = value;
                }

                /**
                 * 取得 orderDate 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderDate() {
                    return orderDate;
                }

                /**
                 * 設定 orderDate 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderDate(String value) {
                    this.orderDate = value;
                }

                /**
                 * 取得 orderStatus 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getOrderStatus() {
                    return orderStatus;
                }

                /**
                 * 設定 orderStatus 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setOrderStatus(BigInteger value) {
                    this.orderStatus = value;
                }

                /**
                 * 取得 orderStatusDescription 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOrderStatusDescription() {
                    return orderStatusDescription;
                }

                /**
                 * 設定 orderStatusDescription 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOrderStatusDescription(String value) {
                    this.orderStatusDescription = value;
                }

                /**
                 * 取得 customerName 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerName() {
                    return customerName;
                }

                /**
                 * 設定 customerName 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerName(String value) {
                    this.customerName = value;
                }

                /**
                 * 取得 customerPhoneNumber 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerPhoneNumber() {
                    return customerPhoneNumber;
                }

                /**
                 * 設定 customerPhoneNumber 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerPhoneNumber(String value) {
                    this.customerPhoneNumber = value;
                }

                /**
                 * 取得 customerEmailAddress 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCustomerEmailAddress() {
                    return customerEmailAddress;
                }

                /**
                 * 設定 customerEmailAddress 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCustomerEmailAddress(String value) {
                    this.customerEmailAddress = value;
                }

                /**
                 * 取得 shipToAddress1 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToAddress1() {
                    return shipToAddress1;
                }

                /**
                 * 設定 shipToAddress1 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToAddress1(String value) {
                    this.shipToAddress1 = value;
                }

                /**
                 * 取得 shipToAddress2 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToAddress2() {
                    return shipToAddress2;
                }

                /**
                 * 設定 shipToAddress2 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToAddress2(String value) {
                    this.shipToAddress2 = value;
                }

                /**
                 * 取得 shipToCityName 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToCityName() {
                    return shipToCityName;
                }

                /**
                 * 設定 shipToCityName 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToCityName(String value) {
                    this.shipToCityName = value;
                }

                /**
                 * 取得 shipToStateCode 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToStateCode() {
                    return shipToStateCode;
                }

                /**
                 * 設定 shipToStateCode 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToStateCode(String value) {
                    this.shipToStateCode = value;
                }

                /**
                 * 取得 shipToZipCode 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToZipCode() {
                    return shipToZipCode;
                }

                /**
                 * 設定 shipToZipCode 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToZipCode(String value) {
                    this.shipToZipCode = value;
                }

                /**
                 * 取得 shipToCountryCode 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToCountryCode() {
                    return shipToCountryCode;
                }

                /**
                 * 設定 shipToCountryCode 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToCountryCode(String value) {
                    this.shipToCountryCode = value;
                }

                /**
                 * 取得 shipService 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipService() {
                    return shipService;
                }

                /**
                 * 設定 shipService 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipService(String value) {
                    this.shipService = value;
                }

                /**
                 * 取得 shipToFirstName 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToFirstName() {
                    return shipToFirstName;
                }

                /**
                 * 設定 shipToFirstName 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToFirstName(String value) {
                    this.shipToFirstName = value;
                }

                /**
                 * 取得 shipToLastName 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToLastName() {
                    return shipToLastName;
                }

                /**
                 * 設定 shipToLastName 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToLastName(String value) {
                    this.shipToLastName = value;
                }

                /**
                 * 取得 shipToCompany 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipToCompany() {
                    return shipToCompany;
                }

                /**
                 * 設定 shipToCompany 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipToCompany(String value) {
                    this.shipToCompany = value;
                }

                /**
                 * 取得 orderItemAmount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getOrderItemAmount() {
                    return orderItemAmount;
                }

                /**
                 * 設定 orderItemAmount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setOrderItemAmount(BigDecimal value) {
                    this.orderItemAmount = value;
                }

                /**
                 * 取得 shippingAmount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getShippingAmount() {
                    return shippingAmount;
                }

                /**
                 * 設定 shippingAmount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setShippingAmount(BigDecimal value) {
                    this.shippingAmount = value;
                }

                /**
                 * 取得 salesTax 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSalesTax() {
                    return salesTax;
                }

                /**
                 * 設定 salesTax 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSalesTax(BigDecimal value) {
                    this.salesTax = value;
                }

                /**
                 * 取得 vatTotal 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVATTotal() {
                    return vatTotal;
                }

                /**
                 * 設定 vatTotal 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVATTotal(BigDecimal value) {
                    this.vatTotal = value;
                }

                /**
                 * 取得 dutyTotal 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDutyTotal() {
                    return dutyTotal;
                }

                /**
                 * 設定 dutyTotal 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDutyTotal(BigDecimal value) {
                    this.dutyTotal = value;
                }

                /**
                 * 取得 discountAmount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getDiscountAmount() {
                    return discountAmount;
                }

                /**
                 * 設定 discountAmount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setDiscountAmount(BigDecimal value) {
                    this.discountAmount = value;
                }

                /**
                 * 取得 orderQty 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getOrderQty() {
                    return orderQty;
                }

                /**
                 * 設定 orderQty 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setOrderQty(BigInteger value) {
                    this.orderQty = value;
                }

                /**
                 * 取得 refundAmount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRefundAmount() {
                    return refundAmount;
                }

                /**
                 * 設定 refundAmount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRefundAmount(BigDecimal value) {
                    this.refundAmount = value;
                }

                /**
                 * 取得 orderTotalAmount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getOrderTotalAmount() {
                    return orderTotalAmount;
                }

                /**
                 * 設定 orderTotalAmount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setOrderTotalAmount(BigDecimal value) {
                    this.orderTotalAmount = value;
                }

                /**
                 * 取得 isAutoVoid 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsAutoVoid() {
                    return isAutoVoid;
                }

                /**
                 * 設定 isAutoVoid 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsAutoVoid(String value) {
                    this.isAutoVoid = value;
                }

                /**
                 * 取得 salesChannel 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getSalesChannel() {
                    return salesChannel;
                }

                /**
                 * 設定 salesChannel 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setSalesChannel(Integer value) {
                    this.salesChannel = value;
                }

                /**
                 * 取得 fulfillmentOption 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getFulfillmentOption() {
                    return fulfillmentOption;
                }

                /**
                 * 設定 fulfillmentOption 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setFulfillmentOption(Integer value) {
                    this.fulfillmentOption = value;
                }

                /**
                 * 取得 itemInfoList 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList }
                 *     
                 */
                public OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList getItemInfoList() {
                    return itemInfoList;
                }

                /**
                 * 設定 itemInfoList 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList }
                 *     
                 */
                public void setItemInfoList(OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList value) {
                    this.itemInfoList = value;
                }

                /**
                 * 取得 packageInfoList 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList }
                 *     
                 */
                public OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList getPackageInfoList() {
                    return packageInfoList;
                }

                /**
                 * 設定 packageInfoList 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList }
                 *     
                 */
                public void setPackageInfoList(OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList value) {
                    this.packageInfoList = value;
                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;all&gt;
                 *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="OrderedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *                   &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *                   &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="ExtendUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="ExtendShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="ExtendSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="ExtendVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="ExtendDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                 *                   &lt;element name="Status" minOccurs="0"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
                 *                         &lt;enumeration value="1"/&gt;
                 *                         &lt;enumeration value="2"/&gt;
                 *                         &lt;enumeration value="3"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                 &lt;/all&gt;
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
                    "itemInfo"
                })
                public static class ItemInfoList {

                    @XmlElement(name = "ItemInfo", required = true)
                    @JsonProperty("ItemInfo")
                    protected List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList.ItemInfo> itemInfo;

                    /**
                     * Gets the value of the itemInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the itemInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getItemInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList.ItemInfo }
                     * 
                     * @return
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList.ItemInfo }
                     * 
                     */
                    public List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList.ItemInfo> getItemInfo() {
                        if (itemInfo == null) {
                            itemInfo = new ArrayList<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.ItemInfoList.ItemInfo>();
                        }
                        return this.itemInfo;
                    }


                    /**
                     * <p>anonymous complex type 的 Java 類別.
                     * 
                     * <p>下列綱要片段會指定此類別中包含的預期內容.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;all&gt;
                     *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="UPCCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="OrderedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                     *         &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                     *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="ExtendUnitPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="ExtendShippingCharge" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="ExtendSalesTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="ExtendVAT" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="ExtendDuty" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
                     *         &lt;element name="Status" minOccurs="0"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
                     *               &lt;enumeration value="1"/&gt;
                     *               &lt;enumeration value="2"/&gt;
                     *               &lt;enumeration value="3"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                    public static class ItemInfo {

                        @XmlElement(name = "SellerPartNumber", required = true)
                        @JsonProperty("SellerPartNumber")
                        protected String sellerPartNumber;
                        @XmlElement(name = "NeweggItemNumber", required = true)
                        @JsonProperty("NeweggItemNumber")
                        protected String neweggItemNumber;
                        @XmlElement(name = "MfrPartNumber", required = true)
                        @JsonProperty("MfrPartNumber")
                        protected String mfrPartNumber;
                        @XmlElement(name = "UPCCode", required = true)
                        @JsonProperty("UPCCode")
                        protected String upcCode;
                        @XmlElement(name = "Description", required = true)
                        @JsonProperty("Description")
                        protected String description;
                        @XmlElement(name = "OrderedQty", required = true)
                        @JsonProperty("OrderedQty")
                        protected BigInteger orderedQty;
                        @XmlElement(name = "ShippedQty", required = true)
                        @JsonProperty("ShippedQty")
                        protected BigInteger shippedQty;
                        @XmlElement(name = "UnitPrice", required = true)
                        @JsonProperty("UnitPrice")
                        protected BigDecimal unitPrice;
                        @XmlElement(name = "ExtendUnitPrice", required = true)
                        @JsonProperty("ExtendUnitPrice")
                        protected BigDecimal extendUnitPrice;
                        @XmlElement(name = "ExtendShippingCharge", required = true)
                        @JsonProperty("ExtendShippingCharge")
                        protected BigDecimal extendShippingCharge;
                        @XmlElement(name = "ExtendSalesTax", required = true)
                        @JsonProperty("ExtendSalesTax")
                        protected BigDecimal extendSalesTax;
                        @XmlElement(name = "ExtendVAT", required = true)
                        @JsonProperty("ExtendVAT")
                        protected BigDecimal extendVAT;
                        @XmlElement(name = "ExtendDuty", required = true)
                        @JsonProperty("ExtendDuty")
                        protected BigDecimal extendDuty;
                        @XmlElement(name = "Status")
                        @JsonProperty("Status")
                        protected BigInteger status;
                        @XmlElement(name = "StatusDescription")
                        @JsonProperty("StatusDescription")
                        protected String statusDescription;
                        @XmlElement(name = "AutoRegWarranty")
                        @JsonProperty("AutoRegWarranty")                        
                        protected String autoRegWarranty;
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
                         * 取得 mfrPartNumber 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMfrPartNumber() {
                            return mfrPartNumber;
                        }

                        /**
                         * 設定 mfrPartNumber 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMfrPartNumber(String value) {
                            this.mfrPartNumber = value;
                        }

                        /**
                         * 取得 upcCode 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUPCCode() {
                            return upcCode;
                        }

                        /**
                         * 設定 upcCode 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUPCCode(String value) {
                            this.upcCode = value;
                        }

                        /**
                         * 取得 description 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDescription() {
                            return description;
                        }

                        /**
                         * 設定 description 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDescription(String value) {
                            this.description = value;
                        }

                        /**
                         * 取得 orderedQty 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getOrderedQty() {
                            return orderedQty;
                        }

                        /**
                         * 設定 orderedQty 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setOrderedQty(BigInteger value) {
                            this.orderedQty = value;
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

                        /**
                         * 取得 unitPrice 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getUnitPrice() {
                            return unitPrice;
                        }

                        /**
                         * 設定 unitPrice 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setUnitPrice(BigDecimal value) {
                            this.unitPrice = value;
                        }

                        /**
                         * 取得 extendUnitPrice 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getExtendUnitPrice() {
                            return extendUnitPrice;
                        }

                        /**
                         * 設定 extendUnitPrice 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setExtendUnitPrice(BigDecimal value) {
                            this.extendUnitPrice = value;
                        }

                        /**
                         * 取得 extendShippingCharge 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getExtendShippingCharge() {
                            return extendShippingCharge;
                        }

                        /**
                         * 設定 extendShippingCharge 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setExtendShippingCharge(BigDecimal value) {
                            this.extendShippingCharge = value;
                        }

                        /**
                         * 取得 extendSalesTax 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getExtendSalesTax() {
                            return extendSalesTax;
                        }

                        /**
                         * 設定 extendSalesTax 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setExtendSalesTax(BigDecimal value) {
                            this.extendSalesTax = value;
                        }

                        /**
                         * 取得 extendVAT 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getExtendVAT() {
                            return extendVAT;
                        }

                        /**
                         * 設定 extendVAT 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setExtendVAT(BigDecimal value) {
                            this.extendVAT = value;
                        }

                        /**
                         * 取得 extendDuty 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getExtendDuty() {
                            return extendDuty;
                        }

                        /**
                         * 設定 extendDuty 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setExtendDuty(BigDecimal value) {
                            this.extendDuty = value;
                        }

                        /**
                         * 取得 status 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getStatus() {
                            return status;
                        }

                        /**
                         * 設定 status 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setStatus(BigInteger value) {
                            this.status = value;
                        }

                        /**
                         * 取得 statusDescription 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStatusDescription() {
                            return statusDescription;
                        }

                        /**
                         * 設定 statusDescription 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStatusDescription(String value) {
                            this.statusDescription = value;
                        }

						public String getUpcCode() {
							return upcCode;
						}

						public void setUpcCode(String upcCode) {
							this.upcCode = upcCode;
						}

						public String getAutoRegWarranty() {
							return autoRegWarranty;
						}

						public void setAutoRegWarranty(String autoRegWarranty) {
							this.autoRegWarranty = autoRegWarranty;
						}

                    }

                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="PackageInfo" maxOccurs="unbounded" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;all&gt;
                 *                   &lt;element name="PackageType" minOccurs="0"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                         &lt;enumeration value="Shipped"/&gt;
                 *                         &lt;enumeration value="Unshipped"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="ShipCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                   &lt;element name="ItemInfoList"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
                 *                               &lt;complexType&gt;
                 *                                 &lt;complexContent&gt;
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                                     &lt;all&gt;
                 *                                       &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                                       &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *                                       &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *                                     &lt;/all&gt;
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
                    "packageInfo"
                })
                public static class PackageInfoList {

                    @XmlElement(name = "PackageInfo")
                    @JsonProperty("PackageInfo")
                    protected List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo> packageInfo;

                    /**
                     * Gets the value of the packageInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the packageInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPackageInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo }
                     * 
                     * @return
                     * Objects of the following type(s) are allowed in the list
                     * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo }
                     * 
                     */
                    public List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo> getPackageInfo() {
                        if (packageInfo == null) {
                            packageInfo = new ArrayList<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo>();
                        }
                        return this.packageInfo;
                    }


                    /**
                     * <p>anonymous complex type 的 Java 類別.
                     * 
                     * <p>下列綱要片段會指定此類別中包含的預期內容.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;all&gt;
                     *         &lt;element name="PackageType" minOccurs="0"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *               &lt;enumeration value="Shipped"/&gt;
                     *               &lt;enumeration value="Unshipped"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="ShipCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="ShipService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *         &lt;element name="ItemInfoList"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
                     *                     &lt;complexType&gt;
                     *                       &lt;complexContent&gt;
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                           &lt;all&gt;
                     *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                             &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                     *                             &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                     *                           &lt;/all&gt;
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
                    public static class PackageInfo {

                        @XmlElement(name = "PackageType")
                        @JsonProperty("PackageType")
                        protected String packageType;
                        @XmlElement(name = "ShipCarrier", required = true)
                        @JsonProperty("ShipCarrier")
                        protected String shipCarrier;
                        @XmlElement(name = "ShipService", required = true)
                        @JsonProperty("ShipService")
                        protected String shipService;
                        @XmlElement(name = "TrackingNumber", required = true)
                        @JsonProperty("TrackingNumber")
                        protected String trackingNumber;
                        @XmlElement(name = "ShipDate", required = true)
                        @JsonProperty("ShipDate")
                        protected String shipDate;
                        @XmlElement(name = "ItemInfoList", required = true)
                        @JsonProperty("ItemInfoList")
                        protected OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList itemInfoList;

                        /**
                         * 取得 packageType 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPackageType() {
                            return packageType;
                        }

                        /**
                         * 設定 packageType 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPackageType(String value) {
                            this.packageType = value;
                        }

                        /**
                         * 取得 shipCarrier 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getShipCarrier() {
                            return shipCarrier;
                        }

                        /**
                         * 設定 shipCarrier 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setShipCarrier(String value) {
                            this.shipCarrier = value;
                        }

                        /**
                         * 取得 shipService 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getShipService() {
                            return shipService;
                        }

                        /**
                         * 設定 shipService 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setShipService(String value) {
                            this.shipService = value;
                        }

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
                         * 取得 itemInfoList 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList }
                         *     
                         */
                        public OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList getItemInfoList() {
                            return itemInfoList;
                        }

                        /**
                         * 設定 itemInfoList 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList }
                         *     
                         */
                        public void setItemInfoList(OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList value) {
                            this.itemInfoList = value;
                        }


                        /**
                         * <p>anonymous complex type 的 Java 類別.
                         * 
                         * <p>下列綱要片段會指定此類別中包含的預期內容.
                         * 
                         * <pre>
                         * &lt;complexType&gt;
                         *   &lt;complexContent&gt;
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *       &lt;sequence&gt;
                         *         &lt;element name="ItemInfo" maxOccurs="unbounded"&gt;
                         *           &lt;complexType&gt;
                         *             &lt;complexContent&gt;
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                         *                 &lt;all&gt;
                         *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *                   &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                         *                   &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                         *                 &lt;/all&gt;
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
                            "itemInfo"
                        })
                        public static class ItemInfoList {

                            @XmlElement(name = "ItemInfo", required = true)
                            @JsonProperty("ItemInfo")
                            protected List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList.ItemInfo> itemInfo;

                            /**
                             * Gets the value of the itemInfo property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the itemInfo property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getItemInfo().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList.ItemInfo }
                             * 
                             * @return
                             * Objects of the following type(s) are allowed in the list
                             * {@link OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList.ItemInfo }
                             * 
                             */
                            public List<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList.ItemInfo> getItemInfo() {
                                if (itemInfo == null) {
                                    itemInfo = new ArrayList<OrderListReportResponse.ResponseBody.OrderInfoList.OrderInfo.PackageInfoList.PackageInfo.ItemInfoList.ItemInfo>();
                                }
                                return this.itemInfo;
                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType&gt;
                             *   &lt;complexContent&gt;
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                             *       &lt;all&gt;
                             *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                             *         &lt;element name="MfrPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                             *         &lt;element name="ShippedQty" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
                            public static class ItemInfo {

                                @XmlElement(name = "SellerPartNumber", required = true)
                                @JsonProperty("SellerPartNumber")
                                protected String sellerPartNumber;
                                @XmlElement(name = "MfrPartNumber", required = true)
                                @JsonProperty("MfrPartNumber")
                                protected String mfrPartNumber;
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
                                 * 取得 mfrPartNumber 特性的值.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMfrPartNumber() {
                                    return mfrPartNumber;
                                }

                                /**
                                 * 設定 mfrPartNumber 特性的值.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMfrPartNumber(String value) {
                                    this.mfrPartNumber = value;
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


				public BigDecimal getVatTotal() {
					return vatTotal;
				}

				public void setVatTotal(BigDecimal vatTotal) {
					this.vatTotal = vatTotal;
				}

				public BigDecimal getRecyclingFeeAmount() {
					return recyclingFeeAmount;
				}

				public void setRecyclingFeeAmount(BigDecimal recyclingFeeAmount) {
					this.recyclingFeeAmount = recyclingFeeAmount;
				}

            }

        }


        /**
         * <p>anonymous complex type 的 Java 類別.
         * 
         * <p>下列綱要片段會指定此類別中包含的預期內容.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="TotalPageCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        public static class PageInfo {

            @XmlElement(name = "TotalCount")
            @JsonProperty("TotalCount")
            protected int totalCount;
            @XmlElement(name = "TotalPageCount")
            @JsonProperty("TotalPageCount")
            protected int totalPageCount;
            @XmlElement(name = "PageSize")
            @JsonProperty("PageSize")
            protected int pageSize;
            @XmlElement(name = "PageIndex")
            @JsonProperty("PageIndex")
            protected int pageIndex;

            /**
             * 取得 totalCount 特性的值.
             * @return
             * possible object is 
             *     {@link int }
             * 
             */
            public int getTotalCount() {
                return totalCount;
            }

            /**
             * 設定 totalCount 特性的值.
             * @param value
             *     allowed object is
             *     {@link  }
             * 
             */
            public void setTotalCount(int value) {
                this.totalCount = value;
            }

            /**
             * 取得 totalPageCount 特性的值.
             * @return
             * possible object is 
             *     {@link int }
             * 
             */
            public int getTotalPageCount() {
                return totalPageCount;
            }

            /**
             * 設定 totalPageCount 特性的值.
             * @param value
             *     allowed object is
             *     {@link  }
             * 
             */
            public void setTotalPageCount(int value) {
                this.totalPageCount = value;
            }

            /**
             * 取得 pageSize 特性的值.
             * @return
             * possible object is 
             *     {@link int }
             * 
             */
            public int getPageSize() {
                return pageSize;
            }

            /**
             * 設定 pageSize 特性的值.
             * @param value
             *     allowed object is
             *     {@link  }
             * 
             */
            public void setPageSize(int value) {
                this.pageSize = value;
            }

            /**
             * 取得 pageIndex 特性的值.
             * @return
             * possible object is 
             *     {@link int }
             * 
             */
            public int getPageIndex() {
                return pageIndex;
            }

            /**
             * 設定 pageIndex 特性的值.
             * @param value
             *     allowed object is
             *     {@link  }
             * 
             */
            public void setPageIndex(int value) {
                this.pageIndex = value;
            }

        }

    }

}
