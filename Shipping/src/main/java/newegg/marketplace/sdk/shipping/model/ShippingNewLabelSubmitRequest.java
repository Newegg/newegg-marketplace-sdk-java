//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2020.02.05 於 04:26:09 PM CST 
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
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="CreateShippingLabel"/&gt;
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
 *                           &lt;all&gt;
 *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="ShippingCarrierCode"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShippingServiceCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="-1"/&gt;
 *                                   &lt;enumeration value="101"/&gt;
 *                                   &lt;enumeration value="102"/&gt;
 *                                   &lt;enumeration value="103"/&gt;
 *                                   &lt;enumeration value="104"/&gt;
 *                                   &lt;enumeration value="105"/&gt;
 *                                   &lt;enumeration value="111"/&gt;
 *                                   &lt;enumeration value="112"/&gt;
 *                                   &lt;enumeration value="113"/&gt;
 *                                   &lt;enumeration value="114"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromFirstName"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromLastName"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="30"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromPhoneNumber"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromAddress1"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromAddress2" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromCityName"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="45"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromStateCode"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="50"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromZipCode"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="20"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ShipFromCountryCode"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="3"/&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
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
 *                                                       &lt;maxLength value="15"/&gt;
 *                                                       &lt;minLength value="0"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
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
public class ShippingNewLabelSubmitRequest {

