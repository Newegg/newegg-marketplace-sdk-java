package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.GetItemLookupReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetItemLookupReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.ItemLookupRequest;
import com.newegg.marketplace.sdk.report.model.submit.ItemLookupResponse;

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
public interface ItemLookupCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetItemLookupReportResponse sendItemLookupRequestJSON(@Param("sellerid") String sellerID, GetItemLookupReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetItemLookupReportResponse sendItemLookupRequestXML(@Param("sellerid") String sellerID, GetItemLookupReportRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetItemLookupReportResponse sendItemLookupRequest(GetItemLookupReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendItemLookupRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendItemLookupRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	ItemLookupResponse sendSubmitItemLookupRequestJSON(@Param("sellerid") String sellerID, ItemLookupRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	ItemLookupResponse sendSubmitItemLookupRequestXML(@Param("sellerid") String sellerID, ItemLookupRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default ItemLookupResponse sendSubmitItemLookupRequest(ItemLookupRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitItemLookupRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitItemLookupRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static ItemLookupCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.ITEM_LOOKUP;
		
		return new CallerFactory<ItemLookupCaller>()
			.jsonBuild(ItemLookupCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static ItemLookupCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.ITEM_LOOKUP;
		
		return new CallerFactory<ItemLookupCaller>()
			.xmlBuild(ItemLookupCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
