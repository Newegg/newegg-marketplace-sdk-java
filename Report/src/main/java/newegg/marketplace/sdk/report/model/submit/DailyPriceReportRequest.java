//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 01:40:46 PM CST 
//
package newegg.marketplace.sdk.report.model.submit;


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
 *               &lt;pattern value="InternationalPriceReportRequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DailyPriceReportCriteria"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="RequestType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FileType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="CSV"/&gt;
 *                                   &lt;enumeration value="XLS"/&gt;
 *                                   &lt;enumeration value="TXT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="CountryList" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="CountryCode" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;enumeration value="AUS"/&gt;
 *                                             &lt;enumeration value="NZL"/&gt;
 *                                             &lt;enumeration value="GBR"/&gt;
 *                                             &lt;enumeration value="IRL"/&gt;
 *                                             &lt;enumeration value="NLD"/&gt;
 *                                             &lt;enumeration value="POL"/&gt;
 *                                             &lt;enumeration value="IND"/&gt;
 *                                             &lt;enumeration value="SGP"/&gt;
 *                                             &lt;enumeration value="USA"/&gt;
 *                                             &lt;enumeration value="HKG"/&gt;
 *                                             &lt;enumeration value="MAC"/&gt;
 *                                             &lt;enumeration value="IDN"/&gt;
 *                                             &lt;enumeration value="PHL"/&gt;
 *                                             &lt;enumeration value="KOR"/&gt;
 *                                             &lt;enumeration value="THA"/&gt;
 *                                             &lt;enumeration value="BRA"/&gt;
 *                                             &lt;enumeration value="CHL"/&gt;
 *                                             &lt;enumeration value="COL"/&gt;
 *                                             &lt;enumeration value="CRI"/&gt;
 *                                             &lt;enumeration value="DOM"/&gt;
 *                                             &lt;enumeration value="ECU"/&gt;
 *                                             &lt;enumeration value="SLV"/&gt;
 *                                             &lt;enumeration value="GTM"/&gt;
 *                                             &lt;enumeration value="HND"/&gt;
 *                                             &lt;enumeration value="JAM"/&gt;
 *                                             &lt;enumeration value="MEX"/&gt;
 *                                             &lt;enumeration value="NIC"/&gt;
 *                                             &lt;enumeration value="PAN"/&gt;
 *                                             &lt;enumeration value="ISR"/&gt;
 *                                             &lt;enumeration value="SAU"/&gt;
 *                                             &lt;enumeration value="TUR"/&gt;
 *                                             &lt;enumeration value="ARE"/&gt;
 *                                             &lt;enumeration value="AUT"/&gt;
 *                                             &lt;enumeration value="BEL"/&gt;
 *                                             &lt;enumeration value="BGR"/&gt;
 *                                             &lt;enumeration value="DNK"/&gt;
 *                                             &lt;enumeration value="FIN"/&gt;
 *                                             &lt;enumeration value="FRA"/&gt;
 *                                             &lt;enumeration value="DEU"/&gt;
 *                                             &lt;enumeration value="GRC"/&gt;
 *                                             &lt;enumeration value="HUN"/&gt;
 *                                             &lt;enumeration value="ITA"/&gt;
 *                                             &lt;enumeration value="LVA"/&gt;
 *                                             &lt;enumeration value="LUX"/&gt;
 *                                             &lt;enumeration value="MCO"/&gt;
 *                                             &lt;enumeration value="NOR"/&gt;
 *                                             &lt;enumeration value="PRT"/&gt;
 *                                             &lt;enumeration value="SVK"/&gt;
 *                                             &lt;enumeration value="SVN"/&gt;
 *                                             &lt;enumeration value="ESP"/&gt;
 *                                             &lt;enumeration value="SWE"/&gt;
 *                                             &lt;enumeration value="CHE"/&gt;
 *                                             &lt;enumeration value="CHN"/&gt;
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
@XmlRootElement(name = "NeweggAPIRequest")
public class DailyPriceReportRequest {

    @XmlElement(name = "IssueUser")
    @JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", defaultValue = "InternationalPriceReportRequest", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "InternationalPriceReportRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected DailyPriceReportRequest.RequestBody requestBody;

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
     *     {@link DailyPriceReportRequest.RequestBody }
     *     
     */
    public DailyPriceReportRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyPriceReportRequest.RequestBody }
     *     
     */
    public void setRequestBody(DailyPriceReportRequest.RequestBody value) {
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
     *         &lt;element name="DailyPriceReportCriteria"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="RequestType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FileType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="CSV"/&gt;
     *                         &lt;enumeration value="XLS"/&gt;
     *                         &lt;enumeration value="TXT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="CountryList" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="CountryCode" maxOccurs="unbounded"&gt;
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
    @XmlType(name = "", propOrder = {
        "dailyPriceReportCriteria"
    })
    public static class RequestBody {

        @XmlElement(name = "DailyPriceReportCriteria", required = true)
        @JsonProperty("DailyPriceReportCriteria")
        protected DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria dailyPriceReportCriteria;

        /**
         * 取得 dailyPriceReportCriteria 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria }
         *     
         */
        public DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria getDailyPriceReportCriteria() {
            return dailyPriceReportCriteria;
        }

        /**
         * 設定 dailyPriceReportCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria }
         *     
         */
        public void setDailyPriceReportCriteria(DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria value) {
            this.dailyPriceReportCriteria = value;
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
         *               &lt;enumeration value="INTERNATIONAL_PRICE_REPORT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FileType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="CSV"/&gt;
         *               &lt;enumeration value="XLS"/&gt;
         *               &lt;enumeration value="TXT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="CountryList" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="CountryCode" maxOccurs="unbounded"&gt;
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
        public static class DailyPriceReportCriteria {

            @XmlElement(name = "RequestType", required = true)
            @JsonProperty("RequestType")
            protected String requestType = "INTERNATIONAL_PRICE_REPORT";
            @XmlElement(name = "FileType")
            @JsonProperty("FileType")
            protected String fileType;
            @XmlElement(name = "CountryList")
            @JsonProperty("CountryList")
            protected DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList countryList;

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
             *     {@link DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList }
             *     
             */
            public DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList getCountryList() {
                return countryList;
            }

            /**
             * 設定 countryList 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList }
             *     
             */
            public void setCountryList(DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList value) {
                this.countryList = value;
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
             *         &lt;element name="CountryCode" maxOccurs="unbounded"&gt;
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
                 * @return
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
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
