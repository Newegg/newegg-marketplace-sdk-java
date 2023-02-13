//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.22 於 04:51:09 PM CST 
//


package com.newegg.marketplace.sdk.order.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;


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
 *         &lt;element name="ResponseDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="Result"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Success"/&gt;
 *                         &lt;enumeration value="Failed"/&gt;
 *                         &lt;enumeration value="Processing"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
public class GetSBNOrderCancellationRequestResultResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OperationType", defaultValue = "GetSBNOrderCancellationResultResponse", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetSBNOrderCancellationResultResponse";
    @XmlElement(name = "ResponseDate", required = true)
    @JsonProperty("ResponseDate")
    protected String responseDate;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty("ResponseBody")
    protected GetSBNOrderCancellationRequestResultResponse.ResponseBody responseBody;

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
     *     {@link GetSBNOrderCancellationRequestResultResponse.ResponseBody }
     *     
     */
    public GetSBNOrderCancellationRequestResultResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSBNOrderCancellationRequestResultResponse.ResponseBody }
     *     
     */
    public void setResponseBody(GetSBNOrderCancellationRequestResultResponse.ResponseBody value) {
        this.responseBody = value;
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
     *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="Result"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Success"/&gt;
     *               &lt;enumeration value="Failed"/&gt;
     *               &lt;enumeration value="Processing"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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

        @XmlElement(name = "RequestDate", required = true)
        @JsonProperty("RequestDate")
        protected String requestDate;
        @XmlElement(name = "OrderNumber")
        @JsonProperty("OrderNumber")
        protected int orderNumber;
        @XmlElement(name = "Result", required = true)
        @JsonProperty("Result")
        protected String result;
        @XmlElement(name = "ErrorMessage", required = true)
        @JsonProperty("ErrorMessage")
        protected String errorMessage;

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
         * 取得 orderNumber 特性的值.
         * @return
         * possible object is 
         *     {@link int }
         * 
         */
        public int getOrderNumber() {
            return orderNumber;
        }

        /**
         * 設定 orderNumber 特性的值.
         * @param value
         *     allowed object is
         *     {@link  }
         * 
         */
        public void setOrderNumber(int value) {
            this.orderNumber = value;
        }

        /**
         * 取得 result 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResult() {
            return result;
        }

        /**
         * 設定 result 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResult(String value) {
            this.result = value;
        }

        /**
         * 取得 errorMessage 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * 設定 errorMessage 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorMessage(String value) {
            this.errorMessage = value;
        }

    }
}
