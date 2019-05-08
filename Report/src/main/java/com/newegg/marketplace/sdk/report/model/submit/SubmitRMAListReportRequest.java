//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 10:31:27 AM CST 
//
package com.newegg.marketplace.sdk.report.model.submit;


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
 *               &lt;pattern value="RMAListReportRequest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RMAListReportCriteria">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="RequestType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="RMA_LIST_REPORT"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="KeywordsType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Status" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="5"/>
 *                                   &lt;enumeration value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="RMADateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RMADateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RMAType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ProcessedBy" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
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
public class SubmitRMAListReportRequest {

    @XmlElement(name = "IssueUser")
    @JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", defaultValue = "RMAListReportRequest", required = true)
    @JsonProperty("OperationType")
    protected String operationType = "RMAListReportRequest";
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected SubmitRMAListReportRequest.RequestBody requestBody;

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
    public SubmitRMAListReportRequest.RequestBody getRequestBody() {
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
    public void setRequestBody(SubmitRMAListReportRequest.RequestBody value) {
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
     *         &lt;element name="RMAListReportCriteria">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="RequestType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="RMA_LIST_REPORT"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="KeywordsType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Status" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="5"/>
     *                         &lt;enumeration value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="RMADateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RMADateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RMAType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ProcessedBy" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
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
    	"rmaListReportCriteria"
    })
    public static class RequestBody {

        @XmlElement(name = "RMAListReportCriteria", required = true)
        //@JsonProperty("RMAListReportCriteria")
        protected SubmitRMAListReportRequest.RequestBody.RMAListReportCriteria rmaListReportCriteria;

        /**
         * 取得 rmaListReportCriteria 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIRequest.RequestBody.RMAListReportCriteria }
         *     
         */
        public SubmitRMAListReportRequest.RequestBody.RMAListReportCriteria getRMAListReportCriteria() {
            return rmaListReportCriteria;
        }

        /**
         * 設定 rmaListReportCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIRequest.RequestBody.RMAListReportCriteria }
         *     
         */
        @JsonProperty("RMAListReportCriteria")
        public void setRMAListReportCriteria(SubmitRMAListReportRequest.RequestBody.RMAListReportCriteria value) {
            this.rmaListReportCriteria = value;
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
         *               &lt;enumeration value="RMA_LIST_REPORT"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="KeywordsType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="KeywordsValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Status" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="RMADateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RMADateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RMAType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ProcessedBy" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
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
        		"requestType", "keywordsType", "keywordsValue", "status", "rmaDateFrom", "rmaDateTo", "rmaType", "processedBy"
        })
        public static class RMAListReportCriteria {

            @XmlElement(name = "RequestType", required = true)
            @JsonProperty("RequestType")
            protected String requestType = "RMA_LIST_REPORT";
            @XmlElement(name = "KeywordsType")
            @JsonProperty("KeywordsType")
            protected Integer keywordsType;
            @XmlElement(name = "KeywordsValue")
            @JsonProperty("KeywordsValue")
            protected String keywordsValue;
            @XmlElement(name = "Status")
            @JsonProperty("Status")
            protected Integer status;
            @XmlElement(name = "RMADateFrom", required = true)
            //@JsonProperty("RMADateFrom")
            protected String rmaDateFrom;
            @XmlElement(name = "RMADateTo", required = true)
            //@JsonProperty("RMADateTo")
            protected String rmaDateTo;
            @XmlElement(name = "RMAType")
            //@JsonProperty("RMAType")
            protected Integer rmaType;
            @XmlElement(name = "ProcessedBy")
            @JsonProperty("ProcessedBy")
            protected Integer processedBy;

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
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getKeywordsType() {
                return keywordsType;
            }

            /**
             * 設定 keywordsType 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setKeywordsType(Integer value) {
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
             * 取得 rmaDateFrom 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRMADateFrom() {
                return rmaDateFrom;
            }

            /**
             * 設定 rmaDateFrom 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @JsonProperty("RMADateFrom")
            public void setRMADateFrom(String value) {
                this.rmaDateFrom = value;
            }

            /**
             * 取得 rmaDateTo 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRMADateTo() {
                return rmaDateTo;
            }

            /**
             * 設定 rmaDateTo 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @JsonProperty("RMADateTo")
            public void setRMADateTo(String value) {
                this.rmaDateTo = value;
            }

            /**
             * 取得 rmaType 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRMAType() {
                return rmaType;
            }

            /**
             * 設定 rmaType 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            @JsonProperty("RMAType")
            public void setRMAType(Integer value) {
                this.rmaType = value;
            }

            /**
             * 取得 processedBy 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getProcessedBy() {
                return processedBy;
            }

            /**
             * 設定 processedBy 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setProcessedBy(Integer value) {
                this.processedBy = value;
            }

        }

    }
}
