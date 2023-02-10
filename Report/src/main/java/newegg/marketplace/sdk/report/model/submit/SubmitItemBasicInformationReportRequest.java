//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 01:40:46 PM CST 
//
package newegg.marketplace.sdk.report.model.submit;


import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>anonymous complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * {
  * "OperationType": "ItemBasicInfoReportRequest",
   *"RequestBody": {
    * "ItemBasicInfoReportCriteria": {
     *  "RequestType": "ITEM_BASIC_INFO_REPORT",
      * "Status": 2,
       *"FileType": "XLS"
     *}
   *}
 *}
 * </pre>
 * 
 * 
 */
public class SubmitItemBasicInformationReportRequest {

    @JsonProperty("IssueUser")
    protected String issueUser;
    @JsonProperty("OperationType")
    protected String operationType = "ItemBasicInfoReportRequest";
    @JsonProperty("RequestBody")
    protected SubmitItemBasicInformationReportRequest.RequestBody requestBody;

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
     *     {@link SubmitItemBasicInformationReportRequest.RequestBody }
     *     
     */
    public SubmitItemBasicInformationReportRequest.RequestBody getRequestBody() {
        return requestBody;
    }

    /**
     * 設定 requestBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitItemBasicInformationReportRequest.RequestBody }
     *     
     */
    public void setRequestBody(SubmitItemBasicInformationReportRequest.RequestBody value) {
        this.requestBody = value;
    }


    public static class RequestBody {

        @JsonProperty("ItemBasicInfoReportCriteria")
        protected SubmitItemBasicInformationReportRequest.RequestBody.ItemBasicInfoReportCriteria itemBasicInfoReportCriteria;

    	
    	public static class ItemBasicInfoReportCriteria{
    		@JsonProperty("RequestType")
    		 private String requestType="ITEM_BASIC_INFO_REPORT";
    		@JsonProperty("Status")
    		 private int status;
    		@JsonProperty("FileType")
    		 private String fileType;
			public String getRequestType() {
				return requestType;
			}
			public void setRequestType(String requestType) {
				this.requestType = requestType;
			}
			public int getStatus() {
				return status;
			}
			public void setStatus(int status) {
				this.status = status;
			}
			public String getFileType() {
				return fileType;
			}
			public void setFileType(String fileType) {
				this.fileType = fileType;
			}
			
    	}


		public SubmitItemBasicInformationReportRequest.RequestBody.ItemBasicInfoReportCriteria getItemBasicInfoReportCriteria() {
			return itemBasicInfoReportCriteria;
		}


		public void setItemBasicInfoReportCriteria(
				SubmitItemBasicInformationReportRequest.RequestBody.ItemBasicInfoReportCriteria itemBasicInfoReportCriteria) {
			this.itemBasicInfoReportCriteria = itemBasicInfoReportCriteria;
		}
    

    }
}
