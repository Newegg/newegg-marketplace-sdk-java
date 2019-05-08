package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.OrderListReportRequest;
import com.newegg.marketplace.sdk.report.model.get.OrderListReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.SubmitOrderListReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.SubmitOrderListReportResponse;

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
public interface OrderListReportCaller {
	/*
	 * Command define from Report API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}&version={version}")
	OrderListReportResponse sendOrderListReportRequestJSON(@Param("sellerid") String sellerID, 
			@Param("version") String version, OrderListReportRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}&version={version}")
	OrderListReportResponse sendOrderListReportRequestXML(@Param("sellerid") String sellerID, 
			@Param("version") String version, OrderListReportRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default OrderListReportResponse sendOrderListReportRequest(OrderListReportRequest body,String version) {
		switch(Variables.MediaType) {
		case JSON:
			if(Variables.SimulationEnabled)
				return sendOrderListReportRequestJSON(Content.SellerID, "309", body);
			else
				return sendOrderListReportRequestJSON(Content.SellerID, version, body);
			
		case XML:
			if(Variables.SimulationEnabled)
				return sendOrderListReportRequestXML(Content.SellerID, "309", body);
			else
				return sendOrderListReportRequestXML(Content.SellerID, version, body);
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit commands
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SubmitOrderListReportResponse sendSubmitOrderListReportRequestJSON(@Param("sellerid") String sellerID, SubmitOrderListReportRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SubmitOrderListReportResponse sendSubmitOrderListReportRequestXML(@Param("sellerid") String sellerID, SubmitOrderListReportRequest body);
	
	default SubmitOrderListReportResponse sendSubmitOrderListReportRequest(SubmitOrderListReportRequest body) {
		switch(Variables.MediaType) {
		case JSON:			 
			return sendSubmitOrderListReportRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendSubmitOrderListReportRequestXML(Content.SellerID, body);
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static OrderListReportCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.ORDER_LIST;
		
		return new CallerFactory<OrderListReportCaller>()
			.jsonBuild(OrderListReportCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}

	static OrderListReportCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.ORDER_LIST;
		
		return new CallerFactory<OrderListReportCaller>()
			.xmlBuild(OrderListReportCaller.class, Variables.LogLevel, Variables.Retryer, ReportClient.genClient());		
	}
}
