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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="GetAddOrderInfoRequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="RequestCriteria"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="OrderNumberList" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence minOccurs="0"&gt;
 *                                       &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Status" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                   &lt;enumeration value="4"/&gt;
 *                                   &lt;enumeration value="5"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OrderDownloaded" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Type" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="0"/&gt;
 *                                   &lt;enumeration value="1"/&gt;
 *                                   &lt;enumeration value="2"/&gt;
 *                                   &lt;enumeration value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="VoidSoon" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="24"/&gt;
 *                                   &lt;enumeration value="48"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CountryCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="AUS"/&gt;
 *                                   &lt;enumeration value="NZL"/&gt;
 *                                   &lt;enumeration value="GBR"/&gt;
 *                                   &lt;enumeration value="IRL"/&gt;
 *                                   &lt;enumeration value="NLD"/&gt;
 *                                   &lt;enumeration value="POL"/&gt;
 *                                   &lt;enumeration value="IND"/&gt;
 *                                   &lt;enumeration value="SGP"/&gt;
 *                                   &lt;enumeration value="USA"/&gt;
 *                                   &lt;enumeration value="HKG"/&gt;
 *                                   &lt;enumeration value="MAC"/&gt;
 *                                   &lt;enumeration value="IDN"/&gt;
 *                                   &lt;enumeration value="PHL"/&gt;
 *                                   &lt;enumeration value="KOR"/&gt;
 *                                   &lt;enumeration value="THA"/&gt;
 *                                   &lt;enumeration value="BRA"/&gt;
 *                                   &lt;enumeration value="CHL"/&gt;
 *                                   &lt;enumeration value="COL"/&gt;
 *                                   &lt;enumeration value="CRI"/&gt;
 *                                   &lt;enumeration value="DOM"/&gt;
 *                                   &lt;enumeration value="ECU"/&gt;
 *                                   &lt;enumeration value="SLV"/&gt;
 *                                   &lt;enumeration value="GTM"/&gt;
 *                                   &lt;enumeration value="HND"/&gt;
 *                                   &lt;enumeration value="JAM"/&gt;
 *                                   &lt;enumeration value="MEX"/&gt;
 *                                   &lt;enumeration value="NIC"/&gt;
 *                                   &lt;enumeration value="PAN"/&gt;
 *                                   &lt;enumeration value="ISR"/&gt;
 *                                   &lt;enumeration value="SAU"/&gt;
 *                                   &lt;enumeration value="TUR"/&gt;
 *                                   &lt;enumeration value="ARE"/&gt;
 *                                   &lt;enumeration value="AUT"/&gt;
 *                                   &lt;enumeration value="BEL"/&gt;
 *                                   &lt;enumeration value="BGR"/&gt;
 *                                   &lt;enumeration value="DNK"/&gt;
 *                                   &lt;enumeration value="FIN"/&gt;
 *                                   &lt;enumeration value="FRA"/&gt;
 *                                   &lt;enumeration value="DEU"/&gt;
 *                                   &lt;enumeration value="GRC"/&gt;
 *                                   &lt;enumeration value="HUN"/&gt;
 *                                   &lt;enumeration value="ITA"/&gt;
 *                                   &lt;enumeration value="LVA"/&gt;
 *                                   &lt;enumeration value="LUX"/&gt;
 *                                   &lt;enumeration value="MCO"/&gt;
 *                                   &lt;enumeration value="NOR"/&gt;
 *                                   &lt;enumeration value="PRT"/&gt;
 *                                   &lt;enumeration value="SVK"/&gt;
 *                                   &lt;enumeration value="SVN"/&gt;
 *                                   &lt;enumeration value="ESP"/&gt;
 *                                   &lt;enumeration value="SWE"/&gt;
 *                                   &lt;enumeration value="CHE"/&gt;
 *                                   &lt;enumeration value="CHN"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
