//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 01:41:35 PM CST 
//
package com.newegg.marketplace.sdk.report.model.submit;


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
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OrderListReportResponse"/&gt;
 *               &lt;enumeration value="SettlementSummaryReportResponse"/&gt;
 *               &lt;enumeration value="SettlementTransactionReportResponse"/&gt;
 *               &lt;enumeration value="DailyInventoryReportResponse"/&gt;
 *               &lt;enumeration value="RMAListReportResponse"/&gt;
 *               &lt;enumeration value="ItemLookupReportResponse"/&gt;
 *               &lt;enumeration value="InternationalInventoryReportResponse"/&gt;
 *               &lt;enumeration value="InternationalPriceReportResponse"/&gt;
 *               &lt;enumeration value="PremierItemReportResponse"/&gt;
 *               &lt;enumeration value="CAProp65ReportResponse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ResponseList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RequestType"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
 *                                             &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
 *                                             &lt;enumeration value="SETTLEMENT_TRANSACTION_REPORT"/&gt;
 *                                             &lt;enumeration value="DAILY_INVENTORY_REPORT"/&gt;
 *                                             &lt;enumeration value="RMA_LIST_REPORT"/&gt;
 *                                             &lt;enumeration value="ITEM_LOOKUP"/&gt;
 *                                             &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
 *                                             &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
 *                                             &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
 *                                             &lt;enumeration value="CAPROP65_REPORT"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="RequestStatus"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="SUBMITTED"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
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
public class DailyPriceReportResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "OperationType", defaultValue = "InternationalPriceReportResponse", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "InternationalPriceReportResponse";
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected DailyPriceReportResponse.ResponseBody responseBody;
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
     * 取得 responseBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DailyPriceReportResponse.ResponseBody }
     *     
     */
    public DailyPriceReportResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyPriceReportResponse.ResponseBody }
     *     
     */
    public void setResponseBody(DailyPriceReportResponse.ResponseBody value) {
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
     *         &lt;element name="ResponseList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RequestType"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
     *                                   &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
     *                                   &lt;enumeration value="SETTLEMENT_TRANSACTION_REPORT"/&gt;
     *                                   &lt;enumeration value="DAILY_INVENTORY_REPORT"/&gt;
     *                                   &lt;enumeration value="RMA_LIST_REPORT"/&gt;
     *                                   &lt;enumeration value="ITEM_LOOKUP"/&gt;
     *                                   &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
     *                                   &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
     *                                   &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
     *                                   &lt;enumeration value="CAPROP65_REPORT"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="RequestStatus"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;enumeration value="SUBMITTED"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
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
        "responseList"
    })
    public static class ResponseBody {

        @XmlElement(name = "ResponseList", required = true)
        @JsonProperty("ResponseList")
        @JsonUnwrapped
        protected DailyPriceReportResponse.ResponseBody.ResponseList responseList;

        /**
         * 取得 responseList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link DailyPriceReportResponse.ResponseBody.ResponseList }
         *     
         */
        public DailyPriceReportResponse.ResponseBody.ResponseList getResponseList() {
            return responseList;
        }

        /**
         * 設定 responseList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link DailyPriceReportResponse.ResponseBody.ResponseList }
         *     
         */
        public void setResponseList(DailyPriceReportResponse.ResponseBody.ResponseList value) {
            this.responseList = value;
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
         *         &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RequestType"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
         *                         &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
         *                         &lt;enumeration value="SETTLEMENT_TRANSACTION_REPORT"/&gt;
         *                         &lt;enumeration value="DAILY_INVENTORY_REPORT"/&gt;
         *                         &lt;enumeration value="RMA_LIST_REPORT"/&gt;
         *                         &lt;enumeration value="ITEM_LOOKUP"/&gt;
         *                         &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
         *                         &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
         *                         &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
         *                         &lt;enumeration value="CAPROP65_REPORT"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="RequestStatus"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;enumeration value="SUBMITTED"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
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
            "responseInfo"
        })
        public static class ResponseList {

            @XmlElement(name = "ResponseInfo")
            @JsonProperty("ResponseInfo")
            protected List<DailyPriceReportResponse.ResponseBody.ResponseList.ResponseInfo> responseInfo;

            /**
             * Gets the value of the responseInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the responseInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getResponseInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DailyPriceReportResponse.ResponseBody.ResponseList.ResponseInfo }
             * 
             * @return
             * Objects of the following type(s) are allowed in the list
             * {@link DailyPriceReportResponse.ResponseBody.ResponseList.ResponseInfo }
             * 
             */
            public List<DailyPriceReportResponse.ResponseBody.ResponseList.ResponseInfo> getResponseInfo() {
                if (responseInfo == null) {
                    responseInfo = new ArrayList<DailyPriceReportResponse.ResponseBody.ResponseList.ResponseInfo>();
                }
                return this.responseInfo;
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
             *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RequestType"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
             *               &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/&gt;
             *               &lt;enumeration value="SETTLEMENT_TRANSACTION_REPORT"/&gt;
             *               &lt;enumeration value="DAILY_INVENTORY_REPORT"/&gt;
             *               &lt;enumeration value="RMA_LIST_REPORT"/&gt;
             *               &lt;enumeration value="ITEM_LOOKUP"/&gt;
             *               &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/&gt;
             *               &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
             *               &lt;enumeration value="PREMIER_ITEM_REPORT"/&gt;
             *               &lt;enumeration value="CAPROP65_REPORT"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="RequestStatus"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;enumeration value="SUBMITTED"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
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
            public static class ResponseInfo {

                @XmlElement(name = "RequestId", required = true)
                @JsonProperty("RequestId")
                protected String requestId;
                @XmlElement(name = "RequestType", required = true)
                @JsonProperty("RequestType")
                protected String requestType;
                @XmlElement(name = "RequestDate", required = true)
                @JsonProperty("RequestDate")
                protected String requestDate;
                @XmlElement(name = "RequestStatus", required = true)
                @JsonProperty("RequestStatus")
                protected String requestStatus;

                /**
                 * 取得 requestId 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestId() {
                    return requestId;
                }

                /**
                 * 設定 requestId 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestId(String value) {
                    this.requestId = value;
                }

                /**
                 * 取得 requestType 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestType() {
                    return requestType;
                }

                /**
                 * 設定 requestType 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestType(String value) {
                    this.requestType = value;
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
                 * 取得 requestStatus 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestStatus() {
                    return requestStatus;
                }

                /**
                 * 設定 requestStatus 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestStatus(String value) {
                    this.requestStatus = value;
                }

            }

        }

    }
}
