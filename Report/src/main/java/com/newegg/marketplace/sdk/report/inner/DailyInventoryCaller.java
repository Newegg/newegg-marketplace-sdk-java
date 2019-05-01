package com.newegg.marketplace.sdk.report.inner;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.DailyInventoryRequest;
import com.newegg.marketplace.sdk.report.model.get.DailyInventoryResponse;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventoryRequest;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventoryResponse;

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
 * @author Zack.J.Hung
 *
 */
public interface DailyInventoryCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	DailyInventoryResponse sendDailyInventoryRequestJSON(@Param("sellerid") String sellerID, DailyInventoryRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	DailyInventoryResponse sendDailyInventoryRequestXML(@Param("sellerid") String sellerID, DailyInventoryRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default DailyInventoryResponse sendDailyInventoryRequest(DailyInventoryRequest body) {
		switch(Variables.MediaType) {
		case JSON:		
			Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
			DailyInventoryResponse r = sendDailyInventoryRequestJSON(Content.SellerID, body);
			Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
			return r;
			
		case XML:			
			return sendDailyInventoryRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}&version={version}")
	SDailyInventoryResponse sendSubmitDailyInventoryRequestJSON(@Param("sellerid") String sellerID, @Param("version") String version,  SDailyInventoryRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}&version={version}")
	SDailyInventoryResponse sendSubmitDailyInventoryRequestXML(@Param("sellerid") String sellerID, @Param("version") String version, SDailyInventoryRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SDailyInventoryResponse sendSubmitDailyInventoryRequest(SDailyInventoryRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitDailyInventoryRequestJSON(Content.SellerID, Variables.version, body);
			
		case XML:			
			return sendSubmitDailyInventoryRequestXML(Content.SellerID, Variables.version, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static DailyInventoryCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.DAILY_INVENTORY;
		
		return new CallerFactory<DailyInventoryCaller>()
			.jsonBuild(DailyInventoryCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static DailyInventoryCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.DAILY_INVENTORY;
		
		return new CallerFactory<DailyInventoryCaller>()
			.xmlBuild(DailyInventoryCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
