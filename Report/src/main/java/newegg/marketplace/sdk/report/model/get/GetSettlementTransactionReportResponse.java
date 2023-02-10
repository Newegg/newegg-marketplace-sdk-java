//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 03:29:08 PM CST 
//

package newegg.marketplace.sdk.report.model.get;


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
 *       &lt;sequence&gt;
 *         &lt;element name="IsSuccess"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="true"/&gt;
 *               &lt;enumeration value="false"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{}PageInfo"/&gt;
 *                   &lt;element name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SettlementTransactionInfoList"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SettlementTransactionInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="CommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                                       &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "isSuccess",
    "sellerID",
    "operationType",
    "responseBody",
    "memo"
})
@XmlRootElement(name = "NeweggAPIResponse")
@JsonRootName("NeweggAPIResponse")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetSettlementTransactionReportResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OperationType", defaultValue = "GetSettlementTransactionInfoResponse", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetSettlementTransactionInfoResponse";
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetSettlementTransactionReportResponse.ResponseBody responseBody;
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
     *     {@link GetSettlementTransactionReportResponse.ResponseBody }
     *     
     */
    public GetSettlementTransactionReportResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSettlementTransactionReportResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetSettlementTransactionReportResponse.ResponseBody value) {
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
     *         &lt;element name="SettlementTransactionInfoList"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SettlementTransactionInfo" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="CommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *                             &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "settlementTransactionInfoList"
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
        @XmlElement(name = "SettlementTransactionInfoList", required = true)
        @JsonProperty("SettlementTransactionInfoList")
        @JsonUnwrapped
        protected GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList settlementTransactionInfoList;

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
         * 取得 settlementTransactionInfoList 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList }
         *     
         */
        public GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList getSettlementTransactionInfoList() {
            return settlementTransactionInfoList;
        }

        /**
         * 設定 settlementTransactionInfoList 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList }
         *     
         */
        public void setSettlementTransactionInfoList(GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList value) {
            this.settlementTransactionInfoList = value;
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
         *         &lt;element name="SettlementTransactionInfo" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="CommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
         *                   &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "settlementTransactionInfo"
        })
        public static class SettlementTransactionInfoList {

            @XmlElement(name = "SettlementTransactionInfo")
            @JsonProperty("SettlementTransactionInfo")
            protected List<GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList.SettlementTransactionInfo> settlementTransactionInfo;

            /**
             * Gets the value of the settlementTransactionInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the settlementTransactionInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSettlementTransactionInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList.SettlementTransactionInfo }
             * 
             * @return
             * Objects of the following type(s) are allowed in the list
             * {@link GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList.SettlementTransactionInfo }
             * 
             */
            public List<GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList.SettlementTransactionInfo> getSettlementTransactionInfo() {
                if (settlementTransactionInfo == null) {
                    settlementTransactionInfo = new ArrayList<GetSettlementTransactionReportResponse.ResponseBody.SettlementTransactionInfoList.SettlementTransactionInfo>();
                }
                return this.settlementTransactionInfo;
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
             *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="InvoiceID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="SellerPartNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="NeweggItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="ItemCondition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="Shipping" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="CommissionFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
             *         &lt;element name="SettlementID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "transactionDate",
                "transactionType",
                "orderID",
                "invoiceID",
                "sellerPartNumber",
                "neweggItemNumber",
                "itemDescription",
                "itemCondition",
                "amount",
                "shipping",
                "commissionFee",
                "settlementID"
            })
            public static class SettlementTransactionInfo {

                @XmlElement(name = "TransactionDate", required = true)
                @JsonProperty("TransactionDate")
                protected String transactionDate;
                @XmlElement(name = "TransactionType", required = true)
                @JsonProperty("TransactionType")
                protected String transactionType;
                @XmlElement(name = "OrderID")
                @JsonProperty("OrderID")
                protected int orderID;
                @XmlElement(name = "InvoiceID")
                @JsonProperty("InvoiceID")
                protected int invoiceID;
                @XmlElement(name = "SellerPartNumber", required = true)
                @JsonProperty("SellerPartNumber")
                protected String sellerPartNumber;
                @XmlElement(name = "NeweggItemNumber", required = true)
                @JsonProperty("NeweggItemNumber")
                protected String neweggItemNumber;
                @XmlElement(name = "ItemDescription", required = true)
                @JsonProperty("ItemDescription")
                protected String itemDescription;
                @XmlElement(name = "ItemCondition", required = true)
                @JsonProperty("ItemCondition")
                protected String itemCondition;
                @XmlElement(name = "Amount", required = true)
                @JsonProperty("Amount")
                protected BigDecimal amount;
                @XmlElement(name = "Shipping", required = true)
                @JsonProperty("Shipping")
                protected BigDecimal shipping;
                @XmlElement(name = "CommissionFee", required = true)
                @JsonProperty("CommissionFee")
                protected BigDecimal commissionFee;
                @XmlElement(name = "SettlementID")
                @JsonProperty("SettlementID")
                protected String settlementID;

                /**
                 * 取得 transactionDate 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransactionDate() {
                    return transactionDate;
                }

                /**
                 * 設定 transactionDate 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransactionDate(String value) {
                    this.transactionDate = value;
                }

                /**
                 * 取得 transactionType 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransactionType() {
                    return transactionType;
                }

                /**
                 * 設定 transactionType 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransactionType(String value) {
                    this.transactionType = value;
                }

                /**
                 * 取得 orderID 特性的值.
                 * @return
                 * possible object is 
                 *     {@link int }
                 * 
                 */
                public int getOrderID() {
                    return orderID;
                }

                /**
                 * 設定 orderID 特性的值.
                 * @param value
                 *     allowed object is
                 *     {@link  }
                 * 
                 */
                public void setOrderID(int value) {
                    this.orderID = value;
                }

                /**
                 * 取得 invoiceID 特性的值.
                 * @return
                 * possible object is 
                 *     {@link int }
                 * 
                 */
                public int getInvoiceID() {
                    return invoiceID;
                }

                /**
                 * 設定 invoiceID 特性的值.
                 * @param value
                 *     allowed object is
                 *     {@link  }
                 * 
                 */
                public void setInvoiceID(int value) {
                    this.invoiceID = value;
                }

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
                 * 取得 itemDescription 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemDescription() {
                    return itemDescription;
                }

                /**
                 * 設定 itemDescription 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemDescription(String value) {
                    this.itemDescription = value;
                }

                /**
                 * 取得 itemCondition 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItemCondition() {
                    return itemCondition;
                }

                /**
                 * 設定 itemCondition 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItemCondition(String value) {
                    this.itemCondition = value;
                }

                /**
                 * 取得 amount 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAmount() {
                    return amount;
                }

                /**
                 * 設定 amount 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAmount(BigDecimal value) {
                    this.amount = value;
                }

                /**
                 * 取得 shipping 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getShipping() {
                    return shipping;
                }

                /**
                 * 設定 shipping 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setShipping(BigDecimal value) {
                    this.shipping = value;
                }

                /**
                 * 取得 commissionFee 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCommissionFee() {
                    return commissionFee;
                }

                /**
                 * 設定 commissionFee 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCommissionFee(BigDecimal value) {
                    this.commissionFee = value;
                }

                /**
                 * 取得 settlementID 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSettlementID() {
                    return settlementID;
                }

                /**
                 * 設定 settlementID 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSettlementID(String value) {
                    this.settlementID = value;
                }

            }

        }

    }
}
