//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.05 於 05:09:49 PM CST 
//
package newegg.marketplace.sdk.report.model.submit;


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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="OrderListReportRequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OrderReportCriteria"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RequestType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="KeywordsType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="9"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Status"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="4"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Type" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="3"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VoidSoon" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;enumeration value="24"/&gt;
 *                                   &lt;enumeration value="48"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="OrderDownloaded" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="true"/&gt;
 *                                   &lt;enumeration value="false"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
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
 *                             &lt;element name="PremierOrder" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                                   &lt;minInclusive value="0"/&gt;
 *                                   &lt;maxInclusive value="2"/&gt;
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
     *     {@link SubmitOrderListReportRequest.RequestBody }
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
     *     {@link SubmitOrderListReportRequest.RequestBody }
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OrderReportCriteria"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="RequestType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="KeywordsType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="9"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Status"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="4"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Type" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="3"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VoidSoon" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;enumeration value="24"/&gt;
     *                         &lt;enumeration value="48"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="OrderDownloaded" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="true"/&gt;
     *                         &lt;enumeration value="false"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
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
     *                   &lt;element name="PremierOrder" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *                         &lt;minInclusive value="0"/&gt;
     *                         &lt;maxInclusive value="2"/&gt;
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
         *     {@link SubmitOrderListReportRequest.RequestBody.OrderReportCriteria }
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
         *     {@link SubmitOrderListReportRequest.RequestBody.OrderReportCriteria }
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="RequestType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="ORDER_LIST_REPORT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="KeywordsType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="9"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Status"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="4"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Type" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="3"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrderDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OrderDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VoidSoon" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;enumeration value="24"/&gt;
         *               &lt;enumeration value="48"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="OrderDownloaded" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="true"/&gt;
         *               &lt;enumeration value="false"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
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
         *         &lt;element name="PremierOrder" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
         *               &lt;minInclusive value="0"/&gt;
         *               &lt;maxInclusive value="2"/&gt;
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
             * @return
             * possible object is 
             *     {@link int }
             * 
             */
            public int getKeywordsType() {
                return keywordsType;
            }

            /**
             * 設定 keywordsType 特性的值.
             * @param value
             *     allowed object is
             *     {@link  }
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
             * @return
             * possible object is 
             *     {@link int }
             * 
             */
            public int getStatus() {
                return status;
            }

            /**
             * 設定 status 特性的值.
             * @param value
             *     allowed object is
             *     {@link  }
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
