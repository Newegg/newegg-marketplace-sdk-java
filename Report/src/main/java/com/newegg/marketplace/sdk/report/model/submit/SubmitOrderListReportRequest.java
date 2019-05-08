//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.05 於 05:09:49 PM CST 
//
package com.newegg.marketplace.sdk.report.model.submit;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;


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
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="OrderListReportRequest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderReportCriteria">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="RequestType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="ORDER_LIST_REPORT"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="KeywordsType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="9"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Type" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VoidSoon" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="24"/>
 *                                   &lt;enumeration value="48"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OrderDownloaded" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="true"/>
 *                                   &lt;enumeration value="false"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CountryCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="AUS"/>
 *                                   &lt;enumeration value="NZL"/>
 *                                   &lt;enumeration value="GBR"/>
 *                                   &lt;enumeration value="IRL"/>
 *                                   &lt;enumeration value="NLD"/>
 *                                   &lt;enumeration value="POL"/>
 *                                   &lt;enumeration value="IND"/>
 *                                   &lt;enumeration value="SGP"/>
 *                                   &lt;enumeration value="USA"/>
 *                                   &lt;enumeration value="HKG"/>
 *                                   &lt;enumeration value="MAC"/>
 *                                   &lt;enumeration value="IDN"/>
 *                                   &lt;enumeration value="PHL"/>
 *                                   &lt;enumeration value="KOR"/>
 *                                   &lt;enumeration value="THA"/>
 *                                   &lt;enumeration value="BRA"/>
 *                                   &lt;enumeration value="CHL"/>
 *                                   &lt;enumeration value="COL"/>
 *                                   &lt;enumeration value="CRI"/>
 *                                   &lt;enumeration value="DOM"/>
 *                                   &lt;enumeration value="ECU"/>
 *                                   &lt;enumeration value="SLV"/>
 *                                   &lt;enumeration value="GTM"/>
 *                                   &lt;enumeration value="HND"/>
 *                                   &lt;enumeration value="JAM"/>
 *                                   &lt;enumeration value="MEX"/>
 *                                   &lt;enumeration value="NIC"/>
 *                                   &lt;enumeration value="PAN"/>
 *                                   &lt;enumeration value="ISR"/>
 *                                   &lt;enumeration value="SAU"/>
 *                                   &lt;enumeration value="TUR"/>
 *                                   &lt;enumeration value="ARE"/>
 *                                   &lt;enumeration value="AUT"/>
 *                                   &lt;enumeration value="BEL"/>
 *                                   &lt;enumeration value="BGR"/>
 *                                   &lt;enumeration value="DNK"/>
 *                                   &lt;enumeration value="FIN"/>
 *                                   &lt;enumeration value="FRA"/>
 *                                   &lt;enumeration value="DEU"/>
 *                                   &lt;enumeration value="GRC"/>
 *                                   &lt;enumeration value="HUN"/>
 *                                   &lt;enumeration value="ITA"/>
 *                                   &lt;enumeration value="LVA"/>
 *                                   &lt;enumeration value="LUX"/>
 *                                   &lt;enumeration value="MCO"/>
 *                                   &lt;enumeration value="NOR"/>
 *                                   &lt;enumeration value="PRT"/>
 *                                   &lt;enumeration value="SVK"/>
 *                                   &lt;enumeration value="SVN"/>
 *                                   &lt;enumeration value="ESP"/>
 *                                   &lt;enumeration value="SWE"/>
 *                                   &lt;enumeration value="CHE"/>
 *                                   &lt;enumeration value="CHN"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PremierOrder" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlRootElement(name = "NeweggAPIRequest")
public class SubmitOrderListReportRequest {

    @XmlElement(name = "IssueUser")
    @JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", defaultValue = "OrderListReportRequest", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "OrderListReportRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected SubmitOrderListReportRequest.RequestBody requestBody;

