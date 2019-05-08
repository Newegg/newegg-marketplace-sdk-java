package com.newegg.marketplace.sdk.item.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.item.Variables;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerRequest;
import com.newegg.marketplace.sdk.item.model.SubmitManufacturerResponse;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusRequest;
import com.newegg.marketplace.sdk.item.model.GetManufacturerRequestStatusResponse;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupRequest;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupForInternationalCountryRequest;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupResponse;
import com.newegg.marketplace.sdk.item.model.ManufacturerLookupForInternationalCountryResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
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

/**
 * For openfeign used
 * @author QB
 *
 */
public interface ManufacturerCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /contentmgmt/manufacturer/creationrequest?sellerid={sellerid}")
	SubmitManufacturerResponse submitManufacturerRequestJSON(@Param("sellerid") String sellerID,SubmitManufacturerRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /contentmgmt/manufacturer/creationrequest?sellerid={sellerid}")
	SubmitManufacturerResponse submitManufacturerRequestXML(@Param("sellerid") String sellerID,SubmitManufacturerRequest body);
	
	default SubmitManufacturerResponse submitManufacturerRequest(SubmitManufacturerRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return submitManufacturerRequestJSON(Content.SellerID,body);
		case XML:			
			return submitManufacturerRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/manufacturer/manufacturerinfo?sellerid={sellerid}")
	ManufacturerLookupResponse manufacturerLookupJSON(@Param("sellerid") String sellerID,ManufacturerLookupRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/manufacturer/manufacturerinfo?sellerid={sellerid}")
	ManufacturerLookupResponse manufacturerLookupXML(@Param("sellerid") String sellerID,ManufacturerLookupRequest body);
	
	default ManufacturerLookupResponse manufacturerLookup(ManufacturerLookupRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return manufacturerLookupJSON(Content.SellerID,body);
		case XML:			
			return manufacturerLookupXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/manufacturer/manufacturerinfo/V2?sellerid={sellerid}")
	ManufacturerLookupForInternationalCountryResponse manufacturerLookupForInternationalCountryJSON(@Param("sellerid") String sellerID,ManufacturerLookupForInternationalCountryRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/manufacturer/manufacturerinfo/V2?sellerid={sellerid}")
	ManufacturerLookupForInternationalCountryResponse manufacturerLookupForInternationalCountryXML(@Param("sellerid") String sellerID,ManufacturerLookupForInternationalCountryRequest body);
	
	default ManufacturerLookupForInternationalCountryResponse manufacturerLookupForInternationalCountry(ManufacturerLookupForInternationalCountryRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return manufacturerLookupForInternationalCountryJSON(Content.SellerID,body);
		case XML:			
			return manufacturerLookupForInternationalCountryXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /contentmgmt/manufacturer/creationrequeststatus?sellerid={sellerid}")
	GetManufacturerRequestStatusResponse getManufacturerRequestStatusJSON(@Param("sellerid") String sellerID,GetManufacturerRequestStatusRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /contentmgmt/manufacturer/creationrequeststatus?sellerid={sellerid}")
	GetManufacturerRequestStatusResponse getManufacturerRequestStatusXML(@Param("sellerid") String sellerID,GetManufacturerRequestStatusRequest body);
	
	default GetManufacturerRequestStatusResponse getManufacturerRequestStatus(GetManufacturerRequestStatusRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getManufacturerRequestStatusJSON(Content.SellerID,body);
		case XML:			
			return getManufacturerRequestStatusXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static ManufacturerCaller buildJSON() {
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ManufacturerCaller>()
		.jsonBuild(ManufacturerCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
	
	static ManufacturerCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ManufacturerCaller>()
		.xmlBuild(ManufacturerCaller.class, Variables.LogLevel, Variables.Retryer,ItemClient.genClient());		
	}
}
