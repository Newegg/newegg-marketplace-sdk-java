//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2020.02.05 於 04:25:36 PM CST 
//

package com.newegg.marketplace.sdk.shipping.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * <p>
 * anonymous complex type 的 Java 類別.
 * 
 * <p>
 * 下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ReprintShippingLabel"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Shipment"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlRootElement(name = "NeweggAPIRequest")
public class ShippingLabelReprintRequest {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty(value = "OperationType", required = true)
    protected String operationType = "ReprintShippingLabel";
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty(value = "SellerID", required = true)
    protected String sellerID;
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty(value = "RequestBody", required = true)
    protected ShippingLabelReprintRequest.RequestBody requestBody;

    /**
     * 取得 operationType 特性的值.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * 設定 operationType 特性的值.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * 取得 sellerID 特性的值.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * 設定 sellerID 特性的值.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * 取得 requestBody 特性的值.
     * 
     * @return possible object is {@link ShippingLabelReprintRequest.RequestBody }
     * 
     */
    public ShippingLabelReprintRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value allowed object is {@link ShippingLabelReprintRequest.RequestBody }
     * 
     */
    public void setRequestBody(ShippingLabelReprintRequest.RequestBody value) {
        this.requestBody = value;
    }

    /**
     * <p>
     * anonymous complex type 的 Java 類別.
     * 
     * <p>
     * 下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Shipment"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    @XmlType(name = "", propOrder = { "shipment" })
    public static class RequestBody {

        @XmlElement(name = "Shipment", required = true)
        @JsonProperty(value = "Shipment", required = true)
        protected ShippingLabelReprintRequest.RequestBody.Shipment shipment;

        /**
         * 取得 shipment 特性的值.
         * 
         * @return possible object is {@link ShippingLabelReprintRequest.RequestBody.Shipment }
         * 
         */
        public ShippingLabelReprintRequest.RequestBody.Shipment getShipment() {
            return shipment;
        }

        /**
         * 設定 shipment 特性的值.
         * 
         * @param value allowed object is {@link ShippingLabelReprintRequest.RequestBody.Shipment }
         * 
         */
        public void setShipment(ShippingLabelReprintRequest.RequestBody.Shipment value) {
            this.shipment = value;
        }

        /**
         * <p>
         * anonymous complex type 的 Java 類別.
         * 
         * <p>
         * 下列綱要片段會指定此類別中包含的預期內容.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "orderNumber" })
        public static class Shipment {

            @XmlElement(name = "OrderNumber")
            @JsonProperty(value = "OrderNumber", required = true)
            protected String orderNumber;

            /**
             * 取得 orderNumber 特性的值.
             * @return possible object is {@link String}
             */
            public String getOrderNumber() {
                return orderNumber;
            }

            /**
             * 設定 orderNumber 特性的值.
             * @param value allowed object is {@link String}
             */
            public void setOrderNumber(String value) {
                this.orderNumber = value;
            }

        }

    }
}