@XmlRootElement(name = "NeweggAPIRequest")
public class GetAdditionalOrderInformationRequest {
	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", defaultValue = "GetAddOrderInfoRequest", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "GetAddOrderInfoRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected GetAdditionalOrderInformationRequest.RequestBody requestBody;

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
     *     {@link GetAdditionalOrderInformationRequest.RequestBody }
     *     
     */
    public GetAdditionalOrderInformationRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAdditionalOrderInformationRequest.RequestBody }
     *     
     */
    public void setRequestBody(GetAdditionalOrderInformationRequest.RequestBody value) {
        this.requestBody = value;
    }


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
     *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="RequestCriteria"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="OrderNumberList" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence minOccurs="0"&gt;
     *                             &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Status" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                         &lt;enumeration value="4"/&gt;
     *                         &lt;enumeration value="5"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OrderDownloaded" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Type" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="0"/&gt;
     *                         &lt;enumeration value="1"/&gt;
     *                         &lt;enumeration value="2"/&gt;
     *                         &lt;enumeration value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="VoidSoon" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="24"/&gt;
     *                         &lt;enumeration value="48"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CountryCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="AUS"/&gt;
     *                         &lt;enumeration value="NZL"/&gt;
     *                         &lt;enumeration value="GBR"/&gt;
     *                         &lt;enumeration value="IRL"/&gt;
     *                         &lt;enumeration value="NLD"/&gt;
     *                         &lt;enumeration value="POL"/&gt;
     *                         &lt;enumeration value="IND"/&gt;
     *                         &lt;enumeration value="SGP"/&gt;
     *                         &lt;enumeration value="USA"/&gt;
     *                         &lt;enumeration value="HKG"/&gt;
     *                         &lt;enumeration value="MAC"/&gt;
     *                         &lt;enumeration value="IDN"/&gt;
     *                         &lt;enumeration value="PHL"/&gt;
     *                         &lt;enumeration value="KOR"/&gt;
     *                         &lt;enumeration value="THA"/&gt;
     *                         &lt;enumeration value="BRA"/&gt;
     *                         &lt;enumeration value="CHL"/&gt;
     *                         &lt;enumeration value="COL"/&gt;
     *                         &lt;enumeration value="CRI"/&gt;
     *                         &lt;enumeration value="DOM"/&gt;
     *                         &lt;enumeration value="ECU"/&gt;
     *                         &lt;enumeration value="SLV"/&gt;
     *                         &lt;enumeration value="GTM"/&gt;
     *                         &lt;enumeration value="HND"/&gt;
     *                         &lt;enumeration value="JAM"/&gt;
     *                         &lt;enumeration value="MEX"/&gt;
     *                         &lt;enumeration value="NIC"/&gt;
     *                         &lt;enumeration value="PAN"/&gt;
     *                         &lt;enumeration value="ISR"/&gt;
     *                         &lt;enumeration value="SAU"/&gt;
     *                         &lt;enumeration value="TUR"/&gt;
     *                         &lt;enumeration value="ARE"/&gt;
     *                         &lt;enumeration value="AUT"/&gt;
     *                         &lt;enumeration value="BEL"/&gt;
     *                         &lt;enumeration value="BGR"/&gt;
     *                         &lt;enumeration value="DNK"/&gt;
     *                         &lt;enumeration value="FIN"/&gt;
     *                         &lt;enumeration value="FRA"/&gt;
     *                         &lt;enumeration value="DEU"/&gt;
     *                         &lt;enumeration value="GRC"/&gt;
     *                         &lt;enumeration value="HUN"/&gt;
     *                         &lt;enumeration value="ITA"/&gt;
     *                         &lt;enumeration value="LVA"/&gt;
     *                         &lt;enumeration value="LUX"/&gt;
     *                         &lt;enumeration value="MCO"/&gt;
     *                         &lt;enumeration value="NOR"/&gt;
     *                         &lt;enumeration value="PRT"/&gt;
     *                         &lt;enumeration value="SVK"/&gt;
     *                         &lt;enumeration value="SVN"/&gt;
     *                         &lt;enumeration value="ESP"/&gt;
     *                         &lt;enumeration value="SWE"/&gt;
     *                         &lt;enumeration value="CHE"/&gt;
     *                         &lt;enumeration value="CHN"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
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
    public static class RequestBody {

        @XmlElement(name = "PageIndex")
        @JsonProperty("PageIndex")
        protected Integer pageIndex;
        @XmlElement(name = "PageSize")
        @JsonProperty("PageSize")
        protected Integer pageSize;
        @XmlElement(name = "RequestCriteria", required = true)
        @JsonProperty("RequestCriteria")
        protected GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria requestCriteria;

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
         *     {@link GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria }
         *     
         */
        public GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria getRequestCriteria() {
            return requestCriteria;
        }

        /**
         * 設定 requestCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria }
         *     
         */
        public void setRequestCriteria(GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria value) {
            this.requestCriteria = value;
        }


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
         *         &lt;element name="OrderNumberList" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence minOccurs="0"&gt;
         *                   &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Status" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *               &lt;enumeration value="4"/&gt;
         *               &lt;enumeration value="5"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrderDownloaded" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Type" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="0"/&gt;
         *               &lt;enumeration value="1"/&gt;
         *               &lt;enumeration value="2"/&gt;
         *               &lt;enumeration value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="VoidSoon" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="24"/&gt;
         *               &lt;enumeration value="48"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CountryCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="AUS"/&gt;
         *               &lt;enumeration value="NZL"/&gt;
         *               &lt;enumeration value="GBR"/&gt;
         *               &lt;enumeration value="IRL"/&gt;
         *               &lt;enumeration value="NLD"/&gt;
         *               &lt;enumeration value="POL"/&gt;
         *               &lt;enumeration value="IND"/&gt;
         *               &lt;enumeration value="SGP"/&gt;
         *               &lt;enumeration value="USA"/&gt;
         *               &lt;enumeration value="HKG"/&gt;
         *               &lt;enumeration value="MAC"/&gt;
         *               &lt;enumeration value="IDN"/&gt;
         *               &lt;enumeration value="PHL"/&gt;
         *               &lt;enumeration value="KOR"/&gt;
         *               &lt;enumeration value="THA"/&gt;
         *               &lt;enumeration value="BRA"/&gt;
         *               &lt;enumeration value="CHL"/&gt;
         *               &lt;enumeration value="COL"/&gt;
         *               &lt;enumeration value="CRI"/&gt;
         *               &lt;enumeration value="DOM"/&gt;
         *               &lt;enumeration value="ECU"/&gt;
         *               &lt;enumeration value="SLV"/&gt;
         *               &lt;enumeration value="GTM"/&gt;
         *               &lt;enumeration value="HND"/&gt;
         *               &lt;enumeration value="JAM"/&gt;
         *               &lt;enumeration value="MEX"/&gt;
         *               &lt;enumeration value="NIC"/&gt;
         *               &lt;enumeration value="PAN"/&gt;
         *               &lt;enumeration value="ISR"/&gt;
         *               &lt;enumeration value="SAU"/&gt;
         *               &lt;enumeration value="TUR"/&gt;
         *               &lt;enumeration value="ARE"/&gt;
         *               &lt;enumeration value="AUT"/&gt;
         *               &lt;enumeration value="BEL"/&gt;
         *               &lt;enumeration value="BGR"/&gt;
         *               &lt;enumeration value="DNK"/&gt;
         *               &lt;enumeration value="FIN"/&gt;
         *               &lt;enumeration value="FRA"/&gt;
         *               &lt;enumeration value="DEU"/&gt;
         *               &lt;enumeration value="GRC"/&gt;
         *               &lt;enumeration value="HUN"/&gt;
         *               &lt;enumeration value="ITA"/&gt;
         *               &lt;enumeration value="LVA"/&gt;
         *               &lt;enumeration value="LUX"/&gt;
         *               &lt;enumeration value="MCO"/&gt;
         *               &lt;enumeration value="NOR"/&gt;
         *               &lt;enumeration value="PRT"/&gt;
         *               &lt;enumeration value="SVK"/&gt;
         *               &lt;enumeration value="SVN"/&gt;
         *               &lt;enumeration value="ESP"/&gt;
         *               &lt;enumeration value="SWE"/&gt;
         *               &lt;enumeration value="CHE"/&gt;
         *               &lt;enumeration value="CHN"/&gt;
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
        public static class RequestCriteria {

            @XmlElement(name = "OrderNumberList")
            @JsonProperty("OrderNumberList")
            protected GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList orderNumberList;
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
             *     {@link GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList }
             *     
             */
            public GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList getOrderNumberList() {
                return orderNumberList;
            }

            /**
             * 設定 orderNumberList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList }
             *     
             */
            public void setOrderNumberList(GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria.OrderNumberList value) {
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
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence minOccurs="0"&gt;
             *         &lt;element name="OrderNumber" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
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
                 * @return
                 * Objects of the following type(s) are allowed in the list
                 * {@link Integer }
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
