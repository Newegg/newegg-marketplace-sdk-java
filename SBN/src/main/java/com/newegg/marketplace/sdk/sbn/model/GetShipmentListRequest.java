//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.26 at 08:49:58 AM CST 
//

package com.newegg.marketplace.sdk.sbn.model;

import java.math.BigInteger;
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
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="OperationType" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="PageInfo"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="PageIndex"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                   &lt;minInclusive value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="PageSize"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                   &lt;minInclusive value="1"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="KeywordsType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="KeywordsValue" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="40"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Status" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="5"/&gt;
 *                         &lt;enumeration value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LastUpdateDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LastUpdateDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
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
public class GetShipmentListRequest {

	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType = "GetShipmentListRequest";
	@XmlElement(name = "RequestBody", required = true)
	@JsonProperty("RequestBody")
	protected GetShipmentListRequest.RequestBody requestBody;

	/**
	 * Gets the value of the operationType property.
	 * 
	 * @return possible object is {@link Object }
	 * 
	 */
	public String getOperationType() {
		return operationType;
	}

	/**
	 * Sets the value of the operationType property.
	 * 
	 * @param value allowed object is {@link String }
	 * @param value
	 *     allowed object is
	 *     {@link 	String }
	 * 
	 */
	public void setOperationType(String value) {
		this.operationType = value;
	}

	/**
	 * Gets the value of the requestBody property.
	 * 
	 * @return possible object is {@link GetShipmentListRequest.RequestBody }
	 * 
	 */
	public GetShipmentListRequest.RequestBody getRequestBody() {
		return requestBody;
	}

