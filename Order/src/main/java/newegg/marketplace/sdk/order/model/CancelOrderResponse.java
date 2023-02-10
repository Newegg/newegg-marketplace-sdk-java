//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.21 於 04:39:09 PM CST 
//



package newegg.marketplace.sdk.order.model;
import java.math.BigInteger;
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
 *         &lt;element name="Result"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="OrderStatus"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Void"/&gt;
 *                         &lt;enumeration value="Processing"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
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
@XmlRootElement(name = "UpdateOrderStatusInfo")
@JsonRootName("UpdateOrderStatusInfo")
public class CancelOrderResponse {

    @XmlElement(name = "IsSuccess", required = true)
    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @XmlElement(name = "Result", required = true)
    @JsonProperty("Result")
    protected CancelOrderResponse.Result result;

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
     * 取得 result 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderResponse.Result }
     *     
     */
    public CancelOrderResponse.Result getResult() {
        return result;
    }

    /**
     * 設定 result 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderResponse.Result }
     *     
     */
    public void setResult(CancelOrderResponse.Result value) {
        this.result = value;
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
     *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="OrderStatus"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Void"/&gt;
     *               &lt;enumeration value="Processing"/&gt;
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

    }

}
