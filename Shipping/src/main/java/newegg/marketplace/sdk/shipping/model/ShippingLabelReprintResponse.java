//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2020.02.05 於 04:25:53 PM CST 
//

package newegg.marketplace.sdk.shipping.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
 *               &lt;enumeration value="ReprintShippingLabelResponse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="Shipment"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PackageList"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Package" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;all&gt;
 *                                                 &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="SignatureOptions" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;maxLength value="15"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="LabelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="PackageListUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="ItemList"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Item" maxOccurs="unbounded"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;all&gt;
 *                                                                     &lt;element name="SellerPartNumber"&gt;
 *                                                                       &lt;simpleType&gt;
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                                           &lt;maxLength value="40"/&gt;
 *                                                                           &lt;minLength value="1"/&gt;
 *                                                                         &lt;/restriction&gt;
 *                                                                       &lt;/simpleType&gt;
 *                                                                     &lt;/element&gt;
 *                                                                     &lt;element name="Quantity"&gt;
 *                                                                       &lt;simpleType&gt;
 *                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                                                           &lt;minExclusive value="0"/&gt;
 *                                                                         &lt;/restriction&gt;
 *                                                                       &lt;/simpleType&gt;
 *                                                                     &lt;/element&gt;
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
public class ShippingLabelReprintResponse {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty(value = "OperationType")
    protected String operationType;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty(value = "SellerID")
    protected String sellerID;
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty(value = "ResponseBody")
    protected ShippingLabelReprintResponse.ResponseBody responseBody;

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
     * 取得 responseBody 特性的值.
     * 
     * @return possible object is {@link ShippingLabelReprintResponse.ResponseBody }
     * 
     */
    public ShippingLabelReprintResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value allowed object is
     *              {@link ShippingLabelReprintResponse.ResponseBody }
     * 
     */
    public void setResponseBody(ShippingLabelReprintResponse.ResponseBody value) {
        this.responseBody = value;
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
     *       &lt;all&gt;
     *         &lt;element name="Shipment"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PackageList"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Package" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;all&gt;
     *                                       &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="SignatureOptions" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;maxLength value="15"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="LabelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="PackageListUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="ItemList"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Item" maxOccurs="unbounded"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;all&gt;
     *                                                           &lt;element name="SellerPartNumber"&gt;
     *                                                             &lt;simpleType&gt;
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                                                 &lt;maxLength value="40"/&gt;
     *                                                                 &lt;minLength value="1"/&gt;
     *                                                               &lt;/restriction&gt;
     *                                                             &lt;/simpleType&gt;
     *                                                           &lt;/element&gt;
     *                                                           &lt;element name="Quantity"&gt;
     *                                                             &lt;simpleType&gt;
     *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                                                                 &lt;minExclusive value="0"/&gt;
     *                                                               &lt;/restriction&gt;
     *                                                             &lt;/simpleType&gt;
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

        @XmlElement(name = "Shipment", required = true)
        @JsonProperty(value = "Shipment")
        protected ShippingLabelReprintResponse.ResponseBody.Shipment shipment;

        /**
         * 取得 shipment 特性的值.
         * 
         * @return possible object is
         *         {@link ShippingLabelReprintResponse.ResponseBody.Shipment }
         * 
         */
        public ShippingLabelReprintResponse.ResponseBody.Shipment getShipment() {
            return shipment;
        }

        /**
         * 設定 shipment 特性的值.
         * 
         * @param value allowed object is
         *              {@link ShippingLabelReprintResponse.ResponseBody.Shipment }
         * 
         */
        public void setShipment(ShippingLabelReprintResponse.ResponseBody.Shipment value) {
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
         *       &lt;all&gt;
         *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PackageList"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Package" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;all&gt;
         *                             &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="SignatureOptions" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;maxLength value="15"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="LabelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="PackageListUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="ItemList"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Item" maxOccurs="unbounded"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;all&gt;
         *                                                 &lt;element name="SellerPartNumber"&gt;
         *                                                   &lt;simpleType&gt;
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                                       &lt;maxLength value="40"/&gt;
         *                                                       &lt;minLength value="1"/&gt;
         *                                                     &lt;/restriction&gt;
         *                                                   &lt;/simpleType&gt;
         *                                                 &lt;/element&gt;
         *                                                 &lt;element name="Quantity"&gt;
         *                                                   &lt;simpleType&gt;
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *                                                       &lt;minExclusive value="0"/&gt;
         *                                                     &lt;/restriction&gt;
         *                                                   &lt;/simpleType&gt;
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
        @JsonPropertyOrder({"OrderNumber", "OrderStatus", "PackageList"})
        public static class Shipment {

            @XmlElement(name = "OrderNumber")
            @JsonProperty(value = "OrderNumber")
            protected Integer orderNumber;
            @XmlElement(name = "OrderStatus", required = true)
            @JsonProperty(value = "OrderStatus")
            protected String orderStatus;
            /*@XmlElement(name = "ErrorMessage")
            @JsonProperty(value = "ErrorMessage")
            protected String errorMessage;*/
            @XmlElement(name = "PackageList", required = true)
            //@JsonProperty("PackageList")
            @JsonUnwrapped
            protected ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList packageList;

            /**
             * 取得 orderNumber 特性的值.
             *  @return possible object is {@link Integer}
             */
            public Integer getOrderNumber() {
                return orderNumber;
            }

            /**
             * 設定 orderNumber 特性的值.
             *  @param value allowed object is {@link Integer}
             */
            public void setOrderNumber(Integer value) {
                this.orderNumber = value;
            }

            /**
             * 取得 orderStatus 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getOrderStatus() {
                return orderStatus;
            }

            /**
             * 設定 orderStatus 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setOrderStatus(String value) {
                this.orderStatus = value;
            }

            /**
             * 取得 errorMessage 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            /*public String getErrorMessage() {
                return errorMessage;
            }*/

            /**
             * 設定 errorMessage 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            /*public void setErrorMessage(String value) {
                this.errorMessage = value;
            }*/

            /**
             * 取得 packageList 特性的值.
             * 
             * @return possible object is
             *         {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList }
             * 
             */
            public ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList getPackageList() {
                return packageList;
            }

            /**
             * 設定 packageList 特性的值.
             * 
             * @param value allowed object is
             *              {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList }
             * 
             */
            public void setPackageList(ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList value) {
                this.packageList = value;
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
             *         &lt;element name="Package" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;all&gt;
             *                   &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="SignatureOptions" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;maxLength value="15"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="LabelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="PackageListUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="ItemList"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Item" maxOccurs="unbounded"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;all&gt;
             *                                       &lt;element name="SellerPartNumber"&gt;
             *                                         &lt;simpleType&gt;
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                                             &lt;maxLength value="40"/&gt;
             *                                             &lt;minLength value="1"/&gt;
             *                                           &lt;/restriction&gt;
             *                                         &lt;/simpleType&gt;
             *                                       &lt;/element&gt;
             *                                       &lt;element name="Quantity"&gt;
             *                                         &lt;simpleType&gt;
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
             *                                             &lt;minExclusive value="0"/&gt;
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
            @XmlType(name = "", propOrder = {  })
            public static class PackageList {

                @XmlElement(name = "Package", required = true)
                @JsonProperty("PackageList")
                protected List<ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package> _package;

                /**
                 * Gets the value of the package property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list, not a snapshot.
                 * Therefore any modification you make to the returned list will be present
                 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
                 * for the package property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * 
                 * <pre>
                 * getPackage().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package }
                 * @return possible object is {@link List}
                 * 
                 */
                @JsonIgnore
                public List<ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package>();
                    }
                    return this._package;
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
                 *       &lt;all&gt;
                 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="SignatureOptions" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;maxLength value="15"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="LabelUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="PackageListUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="ItemList"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Item" maxOccurs="unbounded"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;all&gt;
                 *                             &lt;element name="SellerPartNumber"&gt;
                 *                               &lt;simpleType&gt;
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *                                   &lt;maxLength value="40"/&gt;
                 *                                   &lt;minLength value="1"/&gt;
                 *                                 &lt;/restriction&gt;
                 *                               &lt;/simpleType&gt;
                 *                             &lt;/element&gt;
                 *                             &lt;element name="Quantity"&gt;
                 *                               &lt;simpleType&gt;
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
                 *                                   &lt;minExclusive value="0"/&gt;
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
                 *       &lt;/all&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = { })
                @JsonPropertyOrder({"TrackingNumber", "SignatureOptions", "LabelUrl",
                    "PackingListUrl", "ItemList"})
                public static class Package {

                    @XmlElement(name = "TrackingNumber", required = true)
                    @JsonProperty(value = "TrackingNumber")
                    protected String trackingNumber;
                    @XmlElement(name = "SignatureOptions")
                    @JsonProperty(value = "SignatureOptions")
                    protected String signatureOptions;
                    @XmlElement(name = "LabelUrl", required = true)
                    @JsonProperty(value = "LabelUrl")
                    protected String labelUrl;
                    @XmlElement(name = "PackingListUrl", required = true)
                    @JsonProperty(value = "PackingListUrl")
                    protected String packageListUrl;
                    @XmlElement(name = "ItemList", required = true)
                    //@JsonProperty(value = "ItemList")
                    @JsonUnwrapped
                    protected ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList itemList;

                    /**
                     * 取得 trackingNumber 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getTrackingNumber() {
                        return trackingNumber;
                    }

                    /**
                     * 設定 trackingNumber 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setTrackingNumber(String value) {
                        this.trackingNumber = value;
                    }

                    /**
                     * 取得 signatureOptions 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getSignatureOptions() {
                        return signatureOptions;
                    }

                    /**
                     * 設定 signatureOptions 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setSignatureOptions(String value) {
                        this.signatureOptions = value;
                    }

                    /**
                     * 取得 labelUrl 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getLabelUrl() {
                        return labelUrl;
                    }

                    /**
                     * 設定 labelUrl 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setLabelUrl(String value) {
                        this.labelUrl = value;
                    }

                    /**
                     * 取得 packageListUrl 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getPackageListUrl() {
                        return packageListUrl;
                    }

                    /**
                     * 設定 packageListUrl 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setPackageListUrl(String value) {
                        this.packageListUrl = value;
                    }

                    /**
                     * 取得 itemList 特性的值.
                     * 
                     * @return possible object is
                     *         {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList }
                     * 
                     */
                    public ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList getItemList() {
                        return itemList;
                    }

                    /**
                     * 設定 itemList 特性的值.
                     * 
                     * @param value allowed object is
                     *              {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList }
                     * 
                     */
                    public void setItemList(
                            ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList value) {
                        this.itemList = value;
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
                     *         &lt;element name="Item" maxOccurs="unbounded"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;all&gt;
                     *                   &lt;element name="SellerPartNumber"&gt;
                     *                     &lt;simpleType&gt;
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                     *                         &lt;maxLength value="40"/&gt;
                     *                         &lt;minLength value="1"/&gt;
                     *                       &lt;/restriction&gt;
                     *                     &lt;/simpleType&gt;
                     *                   &lt;/element&gt;
                     *                   &lt;element name="Quantity"&gt;
                     *                     &lt;simpleType&gt;
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
                     *                         &lt;minExclusive value="0"/&gt;
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
                    @XmlType(name = "", propOrder = { "item" })
                    public static class ItemList {

                        @XmlElement(name = "Item", required = true)
                        @JsonProperty(value = "ItemList")
                        protected List<ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList.Item> item;

                        /**
                         * Gets the value of the item property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list, not a snapshot.
                         * Therefore any modification you make to the returned list will be present
                         * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
                         * for the item property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * 
                         * <pre>
                         * getItem().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList.Item }
                         * 
                         * @return possible object is {@link List}
                         */
                        public List<ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList.Item> getItem() {
                            if (item == null) {
                                item = new ArrayList<ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList.Package.ItemList.Item>();
                            }
                            return this.item;
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
                         *       &lt;all&gt;
                         *         &lt;element name="SellerPartNumber"&gt;
                         *           &lt;simpleType&gt;
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                         *               &lt;maxLength value="40"/&gt;
                         *               &lt;minLength value="1"/&gt;
                         *             &lt;/restriction&gt;
                         *           &lt;/simpleType&gt;
                         *         &lt;/element&gt;
                         *         &lt;element name="Quantity"&gt;
                         *           &lt;simpleType&gt;
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
                         *               &lt;minExclusive value="0"/&gt;
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
                        public static class Item {

                            @XmlElement(name = "SellerPartNumber", required = true)
                            @JsonProperty(value = "SellerPartNumber")
                            protected String sellerPartNumber;
                            @XmlElement(name = "Quantity")
                            @JsonProperty(value = "Quantity")
                            protected Integer quantity;

                            /**
                             * 取得 sellerPartNumber 特性的值.
                             * 
                             * @return possible object is {@link String }
                             * 
                             */
                            public String getSellerPartNumber() {
                                return sellerPartNumber;
                            }

                            /**
                             * 設定 sellerPartNumber 特性的值.
                             * 
                             * @param value allowed object is {@link String }
                             * 
                             */
                            public void setSellerPartNumber(String value) {
                                this.sellerPartNumber = value;
                            }

                            /**
                             * 取得 quantity 特性的值.
                             * @return possible object is {@link Integer}
                             */
                            public Integer getQuantity() {
                                return quantity;
                            }

                            /**
                             * 設定 quantity 特性的值.
                             * @param value allowed object is {@link Integer}
                             */
                            public void setQuantity(Integer value) {
                                this.quantity = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