    @XmlElement(name = "OperationType", required = true)
    @JsonProperty(value = "OperationType", required = true)
    protected String operationType = "CreateShippingLabel";
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty(value = "SellerID", required = true)
    protected String sellerID;
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty(value = "RequestBody", required = true)
    protected ShippingNewLabelSubmitRequest.RequestBody requestBody;

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
     * @return possible object is {@link ShippingNewLabelSubmitRequest.RequestBody }
     * 
     */
    public ShippingNewLabelSubmitRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value allowed object is
     *              {@link ShippingNewLabelSubmitRequest.RequestBody }
     * 
     */
    public void setRequestBody(ShippingNewLabelSubmitRequest.RequestBody value) {
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
     *                 &lt;all&gt;
     *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="ShippingCarrierCode"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShippingServiceCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="-1"/&gt;
     *                         &lt;enumeration value="101"/&gt;
     *                         &lt;enumeration value="102"/&gt;
     *                         &lt;enumeration value="103"/&gt;
     *                         &lt;enumeration value="104"/&gt;
     *                         &lt;enumeration value="105"/&gt;
     *                         &lt;enumeration value="111"/&gt;
     *                         &lt;enumeration value="112"/&gt;
     *                         &lt;enumeration value="113"/&gt;
     *                         &lt;enumeration value="114"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromFirstName"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromLastName"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="30"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromPhoneNumber"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="40"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromAddress1"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromAddress2" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="100"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromCityName"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="45"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromStateCode"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="50"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromZipCode"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="20"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ShipFromCountryCode"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;maxLength value="3"/&gt;
     *                         &lt;minLength value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
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
     *                                             &lt;maxLength value="15"/&gt;
     *                                             &lt;minLength value="0"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
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
        protected ShippingNewLabelSubmitRequest.RequestBody.Shipment shipment;

        /**
         * 取得 shipment 特性的值.
         * 
         * @return possible object is
         *         {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment }
         * 
         */
        public ShippingNewLabelSubmitRequest.RequestBody.Shipment getShipment() {
            return shipment;
        }

        /**
         * 設定 shipment 特性的值.
         * 
         * @param value allowed object is
         *              {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment }
         * 
         */
        public void setShipment(ShippingNewLabelSubmitRequest.RequestBody.Shipment value) {
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
         *         &lt;element name="ShippingCarrierCode"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShippingServiceCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="-1"/&gt;
         *               &lt;enumeration value="101"/&gt;
         *               &lt;enumeration value="102"/&gt;
         *               &lt;enumeration value="103"/&gt;
         *               &lt;enumeration value="104"/&gt;
         *               &lt;enumeration value="105"/&gt;
         *               &lt;enumeration value="111"/&gt;
         *               &lt;enumeration value="112"/&gt;
         *               &lt;enumeration value="113"/&gt;
         *               &lt;enumeration value="114"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromFirstName"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromLastName"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="30"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromPhoneNumber"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="40"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromAddress1"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="100"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromAddress2" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="100"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromCityName"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="45"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromStateCode"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="50"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromZipCode"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="20"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ShipFromCountryCode"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;maxLength value="3"/&gt;
         *               &lt;minLength value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
         *                                   &lt;maxLength value="15"/&gt;
         *                                   &lt;minLength value="0"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
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
        public static class Shipment {

            @XmlElement(name = "OrderNumber")
            @JsonProperty(value = "OrderNumber", required = true)
            protected Integer orderNumber;
            @XmlElement(name = "ShippingCarrierCode")
            @JsonProperty(value = "ShippingCarrierCode", required = true)
            protected Integer shippingCarrierCode;
            @XmlElement(name = "ShippingServiceCode", defaultValue = "100")
            @JsonProperty(value = "ShippingServiceCode")
            protected Integer shippingServiceCode;
            @XmlElement(name = "ShipFromFirstName", required = true)
            @JsonProperty(value = "ShipFromFirstName", required = true)
            protected String shipFromFirstName;
            @XmlElement(name = "ShipFromLastName", required = true)
            @JsonProperty(value = "ShipFromLastName", required = true)
            protected String shipFromLastName;
            @XmlElement(name = "ShipFromPhoneNumber", required = true)
            @JsonProperty(value = "ShipFromPhoneNumber", required = true)
            protected String shipFromPhoneNumber;
            @XmlElement(name = "ShipFromAddress1", required = true)
            @JsonProperty(value = "ShipFromAddress1", required = true)
            protected String shipFromAddress1;
            @XmlElement(name = "ShipFromAddress2")
            @JsonProperty(value = "ShipFromAddress2")
            protected String shipFromAddress2;
            @XmlElement(name = "ShipFromCityName", required = true)
            @JsonProperty(value = "ShipFromCityName", required = true)
            protected String shipFromCityName;
            @XmlElement(name = "ShipFromStateCode", required = true)
            @JsonProperty(value = "ShipFromStateCode", required = true)
            protected String shipFromStateCode;
            @XmlElement(name = "ShipFromZipCode", required = true)
            @JsonProperty(value = "ShipFromZipCode", required = true)
            protected String shipFromZipCode;
            @XmlElement(name = "ShipFromCountryCode", required = true)
            @JsonProperty(value = "ShipFromCountryCode", required = true)
            protected String shipFromCountryCode;
            @XmlElement(name = "PackageList", required = true)
            @JsonProperty(value = "PackageList", required = true)
            protected ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList packageList;

            /**
             * 取得 orderNumber 特性的值.
             * @return possible object is {@link Integer}
             */
            public Integer getOrderNumber() {
                return orderNumber;
            }

            /**
             * 設定 orderNumber 特性的值.
             * @param value allowed object is {@link Integer}
             */
            public void setOrderNumber(Integer value) {
                this.orderNumber = value;
            }

            /**
             * 取得 shippingCarrierCode 特性的值.
             * @return possible object is {@link Integer}
             */
            public Integer getShippingCarrierCode() {
                return shippingCarrierCode;
            }

            /**
             * 設定 shippingCarrierCode 特性的值.
             * @param value allowed object is {@link Integer}
             */
            public void setShippingCarrierCode(Integer value) {
                this.shippingCarrierCode = value;
            }

            /**
             * 取得 shippingServiceCode 特性的值.
             * 
             * @return possible object is {@link Integer }
             * 
             */
            public Integer getShippingServiceCode() {
                return shippingServiceCode;
            }

            /**
             * 設定 shippingServiceCode 特性的值.
             * 
             * @param value allowed object is {@link Integer }
             * 
             */
            public void setShippingServiceCode(Integer value) {
                this.shippingServiceCode = value;
            }

            /**
             * 取得 shipFromFirstName 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromFirstName() {
                return shipFromFirstName;
            }

            /**
             * 設定 shipFromFirstName 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromFirstName(String value) {
                this.shipFromFirstName = value;
            }

            /**
             * 取得 shipFromLastName 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromLastName() {
                return shipFromLastName;
            }

            /**
             * 設定 shipFromLastName 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromLastName(String value) {
                this.shipFromLastName = value;
            }

            /**
             * 取得 shipFromPhoneNumber 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromPhoneNumber() {
                return shipFromPhoneNumber;
            }

            /**
             * 設定 shipFromPhoneNumber 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromPhoneNumber(String value) {
                this.shipFromPhoneNumber = value;
            }

            /**
             * 取得 shipFromAddress1 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromAddress1() {
                return shipFromAddress1;
            }

            /**
             * 設定 shipFromAddress1 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromAddress1(String value) {
                this.shipFromAddress1 = value;
            }

            /**
             * 取得 shipFromAddress2 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromAddress2() {
                return shipFromAddress2;
            }

            /**
             * 設定 shipFromAddress2 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromAddress2(String value) {
                this.shipFromAddress2 = value;
            }

            /**
             * 取得 shipFromCityName 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromCityName() {
                return shipFromCityName;
            }

            /**
             * 設定 shipFromCityName 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromCityName(String value) {
                this.shipFromCityName = value;
            }

            /**
             * 取得 shipFromStateCode 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromStateCode() {
                return shipFromStateCode;
            }

            /**
             * 設定 shipFromStateCode 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromStateCode(String value) {
                this.shipFromStateCode = value;
            }

            /**
             * 取得 shipFromZipCode 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromZipCode() {
                return shipFromZipCode;
            }

            /**
             * 設定 shipFromZipCode 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromZipCode(String value) {
                this.shipFromZipCode = value;
            }

            /**
             * 取得 shipFromCountryCode 特性的值.
             * 
             * @return possible object is {@link String }
             * 
             */
            public String getShipFromCountryCode() {
                return shipFromCountryCode;
            }

            /**
             * 設定 shipFromCountryCode 特性的值.
             * 
             * @param value allowed object is {@link String }
             * 
             */
            public void setShipFromCountryCode(String value) {
                this.shipFromCountryCode = value;
            }

            /**
             * 取得 packageList 特性的值.
             * 
             * @return possible object is
             *         {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList }
             * 
             */
            public ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList getPackageList() {
                return packageList;
            }

            /**
             * 設定 packageList 特性的值.
             * 
             * @param value allowed object is
             *              {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList }
             * 
             */
            public void setPackageList(ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList value) {
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
             *                         &lt;maxLength value="15"/&gt;
             *                         &lt;minLength value="0"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
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
            @XmlType(name = "", propOrder = { "_package" })
            public static class PackageList {

                @XmlElement(name = "Package", required = true)
                @JsonProperty(value = "Package", required = true)
                protected List<ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package> _package;

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
                 * {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package }
                 * 
                 * @return possible object is {@link List}
                 */
                @JsonIgnore
                public List<ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package> getPackage() {
                    if (_package == null) {
                        _package = new ArrayList<ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package>();
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
                 *               &lt;maxLength value="15"/&gt;
                 *               &lt;minLength value="0"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
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
                @XmlType(name = "", propOrder = {

                })
                public static class Package {

                    @XmlElement(name = "PackageWeight", required = true)
                    @JsonProperty(value = "PackageWeight", required = true)
                    protected BigDecimal packageWeight;
                    @XmlElement(name = "PackageLength", required = true)
                    @JsonProperty(value = "PackageLength", required = true)
                    protected BigDecimal packageLength;
                    @XmlElement(name = "PackageHeight", required = true)
                    @JsonProperty(value = "PackageHeight", required = true)
                    protected BigDecimal packageHeight;
                    @XmlElement(name = "PackageWidth", required = true)
                    @JsonProperty(value = "PackageWidth", required = true)
                    protected BigDecimal packageWidth;
                    @XmlElement(name = "SignatureOptions")
                    @JsonProperty(value = "SignatureOptions")
                    protected String signatureOptions;
                    @XmlElement(name = "ItemList", required = true)
                    @JsonProperty(value = "ItemList", required = true)
                    protected ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList;

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
                     * 取得 itemList 特性的值.
                     * 
                     * @return possible object is
                     *         {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList }
                     * 
                     */
                    public ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList getItemList() {
                        return itemList;
                    }

                    /**
                     * 設定 itemList 特性的值.
                     * 
                     * @param value allowed object is
                     *              {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList }
                     * 
                     */
                    public void setItemList(
                            ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList value) {
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
                        @JsonProperty(value = "Item", required = true)
                        protected List<ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item> item;

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
                         * {@link ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item }
                         * 
                         * @return possible object is {@link List}
                         */
                        public List<ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item> getItem() {
                            if (item == null) {
                                item = new ArrayList<ShippingNewLabelSubmitRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item>();
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
                            @JsonProperty(value = "SellerPartNumber", required = true)
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