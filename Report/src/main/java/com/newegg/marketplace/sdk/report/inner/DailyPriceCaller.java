package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.DailyPriceRequest;
import com.newegg.marketplace.sdk.report.model.get.DailyPriceResponse;
import com.newegg.marketplace.sdk.report.model.submit.SDailyPriceRequest;
import com.newegg.marketplace.sdk.report.model.submit.SDailyPriceResponse;

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
public interface DailyPriceCaller {

	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	DailyPriceResponse sendDailyPriceRequestJSON(@Param("sellerid") String sellerID, DailyPriceRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	DailyPriceResponse sendDailyPriceRequestXML(@Param("sellerid") String sellerID, DailyPriceRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default DailyPriceResponse sendDailyPriceRequest(DailyPriceRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendDailyPriceRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendDailyPriceRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}&version={version}")
	SDailyPriceResponse sendSubmitDailyPriceRequestJSON(@Param("sellerid") String sellerID, @Param("version") String version, SDailyPriceRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}&version={version}")
	SDailyPriceResponse sendSubmitDailyPriceRequestXML(@Param("sellerid") String sellerID, @Param("version") String version, SDailyPriceRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SDailyPriceResponse sendSubmitDailyPriceRequest(SDailyPriceRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitDailyPriceRequestJSON(Content.SellerID, Variables.version, body);
			
		case XML:			
			return sendSubmitDailyPriceRequestXML(Content.SellerID, Variables.version, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static DailyPriceCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.DAILY_PRICE;
		
		return new CallerFactory<DailyPriceCaller>()
			.jsonBuild(DailyPriceCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static DailyPriceCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.DAILY_PRICE;
		
		return new CallerFactory<DailyPriceCaller>()
			.xmlBuild(DailyPriceCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
