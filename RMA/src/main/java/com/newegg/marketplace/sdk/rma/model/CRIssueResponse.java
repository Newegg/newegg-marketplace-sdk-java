//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.08 at 04:26:58 PM CST 
//

package com.newegg.marketplace.sdk.rma.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IsSuccess">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="true"/>
 *               &lt;enumeration value="false"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SellerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ResponseBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ResponseList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;all>
 *                                       &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="RequestStatus">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="SUBMITTED"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/all>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "NeweggAPIResponse")
public class CRIssueResponse {

	@XmlElement(name = "IsSuccess", required = true)
	@JsonProperty("IsSuccess")
	protected String isSuccess;

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType;

	@XmlElement(name = "SellerID", required = true)
	@JsonProperty("SellerID")
	protected String sellerID;

	@XmlElement(name = "ResponseBody", required = true)
	@JsonProperty("ResponseBody")
	protected CRIssueResponse.ResponseBody responseBody;

	@XmlElement(name = "Memo")
	@JsonProperty("Memo")
	protected String memo;

	public String getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getSellerID() {
		return sellerID;
	}

	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}

	public CRIssueResponse.ResponseBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(CRIssueResponse.ResponseBody responseBody) {
		this.responseBody = responseBody;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="ResponseList">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;all>
	 *                             &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                             &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                             &lt;element name="RequestStatus">
	 *                               &lt;simpleType>
	 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
	 *                                   &lt;enumeration value="SUBMITTED"/>
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
			"responseList"
	})
	public static class ResponseBody {

		@XmlElement(name = "ResponseList", required = true)
		@JsonProperty("ResponseList")
		protected CRIssueResponse.ResponseBody.ResponseList responseList;

		public CRIssueResponse.ResponseBody.ResponseList getResponseList() {
			return responseList;
		}

		public void setResponseList(CRIssueResponse.ResponseBody.ResponseList responseList) {
			this.responseList = responseList;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="ResponseInfo" maxOccurs="unbounded" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;all>
		 *                   &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *                   &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *                   &lt;element name="RequestStatus">
		 *                     &lt;simpleType>
		 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
		 *                         &lt;enumeration value="SUBMITTED"/>
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
				"responseInfo"
		})
		public static class ResponseList {

			@XmlElement(name = "ResponseInfo")
			@JsonProperty("ResponseInfo")
			protected List<CRIssueResponse.ResponseBody.ResponseList.ResponseInfo> responseInfo;

			/**
			 * Gets the value of the responseInfo property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the responseInfo property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getResponseInfo().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link CRIssueResponse.ResponseBody.ResponseList.ResponseInfo }
			 * 
			 * 
			 */
			public List<CRIssueResponse.ResponseBody.ResponseList.ResponseInfo> getResponseInfo() {
				if (responseInfo == null) {
					responseInfo = new ArrayList<CRIssueResponse.ResponseBody.ResponseList.ResponseInfo>();
				}
				return this.responseInfo;
			}

			/**
			 * <p>
			 * Java class for anonymous complex type.
			 * 
			 * <p>
			 * The following schema fragment specifies the expected content contained within this class.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;all>
			 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
			 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
			 *         &lt;element name="RequestStatus">
			 *           &lt;simpleType>
			 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
			 *               &lt;enumeration value="SUBMITTED"/>
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
			public static class ResponseInfo {

				@XmlElement(name = "RequestId", required = true)
				@JsonProperty("RequestId")
				protected String requestId;

				@XmlElement(name = "RequestDate", required = true)
				@JsonProperty("RequestDate")
				protected String requestDate;

				@XmlElement(name = "RequestStatus", required = true)
				@JsonProperty("RequestStatus")
				protected String requestStatus;

				public String getRequestId() {
					return requestId;
				}

				public void setRequestId(String requestId) {
					this.requestId = requestId;
				}

				public String getRequestDate() {
					return requestDate;
				}

				public void setRequestDate(String requestDate) {
					this.requestDate = requestDate;
				}

				public String getRequestStatus() {
					return requestStatus;
				}

				public void setRequestStatus(String requestStatus) {
					this.requestStatus = requestStatus;
				}

			}

		}

	}

}
