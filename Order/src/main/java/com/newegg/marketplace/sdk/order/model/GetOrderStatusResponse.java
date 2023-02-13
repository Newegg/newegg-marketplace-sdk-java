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
* &lt;complexType&gt;
*   &lt;complexContent&gt;
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
*       &lt;all&gt;
*         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
*         &lt;element name="OrderStatusCode"&gt;
*           &lt;simpleType&gt;
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
*               &lt;minInclusive value="0"/&gt;
*               &lt;maxInclusive value="4"/&gt;
*             &lt;/restriction&gt;
*           &lt;/simpleType&gt;
*         &lt;/element&gt;
*         &lt;element name="OrderStatusName"&gt;
*           &lt;simpleType&gt;
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
*               &lt;enumeration value="Unshipped"/&gt;
*               &lt;enumeration value="PartiallyShipped"/&gt;
*               &lt;enumeration value="Shipped"/&gt;
*               &lt;enumeration value="Invoiced"/&gt;
*               &lt;enumeration value="Void"/&gt;
*             &lt;/restriction&gt;
*           &lt;/simpleType&gt;
*         &lt;/element&gt;
*         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
*         &lt;element name="OrderDownloaded"&gt;
*           &lt;simpleType&gt;
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
*               &lt;enumeration value="true"/&gt;
*               &lt;enumeration value="false"/&gt;
*             &lt;/restriction&gt;
*           &lt;/simpleType&gt;
*         &lt;/element&gt;
*         &lt;element name="SalesChannel" minOccurs="0"&gt;
*           &lt;simpleType&gt;
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
*               &lt;enumeration value="0"/&gt;
*               &lt;enumeration value="2"/&gt;
*             &lt;/restriction&gt;
*           &lt;/simpleType&gt;
*         &lt;/element&gt;
*         &lt;element name="FulfillmentOption" minOccurs="0"&gt;
*           &lt;simpleType&gt;
*             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
*               &lt;enumeration value="0"/&gt;
*               &lt;enumeration value="1"/&gt;
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
     * @return
     * possible object is 
     *     {@link int }
     * 
     */
    public int getOrderStatusCode() {
        return orderStatusCode;
    }

    /**
     * 設定 orderStatusCode 特性的值.
     * @param value
     *     allowed object is
     *     {@link  }
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