	/**
	 * Sets the value of the requestBody property.
	 * 
	 * @param value allowed object is {@link GetShipmentListRequest.RequestBody }
	 * @param value
	 *     allowed object is
	 *     {@link 	GetShipmentListRequest.RequestBody }
	 * 
	 */
	public void setRequestBody(GetShipmentListRequest.RequestBody value) {
		this.requestBody = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within
	 * this class.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="PageInfo"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;all&gt;
	 *                   &lt;element name="PageIndex"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *                         &lt;minInclusive value="1"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="PageSize"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *                         &lt;minInclusive value="1"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                 &lt;/all&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *         &lt;element name="KeywordsType" minOccurs="0"&gt;
	 *           &lt;simpleType&gt;
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *               &lt;enumeration value="0"/&gt;
	 *               &lt;enumeration value="1"/&gt;
	 *               &lt;enumeration value="2"/&gt;
	 *               &lt;enumeration value="3"/&gt;
	 *             &lt;/restriction&gt;
	 *           &lt;/simpleType&gt;
	 *         &lt;/element&gt;
	 *         &lt;element name="KeywordsValue" minOccurs="0"&gt;
	 *           &lt;simpleType&gt;
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *               &lt;minLength value="1"/&gt;
	 *               &lt;maxLength value="40"/&gt;
	 *             &lt;/restriction&gt;
	 *           &lt;/simpleType&gt;
	 *         &lt;/element&gt;
	 *         &lt;element name="Status" minOccurs="0"&gt;
	 *           &lt;simpleType&gt;
	 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
	 *               &lt;enumeration value="0"/&gt;
	 *               &lt;enumeration value="1"/&gt;
	 *               &lt;enumeration value="2"/&gt;
	 *               &lt;enumeration value="3"/&gt;
	 *               &lt;enumeration value="4"/&gt;
	 *               &lt;enumeration value="5"/&gt;
	 *               &lt;enumeration value="6"/&gt;
	 *             &lt;/restriction&gt;
	 *           &lt;/simpleType&gt;
	 *         &lt;/element&gt;
	 *         &lt;element name="LastUpdateDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="LastUpdateDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
	public static class RequestBody {

		@XmlElement(name = "PageInfo", required = true)
		@JsonProperty("PageInfo")
		protected GetShipmentListRequest.RequestBody.PageInfo pageInfo;
		@XmlElement(name = "KeywordsType")
		@JsonProperty("KeywordsType")
		protected BigInteger keywordsType;
		@XmlElement(name = "KeywordsValue")
		@JsonProperty("KeywordsValue")
		protected String keywordsValue;
		@XmlElement(name = "Status")
		@JsonProperty("Status")
		protected BigInteger status;
		@XmlElement(name = "LastUpdateDateFrom")
		@JsonProperty("LastUpdateDateFrom")
		protected String lastUpdateDateFrom;
		@XmlElement(name = "LastUpdateDateTo")
		@JsonProperty("LastUpdateDateTo")
		protected String lastUpdateDateTo;

		/**
		 * Gets the value of the pageInfo property.
		 * 
		 * @return possible object is
		 *         {@link GetShipmentListRequest.RequestBody.PageInfo }
		 * 
		 */
		public GetShipmentListRequest.RequestBody.PageInfo getPageInfo() {
			return pageInfo;
		}

		/**
		 * Sets the value of the pageInfo property.
		 * 
		 * @param value allowed object is
		 *              {@link GetShipmentListRequest.RequestBody.PageInfo }
		 * @param value
		 *     allowed object is
		 *     {@link 		GetShipmentListRequest.RequestBody.PageInfo }
		 * 
		 */
		public void setPageInfo(GetShipmentListRequest.RequestBody.PageInfo value) {
			this.pageInfo = value;
		}

		/**
		 * Gets the value of the keywordsType property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getKeywordsType() {
			return keywordsType;
		}

		/**
		 * Sets the value of the keywordsType property.
		 * 
		 * @param value allowed object is {@link BigInteger }
		 * @param value
		 *     allowed object is
		 *     {@link 		BigInteger }
		 * 
		 */
		public void setKeywordsType(BigInteger value) {
			this.keywordsType = value;
		}

		/**
		 * Gets the value of the keywordsValue property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getKeywordsValue() {
			return keywordsValue;
		}

		/**
		 * Sets the value of the keywordsValue property.
		 * 
		 * @param value allowed object is {@link String }
		 * @param value
		 *     allowed object is
		 *     {@link 		String }
		 * 
		 */
		public void setKeywordsValue(String value) {
			this.keywordsValue = value;
		}

		/**
		 * Gets the value of the status property.
		 * 
		 * @return possible object is {@link BigInteger }
		 * 
		 */
		public BigInteger getStatus() {
			return status;
		}

		/**
		 * Sets the value of the status property.
		 * 
		 * @param value allowed object is {@link BigInteger }
		 * @param value
		 *     allowed object is
		 *     {@link 		BigInteger }
		 * 
		 */
		public void setStatus(BigInteger value) {
			this.status = value;
		}

		/**
		 * Gets the value of the lastUpdateDateFrom property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLastUpdateDateFrom() {
			return lastUpdateDateFrom;
		}

		/**
		 * Sets the value of the lastUpdateDateFrom property.
		 * 
		 * @param value allowed object is {@link String }
		 * @param value
		 *     allowed object is
		 *     {@link 		String }
		 * 
		 */
		public void setLastUpdateDateFrom(String value) {
			this.lastUpdateDateFrom = value;
		}

		/**
		 * Gets the value of the lastUpdateDateTo property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getLastUpdateDateTo() {
			return lastUpdateDateTo;
		}

		/**
		 * Sets the value of the lastUpdateDateTo property.
		 * 
		 * @param value allowed object is {@link String }
		 * @param value
		 *     allowed object is
		 *     {@link 		String }
		 * 
		 */
		public void setLastUpdateDateTo(String value) {
			this.lastUpdateDateTo = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within
		 * this class.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *       &lt;all&gt;
		 *         &lt;element name="PageIndex"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
		 *               &lt;minInclusive value="1"/&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="PageSize"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
		 *               &lt;minInclusive value="1"/&gt;
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
		public static class PageInfo {

			@XmlElement(name = "PageIndex", required = true)
			@JsonProperty("PageIndex")
			protected BigInteger pageIndex;
			@XmlElement(name = "PageSize", required = true)
			@JsonProperty("PageSize")
			protected BigInteger pageSize;

			/**
			 * Gets the value of the pageIndex property.
			 * 
			 * @return possible object is {@link BigInteger }
			 * 
			 */
			public BigInteger getPageIndex() {
				return pageIndex;
			}

			/**
			 * Sets the value of the pageIndex property.
			 * 
			 * @param value allowed object is {@link BigInteger }
			 * @param value
			 *     allowed object is
			 *     {@link 			BigInteger }
			 * 
			 */
			public void setPageIndex(BigInteger value) {
				this.pageIndex = value;
			}

			/**
			 * Gets the value of the pageSize property.
			 * 
			 * @return possible object is {@link BigInteger }
			 * 
			 */
			public BigInteger getPageSize() {
				return pageSize;
			}

			/**
			 * Sets the value of the pageSize property.
			 * 
			 * @param value allowed object is {@link BigInteger }
			 * @param value
			 *     allowed object is
			 *     {@link 			BigInteger }
			 * 
			 */
			public void setPageSize(BigInteger value) {
				this.pageSize = value;
			}

		}

	}

}
