//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 04:53:54 PM CST 
//
package newegg.marketplace.sdk.report.model.get;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>
 * anonymous complex type 的 Java 類別.
 * 
 * <p>
 * 下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
*PUT https://api.newegg.com/marketplace/reportmgmt/report/result?sellerid={sellerid}
*Authorization: 720ddc067f4d115bd544aff46bc75634
*SecretKey: 21EC2020-3AEA-1069-A2DD-08002B30309D
*Content-Type: application/json
*Accept: application/json
*{
*    "OperationType": "ItemBasicInfoReportRequest",
*    "RequestBody": {
*        "RequestID": "245VV9QOCM6BK"
*    }
*}
 * </pre>
 * 
 * 
 */

public class GetItemBasicInformationReportRequest {

    @JsonProperty("IssueUser")
    protected String issueUser;
    @JsonProperty("OperationType")
    protected String operationType = "ItemBasicInfoReportRequest";
    @JsonProperty("RequestBody")
    protected GetItemBasicInformationReportRequest.RequestBody requestBody;

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
     *     {@link GetItemBasicInformationReportRequest.RequestBody }
     *     
     */
    public GetItemBasicInformationReportRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemBasicInformationReportRequest.RequestBody }
     *     
     */
    public void setRequestBody(GetItemBasicInformationReportRequest.RequestBody value) {
        this.requestBody = value;
    }

    public static class RequestBody {

        @JsonProperty("RequestID")
        protected String requestID;
        @JsonProperty("PageInfo")
        protected GetItemBasicInformationReportRequest.RequestBody.PageInfo pageInfo;

        /**
         * 取得 requestID 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequestID() {
            return requestID;
        }

        /**
         * 設定 requestID 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequestID(String value) {
            this.requestID = value;
        }

        /**
         * 取得 pageInfo 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link GetItemBasicInformationReportRequest.RequestBody.PageInfo }
         *     
         */
        public GetItemBasicInformationReportRequest.RequestBody.PageInfo getPageInfo() {
            return pageInfo;
        }

        /**
         * 設定 pageInfo 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link GetItemBasicInformationReportRequest.RequestBody.PageInfo }
         *     
         */
        public void setPageInfo(GetItemBasicInformationReportRequest.RequestBody.PageInfo value) {
            this.pageInfo = value;
        }
        public static class PageInfo {

            @JsonProperty("PageSize")
            protected Integer pageSize;
            @JsonProperty("PageIndex")
            protected Integer pageIndex;

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

        }

    }
}
