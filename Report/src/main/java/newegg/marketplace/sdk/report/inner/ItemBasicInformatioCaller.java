package newegg.marketplace.sdk.report.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.report.Variables;
import newegg.marketplace.sdk.report.Variables.URILock;
import newegg.marketplace.sdk.report.model.get.GetItemBasicInformationReportRequest;
import newegg.marketplace.sdk.report.model.get.GetItemBasicInformationReportResponse;
import newegg.marketplace.sdk.report.model.submit.SubmitItemBasicInformationReportRequest;
import newegg.marketplace.sdk.report.model.submit.SubmitItemBasicInformationReportResponse;

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
 * @author nick.d.Liang
 *
 */
public interface ItemBasicInformatioCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	GetItemBasicInformationReportResponse getItemBasicInformationJSON(@Param("sellerid") String sellerID, GetItemBasicInformationReportRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetItemBasicInformationReportResponse getItemBasicInformationReport(GetItemBasicInformationReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return getItemBasicInformationJSON(Content.SellerID, body);
		default:
			throw new RuntimeException("Sorry, the new version of the service only supports JSON requests.");
		}
				
	}
	
	
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SubmitItemBasicInformationReportResponse submitItemBasicInformationReportJSON(@Param("sellerid") String sellerID, SubmitItemBasicInformationReportRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SubmitItemBasicInformationReportResponse submitItemBasicInformationReport(SubmitItemBasicInformationReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return submitItemBasicInformationReportJSON(Content.SellerID, body);
		default:
			throw new RuntimeException("Sorry, the new version of the service only supports JSON requests.");
		}
				
	}
	
	
	
	static ItemBasicInformatioCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.ITEM_BASIC;
		
		return new CallerFactory<ItemBasicInformatioCaller>()
			.jsonBuild(ItemBasicInformatioCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static ItemBasicInformatioCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.ITEM_BASIC;
		
		return new CallerFactory<ItemBasicInformatioCaller>()
			.xmlBuild(ItemBasicInformatioCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

}
