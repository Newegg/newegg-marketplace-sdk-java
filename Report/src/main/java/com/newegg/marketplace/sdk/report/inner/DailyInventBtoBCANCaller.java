package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.DailyInventBtoBCANRequest;
import com.newegg.marketplace.sdk.report.model.get.DailyInventBtoBCANResponse;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventBtoBCANRequest;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventBtoBCANResponse;

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
public interface DailyInventBtoBCANCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/result?sellerid={sellerid}")
	DailyInventBtoBCANResponse sendDailyInventBtoBCANRequestJSON(@Param("sellerid") String sellerID, DailyInventBtoBCANRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/result?sellerid={sellerid}")
	DailyInventBtoBCANResponse sendDailyInventBtoBCANRequestXML(@Param("sellerid") String sellerID, DailyInventBtoBCANRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default DailyInventBtoBCANResponse sendDailyInventBtoBCANRequest(DailyInventBtoBCANRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendDailyInventBtoBCANRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendDailyInventBtoBCANRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}&version={version}")
	SDailyInventBtoBCANResponse sendSubmitDailyInventBtoBCANRequestJSON(@Param("sellerid") String sellerID, @Param("version") String version, SDailyInventBtoBCANRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}&version={version}")
	SDailyInventBtoBCANResponse sendSubmitDailyInventBtoBCANRequestXML(@Param("sellerid") String sellerID, @Param("version") String version, SDailyInventBtoBCANRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SDailyInventBtoBCANResponse sendSubmitDailyInventBtoBCANRequest(SDailyInventBtoBCANRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitDailyInventBtoBCANRequestJSON(Content.SellerID, Variables.version, body);
			
		case XML:			
			return sendSubmitDailyInventBtoBCANRequestXML(Content.SellerID, Variables.version, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static DailyInventBtoBCANCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.DAILY_INVENTORY_CA;
		
		return new CallerFactory<DailyInventBtoBCANCaller>()
			.jsonBuild(DailyInventBtoBCANCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static DailyInventBtoBCANCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.DAILY_INVENTORY_CA;
		
		return new CallerFactory<DailyInventBtoBCANCaller>()
			.xmlBuild(DailyInventBtoBCANCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
