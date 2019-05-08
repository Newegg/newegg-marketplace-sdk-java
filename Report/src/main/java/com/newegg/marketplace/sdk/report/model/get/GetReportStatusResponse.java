//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.27 於 01:33:14 PM CST 
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
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResponseList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RequestType">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="ORDER_LIST_REPORT"/>
 *                                             &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/>
 *                                             &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/>
 *                                             &lt;enumeration value="DAILY_INVENTORY_ REPORT"/>
 *                                             &lt;enumeration value="RMA_LIST_REPORT"/>
 *                                             &lt;enumeration value="ITEM_LOOKUP"/>
 *                                             &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/>
 *                                             &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
 *                                             &lt;enumeration value="PREMIER_ITEM_REPORT"/>
 *                                             &lt;enumeration value="CAPROP65_REPORT"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RequestStatus">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="SUBMITTED"/>
 *                                             &lt;enumeration value="IN_PROGRESS"/>
 *                                             &lt;enumeration value="FINISHED"/>
 *                                             &lt;enumeration value="CANCELLED"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@JsonIgnoreProperties(ignoreUnknown = true) // this is for json not marked as ignorable
public class GetReportStatusResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "OperationType", defaultValue = "GetReportStatusResponse", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetReportStatusResponse";
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetReportStatusResponse.ResponseBody responseBody;
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
     *     {@link NeweggAPIResponse.ResponseBody }
     *     
     */
    public GetReportStatusResponse.ResponseBody getResponseBody() {
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
    public void setResponseBody(GetReportStatusResponse.ResponseBody value) {
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ResponseList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;all>
     *                             &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RequestType">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="ORDER_LIST_REPORT"/>
     *                                   &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/>
     *                                   &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/>
     *                                   &lt;enumeration value="DAILY_INVENTORY_ REPORT"/>
     *                                   &lt;enumeration value="RMA_LIST_REPORT"/>
     *                                   &lt;enumeration value="ITEM_LOOKUP"/>
     *                                   &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/>
     *                                   &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
     *                                   &lt;enumeration value="PREMIER_ITEM_REPORT"/>
     *                                   &lt;enumeration value="CAPROP65_REPORT"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="RequestStatus">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="SUBMITTED"/>
     *                                   &lt;enumeration value="IN_PROGRESS"/>
     *                                   &lt;enumeration value="FINISHED"/>
     *                                   &lt;enumeration value="CANCELLED"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
        "responseList"
    })
    public static class ResponseBody {

        @XmlElement(name = "ResponseList", required = true)
        @JsonProperty("ResponseList")
        @JsonUnwrapped // this is for json out of START_ARRAY token
        protected GetReportStatusResponse.ResponseBody.ResponseList responseList;

        /**
         * 取得 responseList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIResponse.ResponseBody.ResponseList }
         *     
         */
        public GetReportStatusResponse.ResponseBody.ResponseList getResponseList() {
            return responseList;
        }

        /**
         * 設定 responseList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIResponse.ResponseBody.ResponseList }
         *     
         */
        public void setResponseList(GetReportStatusResponse.ResponseBody.ResponseList value) {
            this.responseList = value;
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
         *         &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;all>
         *                   &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RequestType">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="ORDER_LIST_REPORT"/>
         *                         &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/>
         *                         &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/>
         *                         &lt;enumeration value="DAILY_INVENTORY_ REPORT"/>
         *                         &lt;enumeration value="RMA_LIST_REPORT"/>
         *                         &lt;enumeration value="ITEM_LOOKUP"/>
         *                         &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/>
         *                         &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
         *                         &lt;enumeration value="PREMIER_ITEM_REPORT"/>
         *                         &lt;enumeration value="CAPROP65_REPORT"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="RequestStatus">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="SUBMITTED"/>
         *                         &lt;enumeration value="IN_PROGRESS"/>
         *                         &lt;enumeration value="FINISHED"/>
         *                         &lt;enumeration value="CANCELLED"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
            "responseInfo"
        })
        public static class ResponseList {

            @XmlElement(name = "ResponseInfo")
            @JsonProperty("ResponseInfo")
            protected List<GetReportStatusResponse.ResponseBody.ResponseList.ResponseInfo> responseInfo;

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
             * {@link NeweggAPIResponse.ResponseBody.ResponseList.ResponseInfo }
             * 
             * 
             */
            public List<GetReportStatusResponse.ResponseBody.ResponseList.ResponseInfo> getResponseInfo() {
                if (responseInfo == null) {
                    responseInfo = new ArrayList<GetReportStatusResponse.ResponseBody.ResponseList.ResponseInfo>();
                }
                return this.responseInfo;
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
             *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RequestType">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="ORDER_LIST_REPORT"/>
             *               &lt;enumeration value="SETTLEMENT_SUMMARY_REPORT"/>
             *               &lt;enumeration value="SETTLEMENT_TRASACTION_REPORT"/>
             *               &lt;enumeration value="DAILY_INVENTORY_ REPORT"/>
             *               &lt;enumeration value="RMA_LIST_REPORT"/>
             *               &lt;enumeration value="ITEM_LOOKUP"/>
             *               &lt;enumeration value="INTERNATIONAL_INVENTORY_REPORT"/>
             *               &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
             *               &lt;enumeration value="PREMIER_ITEM_REPORT"/>
             *               &lt;enumeration value="CAPROP65_REPORT"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="RequestStatus">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="SUBMITTED"/>
             *               &lt;enumeration value="IN_PROGRESS"/>
             *               &lt;enumeration value="FINISHED"/>
             *               &lt;enumeration value="CANCELLED"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
                @XmlElement(name = "TotalCount", required = true)
                @JsonProperty("TotalCount")
                protected BigInteger totalCount;

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

            }

        }

    }
}
