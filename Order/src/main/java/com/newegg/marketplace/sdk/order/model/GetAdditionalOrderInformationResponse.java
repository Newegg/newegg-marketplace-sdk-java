//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.22 於 09:54:16 AM CST 
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
 *                   &lt;element name="AddOrderInfoList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AddOrderInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="RecipientIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="RecipientIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                       &lt;element name="NISPOriginalInfo" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="NISPOriFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="NISPOriPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="OriginalInputInfo"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="OriginalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                               &lt;/all&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="AddInfo1" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="AddInfo2" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="AddInfo3" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="TaxDutyTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ImportTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="IDCopyFront" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="IDCopyBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
public class GetAdditionalOrderInformationResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OperationType", defaultValue = "GetAddOrderInfoResponse", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetAddOrderInfoResponse";
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetAdditionalOrderInformationResponse.ResponseBody responseBody;
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
     *     {@link GetAdditionalOrderInformationResponse.ResponseBody }
     *     
     */
    public GetAdditionalOrderInformationResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAdditionalOrderInformationResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetAdditionalOrderInformationResponse.ResponseBody value) {
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
     *         &lt;element name="AddOrderInfoList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AddOrderInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="RecipientIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="RecipientIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                             &lt;element name="NISPOriginalInfo" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="NISPOriFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="NISPOriPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="OriginalInputInfo"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="OriginalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                     &lt;/all&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="AddInfo1" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AddInfo2" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AddInfo3" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="TaxDutyTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ImportTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="IDCopyFront" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="IDCopyBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        protected GetAdditionalOrderInformationResponse.ResponseBody.PageInfo pageInfo;
        @XmlElement(name = "AddOrderInfoList", required = true)
        @JsonProperty("AddOrderInfoList")
        @JsonUnwrapped
        protected GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList addOrderInfoList;

        /**
         * 取得 pageInfo 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link GetAdditionalOrderInformationResponse.ResponseBody.PageInfo }
         *     
         */
        public GetAdditionalOrderInformationResponse.ResponseBody.PageInfo getPageInfo() {
            return pageInfo;
        }

        /**
         * 設定 pageInfo 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetAdditionalOrderInformationResponse.ResponseBody.PageInfo }
         *     
         */
        public void setPageInfo(GetAdditionalOrderInformationResponse.ResponseBody.PageInfo value) {
            this.pageInfo = value;
        }

        /**
         * 取得 addOrderInfoList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList }
         *     
         */
        public GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList getAddOrderInfoList() {
            return addOrderInfoList;
        }

        /**
         * 設定 addOrderInfoList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList }
         *     
         */
        public void setAddOrderInfoList(GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList value) {
            this.addOrderInfoList = value;
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
         *         &lt;element name="AddOrderInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="RecipientIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="RecipientIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                   &lt;element name="NISPOriginalInfo" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="NISPOriFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="NISPOriPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="OriginalInputInfo"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="OriginalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                           &lt;/all&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="AddInfo1" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AddInfo2" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AddInfo3" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="TaxDutyTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ImportTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="IDCopyFront" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="IDCopyBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "addOrderInfo"
        })
        public static class AddOrderInfoList {

            @XmlElement(name = "AddOrderInfo")
            @JsonProperty("AddOrderInfo")
            protected List<GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo> addOrderInfo;

            /**
             * Gets the value of the addOrderInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addOrderInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddOrderInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo }
             * 
             * @return
             * Objects of the following type(s) are allowed in the list
             * {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo }
             * 
             */
            public List<GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo> getAddOrderInfo() {
                if (addOrderInfo == null) {
                    addOrderInfo = new ArrayList<GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo>();
                }
                return this.addOrderInfo;
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
             *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="RecipientIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="RecipientIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *         &lt;element name="NISPOriginalInfo" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="NISPOriFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="NISPOriPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/all&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="OriginalInputInfo"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="OriginalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/all&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="AddInfo1" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AddInfo2" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AddInfo3" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="TaxDutyTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ImportTypeChina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="IDCopyFront" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="IDCopyBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            public static class AddOrderInfo {

                @XmlElement(name = "OrderNumber", required = true)
                @JsonProperty("OrderNumber")
                protected BigInteger orderNumber;
                @XmlElement(name = "RecipientIDType")
                @JsonProperty("RecipientIDType")
                protected String recipientIDType;
                @XmlElement(name = "RecipientIDNumber")
                @JsonProperty("RecipientIDNumber")
                protected String recipientIDNumber;
                @XmlElement(name = "NISPOriginalInfo")
                @JsonProperty("NISPOriginalInfo")
                protected GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.NISPOriginalInfo nispOriginalInfo;
                @XmlElement(name = "OriginalInputInfo", required = true)
                @JsonProperty("OriginalInputInfo")
                protected GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.OriginalInputInfo originalInputInfo;
                @XmlElement(name = "AddInfo1", required = true)
                @JsonProperty("AddInfo1")
                protected Object addInfo1;
                @XmlElement(name = "AddInfo2", required = true)
                @JsonProperty("AddInfo2")
                protected Object addInfo2;
                @XmlElement(name = "AddInfo3", required = true)
                @JsonProperty("AddInfo3")
                protected Object addInfo3;
                @XmlElement(name = "TaxDutyTypeChina", required = true)
                @JsonProperty("TaxDutyTypeChina")
                protected String taxDutyTypeChina;
                @XmlElement(name = "ImportTypeChina", required = true)
                @JsonProperty("ImportTypeChina")
                protected String importTypeChina;
                @XmlElement(name = "IDCopyFront", required = true)
                @JsonProperty("IDCopyFront")
                protected String idCopyFront;
                @XmlElement(name = "IDCopyBack", required = true)
                @JsonProperty("IDCopyBack")
                protected String idCopyBack;

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
                 * 取得 recipientIDType 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRecipientIDType() {
                    return recipientIDType;
                }

                /**
                 * 設定 recipientIDType 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRecipientIDType(String value) {
                    this.recipientIDType = value;
                }

                /**
                 * 取得 recipientIDNumber 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRecipientIDNumber() {
                    return recipientIDNumber;
                }

                /**
                 * 設定 recipientIDNumber 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRecipientIDNumber(String value) {
                    this.recipientIDNumber = value;
                }

                /**
                 * 取得 nispOriginalInfo 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.NISPOriginalInfo }
                 *     
                 */
                public GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.NISPOriginalInfo getNISPOriginalInfo() {
                    return nispOriginalInfo;
                }

                /**
                 * 設定 nispOriginalInfo 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.NISPOriginalInfo }
                 *     
                 */
                public void setNISPOriginalInfo(GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.NISPOriginalInfo value) {
                    this.nispOriginalInfo = value;
                }

                /**
                 * 取得 originalInputInfo 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.OriginalInputInfo }
                 *     
                 */
                public GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.OriginalInputInfo getOriginalInputInfo() {
                    return originalInputInfo;
                }

                /**
                 * 設定 originalInputInfo 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.OriginalInputInfo }
                 *     
                 */
                public void setOriginalInputInfo(GetAdditionalOrderInformationResponse.ResponseBody.AddOrderInfoList.AddOrderInfo.OriginalInputInfo value) {
                    this.originalInputInfo = value;
                }

                /**
                 * 取得 addInfo1 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAddInfo1() {
                    return addInfo1;
                }

                /**
                 * 設定 addInfo1 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAddInfo1(Object value) {
                    this.addInfo1 = value;
                }

                /**
                 * 取得 addInfo2 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAddInfo2() {
                    return addInfo2;
                }

                /**
                 * 設定 addInfo2 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAddInfo2(Object value) {
                    this.addInfo2 = value;
                }

                /**
                 * 取得 addInfo3 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAddInfo3() {
                    return addInfo3;
                }

                /**
                 * 設定 addInfo3 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAddInfo3(Object value) {
                    this.addInfo3 = value;
                }

                /**
                 * 取得 taxDutyTypeChina 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTaxDutyTypeChina() {
                    return taxDutyTypeChina;
                }

                /**
                 * 設定 taxDutyTypeChina 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTaxDutyTypeChina(String value) {
                    this.taxDutyTypeChina = value;
                }

                /**
                 * 取得 importTypeChina 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImportTypeChina() {
                    return importTypeChina;
                }

                /**
                 * 設定 importTypeChina 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImportTypeChina(String value) {
                    this.importTypeChina = value;
                }

                /**
                 * 取得 idCopyFront 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIDCopyFront() {
                    return idCopyFront;
                }

                /**
                 * 設定 idCopyFront 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIDCopyFront(String value) {
                    this.idCopyFront = value;
                }

                /**
                 * 取得 idCopyBack 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIDCopyBack() {
                    return idCopyBack;
                }

                /**
                 * 設定 idCopyBack 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIDCopyBack(String value) {
                    this.idCopyBack = value;
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
                 *         &lt;element name="NISPOriFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="NISPOriPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                public static class NISPOriginalInfo {

                    @XmlElement(name = "NISPOriFirstName", required = true)
                    @JsonProperty("NISPOriFirstName")
                    protected String nispOriFirstName;
                    @XmlElement(name = "NISPOriLastName", required = true)
                    @JsonProperty("NISPOriLastName")
                    protected String nispOriLastName;
                    @XmlElement(name = "NISPOriCompanyName", required = true)
                    @JsonProperty("NISPOriCompanyName")
                    protected String nispOriCompanyName;
                    @XmlElement(name = "NISPOriAddress1", required = true)
                    @JsonProperty("NISPOriAddress1")
                    protected String nispOriAddress1;
                    @XmlElement(name = "NISPOriAddress2", required = true)
                    @JsonProperty("NISPOriAddress2")
                    protected String nispOriAddress2;
                    @XmlElement(name = "NISPOriCity", required = true)
                    @JsonProperty("NISPOriCity")
                    protected String nispOriCity;
                    @XmlElement(name = "NISPOriState", required = true)
                    @JsonProperty("NISPOriState")
                    protected String nispOriState;
                    @XmlElement(name = "NISPOriZipCode", required = true)
                    @JsonProperty("NISPOriZipCode")
                    protected String nispOriZipCode;
                    @XmlElement(name = "NISPOriCountryCode", required = true)
                    @JsonProperty("NISPOriCountryCode")
                    protected String nispOriCountryCode;
                    @XmlElement(name = "NISPOriPhoneNumber", required = true)
                    @JsonProperty("NISPOriPhoneNumber")
                    protected String nispOriPhoneNumber;

                    /**
                     * 取得 nispOriFirstName 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriFirstName() {
                        return nispOriFirstName;
                    }

                    /**
                     * 設定 nispOriFirstName 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriFirstName(String value) {
                        this.nispOriFirstName = value;
                    }

                    /**
                     * 取得 nispOriLastName 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriLastName() {
                        return nispOriLastName;
                    }

                    /**
                     * 設定 nispOriLastName 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriLastName(String value) {
                        this.nispOriLastName = value;
                    }

                    /**
                     * 取得 nispOriCompanyName 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriCompanyName() {
                        return nispOriCompanyName;
                    }

                    /**
                     * 設定 nispOriCompanyName 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriCompanyName(String value) {
                        this.nispOriCompanyName = value;
                    }

                    /**
                     * 取得 nispOriAddress1 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriAddress1() {
                        return nispOriAddress1;
                    }

                    /**
                     * 設定 nispOriAddress1 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriAddress1(String value) {
                        this.nispOriAddress1 = value;
                    }

                    /**
                     * 取得 nispOriAddress2 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriAddress2() {
                        return nispOriAddress2;
                    }

                    /**
                     * 設定 nispOriAddress2 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriAddress2(String value) {
                        this.nispOriAddress2 = value;
                    }

                    /**
                     * 取得 nispOriCity 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriCity() {
                        return nispOriCity;
                    }

                    /**
                     * 設定 nispOriCity 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriCity(String value) {
                        this.nispOriCity = value;
                    }

                    /**
                     * 取得 nispOriState 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriState() {
                        return nispOriState;
                    }

                    /**
                     * 設定 nispOriState 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriState(String value) {
                        this.nispOriState = value;
                    }

                    /**
                     * 取得 nispOriZipCode 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriZipCode() {
                        return nispOriZipCode;
                    }

                    /**
                     * 設定 nispOriZipCode 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriZipCode(String value) {
                        this.nispOriZipCode = value;
                    }

                    /**
                     * 取得 nispOriCountryCode 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriCountryCode() {
                        return nispOriCountryCode;
                    }

                    /**
                     * 設定 nispOriCountryCode 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriCountryCode(String value) {
                        this.nispOriCountryCode = value;
                    }

                    /**
                     * 取得 nispOriPhoneNumber 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNISPOriPhoneNumber() {
                        return nispOriPhoneNumber;
                    }

                    /**
                     * 設定 nispOriPhoneNumber 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNISPOriPhoneNumber(String value) {
                        this.nispOriPhoneNumber = value;
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
                 *         &lt;element name="OriginalFirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalLastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalCompanyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalZipCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalCountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="OriginalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                public static class OriginalInputInfo {

                    @XmlElement(name = "OriginalFirstName", required = true)
                    @JsonProperty("OriginalFirstName")
                    protected String originalFirstName;
                    @XmlElement(name = "OriginalLastName", required = true)
                    @JsonProperty("OriginalLastName")
                    protected String originalLastName;
                    @XmlElement(name = "OriginalCompanyName", required = true)
                    @JsonProperty("OriginalCompanyName")
                    protected String originalCompanyName;
                    @XmlElement(name = "OriginalAddress1", required = true)
                    @JsonProperty("OriginalAddress1")
                    protected String originalAddress1;
                    @XmlElement(name = "OriginalAddress2", required = true)
                    @JsonProperty("OriginalAddress2")
                    protected String originalAddress2;
                    @XmlElement(name = "OriginalCity", required = true)
                    @JsonProperty("OriginalCity")
                    protected String originalCity;
                    @XmlElement(name = "OriginalState", required = true)
                    @JsonProperty("OriginalState")
                    protected String originalState;
                    @XmlElement(name = "OriginalZipCode", required = true)
                    @JsonProperty("OriginalZipCode")
                    protected String originalZipCode;
                    @XmlElement(name = "OriginalCountryCode", required = true)
                    @JsonProperty("OriginalCountryCode")
                    protected String originalCountryCode;
                    @XmlElement(name = "OriginalPhoneNumber", required = true)
                    @JsonProperty("OriginalPhoneNumber")
                    protected String originalPhoneNumber;

                    /**
                     * 取得 originalFirstName 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalFirstName() {
                        return originalFirstName;
                    }

                    /**
                     * 設定 originalFirstName 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalFirstName(String value) {
                        this.originalFirstName = value;
                    }

                    /**
                     * 取得 originalLastName 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalLastName() {
                        return originalLastName;
                    }

                    /**
                     * 設定 originalLastName 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalLastName(String value) {
                        this.originalLastName = value;
                    }

                    /**
                     * 取得 originalCompanyName 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalCompanyName() {
                        return originalCompanyName;
                    }

                    /**
                     * 設定 originalCompanyName 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalCompanyName(String value) {
                        this.originalCompanyName = value;
                    }

                    /**
                     * 取得 originalAddress1 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalAddress1() {
                        return originalAddress1;
                    }

                    /**
                     * 設定 originalAddress1 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalAddress1(String value) {
                        this.originalAddress1 = value;
                    }

                    /**
                     * 取得 originalAddress2 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalAddress2() {
                        return originalAddress2;
                    }

                    /**
                     * 設定 originalAddress2 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalAddress2(String value) {
                        this.originalAddress2 = value;
                    }

                    /**
                     * 取得 originalCity 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalCity() {
                        return originalCity;
                    }

                    /**
                     * 設定 originalCity 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalCity(String value) {
                        this.originalCity = value;
                    }

                    /**
                     * 取得 originalState 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalState() {
                        return originalState;
                    }

                    /**
                     * 設定 originalState 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalState(String value) {
                        this.originalState = value;
                    }

                    /**
                     * 取得 originalZipCode 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalZipCode() {
                        return originalZipCode;
                    }

                    /**
                     * 設定 originalZipCode 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalZipCode(String value) {
                        this.originalZipCode = value;
                    }

                    /**
                     * 取得 originalCountryCode 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalCountryCode() {
                        return originalCountryCode;
                    }

                    /**
                     * 設定 originalCountryCode 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalCountryCode(String value) {
                        this.originalCountryCode = value;
                    }

                    /**
                     * 取得 originalPhoneNumber 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOriginalPhoneNumber() {
                        return originalPhoneNumber;
                    }

                    /**
                     * 設定 originalPhoneNumber 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOriginalPhoneNumber(String value) {
                        this.originalPhoneNumber = value;
                    }

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
