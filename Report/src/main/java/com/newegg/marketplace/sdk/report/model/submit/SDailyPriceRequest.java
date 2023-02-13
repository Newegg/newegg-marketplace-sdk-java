//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 01:40:46 PM CST 
//
package com.newegg.marketplace.sdk.report.model.submit;


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
 *               &lt;pattern value="InternationalPriceReportRequest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DailyPriceReportCriteria">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="RequestType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FileType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="CSV"/>
 *                                   &lt;enumeration value="XLS"/>
 *                                   &lt;enumeration value="TXT"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CountryList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CountryCode" maxOccurs="unbounded">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="AUS"/>
 *                                             &lt;enumeration value="NZL"/>
 *                                             &lt;enumeration value="GBR"/>
 *                                             &lt;enumeration value="IRL"/>
 *                                             &lt;enumeration value="NLD"/>
 *                                             &lt;enumeration value="POL"/>
 *                                             &lt;enumeration value="IND"/>
 *                                             &lt;enumeration value="SGP"/>
 *                                             &lt;enumeration value="USA"/>
 *                                             &lt;enumeration value="HKG"/>
 *                                             &lt;enumeration value="MAC"/>
 *                                             &lt;enumeration value="IDN"/>
 *                                             &lt;enumeration value="PHL"/>
 *                                             &lt;enumeration value="KOR"/>
 *                                             &lt;enumeration value="THA"/>
 *                                             &lt;enumeration value="BRA"/>
 *                                             &lt;enumeration value="CHL"/>
 *                                             &lt;enumeration value="COL"/>
 *                                             &lt;enumeration value="CRI"/>
 *                                             &lt;enumeration value="DOM"/>
 *                                             &lt;enumeration value="ECU"/>
 *                                             &lt;enumeration value="SLV"/>
 *                                             &lt;enumeration value="GTM"/>
 *                                             &lt;enumeration value="HND"/>
 *                                             &lt;enumeration value="JAM"/>
 *                                             &lt;enumeration value="MEX"/>
 *                                             &lt;enumeration value="NIC"/>
 *                                             &lt;enumeration value="PAN"/>
 *                                             &lt;enumeration value="ISR"/>
 *                                             &lt;enumeration value="SAU"/>
 *                                             &lt;enumeration value="TUR"/>
 *                                             &lt;enumeration value="ARE"/>
 *                                             &lt;enumeration value="AUT"/>
 *                                             &lt;enumeration value="BEL"/>
 *                                             &lt;enumeration value="BGR"/>
 *                                             &lt;enumeration value="DNK"/>
 *                                             &lt;enumeration value="FIN"/>
 *                                             &lt;enumeration value="FRA"/>
 *                                             &lt;enumeration value="DEU"/>
 *                                             &lt;enumeration value="GRC"/>
 *                                             &lt;enumeration value="HUN"/>
 *                                             &lt;enumeration value="ITA"/>
 *                                             &lt;enumeration value="LVA"/>
 *                                             &lt;enumeration value="LUX"/>
 *                                             &lt;enumeration value="MCO"/>
 *                                             &lt;enumeration value="NOR"/>
 *                                             &lt;enumeration value="PRT"/>
 *                                             &lt;enumeration value="SVK"/>
 *                                             &lt;enumeration value="SVN"/>
 *                                             &lt;enumeration value="ESP"/>
 *                                             &lt;enumeration value="SWE"/>
 *                                             &lt;enumeration value="CHE"/>
 *                                             &lt;enumeration value="CHN"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
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
public class SDailyPriceRequest {

    @XmlElement(name = "IssueUser")
    @JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType;
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected SDailyPriceRequest.RequestBody requestBody;

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
    public SDailyPriceRequest.RequestBody getRequestBody() {
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
    public void setRequestBody(SDailyPriceRequest.RequestBody value) {
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
     *         &lt;element name="DailyPriceReportCriteria">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="RequestType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FileType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="CSV"/>
     *                         &lt;enumeration value="XLS"/>
     *                         &lt;enumeration value="TXT"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CountryList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CountryCode" maxOccurs="unbounded">
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
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
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
        "dailyPriceReportCriteria"
    })
    public static class RequestBody {

        @XmlElement(name = "DailyPriceReportCriteria", required = true)
        @JsonProperty("DailyPriceReportCriteria")
        protected SDailyPriceRequest.RequestBody.DailyPriceReportCriteria dailyPriceReportCriteria;

        /**
         * 取得 dailyPriceReportCriteria 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIRequest.RequestBody.DailyPriceReportCriteria }
         *     
         */
        public SDailyPriceRequest.RequestBody.DailyPriceReportCriteria getDailyPriceReportCriteria() {
            return dailyPriceReportCriteria;
        }

        /**
         * 設定 dailyPriceReportCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIRequest.RequestBody.DailyPriceReportCriteria }
         *     
         */
        public void setDailyPriceReportCriteria(SDailyPriceRequest.RequestBody.DailyPriceReportCriteria value) {
            this.dailyPriceReportCriteria = value;
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
         *               &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FileType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="CSV"/>
         *               &lt;enumeration value="XLS"/>
         *               &lt;enumeration value="TXT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CountryList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CountryCode" maxOccurs="unbounded">
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
        public static class DailyPriceReportCriteria {

            @XmlElement(name = "RequestType", required = true)
            @JsonProperty("RequestType")
            protected String requestType;
            @XmlElement(name = "FileType")
            @JsonProperty("FileType")
            protected String fileType;
            @XmlElement(name = "CountryList")
            @JsonProperty("CountryList")
            protected SDailyPriceRequest.RequestBody.DailyPriceReportCriteria.CountryList countryList;

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
             * 取得 fileType 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileType() {
                return fileType;
            }

            /**
             * 設定 fileType 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileType(String value) {
                this.fileType = value;
            }

            /**
             * 取得 countryList 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link NeweggAPIRequest.RequestBody.DailyPriceReportCriteria.CountryList }
             *     
             */
            public SDailyPriceRequest.RequestBody.DailyPriceReportCriteria.CountryList getCountryList() {
                return countryList;
            }

            /**
             * 設定 countryList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link NeweggAPIRequest.RequestBody.DailyPriceReportCriteria.CountryList }
             *     
             */
            public void setCountryList(SDailyPriceRequest.RequestBody.DailyPriceReportCriteria.CountryList value) {
                this.countryList = value;
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
             *         &lt;element name="CountryCode" maxOccurs="unbounded">
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
                "countryCode"
            })
            public static class CountryList {

                @XmlElement(name = "CountryCode", required = true)
                @JsonProperty("CountryCode")
                protected List<String> countryCode;

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the countryCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCountryCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getCountryCode() {
                    if (countryCode == null) {
                        countryCode = new ArrayList<String>();
                    }
                    return this.countryCode;
                }

            }

        }

    }
}
