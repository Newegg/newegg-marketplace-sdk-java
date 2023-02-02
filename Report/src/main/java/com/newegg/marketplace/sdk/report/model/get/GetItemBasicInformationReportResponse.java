//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.04 於 04:55:42 PM CST 
//
package com.newegg.marketplace.sdk.report.model.get;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * <p>
 * anonymous complex type 的 Java 類別.
 * 
 * <p>
 * 下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * {
*  "NeweggAPIResponse": {
*    "IsSuccess": "true",
*    "sellerID": "A006",
*    "OperationType": "ItemBasicInfoReportResponse",
*    "ResponseBody": {
*      "RequestID": "245VV9QOCM6BK",
*      "RequestType": "ITEM_BASIC_INFO_REPORT",
*      "RequestDate": "2/21/2012 15:32:57",
*      "ReportFileURL": "ftp://KUXTMPPH:01250442@mktpftp.newegg.com/ApiItemBaseInfoReport_245VV9QOCM6BK.zip"
*    },
*    "Memo": null
*  }
*}
 * </pre>
 * 
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetItemBasicInformationReportResponse {
	@JsonProperty("NeweggAPIResponse")
	protected NeweggAPIResponse neweggAPIResponse;

	public static class  NeweggAPIResponse{
		@JsonProperty("IsSuccess")
		protected String isSuccess;
		@JsonProperty("sellerID")
		protected String sellerID;
		@JsonProperty("OperationType")
		protected String operationType = "ItemBasicInfoReportResponse";
		@JsonProperty("ResponseBody")
		protected GetItemBasicInformationReportResponse.ResponseBody responseBody;
		@JsonProperty("Memo")
		protected String memo;
		public String getIsSuccess() {
			return isSuccess;
		}
		public void setIsSuccess(String isSuccess) {
			this.isSuccess = isSuccess;
		}
		public String getSellerID() {
			return sellerID;
		}
		public void setSellerID(String sellerID) {
			this.sellerID = sellerID;
		}
		public String getOperationType() {
			return operationType;
		}
		public void setOperationType(String operationType) {
			this.operationType = operationType;
		}
		public GetItemBasicInformationReportResponse.ResponseBody getResponseBody() {
			return responseBody;
		}
		public void setResponseBody(GetItemBasicInformationReportResponse.ResponseBody responseBody) {
			this.responseBody = responseBody;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
	}



	
	public static class ResponseBody {

		@JsonProperty("RequestID")
		protected String requestID;
		@JsonProperty("RequestDate")
		protected String requestDate;
		@JsonProperty("RequestType")
		protected String requestType;
		@JsonProperty("ReportFileURL")
		protected String reportFileURL;

		/**
		 * 取得 requestID 特性的值.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRequestID() {
			return requestID;
		}

		/**
		 * 設定 requestID 特性的值.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setRequestID(String value) {
			this.requestID = value;
		}

		/**
		 * 取得 requestDate 特性的值.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getRequestDate() {
			return requestDate;
		}

		/**
		 * 設定 requestDate 特性的值.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setRequestDate(String value) {
			this.requestDate = value;
		}

		public String getRequestType() {
			return requestType;
		}

		public void setRequestType(String requestType) {
			this.requestType = requestType;
		}

		public String getReportFileURL() {
			return reportFileURL;
		}

		public void setReportFileURL(String reportFileURL) {
			this.reportFileURL = reportFileURL;
		}


	}




	public NeweggAPIResponse getNeweggAPIResponse() {
		return neweggAPIResponse;
	}




	public void setNeweggAPIResponse(NeweggAPIResponse neweggAPIResponse) {
		this.neweggAPIResponse = neweggAPIResponse;
	}
}
