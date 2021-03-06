//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 10:03:33 AM CST 
//

package com.newegg.marketplace.sdk.rma.model;

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
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperationType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RequestBody">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="PageInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="PageSize" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PageIndex" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;minInclusive value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="KeywordsType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
 *                   &lt;element name="RMADateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="RMADateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
public class RMAInformationRequest {

	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
	protected String issueUser;

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType;

	@XmlElement(name = "RequestBody", required = true)
	@JsonProperty("RequestBody")
	protected RMAInformationRequest.RequestBody requestBody;

	public String getIssueUser() {
		return issueUser;
	}

	public void setIssueUser(String issueUser) {
		this.issueUser = issueUser;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public RMAInformationRequest.RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(RMAInformationRequest.RequestBody requestBody) {
		this.requestBody = requestBody;
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
	 *         &lt;element name="PageInfo" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;all>
	 *                   &lt;element name="PageSize" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
	 *                         &lt;minInclusive value="1"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                   &lt;element name="PageIndex" minOccurs="0">
	 *                     &lt;simpleType>
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
	 *                         &lt;minInclusive value="1"/>
	 *                       &lt;/restriction>
	 *                     &lt;/simpleType>
	 *                   &lt;/element>
	 *                 &lt;/all>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="KeywordsType" minOccurs="0">
	 *           &lt;simpleType>
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
	 *         &lt;element name="RMADateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="RMADateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

	})
	public static class RequestBody {

		@XmlElement(name = "PageInfo")
		@JsonProperty("PageInfo")
		protected RMAInformationRequest.RequestBody.PageInfo pageInfo;

		@XmlElement(name = "KeywordsType")
		@JsonProperty("KeywordsType")
		protected Integer keywordsType;

		@XmlElement(name = "KeywordsValue")
		@JsonProperty("KeywordsValue")
		protected String keywordsValue;

		@XmlElement(name = "Status")
		@JsonProperty("Status")
		protected Integer status;

		@XmlElement(name = "RMADateFrom")
		@JsonProperty("RMADateFrom")
		protected String rmaDateFrom;

		@XmlElement(name = "RMADateTo")
		@JsonProperty("RMADateTo")
		protected String rmaDateTo;

		@XmlElement(name = "RMAType")
		@JsonProperty("RMAType")
		protected Integer rmaType;

		@XmlElement(name = "ProcessedBy")
		@JsonProperty("ProcessedBy")
		protected Integer processedBy;

		public RMAInformationRequest.RequestBody.PageInfo getPageInfo() {
			return pageInfo;
		}

		public void setPageInfo(RMAInformationRequest.RequestBody.PageInfo pageInfo) {
			this.pageInfo = pageInfo;
		}

		public Integer getKeywordsType() {
			return keywordsType;
		}

		public void setKeywordsType(Integer keywordsType) {
			this.keywordsType = keywordsType;
		}

		public String getKeywordsValue() {
			return keywordsValue;
		}

		public void setKeywordsValue(String keywordsValue) {
			this.keywordsValue = keywordsValue;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getRmaDateFrom() {
			return rmaDateFrom;
		}

		public void setRmaDateFrom(String rmaDateFrom) {
			this.rmaDateFrom = rmaDateFrom;
		}

		public String getRmaDateTo() {
			return rmaDateTo;
		}

		public void setRmaDateTo(String rmaDateTo) {
			this.rmaDateTo = rmaDateTo;
		}

		public Integer getRmaType() {
			return rmaType;
		}

		public void setRmaType(Integer rmaType) {
			this.rmaType = rmaType;
		}

		public Integer getProcessedBy() {
			return processedBy;
		}

		public void setProcessedBy(Integer processedBy) {
			this.processedBy = processedBy;
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
		 *         &lt;element name="PageSize" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
		 *               &lt;minInclusive value="1"/>
		 *             &lt;/restriction>
		 *           &lt;/simpleType>
		 *         &lt;/element>
		 *         &lt;element name="PageIndex" minOccurs="0">
		 *           &lt;simpleType>
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
		 *               &lt;minInclusive value="1"/>
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
		public static class PageInfo {

			@XmlElement(name = "PageSize")
			@JsonProperty("PageSize")
			protected Integer pageSize;

			@XmlElement(name = "PageIndex")
			@JsonProperty("PageIndex")
			protected Integer pageIndex;

			public Integer getPageSize() {
				return pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getPageIndex() {
				return pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
			}

		}

	}

}
