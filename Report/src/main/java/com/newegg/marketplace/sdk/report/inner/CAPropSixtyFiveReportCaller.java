package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.CAPropSixtyFiveReportRequest;
import com.newegg.marketplace.sdk.report.model.get.CAPropSixtyFiveReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.SCAPropSixtyFiveRequest;
import com.newegg.marketplace.sdk.report.model.submit.SCAPropSixtyFiveResponse;

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
public interface CAPropSixtyFiveReportCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	CAPropSixtyFiveReportResponse sendCAPropSixtyFiveReportRequestJSON(@Param("sellerid") String sellerID, CAPropSixtyFiveReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	CAPropSixtyFiveReportResponse sendCAPropSixtyFiveReportRequestXML(@Param("sellerid") String sellerID, CAPropSixtyFiveReportRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default CAPropSixtyFiveReportResponse sendCAPropSixtyFiveReportRequest(CAPropSixtyFiveReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendCAPropSixtyFiveReportRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendCAPropSixtyFiveReportRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SCAPropSixtyFiveResponse sendSubmitCAPropSixtyFiveReportRequestJSON(@Param("sellerid") String sellerID, SCAPropSixtyFiveRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SCAPropSixtyFiveResponse sendSubmitCAPropSixtyFiveReportRequestXML(@Param("sellerid") String sellerID, SCAPropSixtyFiveRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SCAPropSixtyFiveResponse sendSubmitCAPropSixtyFiveReportRequest(SCAPropSixtyFiveRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitCAPropSixtyFiveReportRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitCAPropSixtyFiveReportRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static CAPropSixtyFiveReportCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.CA_PRO_65;
		
		return new CallerFactory<CAPropSixtyFiveReportCaller>()
			.jsonBuild(CAPropSixtyFiveReportCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static CAPropSixtyFiveReportCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.CA_PRO_65;
		
		return new CallerFactory<CAPropSixtyFiveReportCaller>()
			.xmlBuild(CAPropSixtyFiveReportCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
