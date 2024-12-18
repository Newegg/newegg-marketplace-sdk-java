//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.13 at 02:29:54 PM CST 
//

package com.newegg.marketplace.sdk.item.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

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
 *         &lt;element name="IssueUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="SubmitManufacturerRequest"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RequestBody"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ManufacturerRequest"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="Name"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="40"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="URL"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="60"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SupportEmail" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="100"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SupportPhone" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="120"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SupportURL" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;maxLength value="250"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
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
public class SubmitManufacturerRequest {

	@XmlElement(name = "IssueUser")
	@JsonProperty("IssueUser")
	protected String issueUser;
	@XmlElement(name = "OperationType", required = true)
	@JsonProperty("OperationType")
	protected String operationType = "SubmitManufacturerRequest";
	@XmlElement(name = "RequestBody", required = true)
	@JsonProperty("RequestBody")
	protected SubmitManufacturerRequest.RequestBody requestBody;

	/**
	 * Gets the value of the issueUser property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIssueUser() {
		return issueUser;
	}

	/**
	 * Sets the value of the issueUser property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setIssueUser(String value) {
		this.issueUser = value;
	}

	/**
	 * Gets the value of the operationType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOperationType() {
		return operationType;
	}

	/**
	 * Sets the value of the operationType property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setOperationType(String value) {
		this.operationType = value;
	}

	/**
	 * Gets the value of the requestBody property.
	 * 
	 * @return possible object is {@link SubmitManufacturerRequest.RequestBody }
	 * 
	 */
	public SubmitManufacturerRequest.RequestBody getRequestBody() {
		return requestBody;
	}

	/**
	 * Sets the value of the requestBody property.
	 * 
	 * @param value allowed object is {@link SubmitManufacturerRequest.RequestBody }
	 * 
	 */
	public void setRequestBody(SubmitManufacturerRequest.RequestBody value) {
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
	 *       &lt;sequence&gt;
	 *         &lt;element name="ManufacturerRequest"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;all&gt;
	 *                   &lt;element name="Name"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                         &lt;maxLength value="40"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="URL"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                         &lt;maxLength value="60"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="SupportEmail" minOccurs="0"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                         &lt;maxLength value="100"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="SupportPhone" minOccurs="0"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                         &lt;maxLength value="120"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
	 *                   &lt;/element&gt;
	 *                   &lt;element name="SupportURL" minOccurs="0"&gt;
	 *                     &lt;simpleType&gt;
	 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
	 *                         &lt;maxLength value="250"/&gt;
	 *                       &lt;/restriction&gt;
	 *                     &lt;/simpleType&gt;
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
	@XmlType(name = "", propOrder = { "manufacturerRequest" })
	public static class RequestBody {

		@XmlElement(name = "ManufacturerRequest", required = true)
		@JsonProperty("ManufacturerRequest")
		protected SubmitManufacturerRequest.RequestBody.ManufacturerRequest manufacturerRequest;

		/**
		 * Gets the value of the manufacturerRequest property.
		 * 
		 * @return possible object is
		 *         {@link SubmitManufacturerRequest.RequestBody.ManufacturerRequest }
		 * 
		 */
		public SubmitManufacturerRequest.RequestBody.ManufacturerRequest getManufacturerRequest() {
			return manufacturerRequest;
		}

		/**
		 * Sets the value of the manufacturerRequest property.
		 * 
		 * @param value allowed object is
		 *              {@link SubmitManufacturerRequest.RequestBody.ManufacturerRequest }
		 * 
		 */
		public void setManufacturerRequest(SubmitManufacturerRequest.RequestBody.ManufacturerRequest value) {
			this.manufacturerRequest = value;
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
		 *         &lt;element name="Name"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *               &lt;maxLength value="40"/&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="URL"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *               &lt;maxLength value="60"/&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="SupportEmail" minOccurs="0"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *               &lt;maxLength value="100"/&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="SupportPhone" minOccurs="0"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *               &lt;maxLength value="120"/&gt;
		 *             &lt;/restriction&gt;
		 *           &lt;/simpleType&gt;
		 *         &lt;/element&gt;
		 *         &lt;element name="SupportURL" minOccurs="0"&gt;
		 *           &lt;simpleType&gt;
		 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
		 *               &lt;maxLength value="250"/&gt;
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
		public static class ManufacturerRequest {

			@XmlElement(name = "Name", required = true)
			@JsonProperty("Name")
			protected String name;
			@XmlElement(name = "URL", required = true)
			@JsonProperty("URL")
			protected String url;
			@XmlElement(name = "CountryCode", required = true)
			@JsonProperty("CountryCode")
			protected String countryCode;
			@XmlElement(name = "SupportEmail")
			@JsonProperty("SupportEmail")
			protected String supportEmail;
			@XmlElement(name = "SupportPhone")
			@JsonProperty("SupportPhone")
			protected String supportPhone;
			@XmlElement(name = "SupportURL")
			@JsonProperty("SupportURL")
			protected String supportURL;

			/**
			 * Gets the value of the name property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getName() {
				return name;
			}

			/**
			 * Sets the value of the name property.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setName(String value) {
				this.name = value;
			}

			/**
			 * Gets the value of the url property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getURL() {
				return url;
			}

			/**
			 * Sets the value of the url property.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setURL(String value) {
				this.url = value;
			}

			/**
			 * Gets the value of the countryCode property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCountryCode() {
				return countryCode;
			}

			/**
			 * Sets the value of the countryCode property.
			 * 
			 * @param countryCode allowed object is Country String
			 * 
			 */
			public void setCountryCode(String countryCode) {
				this.countryCode = countryCode;
			}

			/**
			 * Gets the value of the supportEmail property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSupportEmail() {
				return supportEmail;
			}

			/**
			 * Sets the value of the supportEmail property.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setSupportEmail(String value) {
				this.supportEmail = value;
			}

			/**
			 * Gets the value of the supportPhone property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSupportPhone() {
				return supportPhone;
			}

			/**
			 * Sets the value of the supportPhone property.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setSupportPhone(String value) {
				this.supportPhone = value;
			}

			/**
			 * Gets the value of the supportURL property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getSupportURL() {
				return supportURL;
			}

			/**
			 * Sets the value of the supportURL property.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setSupportURL(String value) {
				this.supportURL = value;
			}

		}

	}

}
