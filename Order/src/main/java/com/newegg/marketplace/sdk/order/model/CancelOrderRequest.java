//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.21 於 04:34:26 PM CST 
//


package com.newegg.marketplace.sdk.order.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;


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
 *         &lt;element name="Action"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Value"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="24"/&gt;
 *               &lt;enumeration value="72"/&gt;
 *               &lt;enumeration value="73"/&gt;
 *               &lt;enumeration value="74"/&gt;
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
@XmlRootElement(name = "UpdateOrderStatus")
public class CancelOrderRequest {

    @XmlElement(name = "Action")
    @JsonProperty("Action")
    protected int action;
    @XmlElement(name = "Value")
    @JsonProperty("Value")
    protected int value;

    /**
     * 取得 action 特性的值.
     * @return
     * possible object is 
     *     {@link int }
     * 
     */
    public int getAction() {
        return action;
    }

    /**
     * 設定 action 特性的值.
     * @param value
     *     allowed object is
     *     {@link  }
     * 
     */
    public void setAction(int value) {
        this.action = value;
    }

    /**
     * 取得 value 特性的值.
     * @return
     * possible object is 
     *     {@link int }
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * 設定 value 特性的值.
     * @param value
     *     allowed object is
     *     {@link  }
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}
