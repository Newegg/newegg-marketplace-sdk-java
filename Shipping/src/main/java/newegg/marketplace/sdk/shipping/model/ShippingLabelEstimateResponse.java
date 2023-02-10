//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2020.02.05 於 04:25:08 PM CST 
//

package newegg.marketplace.sdk.shipping.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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
 *         &lt;element name="IsSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="EstimateShippingLabelResponse"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Shipment"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="EstimatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                                                 &lt;element name="PackageWeight"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                       &lt;minExclusive value="0"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PackageLength"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                       &lt;minExclusive value="0"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PackageHeight"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                       &lt;minExclusive value="0"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="PackageWidth"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                       &lt;minExclusive value="0"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="SignatureOptions" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ProcessResult"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ErrorMessage" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="EstimatedRate"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="EstimatedShipWeight"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                                 &lt;minExclusive value="0"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="EstimatedArriveBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                                           &lt;element name="EstimatedShippingAmount"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                                 &lt;minExclusive value="0"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="EstimatedSignatureOptions"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="EstimatedTotal"&gt;
 *                                                             &lt;simpleType&gt;
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                                                                 &lt;minExclusive value="0"/&gt;
 *                                                               &lt;/restriction&gt;
 *                                                             &lt;/simpleType&gt;
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
@XmlRootElement(name = "NeweggAPIResponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingLabelEstimateResponse {

    @XmlElement(name = "IsSuccess")
    @JsonProperty(value = "IsSuccess")
    protected boolean isSuccess;
    
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty(value = "OperationType")
    protected String operationType;
    
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty(value = "SellerID")
    protected String sellerID;
    
    @XmlElement(name = "ResponseBody", required = true)
    @JsonProperty(value = "ResponseBody")
    protected ShippingLabelEstimateResponse.ResponseBody responseBody;

    /**
     * 取得 isSuccess 特性的值.
     * @return possible object is {@link Boolean }
     */
    public boolean isIsSuccess() {
        return isSuccess;
    }

    /**
     * 設定 isSuccess 特性的值.
     * @param value allowed object is {@link Boolean }
     */
    public void setIsSuccess(boolean value) {
        this.isSuccess = value;
    }

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
    public ShippingLabelEstimateResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value allowed object is {@link ShippingLabelReprintResponse.ResponseBody }
     * 
     */
    public void setResponseBody(ShippingLabelEstimateResponse.ResponseBody value) {
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
     *       &lt;sequence&gt;
     *         &lt;element name="Shipment"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="EstimatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
     *                                       &lt;element name="PackageWeight"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                             &lt;minExclusive value="0"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PackageLength"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                             &lt;minExclusive value="0"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PackageHeight"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                             &lt;minExclusive value="0"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="PackageWidth"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                             &lt;minExclusive value="0"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="SignatureOptions" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ProcessResult"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ErrorMessage" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="EstimatedRate"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="EstimatedShipWeight"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                                       &lt;minExclusive value="0"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="EstimatedArriveBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                                                 &lt;element name="EstimatedShippingAmount"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                                       &lt;minExclusive value="0"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="EstimatedSignatureOptions"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="EstimatedTotal"&gt;
     *                                                   &lt;simpleType&gt;
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *                                                       &lt;minExclusive value="0"/&gt;
     *                                                     &lt;/restriction&gt;
     *                                                   &lt;/simpleType&gt;
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
    @XmlType(name = "", propOrder = { "shipment" })
    public static class ResponseBody {

        @XmlElement(name = "Shipment", required = true)
        @JsonProperty(value = "Shipment")
        protected ShippingLabelEstimateResponse.ResponseBody.Shipment shipment;

        /**
         * 取得 shipment 特性的值.
         * 
         * @return possible object is {@link ShippingLabelReprintResponse.ResponseBody.Shipment }
         * 
         */
        public ShippingLabelEstimateResponse.ResponseBody.Shipment getShipment() {
            return shipment;
        }

        /**
         * 設定 shipment 特性的值.
         * 
         * @param value allowed object is
         *              {@link ShippingLabelReprintResponse.ResponseBody.Shipment }
         * 
         */
        public void setShipment(ShippingLabelEstimateResponse.ResponseBody.Shipment value) {
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
         *         &lt;element name="EstimatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
         *                             &lt;element name="PackageWeight"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                   &lt;minExclusive value="0"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="PackageLength"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                   &lt;minExclusive value="0"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="PackageHeight"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                   &lt;minExclusive value="0"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="PackageWidth"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                   &lt;minExclusive value="0"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="SignatureOptions" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="ProcessResult"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="ErrorMessage" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="EstimatedRate"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="EstimatedShipWeight"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                             &lt;minExclusive value="0"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="EstimatedArriveBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                                       &lt;element name="EstimatedShippingAmount"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                             &lt;minExclusive value="0"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="EstimatedSignatureOptions"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="EstimatedTotal"&gt;
         *                                         &lt;simpleType&gt;
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
         *                                             &lt;minExclusive value="0"/&gt;
         *                                           &lt;/restriction&gt;
         *                                         &lt;/simpleType&gt;
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
        public static class Shipment {

            @XmlElement(name = "OrderNumber")
            @JsonProperty(value = "OrderNumber")
            protected Integer orderNumber;
            @XmlElement(name = "EstimatedDate", required = true)
            @JsonProperty(value = "EstimatedDate")
            protected String estimatedDate;
            @XmlElement(name = "PackageList", required = true)
            @JsonProperty(value = "PackageList")
           // @JsonUnwrapped
            protected ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList packageList;

            /**
             * 取得 orderNumber 特性的值.
             * @return possible object is {@link Integer }
             */
            public Integer getOrderNumber() {
                return orderNumber;
            }

            /**
             * 設定 orderNumber 特性的值.
             * @param value allowed object is {@link Integer }
             */
            public void setOrderNumber(Integer value) {
                this.orderNumber = value;
            }

            /**
             * 取得 estimatedDate 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getEstimatedDate() {
                return estimatedDate;
            }

            /**
             * 設定 estimatedDate 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setEstimatedDate(String value) {
                this.estimatedDate = value;
            }

            /**
             * 取得 packageList 特性的值.
             * 
             * @return possible object is
             *         {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList }
             * 
             */
            public ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList getPackageList() {
                return packageList;
            }

            /**
             * 設定 packageList 特性的值.
             * 
             * @param value allowed object is
             *              {@link ShippingLabelReprintResponse.ResponseBody.Shipment.PackageList }
             * 
             */
            public void setPackageList(ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList value) {
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
             *                   &lt;element name="PackageWeight"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                         &lt;minExclusive value="0"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="PackageLength"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                         &lt;minExclusive value="0"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="PackageHeight"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                         &lt;minExclusive value="0"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="PackageWidth"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                         &lt;minExclusive value="0"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="SignatureOptions" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="ProcessResult"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="ErrorMessage" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="EstimatedRate"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="EstimatedShipWeight"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                                   &lt;minExclusive value="0"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="EstimatedArriveBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *                             &lt;element name="EstimatedShippingAmount"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                                   &lt;minExclusive value="0"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="EstimatedSignatureOptions"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="EstimatedTotal"&gt;
             *                               &lt;simpleType&gt;
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
             *                                   &lt;minExclusive value="0"/&gt;
             *                                 &lt;/restriction&gt;
             *                               &lt;/simpleType&gt;
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
            @XmlType(name = "", propOrder = { "_package" })
            public static class PackageList {

                @XmlElement(name = "Package", required = true)
                @JsonProperty(value = "Package")
                protected List<ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList.Package> _package;

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
                 * 
                 * @return possible object is {@link List}
                 */
                @JsonIgnore
                public List<ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList.Package> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList.Package>();
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
                 *         &lt;element name="PackageWeight"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *               &lt;minExclusive value="0"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="PackageLength"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *               &lt;minExclusive value="0"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="PackageHeight"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *               &lt;minExclusive value="0"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="PackageWidth"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *               &lt;minExclusive value="0"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="SignatureOptions" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="ProcessResult"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="ErrorMessage" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="EstimatedRate"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="EstimatedShipWeight"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *                         &lt;minExclusive value="0"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="EstimatedArriveBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                 *                   &lt;element name="EstimatedShippingAmount"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *                         &lt;minExclusive value="0"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="EstimatedSignatureOptions"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="EstimatedTotal"&gt;
                 *                     &lt;simpleType&gt;
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                 *                         &lt;minExclusive value="0"/&gt;
                 *                       &lt;/restriction&gt;
                 *                     &lt;/simpleType&gt;
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
                public static class Package {

                    @XmlElement(name = "PackageWeight", required = true)
                    @JsonProperty(value = "PackageWeight")
                    protected BigDecimal packageWeight;
                    @XmlElement(name = "PackageLength", required = true)
                    @JsonProperty(value = "PackageLength")
                    protected BigDecimal packageLength;
                    @XmlElement(name = "PackageHeight", required = true)
                    @JsonProperty(value = "PackageHeight")
                    protected BigDecimal packageHeight;
                    @XmlElement(name = "PackageWidth", required = true)
                    @JsonProperty(value = "PackageWidth")
                    protected BigDecimal packageWidth;
                    @XmlElement(name = "SignatureOptions")
                    @JsonProperty(value = "SignatureOptions")
                    protected String signatureOptions;
                    @XmlElement(name = "ProcessResult", required = true)
                    @JsonProperty(value = "ProcessResult")
                    protected String processResult;
                    @XmlElement(name = "ErrorMessage")
                    @JsonProperty(value = "ErrorMessage")
                    protected String errorMessage;
                    @XmlElement(name = "EstimatedRate", required = true)
                    @JsonProperty(value = "EstimatedRate")
                    protected ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList.Package.EstimatedRate estimatedRate;

                    /**
                     * 取得 packageWeight 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageWeight() {
                        return packageWeight;
                    }

                    /**
                     * 設定 packageWeight 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageWeight(BigDecimal value) {
                        this.packageWeight = value;
                    }

                    /**
                     * 取得 packageLength 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageLength() {
                        return packageLength;
                    }

                    /**
                     * 設定 packageLength 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageLength(BigDecimal value) {
                        this.packageLength = value;
                    }

                    /**
                     * 取得 packageHeight 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageHeight() {
                        return packageHeight;
                    }

                    /**
                     * 設定 packageHeight 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageHeight(BigDecimal value) {
                        this.packageHeight = value;
                    }

                    /**
                     * 取得 packageWidth 特性的值.
                     * 
                     * @return possible object is {@link BigDecimal }
                     * 
                     */
                    public BigDecimal getPackageWidth() {
                        return packageWidth;
                    }

                    /**
                     * 設定 packageWidth 特性的值.
                     * 
                     * @param value allowed object is {@link BigDecimal }
                     * 
                     */
                    public void setPackageWidth(BigDecimal value) {
                        this.packageWidth = value;
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
                     * 取得 processResult 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getProcessResult() {
                        return processResult;
                    }

                    /**
                     * 設定 processResult 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setProcessResult(String value) {
                        this.processResult = value;
                    }

                    /**
                     * 取得 errorMessage 特性的值.
                     * 
                     * @return possible object is {@link String }
                     * 
                     */
                    public String getErrorMessage() {
                        return errorMessage;
                    }

                    /**
                     * 設定 errorMessage 特性的值.
                     * 
                     * @param value allowed object is {@link String }
                     * 
                     */
                    public void setErrorMessage(String value) {
                        this.errorMessage = value;
                    }

                    /**
                     * 取得 estimatedRate 特性的值.
                     * 
                     * @return possible object is
                     *         
                     * 
                     */
                    public ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList.Package.EstimatedRate getEstimatedRate() {
                        return estimatedRate;
                    }

                    /**
                     * 設定 estimatedRate 特性的值.
                     * 
                     * @param value allowed object is
                     *              
                     * 
                     */
                    public void setEstimatedRate(
                            ShippingLabelEstimateResponse.ResponseBody.Shipment.PackageList.Package.EstimatedRate value) {
                        this.estimatedRate = value;
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
                     *         &lt;element name="EstimatedShipWeight"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                     *               &lt;minExclusive value="0"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="EstimatedArriveBy" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
                     *         &lt;element name="EstimatedShippingAmount"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                     *               &lt;minExclusive value="0"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="EstimatedSignatureOptions"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="EstimatedTotal"&gt;
                     *           &lt;simpleType&gt;
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
                     *               &lt;minExclusive value="0"/&gt;
                     *             &lt;/restriction&gt;
                     *           &lt;/simpleType&gt;
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
                    @XmlType(name = "", propOrder = { "estimatedShipWeight", "estimatedArriveBy",
                            "estimatedShippingAmount", "estimatedSignatureOptions", "estimatedTotal" })
                    public static class EstimatedRate {

                        @XmlElement(name = "EstimatedShipWeight", required = true)
                        @JsonProperty(value = "EstimatedShipWeight")
                        protected BigDecimal estimatedShipWeight;
                        @XmlElement(name = "EstimatedArriveBy", required = true)
                        @JsonProperty(value = "EstimatedArriveBy")
                        protected Object estimatedArriveBy;
                        @XmlElement(name = "EstimatedShippingAmount", required = true)
                        @JsonProperty(value = "EstimatedShippingAmount")
                        protected BigDecimal estimatedShippingAmount;
                        @XmlElement(name = "EstimatedSignatureOptions", required = true)
                        @JsonProperty(value = "EstimatedSignatureOptions")
                        protected BigDecimal estimatedSignatureOptions;
                        @XmlElement(name = "EstimatedTotal", required = true)
                        @JsonProperty(value = "EstimatedTotal")
                        protected BigDecimal estimatedTotal;

                        /**
                         * 取得 estimatedShipWeight 特性的值.
                         * 
                         * @return possible object is {@link BigDecimal }
                         * 
                         */
                        public BigDecimal getEstimatedShipWeight() {
                            return estimatedShipWeight;
                        }

                        /**
                         * 設定 estimatedShipWeight 特性的值.
                         * 
                         * @param value allowed object is {@link BigDecimal }
                         * 
                         */
                        public void setEstimatedShipWeight(BigDecimal value) {
                            this.estimatedShipWeight = value;
                        }

                        /**
                         * 取得 estimatedArriveBy 特性的值.
                         * 
                         * @return possible object is {@link Object }
                         * 
                         */
                        public Object getEstimatedArriveBy() {
                            return estimatedArriveBy;
                        }

                        /**
                         * 設定 estimatedArriveBy 特性的值.
                         * 
                         * @param value allowed object is {@link Object }
                         * 
                         */
                        public void setEstimatedArriveBy(Object value) {
                            this.estimatedArriveBy = value;
                        }

                        /**
                         * 取得 estimatedShippingAmount 特性的值.
                         * 
                         * @return possible object is {@link BigDecimal }
                         * 
                         */
                        public BigDecimal getEstimatedShippingAmount() {
                            return estimatedShippingAmount;
                        }

                        /**
                         * 設定 estimatedShippingAmount 特性的值.
                         * 
                         * @param value allowed object is {@link BigDecimal }
                         * 
                         */
                        public void setEstimatedShippingAmount(BigDecimal value) {
                            this.estimatedShippingAmount = value;
                        }

                        /**
                         * 取得 estimatedSignatureOptions 特性的值.
                         * 
                         * @return possible object is {@link BigDecimal }
                         * 
                         */
                        public BigDecimal getEstimatedSignatureOptions() {
                            return estimatedSignatureOptions;
                        }

                        /**
                         * 設定 estimatedSignatureOptions 特性的值.
                         * 
                         * @param value allowed object is {@link BigDecimal }
                         * 
                         */
                        public void setEstimatedSignatureOptions(BigDecimal value) {
                            this.estimatedSignatureOptions = value;
                        }

                        /**
                         * 取得 estimatedTotal 特性的值.
                         * 
                         * @return possible object is {@link BigDecimal }
                         * 
                         */
                        public BigDecimal getEstimatedTotal() {
                            return estimatedTotal;
                        }

                        /**
                         * 設定 estimatedTotal 特性的值.
                         * 
                         * @param value allowed object is {@link BigDecimal }
                         * 
                         */
                        public void setEstimatedTotal(BigDecimal value) {
                            this.estimatedTotal = value;
                        }

                    }

                }

            }

        }

    }
}
