package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.RMAListRequest;
import com.newegg.marketplace.sdk.report.model.get.RMAListResponse;
import com.newegg.marketplace.sdk.report.model.submit.SRMAListRequest;
import com.newegg.marketplace.sdk.report.model.submit.SRMAListResponse;

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
public interface RMAListCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}&version={version}")
	RMAListResponse sendRMAListRequestJSON(@Param("sellerid") String sellerID,
			                               @Param("version") String version, 
			                               RMAListRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}&version={version}")
	RMAListResponse sendRMAListRequestXML(@Param("sellerid") String sellerID,
								            @Param("version") String version, 
								            RMAListRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default RMAListResponse sendRMAListRequest(RMAListRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendRMAListRequestJSON(Content.SellerID, Variables.version, body);
			
		case XML:			
			return sendRMAListRequestXML(Content.SellerID, Variables.version, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SRMAListResponse sendSubmitRMAListRequestJSON(@Param("sellerid") String sellerID, SRMAListRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SRMAListResponse sendSubmitRMAListRequestXML(@Param("sellerid") String sellerID, SRMAListRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SRMAListResponse sendSubmitRMAListRequest(SRMAListRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitRMAListRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitRMAListRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static RMAListCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.RMA_LIST;
		
		return new CallerFactory<RMAListCaller>()
			.jsonBuild(RMAListCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static RMAListCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.RMA_LIST;
		
		return new CallerFactory<RMAListCaller>()
			.xmlBuild(RMAListCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
