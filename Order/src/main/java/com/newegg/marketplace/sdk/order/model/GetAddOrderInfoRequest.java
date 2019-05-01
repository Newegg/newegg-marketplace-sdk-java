//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.02.22 於 09:47:45 AM CST 
//


package com.newegg.marketplace.sdk.order.model;

import java.util.ArrayList;
import java.util.List;
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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="GetAddOrderInfoRequest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="RequestCriteria">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="OrderNumberList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Status" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="5"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OrderDownloaded" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Type" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="VoidSoon" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="24"/>
 *                                   &lt;enumeration value="48"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
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
public class GetAddOrderInfoRequest {
	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType;
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected GetAddOrderInfoRequest.RequestBody requestBody;

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
    public GetAddOrderInfoRequest.RequestBody getRequestBody() {
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
    public void setRequestBody(GetAddOrderInfoRequest.RequestBody value) {
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
     *       &lt;all>
     *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="RequestCriteria">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="OrderNumberList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Status" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="5"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OrderDownloaded" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Type" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="VoidSoon" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="24"/>
     *                         &lt;enumeration value="48"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                 &lt;/all>
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
    public static class RequestBody {

        @XmlElement(name = "PageIndex")
        @JsonProperty("PageIndex")
        protected Integer pageIndex;
        @XmlElement(name = "PageSize")
        @JsonProperty("PageSize")
        protected Integer pageSize;
        @XmlElement(name = "RequestCriteria", required = true)
        @JsonProperty("RequestCriteria")
        protected GetAddOrderInfoRequest.RequestBody.RequestCriteria requestCriteria;

        /**
         * 取得 pageIndex 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPageIndex() {
            return pageIndex;
        }

        /**
         * 設定 pageIndex 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPageIndex(Integer value) {
            this.pageIndex = value;
        }

        /**
         * 取得 pageSize 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPageSize() {
            return pageSize;
        }

        /**
         * 設定 pageSize 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPageSize(Integer value) {
            this.pageSize = value;
        }

        /**
         * 取得 requestCriteria 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIRequest.RequestBody.RequestCriteria }
         *     
         */
        public GetAddOrderInfoRequest.RequestBody.RequestCriteria getRequestCriteria() {
            return requestCriteria;
        }

        /**
         * 設定 requestCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIRequest.RequestBody.RequestCriteria }
         *     
         */
        public void setRequestCriteria(GetAddOrderInfoRequest.RequestBody.RequestCriteria value) {
            this.requestCriteria = value;
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
         *         &lt;element name="OrderNumberList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Status" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OrderDownloaded" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Type" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="VoidSoon" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="24"/>
         *               &lt;enumeration value="48"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        public static class RequestCriteria {

            @XmlElement(name = "OrderNumberList")
            @JsonProperty("OrderNumberList")
            protected GetAddOrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList orderNumberList;
            @XmlElement(name = "Status")
            @JsonProperty("Status")
            protected Integer status;
            @XmlElement(name = "OrderDownloaded")
            @JsonProperty("OrderDownloaded")
            protected Integer orderDownloaded;
            @XmlElement(name = "Type")
            @JsonProperty("Type")
            protected Integer type;
            @XmlElement(name = "VoidSoon")
            @JsonProperty("VoidSoon")
            protected Integer voidSoon;
            @XmlElement(name = "OrderDateFrom")
            @JsonProperty("OrderDateFrom")
            protected String orderDateFrom;
            @XmlElement(name = "OrderDateTo")
            @JsonProperty("OrderDateTo")
            protected String orderDateTo;
            @XmlElement(name = "CountryCode")
            @JsonProperty("CountryCode")
            protected String countryCode;

            /**
             * 取得 orderNumberList 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link NeweggAPIRequest.RequestBody.RequestCriteria.OrderNumberList }
             *     
             */
            public GetAddOrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList getOrderNumberList() {
                return orderNumberList;
            }

            /**
             * 設定 orderNumberList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link NeweggAPIRequest.RequestBody.RequestCriteria.OrderNumberList }
             *     
             */
            public void setOrderNumberList(GetAddOrderInfoRequest.RequestBody.RequestCriteria.OrderNumberList value) {
                this.orderNumberList = value;
            }

            /**
             * 取得 status 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getStatus() {
                return status;
            }

            /**
             * 設定 status 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setStatus(Integer value) {
                this.status = value;
            }

            /**
             * 取得 orderDownloaded 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOrderDownloaded() {
                return orderDownloaded;
            }

            /**
             * 設定 orderDownloaded 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOrderDownloaded(Integer value) {
                this.orderDownloaded = value;
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
             * 取得 voidSoon 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getVoidSoon() {
                return voidSoon;
            }

            /**
             * 設定 voidSoon 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setVoidSoon(Integer value) {
                this.voidSoon = value;
            }

            /**
             * 取得 orderDateFrom 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderDateFrom() {
                return orderDateFrom;
            }

            /**
             * 設定 orderDateFrom 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderDateFrom(String value) {
                this.orderDateFrom = value;
            }

            /**
             * 取得 orderDateTo 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderDateTo() {
                return orderDateTo;
            }

            /**
             * 設定 orderDateTo 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderDateTo(String value) {
                this.orderDateTo = value;
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
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
                "orderNumber"
            })
            public static class OrderNumberList {

                @XmlElement(name = "OrderNumber", type = Integer.class)
                @JsonProperty("OrderNumber")
                protected List<Integer> orderNumber;

                /**
                 * Gets the value of the orderNumber property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the orderNumber property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOrderNumber().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
                 * 
                 * 
                 */
                public List<Integer> getOrderNumber() {
                    if (orderNumber == null) {
                        orderNumber = new ArrayList<Integer>();
                    }
                    return this.orderNumber;
                }

            }

        }

    }
}
