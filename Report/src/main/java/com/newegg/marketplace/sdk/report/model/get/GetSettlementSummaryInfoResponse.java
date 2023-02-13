//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 02:50:13 PM CST 
//

package com.newegg.marketplace.sdk.report.model.get;

import java.math.BigDecimal;
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
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}PageInfo"/&gt;
 *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SettlementSummaryList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SettlementSummary" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="SettlementDateFrom" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="SettlementDateTo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TotalOrderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="Refunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="ChargeBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="MiscellaneousAdjustment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TotalRefunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggTransactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggRefundCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggMonthlyFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggStorageFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggRMABuyoutFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggPremierFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="NeweggShippingLabelFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="TotalNeweggFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="TotalSettlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
public class GetSettlementSummaryInfoResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OperationType", defaultValue = "GetSettlementSummaryInfoResponse", required = true)
    @JsonProperty("OperationType")
    protected Object operationType = "GetSettlementSummaryInfoResponse";
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetSettlementSummaryInfoResponse.ResponseBody responseBody;
    @XmlElement(name = "Memo")
    @JsonProperty("Memo")
    protected String memo;

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
     *     {@link Object }
     *     
     */
    public Object getOperationType() {
        return operationType;
    }

    /**
     * 設定 operationType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOperationType(Object value) {
        this.operationType = value;
    }

    /**
     * 取得 responseBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link GetSettlementSummaryInfoResponse.ResponseBody }
     *     
     */
    public GetSettlementSummaryInfoResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSettlementSummaryInfoResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetSettlementSummaryInfoResponse.ResponseBody value) {
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
     * <p>anonymous complex type 的 Java 類別.
     * 
     * <p>下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{}PageInfo"/&gt;
     *         &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SettlementSummaryList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SettlementSummary" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="SettlementDateFrom" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="SettlementDateTo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TotalOrderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="Refunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="ChargeBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="MiscellaneousAdjustment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TotalRefunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggTransactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggRefundCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggMonthlyFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggStorageFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggRMABuyoutFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggPremierFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="NeweggShippingLabelFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="TotalNeweggFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="TotalSettlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
        "pageInfo",
        "requestID",
        "requestDate",
        "settlementSummaryList"
    })
    public static class ResponseBody {

        @XmlElement(name = "PageInfo", required = true)
        @JsonProperty("PageInfo")
        protected PageInfo pageInfo;
        @XmlElement(name = "RequestID", required = true)
        @JsonProperty("RequestID")
        protected String requestID;
        @XmlElement(name = "RequestDate", required = true)
        @JsonProperty("RequestDate")
        protected String requestDate;
        @XmlElement(name = "SettlementSummaryList", required = true)
        @JsonProperty("SettlementSummaryList")
        @JsonUnwrapped
        protected GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList settlementSummaryList;

        /**
         * 取得 pageInfo 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link PageInfo }
         *     
         */
        public PageInfo getPageInfo() {
            return pageInfo;
        }

        /**
         * 設定 pageInfo 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link PageInfo }
         *     
         */
        public void setPageInfo(PageInfo value) {
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
         * 取得 settlementSummaryList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList }
         *     
         */
        public GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList getSettlementSummaryList() {
            return settlementSummaryList;
        }

        /**
         * 設定 settlementSummaryList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList }
         *     
         */
        public void setSettlementSummaryList(GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList value) {
            this.settlementSummaryList = value;
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
         *         &lt;element name="SettlementSummary" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="SettlementDateFrom" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="SettlementDateTo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TotalOrderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="Refunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="ChargeBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="MiscellaneousAdjustment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TotalRefunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggTransactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggRefundCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggMonthlyFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggStorageFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggRMABuyoutFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggPremierFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="NeweggShippingLabelFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="TotalNeweggFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="TotalSettlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
            "settlementSummary"
        })
        public static class SettlementSummaryList {

            @XmlElement(name = "SettlementSummary", required = true)
            @JsonProperty("SettlementSummary")
            protected List<GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList.SettlementSummary> settlementSummary;

            /**
             * Gets the value of the settlementSummary property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the settlementSummary property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSettlementSummary().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList.SettlementSummary }
             * 
             * @return
             * Objects of the following type(s) are allowed in the list
             * {@link GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList.SettlementSummary }
             * 
             */
            public List<GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList.SettlementSummary> getSettlementSummary() {
                if (settlementSummary == null) {
                    settlementSummary = new ArrayList<GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList.SettlementSummary>();
                }
                return this.settlementSummary;
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
             *         &lt;element name="SettlementDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="SettlementDateFrom" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="SettlementDateTo" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ItemPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Other" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TotalOrderAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="Refunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="ChargeBack" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="MiscellaneousAdjustment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TotalRefunds" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggTransactionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggRefundCommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggMonthlyFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggStorageFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggRMABuyoutFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggPremierFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="NeweggShippingLabelFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="TotalNeweggFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="TotalSettlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
            })
            public static class SettlementSummary {

                @XmlElement(name = "SettlementDate", required = true)
                @JsonProperty("SettlementDate")
                protected String settlementDate;
                @XmlElement(name = "SettlementDateFrom", required = true)
                @JsonProperty("SettlementDateFrom")
                protected Object settlementDateFrom;
                @XmlElement(name = "SettlementDateTo", required = true)
                @JsonProperty("SettlementDateTo")
                protected Object settlementDateTo;
                @XmlElement(name = "SettlementID")
                @JsonProperty("SettlementID")
                protected int settlementID;
                @XmlElement(name = "CheckNumber", required = true)
                @JsonProperty("CheckNumber")
                protected String checkNumber;
                @XmlElement(name = "ItemPrice", required = true)
                @JsonProperty("ItemPrice")
                protected BigDecimal itemPrice;
                @XmlElement(name = "Shipping", required = true)
                @JsonProperty("Shipping")
                protected String shipping;
                @XmlElement(name = "GSTTotal")
                @JsonProperty("GSTTotal")
                protected BigDecimal gstTotal;
                @XmlElement(name = "HSTTotal")
                @JsonProperty("HSTTotal")
                protected BigDecimal hstTotal;
                @XmlElement(name = "TaxDuty")
                @JsonProperty("TaxDuty")
                protected BigDecimal taxDuty;
                @XmlElement(name = "GSTAndHST")
                @JsonProperty("GSTAndHST")
                protected BigDecimal gstAndhst;
                @XmlElement(name = "PSTTotal")
                @JsonProperty("PSTTotal")
                protected BigDecimal pstTotal;
                @XmlElement(name = "PSTAndQST")
                @JsonProperty("PSTAndQST")
                protected BigDecimal pstAndqst;
                @XmlElement(name = "EHFTotal")
                @JsonProperty("EHFTotal")
                protected BigDecimal eHfTotal;
                @XmlElement(name = "RecyclingFeeTotal")
                @JsonProperty("RecyclingFeeTotal")
                protected BigDecimal recyclingFeeTotal;
                @XmlElement(name = "CourtesyRefund")
                @JsonProperty("CourtesyRefund")
                protected BigDecimal courtesyRefund;                
                @XmlElement(name = "Other", required = true)
                @JsonProperty("Other")
                protected String other;
                @XmlElement(name = "TotalOrderAmount", required = true)
                @JsonProperty("TotalOrderAmount")
                protected BigDecimal totalOrderAmount;
                @XmlElement(name = "Refunds", required = true)
                @JsonProperty("Refunds")
                protected BigDecimal refunds;
                @XmlElement(name = "ChargeBack", required = true)
                @JsonProperty("ChargeBack")
                protected String chargeBack;
                @XmlElement(name = "MiscellaneousAdjustment", required = true)
                @JsonProperty("MiscellaneousAdjustment")
                protected String miscellaneousAdjustment;
                @XmlElement(name = "TotalRefunds", required = true)
                @JsonProperty("TotalRefunds")
                protected BigDecimal totalRefunds;
                @XmlElement(name = "NeweggCommissionFee", required = true)
                @JsonProperty("NeweggCommissionFee")
                protected BigDecimal neweggCommissionFee;
                @XmlElement(name = "NeweggTransactionFee", required = true)
                @JsonProperty("NeweggTransactionFee")
                protected BigDecimal neweggTransactionFee;
                @XmlElement(name = "NeweggRefundCommissionFee", required = true)
                @JsonProperty("NeweggRefundCommissionFee")
                protected BigDecimal neweggRefundCommissionFee;
                @XmlElement(name = "NeweggMonthlyFee", required = true)
                @JsonProperty("NeweggMonthlyFee")
                protected BigDecimal neweggMonthlyFee;
                @XmlElement(name = "NeweggStorageFee", required = true)
                @JsonProperty("NeweggStorageFee")
                protected BigDecimal neweggStorageFee;
                @XmlElement(name = "NeweggRMABuyoutFee", required = true)
                @JsonProperty("NeweggRMABuyoutFee")
                protected BigDecimal neweggRMABuyoutFee;
                @XmlElement(name = "NeweggServiceFeeTax")
                @JsonProperty("NeweggServiceFeeTax")
                protected BigDecimal neweggServiceFeeTax;
                @XmlElement(name = "NeweggPremierFee", required = true)
                @JsonProperty("NeweggPremierFee")
                protected BigDecimal neweggPremierFee;
                @XmlElement(name = "NeweggShippingLabelFee", required = true)
                @JsonProperty("NeweggShippingLabelFee")
                protected BigDecimal neweggShippingLabelFee;
                @XmlElement(name = "CreditCardPayment")
                @JsonProperty("CreditCardPayment")
                protected BigDecimal creditCardPayment;
                @XmlElement(name = "FulfillmentByNeweggFee")
                @JsonProperty("FulfillmentByNeweggFee")
                protected BigDecimal fulfillmentByNeweggFee;
                @XmlElement(name = "MultiChannelFee")
                @JsonProperty("MultiChannelFee")
                protected BigDecimal multiChannelFee;
                @XmlElement(name = "AdjustmentFee")
                @JsonProperty("AdjustmentFee")
                protected BigDecimal adjustmentFee;
                @XmlElement(name = "MerchandisingFee")
                @JsonProperty("MerchandisingFee")
                protected BigDecimal merchandisingFee;
                @XmlElement(name = "TotalNeweggFee", required = true)
                @JsonProperty("TotalNeweggFee")
                protected BigDecimal totalNeweggFee;
                @XmlElement(name = "TotalSettlement", required = true)
                @JsonProperty("TotalSettlement")
                protected BigDecimal totalSettlement;
                @XmlElement(name = "ReservedBalance")
                @JsonProperty("ReservedBalance")
                protected BigDecimal reservedBalance;
                @XmlElement(name = "PreviousReservedBalance")
                @JsonProperty("PreviousReservedBalance")
                protected BigDecimal previousReservedBalance;
                /**
                 * 取得 settlementDate 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSettlementDate() {
                    return settlementDate;
                }

                /**
                 * 設定 settlementDate 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSettlementDate(String value) {
                    this.settlementDate = value;
                }

                /**
                 * 取得 settlementDateFrom 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSettlementDateFrom() {
                    return settlementDateFrom;
                }

                /**
                 * 設定 settlementDateFrom 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSettlementDateFrom(Object value) {
                    this.settlementDateFrom = value;
                }

                /**
                 * 取得 settlementDateTo 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSettlementDateTo() {
                    return settlementDateTo;
                }

                /**
                 * 設定 settlementDateTo 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSettlementDateTo(Object value) {
                    this.settlementDateTo = value;
                }

                /**
                 * 取得 settlementID 特性的值.
                 * @return
                 * possible object is 
                 *     {@link int }
                 * 
                 */
                public int getSettlementID() {
                    return settlementID;
                }

                /**
                 * 設定 settlementID 特性的值.
                 * @param value
                 *     allowed object is
                 *     {@link  }
                 * 
                 */
                public void setSettlementID(int value) {
                    this.settlementID = value;
                }

                /**
                 * 取得 checkNumber 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCheckNumber() {
                    return checkNumber;
                }

                /**
                 * 設定 checkNumber 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCheckNumber(String value) {
                    this.checkNumber = value;
                }

                /**
                 * 取得 itemPrice 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getItemPrice() {
                    return itemPrice;
                }

                /**
                 * 設定 itemPrice 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setItemPrice(BigDecimal value) {
                    this.itemPrice = value;
                }

                /**
                 * 取得 shipping 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getShipping() {
                    return shipping;
                }

                /**
                 * 設定 shipping 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setShipping(String value) {
                    this.shipping = value;
                }

                /**
                 * 取得 other 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOther() {
                    return other;
                }

                /**
                 * 設定 other 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOther(String value) {
                    this.other = value;
                }

                /**
                 * 取得 totalOrderAmount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalOrderAmount() {
                    return totalOrderAmount;
                }

                /**
                 * 設定 totalOrderAmount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalOrderAmount(BigDecimal value) {
                    this.totalOrderAmount = value;
                }

                /**
                 * 取得 refunds 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getRefunds() {
                    return refunds;
                }

                /**
                 * 設定 refunds 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setRefunds(BigDecimal value) {
                    this.refunds = value;
                }

                /**
                 * 取得 chargeBack 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChargeBack() {
                    return chargeBack;
                }

                /**
                 * 設定 chargeBack 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChargeBack(String value) {
                    this.chargeBack = value;
                }

                /**
                 * 取得 miscellaneousAdjustment 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMiscellaneousAdjustment() {
                    return miscellaneousAdjustment;
                }

                /**
                 * 設定 miscellaneousAdjustment 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMiscellaneousAdjustment(String value) {
                    this.miscellaneousAdjustment = value;
                }

                /**
                 * 取得 totalRefunds 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalRefunds() {
                    return totalRefunds;
                }

                /**
                 * 設定 totalRefunds 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalRefunds(BigDecimal value) {
                    this.totalRefunds = value;
                }

                /**
                 * 取得 neweggCommissionFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggCommissionFee() {
                    return neweggCommissionFee;
                }

                /**
                 * 設定 neweggCommissionFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggCommissionFee(BigDecimal value) {
                    this.neweggCommissionFee = value;
                }

                /**
                 * 取得 neweggTransactionFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggTransactionFee() {
                    return neweggTransactionFee;
                }

                /**
                 * 設定 neweggTransactionFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggTransactionFee(BigDecimal value) {
                    this.neweggTransactionFee = value;
                }

                /**
                 * 取得 neweggRefundCommissionFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggRefundCommissionFee() {
                    return neweggRefundCommissionFee;
                }

                /**
                 * 設定 neweggRefundCommissionFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggRefundCommissionFee(BigDecimal value) {
                    this.neweggRefundCommissionFee = value;
                }

                /**
                 * 取得 neweggMonthlyFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggMonthlyFee() {
                    return neweggMonthlyFee;
                }

                /**
                 * 設定 neweggMonthlyFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggMonthlyFee(BigDecimal value) {
                    this.neweggMonthlyFee = value;
                }

                /**
                 * 取得 neweggStorageFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggStorageFee() {
                    return neweggStorageFee;
                }

                /**
                 * 設定 neweggStorageFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggStorageFee(BigDecimal value) {
                    this.neweggStorageFee = value;
                }

                /**
                 * 取得 neweggRMABuyoutFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggRMABuyoutFee() {
                    return neweggRMABuyoutFee;
                }

                /**
                 * 設定 neweggRMABuyoutFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggRMABuyoutFee(BigDecimal value) {
                    this.neweggRMABuyoutFee = value;
                }

                /**
                 * 取得 neweggPremierFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggPremierFee() {
                    return neweggPremierFee;
                }

                /**
                 * 設定 neweggPremierFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggPremierFee(BigDecimal value) {
                    this.neweggPremierFee = value;
                }

                /**
                 * 取得 neweggShippingLabelFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getNeweggShippingLabelFee() {
                    return neweggShippingLabelFee;
                }

                /**
                 * 設定 neweggShippingLabelFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setNeweggShippingLabelFee(BigDecimal value) {
                    this.neweggShippingLabelFee = value;
                }

                /**
                 * 取得 totalNeweggFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalNeweggFee() {
                    return totalNeweggFee;
                }

                /**
                 * 設定 totalNeweggFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalNeweggFee(BigDecimal value) {
                    this.totalNeweggFee = value;
                }

                /**
                 * 取得 totalSettlement 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalSettlement() {
                    return totalSettlement;
                }

                /**
                 * 設定 totalSettlement 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalSettlement(BigDecimal value) {
                    this.totalSettlement = value;
                }

				public BigDecimal getGstTotal() {
					return gstTotal;
				}

				public void setGstTotal(BigDecimal gstTotal) {
					this.gstTotal = gstTotal;
				}

				public BigDecimal getHstTotal() {
					return hstTotal;
				}

				public void setHstTotal(BigDecimal hstTotal) {
					this.hstTotal = hstTotal;
				}

				public BigDecimal getTaxDuty() {
					return taxDuty;
				}

				public void setTaxDuty(BigDecimal taxDuty) {
					this.taxDuty = taxDuty;
				}

				public BigDecimal getGstAndhst() {
					return gstAndhst;
				}

				public void setGstAndhst(BigDecimal gstAndhst) {
					this.gstAndhst = gstAndhst;
				}

				public BigDecimal getPstTotal() {
					return pstTotal;
				}

				public void setPstTotal(BigDecimal pstTotal) {
					this.pstTotal = pstTotal;
				}

				public BigDecimal getPstAndqst() {
					return pstAndqst;
				}

				public void setPstAndqst(BigDecimal pstAndqst) {
					this.pstAndqst = pstAndqst;
				}

				public BigDecimal geteHfTotal() {
					return eHfTotal;
				}

				public void seteHfTotal(BigDecimal eHfTotal) {
					this.eHfTotal = eHfTotal;
				}

				public BigDecimal getRecyclingFeeTotal() {
					return recyclingFeeTotal;
				}

				public void setRecyclingFeeTotal(BigDecimal recyclingFeeTotal) {
					this.recyclingFeeTotal = recyclingFeeTotal;
				}

				public BigDecimal getCourtesyRefund() {
					return courtesyRefund;
				}

				public void setCourtesyRefund(BigDecimal courtesyRefund) {
					this.courtesyRefund = courtesyRefund;
				}

				public BigDecimal getNeweggServiceFeeTax() {
					return neweggServiceFeeTax;
				}

				public void setNeweggServiceFeeTax(BigDecimal neweggServiceFeeTax) {
					this.neweggServiceFeeTax = neweggServiceFeeTax;
				}

				public BigDecimal getCreditCardPayment() {
					return creditCardPayment;
				}

				public void setCreditCardPayment(BigDecimal creditCardPayment) {
					this.creditCardPayment = creditCardPayment;
				}

				public BigDecimal getFulfillmentByNeweggFee() {
					return fulfillmentByNeweggFee;
				}

				public void setFulfillmentByNeweggFee(BigDecimal fulfillmentByNeweggFee) {
					this.fulfillmentByNeweggFee = fulfillmentByNeweggFee;
				}

				public BigDecimal getMultiChannelFee() {
					return multiChannelFee;
				}

				public void setMultiChannelFee(BigDecimal multiChannelFee) {
					this.multiChannelFee = multiChannelFee;
				}

				public BigDecimal getAdjustmentFee() {
					return adjustmentFee;
				}

				public void setAdjustmentFee(BigDecimal adjustmentFee) {
					this.adjustmentFee = adjustmentFee;
				}

				public BigDecimal getMerchandisingFee() {
					return merchandisingFee;
				}

				public void setMerchandisingFee(BigDecimal merchandisingFee) {
					this.merchandisingFee = merchandisingFee;
				}

				public BigDecimal getReservedBalance() {
					return reservedBalance;
				}

				public void setReservedBalance(BigDecimal reservedBalance) {
					this.reservedBalance = reservedBalance;
				}

				public BigDecimal getPreviousReservedBalance() {
					return previousReservedBalance;
				}

				public void setPreviousReservedBalance(BigDecimal previousReservedBalance) {
					this.previousReservedBalance = previousReservedBalance;
				}

            }


			public void setSettlementSummary(
					List<GetSettlementSummaryInfoResponse.ResponseBody.SettlementSummaryList.SettlementSummary> settlementSummary) {
				this.settlementSummary = settlementSummary;
			}

        }

    }
}