    /**
     * 取得 issueUser 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueUser() {
        return issueUser;
    }

    /**
     * 設定 issueUser 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueUser(String value) {
        this.issueUser = value;
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
     * 取得 requestBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link NeweggAPIRequest.RequestBody }
     *     
     */
    public SubmitOrderListReportRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link NeweggAPIRequest.RequestBody }
     *     
     */
    public void setRequestBody(SubmitOrderListReportRequest.RequestBody value) {
        this.requestBody = value;
    }


    /**
     * <p>anonymous complex type 的 Java 類別.
     * 
     * <p>下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrderReportCriteria">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="RequestType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="ORDER_LIST_REPORT"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="KeywordsType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="9"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Type" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VoidSoon" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="24"/>
     *                         &lt;enumeration value="48"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OrderDownloaded" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="true"/>
     *                         &lt;enumeration value="false"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CountryCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="AUS"/>
     *                         &lt;enumeration value="NZL"/>
     *                         &lt;enumeration value="GBR"/>
     *                         &lt;enumeration value="IRL"/>
     *                         &lt;enumeration value="NLD"/>
     *                         &lt;enumeration value="POL"/>
     *                         &lt;enumeration value="IND"/>
     *                         &lt;enumeration value="SGP"/>
     *                         &lt;enumeration value="USA"/>
     *                         &lt;enumeration value="HKG"/>
     *                         &lt;enumeration value="MAC"/>
     *                         &lt;enumeration value="IDN"/>
     *                         &lt;enumeration value="PHL"/>
     *                         &lt;enumeration value="KOR"/>
     *                         &lt;enumeration value="THA"/>
     *                         &lt;enumeration value="BRA"/>
     *                         &lt;enumeration value="CHL"/>
     *                         &lt;enumeration value="COL"/>
     *                         &lt;enumeration value="CRI"/>
     *                         &lt;enumeration value="DOM"/>
     *                         &lt;enumeration value="ECU"/>
     *                         &lt;enumeration value="SLV"/>
     *                         &lt;enumeration value="GTM"/>
     *                         &lt;enumeration value="HND"/>
     *                         &lt;enumeration value="JAM"/>
     *                         &lt;enumeration value="MEX"/>
     *                         &lt;enumeration value="NIC"/>
     *                         &lt;enumeration value="PAN"/>
     *                         &lt;enumeration value="ISR"/>
     *                         &lt;enumeration value="SAU"/>
     *                         &lt;enumeration value="TUR"/>
     *                         &lt;enumeration value="ARE"/>
     *                         &lt;enumeration value="AUT"/>
     *                         &lt;enumeration value="BEL"/>
     *                         &lt;enumeration value="BGR"/>
     *                         &lt;enumeration value="DNK"/>
     *                         &lt;enumeration value="FIN"/>
     *                         &lt;enumeration value="FRA"/>
     *                         &lt;enumeration value="DEU"/>
     *                         &lt;enumeration value="GRC"/>
     *                         &lt;enumeration value="HUN"/>
     *                         &lt;enumeration value="ITA"/>
     *                         &lt;enumeration value="LVA"/>
     *                         &lt;enumeration value="LUX"/>
     *                         &lt;enumeration value="MCO"/>
     *                         &lt;enumeration value="NOR"/>
     *                         &lt;enumeration value="PRT"/>
     *                         &lt;enumeration value="SVK"/>
     *                         &lt;enumeration value="SVN"/>
     *                         &lt;enumeration value="ESP"/>
     *                         &lt;enumeration value="SWE"/>
     *                         &lt;enumeration value="CHE"/>
     *                         &lt;enumeration value="CHN"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PremierOrder" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderReportCriteria"
    })
    public static class RequestBody {

        @XmlElement(name = "OrderReportCriteria", required = true)
        @JsonProperty("OrderReportCriteria")
        protected SubmitOrderListReportRequest.RequestBody.OrderReportCriteria orderReportCriteria;

        /**
         * 取得 orderReportCriteria 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIRequest.RequestBody.OrderReportCriteria }
         *     
         */
        public SubmitOrderListReportRequest.RequestBody.OrderReportCriteria getOrderReportCriteria() {
            return orderReportCriteria;
        }

        /**
         * 設定 orderReportCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIRequest.RequestBody.OrderReportCriteria }
         *     
         */
        public void setOrderReportCriteria(SubmitOrderListReportRequest.RequestBody.OrderReportCriteria value) {
            this.orderReportCriteria = value;
        }


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
         *         &lt;element name="RequestType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="ORDER_LIST_REPORT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="KeywordsType">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="9"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Type" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VoidSoon" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="24"/>
         *               &lt;enumeration value="48"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OrderDownloaded" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="true"/>
         *               &lt;enumeration value="false"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CountryCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="AUS"/>
         *               &lt;enumeration value="NZL"/>
         *               &lt;enumeration value="GBR"/>
         *               &lt;enumeration value="IRL"/>
         *               &lt;enumeration value="NLD"/>
         *               &lt;enumeration value="POL"/>
         *               &lt;enumeration value="IND"/>
         *               &lt;enumeration value="SGP"/>
         *               &lt;enumeration value="USA"/>
         *               &lt;enumeration value="HKG"/>
         *               &lt;enumeration value="MAC"/>
         *               &lt;enumeration value="IDN"/>
         *               &lt;enumeration value="PHL"/>
         *               &lt;enumeration value="KOR"/>
         *               &lt;enumeration value="THA"/>
         *               &lt;enumeration value="BRA"/>
         *               &lt;enumeration value="CHL"/>
         *               &lt;enumeration value="COL"/>
         *               &lt;enumeration value="CRI"/>
         *               &lt;enumeration value="DOM"/>
         *               &lt;enumeration value="ECU"/>
         *               &lt;enumeration value="SLV"/>
         *               &lt;enumeration value="GTM"/>
         *               &lt;enumeration value="HND"/>
         *               &lt;enumeration value="JAM"/>
         *               &lt;enumeration value="MEX"/>
         *               &lt;enumeration value="NIC"/>
         *               &lt;enumeration value="PAN"/>
         *               &lt;enumeration value="ISR"/>
         *               &lt;enumeration value="SAU"/>
         *               &lt;enumeration value="TUR"/>
         *               &lt;enumeration value="ARE"/>
         *               &lt;enumeration value="AUT"/>
         *               &lt;enumeration value="BEL"/>
         *               &lt;enumeration value="BGR"/>
         *               &lt;enumeration value="DNK"/>
         *               &lt;enumeration value="FIN"/>
         *               &lt;enumeration value="FRA"/>
         *               &lt;enumeration value="DEU"/>
         *               &lt;enumeration value="GRC"/>
         *               &lt;enumeration value="HUN"/>
         *               &lt;enumeration value="ITA"/>
         *               &lt;enumeration value="LVA"/>
         *               &lt;enumeration value="LUX"/>
         *               &lt;enumeration value="MCO"/>
         *               &lt;enumeration value="NOR"/>
         *               &lt;enumeration value="PRT"/>
         *               &lt;enumeration value="SVK"/>
         *               &lt;enumeration value="SVN"/>
         *               &lt;enumeration value="ESP"/>
         *               &lt;enumeration value="SWE"/>
         *               &lt;enumeration value="CHE"/>
         *               &lt;enumeration value="CHN"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PremierOrder" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="2"/>
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
        public static class OrderReportCriteria {

            @XmlElement(name = "RequestType", required = true)
            @JsonProperty("RequestType")
            protected String requestType = "ORDER_LIST_REPORT";
            @XmlElement(name = "KeywordsType")
            @JsonProperty("KeywordsType")
            protected int keywordsType;
            @XmlElement(name = "KeywordsValue")
            @JsonProperty("KeywordsValue")
            protected String keywordsValue;
            @XmlElement(name = "Status")
            @JsonProperty("Status")
            protected int status;
            @XmlElement(name = "Type")
            @JsonProperty("Type")
            protected Integer type;
            //@XmlElementRef(name = "OrderDateFrom", type = JAXBElement.class, required = false)
            @XmlElement(name = "OrderDateFrom", required = false)
            @JsonProperty("OrderDateFrom")
            protected String/*JAXBElement<String>*/ orderDateFrom;
            //@XmlElementRef(name = "OrderDateTo", type = JAXBElement.class, required = false)
            @XmlElement(name = "OrderDateTo", required = false)
            @JsonProperty("OrderDateTo")
            protected String/*JAXBElement<String>*/ orderDateTo;
            //@XmlElementRef(name = "VoidSoon", type = JAXBElement.class, required = false)
            @XmlElement(name = "VoidSoon", required = false)
            @JsonProperty("VoidSoon")
            protected String/*JAXBElement<Integer>*/ voidSoon;
            @XmlElement(name = "OrderDownloaded")
            @JsonProperty("OrderDownloaded")
            protected String orderDownloaded;
            @XmlElement(name = "CountryCode")
            @JsonProperty("CountryCode")
            protected String countryCode;
            @XmlElement(name = "PremierOrder")
            @JsonProperty("PremierOrder")
            protected Integer premierOrder;

            /**
             * 取得 requestType 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRequestType() {
                return requestType;
            }

            /**
             * 設定 requestType 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRequestType(String value) {
                this.requestType = value;
            }

            /**
             * 取得 keywordsType 特性的值.
             * 
             */
            public int getKeywordsType() {
                return keywordsType;
            }

            /**
             * 設定 keywordsType 特性的值.
             * 
             */
            public void setKeywordsType(int value) {
                this.keywordsType = value;
            }

            /**
             * 取得 keywordsValue 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeywordsValue() {
                return keywordsValue;
            }

            /**
             * 設定 keywordsValue 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeywordsValue(String value) {
                this.keywordsValue = value;
            }

            /**
             * 取得 status 特性的值.
             * 
             */
            public int getStatus() {
                return status;
            }

            /**
             * 設定 status 特性的值.
             * 
             */
            public void setStatus(int value) {
                this.status = value;
            }

            /**
             * 取得 type 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getType() {
                return type;
            }

            /**
             * 設定 type 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setType(Integer value) {
                this.type = value;
            }

            /**
             * 取得 orderDateFrom 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public String/*JAXBElement<String>*/ getOrderDateFrom() {
                return orderDateFrom;
            }

            /**
             * 設定 orderDateFrom 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setOrderDateFrom(String/*JAXBElement<String>*/ value) {
                this.orderDateFrom = value;
            }

            /**
             * 取得 orderDateTo 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public String/*JAXBElement<String>*/ getOrderDateTo() {
                return orderDateTo;
            }

            /**
             * 設定 orderDateTo 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setOrderDateTo(String/*JAXBElement<String>*/ value) {
                this.orderDateTo = value;
            }

            /**
             * 取得 voidSoon 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public String/*JAXBElement<Integer>*/ getVoidSoon() {
                return voidSoon;
            }

            /**
             * 設定 voidSoon 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
             *     
             */
            public void setVoidSoon(String/*JAXBElement<Integer>*/ value) {
                this.voidSoon = value;
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
             * 取得 countryCode 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 設定 countryCode 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 取得 premierOrder 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPremierOrder() {
                return premierOrder;
            }

            /**
             * 設定 premierOrder 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPremierOrder(Integer value) {
                this.premierOrder = value;
            }

        }

    }
}
