//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.03.06 於 01:41:35 PM CST 
//
package newegg.marketplace.sdk.report.model.submit;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;


/**
 * <p>anonymous complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * {
  "IsSuccess": true,
  "OperationType": " ItemBasicInfoReportResponse ",
  "SellerID": "a001",
  "ResponseBody": {
    "ResponseList": [
      {
        "RequestId": "270Z8Y3SYIGQV",
        "RequestType": "ITEM_BASIC_INFO_REPORT",
        "RequestDate": "10/26/2021 11:02:35",
        "RequestStatus": "SUBMITTED"
      }
    ]
  }
}
 * </pre>
 * 
 * 
 */
@JsonRootName("NeweggAPIResponse")
public class SubmitItemBasicInformationReportResponse {

    @JsonProperty("IsSuccess")
    protected String isSuccess;
    @JsonProperty("OperationType")
    protected String operationType = "ItemBasicInfoReportResponse";
    @JsonProperty("SellerID")
    protected String sellerID;
    @JsonProperty("ResponseBody")
    protected SubmitItemBasicInformationReportResponse.ResponseBody responseBody;

    /**
     * 取得 isSuccess 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSuccess() {
        return isSuccess;
    }

    /**
     * 設定 isSuccess 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSuccess(String value) {
        this.isSuccess = value;
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
     * 取得 sellerID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerID() {
        return sellerID;
    }

    /**
     * 設定 sellerID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerID(String value) {
        this.sellerID = value;
    }

    /**
     * 取得 responseBody 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link SubmitItemBasicInformationReportResponse.ResponseBody }
     *     
     */
    public SubmitItemBasicInformationReportResponse.ResponseBody getResponseBody() {
        return responseBody;
    }

    /**
     * 設定 responseBody 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitItemBasicInformationReportResponse.ResponseBody }
     *     
     */
    public void setResponseBody(SubmitItemBasicInformationReportResponse.ResponseBody value) {
        this.responseBody = value;
    }

    public static class ResponseBody {

        @JsonProperty("ResponseList")
        @JsonUnwrapped
        protected List<SubmitItemBasicInformationReportResponse.ResponseBody.ResponseInfo> responseList;


            public static class ResponseInfo {

                @JsonProperty("RequestId")
                protected String requestId;
                @JsonProperty("RequestType")
                protected String requestType;
                @JsonProperty("RequestDate")
                protected String requestDate;
                @JsonProperty("RequestStatus")
                protected String requestStatus;

                /**
                 * 取得 requestId 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestId() {
                    return requestId;
                }

                /**
                 * 設定 requestId 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestId(String value) {
                    this.requestId = value;
                }

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
                 * 取得 requestDate 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestDate() {
                    return requestDate;
                }

                /**
                 * 設定 requestDate 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestDate(String value) {
                    this.requestDate = value;
                }

                /**
                 * 取得 requestStatus 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRequestStatus() {
                    return requestStatus;
                }

                /**
                 * 設定 requestStatus 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRequestStatus(String value) {
                    this.requestStatus = value;
                }


    }







			public List<SubmitItemBasicInformationReportResponse.ResponseBody.ResponseInfo> getResponseList() {
				return responseList;
			}







			public void setResponseList(List<SubmitItemBasicInformationReportResponse.ResponseBody.ResponseInfo> responseList) {
				this.responseList = responseList;
			}}
}
