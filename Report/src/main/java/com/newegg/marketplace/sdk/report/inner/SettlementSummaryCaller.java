package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.GetSettlementSummaryReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetSettlementSummaryInfoResponse;
import com.newegg.marketplace.sdk.report.model.submit.SettlementSummaryReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.SettlementSummaryReportResponse;

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
public interface SettlementSummaryCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetSettlementSummaryInfoResponse sendSettlementSummaryRequestJSON(@Param("sellerid") String sellerID, GetSettlementSummaryReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetSettlementSummaryInfoResponse sendSettlementSummaryRequestXML(@Param("sellerid") String sellerID, GetSettlementSummaryReportRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetSettlementSummaryInfoResponse sendSettlementSummaryRequest(GetSettlementSummaryReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSettlementSummaryRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSettlementSummaryRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SettlementSummaryReportResponse sendSubmitSettlementSummaryRequestJSON(@Param("sellerid") String sellerID, SettlementSummaryReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SettlementSummaryReportResponse sendSubmitSettlementSummaryRequestXML(@Param("sellerid") String sellerID, SettlementSummaryReportRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SettlementSummaryReportResponse sendSubmitSettlementSummaryRequest(SettlementSummaryReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendSubmitSettlementSummaryRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitSettlementSummaryRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static SettlementSummaryCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.SETTLEMENT_SUMMARY;
		
		return new CallerFactory<SettlementSummaryCaller>()
			.jsonBuild(SettlementSummaryCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static SettlementSummaryCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.SETTLEMENT_SUMMARY;
		
		return new CallerFactory<SettlementSummaryCaller>()
			.xmlBuild(SettlementSummaryCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
	
}
