package com.newegg.marketplace.sdk.report.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.OrderListRequest;
import com.newegg.marketplace.sdk.report.model.get.OrderListResponse;
import com.newegg.marketplace.sdk.report.model.submit.SOrderListRequest;
import com.newegg.marketplace.sdk.report.model.submit.SOrderListResponse;

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
	OrderListResponse sendOrderListReportRequestJSON(@Param("sellerid") String sellerID, 
			@Param("version") String version, OrderListRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /reportmgmt/report/result?sellerid={sellerid}&version={version}")
	OrderListResponse sendOrderListReportRequestXML(@Param("sellerid") String sellerID, 
			@Param("version") String version, OrderListRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default OrderListResponse sendOrderListReportRequest(OrderListRequest body) {
		switch(Variables.MediaType) {
		case JSON:			 
			return sendOrderListReportRequestJSON(Content.SellerID, Variables.version, body);
			
		case XML:			
			return sendOrderListReportRequestXML(Content.SellerID, Variables.version, body);
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	// submit commands
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SOrderListResponse sendSubmitOrderListReportRequestJSON(@Param("sellerid") String sellerID, SOrderListRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /reportmgmt/report/submitrequest?sellerid={sellerid}")
	SOrderListResponse sendSubmitOrderListReportRequestXML(@Param("sellerid") String sellerID, SOrderListRequest body);
	
	default SOrderListResponse sendSubmitOrderListReportRequest(SOrderListRequest body) {
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
