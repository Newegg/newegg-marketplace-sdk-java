package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.SettlementTransactionRequest;
import com.newegg.marketplace.sdk.report.model.get.SettlementTransactionResponse;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementTransactionRequest;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementTransactionResponse;

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
public interface SettlementTransactionCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	SettlementTransactionResponse sendSettlementTransactionRequestJSON(@Param("sellerid") String sellerID, SettlementTransactionRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}")
	SettlementTransactionResponse sendSettlementTransactionRequestXML(@Param("sellerid") String sellerID, SettlementTransactionRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SettlementTransactionResponse sendSettlementTransactionRequest(SettlementTransactionRequest body) {
		switch(Variables.MediaType) { 
		case JSON:			
			return sendSettlementTransactionRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSettlementTransactionRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit command
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SSettlementTransactionResponse sendSubmitSettlementTransactionRequestJSON(@Param("sellerid") String sellerID, SSettlementTransactionRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SSettlementTransactionResponse sendSubmitSettlementTransactionRequestXML(@Param("sellerid") String sellerID, SSettlementTransactionRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default SSettlementTransactionResponse sendSubmitSettlementTransactionRequest(SSettlementTransactionRequest body) {
		switch(Variables.MediaType) { 
		case JSON:			
			return sendSubmitSettlementTransactionRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitSettlementTransactionRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	
	static SettlementTransactionCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.SETTLEMENT_TRANSACTION;
		
		return new CallerFactory<SettlementTransactionCaller>()
			.jsonBuild(SettlementTransactionCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static SettlementTransactionCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.SETTLEMENT_TRANSACTION;
		
		return new CallerFactory<SettlementTransactionCaller>()
			.xmlBuild(SettlementTransactionCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
