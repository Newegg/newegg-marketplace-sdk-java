//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 02:59:37 PM CST 
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
 *               &lt;pattern value="ItemChinaTaxSettingReportRequest"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ItemChinaTaxSettingReportCriteria">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="RequestType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="ITEM_CHINATAXSETTING_REPORT"/>
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
public class SItemChinaTaxSettingRequest {

    @XmlElement(name = "IssueUser")
    @JsonProperty("IssueUser")
    protected String issueUser;
    @XmlElement(name = "OperationType", required = true)
    @JsonProperty("OperationType")
    protected String operationType;
    @XmlElement(name = "RequestBody", required = true)
    @JsonProperty("RequestBody")
    protected SItemChinaTaxSettingRequest.RequestBody requestBody;

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
    public SItemChinaTaxSettingRequest.RequestBody getRequestBody() {
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
    public void setRequestBody(SItemChinaTaxSettingRequest.RequestBody value) {
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
     *         &lt;element name="ItemChinaTaxSettingReportCriteria">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="RequestType">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="ITEM_CHINATAXSETTING_REPORT"/>
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
        "itemChinaTaxSettingReportCriteria"
    })
    public static class RequestBody {

        @XmlElement(name = "ItemChinaTaxSettingReportCriteria", required = true)
        @JsonProperty("ItemChinaTaxSettingReportCriteria")
        protected SItemChinaTaxSettingRequest.RequestBody.ItemChinaTaxSettingReportCriteria itemChinaTaxSettingReportCriteria;

        /**
         * 取得 itemChinaTaxSettingReportCriteria 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link NeweggAPIRequest.RequestBody.ItemChinaTaxSettingReportCriteria }
         *     
         */
        public SItemChinaTaxSettingRequest.RequestBody.ItemChinaTaxSettingReportCriteria getItemChinaTaxSettingReportCriteria() {
            return itemChinaTaxSettingReportCriteria;
        }

        /**
         * 設定 itemChinaTaxSettingReportCriteria 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link NeweggAPIRequest.RequestBody.ItemChinaTaxSettingReportCriteria }
         *     
         */
        public void setItemChinaTaxSettingReportCriteria(SItemChinaTaxSettingRequest.RequestBody.ItemChinaTaxSettingReportCriteria value) {
            this.itemChinaTaxSettingReportCriteria = value;
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
         *               &lt;enumeration value="ITEM_CHINATAXSETTING_REPORT"/>
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
        public static class ItemChinaTaxSettingReportCriteria {

            @XmlElement(name = "RequestType", required = true)
            @JsonProperty("RequestType")
            protected String requestType;
            @XmlElement(name = "FileType")
            @JsonProperty("FileType")
            protected String fileType;

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

        }

    }
}
