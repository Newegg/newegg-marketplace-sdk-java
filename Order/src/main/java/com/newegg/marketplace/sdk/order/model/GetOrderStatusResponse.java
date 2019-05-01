//
//此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
//請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
//一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
//產生時間: 2019.02.21 於 10:18:22 AM CST 
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
* &lt;complexType>
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;all>
*         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
*         &lt;element name="OrderStatusCode">
*           &lt;simpleType>
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
*               &lt;minInclusive value="0"/>
*               &lt;maxInclusive value="4"/>
*             &lt;/restriction>
*           &lt;/simpleType>
*         &lt;/element>
*         &lt;element name="OrderStatusName">
*           &lt;simpleType>
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
*               &lt;enumeration value="Unshipped"/>
*               &lt;enumeration value="PartiallyShipped"/>
*               &lt;enumeration value="Shipped"/>
*               &lt;enumeration value="Invoiced"/>
*               &lt;enumeration value="Void"/>
*             &lt;/restriction>
*           &lt;/simpleType>
*         &lt;/element>
*         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
*         &lt;element name="OrderDownloaded">
*           &lt;simpleType>
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
*               &lt;enumeration value="true"/>
*               &lt;enumeration value="false"/>
*             &lt;/restriction>
*           &lt;/simpleType>
*         &lt;/element>
*         &lt;element name="SalesChannel" minOccurs="0">
*           &lt;simpleType>
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
*               &lt;enumeration value="0"/>
*               &lt;enumeration value="2"/>
*             &lt;/restriction>
*           &lt;/simpleType>
*         &lt;/element>
*         &lt;element name="FulfillmentOption" minOccurs="0">
*           &lt;simpleType>
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
*               &lt;enumeration value="0"/>
*               &lt;enumeration value="1"/>
*             &lt;/restriction>
*           &lt;/simpleType>
*         &lt;/element>
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
@XmlRootElement(name = "QueryOrderStatusInfo")
@JsonRootName("QueryOrderStatusInfo")
public class GetOrderStatusResponse {
	@XmlElement(name = "OrderNumber", required = true)
	@JsonProperty("OrderNumber")
    protected String orderNumber;
    @XmlElement(name = "OrderStatusCode")
    @JsonProperty("OrderStatusCode")
    protected int orderStatusCode;
    @XmlElement(name = "OrderStatusName", required = true)
    @JsonProperty("OrderStatusName")
    protected String orderStatusName;
    @XmlElement(name = "SellerID", required = true)
    @JsonProperty("SellerID")
    protected String sellerID;
    @XmlElement(name = "OrderDownloaded", required = true)
    @JsonProperty("OrderDownloaded")
    protected String orderDownloaded;
    @XmlElement(name = "SalesChannel")
    @JsonProperty("SalesChannel")
    protected Integer salesChannel;
    @XmlElement(name = "FulfillmentOption")
    @JsonProperty("FulfillmentOption")
    protected Integer fulfillmentOption;

    /**
     * 取得 orderNumber 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 設定 orderNumber 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * 取得 orderStatusCode 特性的值.
     * 
     */
    public int getOrderStatusCode() {
        return orderStatusCode;
    }

    /**
     * 設定 orderStatusCode 特性的值.
     * 
     */
    public void setOrderStatusCode(int value) {
        this.orderStatusCode = value;
    }

    /**
     * 取得 orderStatusName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatusName() {
        return orderStatusName;
    }

    /**
     * 設定 orderStatusName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatusName(String value) {
        this.orderStatusName = value;
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
     * 取得 orderDownloaded 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDownloaded() {
        return orderDownloaded;
    }

    /**
     * 設定 orderDownloaded 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDownloaded(String value) {
        this.orderDownloaded = value;
    }

    /**
     * 取得 salesChannel 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesChannel() {
        return salesChannel;
    }

    /**
     * 設定 salesChannel 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesChannel(Integer value) {
        this.salesChannel = value;
    }

    /**
     * 取得 fulfillmentOption 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFulfillmentOption() {
        return fulfillmentOption;
    }

    /**
     * 設定 fulfillmentOption 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFulfillmentOption(Integer value) {
        this.fulfillmentOption = value;
    }
}
