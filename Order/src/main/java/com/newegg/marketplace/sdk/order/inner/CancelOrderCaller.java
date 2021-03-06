package com.newegg.marketplace.sdk.order.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.order.Variables;
import com.newegg.marketplace.sdk.order.Variables.URILock;
import com.newegg.marketplace.sdk.order.model.CancelOrderRequest;
import com.newegg.marketplace.sdk.order.model.CancelOrderResponse;

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
public interface CancelOrderCaller {
	/*
	 * Command define from Cancel Order API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /ordermgmt/orderstatus/orders/{ordernumber}?sellerid={sellerid}&version={version}")
	CancelOrderResponse sendCancelOrderRequestJSON(
			@Param("ordernumber") String orderNumber, 
			@Param("sellerid") String sellerID, 
			@Param("version") String version, 
			CancelOrderRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /ordermgmt/orderstatus/orders/{ordernumber}?sellerid={sellerid}&version={version}")
	CancelOrderResponse sendCancelOrderRequestXML(
			@Param("ordernumber") String orderNumber, 
			@Param("sellerid") String sellerID, 
			@Param("version") String version, 
			CancelOrderRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default CancelOrderResponse sendCancelOrderRequest(CancelOrderRequest body,String orderNumber,String version) {
		switch(Variables.MediaType) {
		case JSON:		
			if(Variables.SimulationEnabled) {
				
				return sendCancelOrderRequestJSON("123456", Content.SellerID, null, body);
			}else {
				return sendCancelOrderRequestJSON(orderNumber, Content.SellerID, version, body);
			}
			
		case XML:
			if(Variables.SimulationEnabled) {
				
				return sendCancelOrderRequestXML("123456", Content.SellerID, null, body);
			}else {
				return sendCancelOrderRequestXML(orderNumber, Content.SellerID, version, body);	
			}
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	static CancelOrderCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.CANCEL_ORDER;
		
		return new CallerFactory<CancelOrderCaller>()
			.jsonBuild(CancelOrderCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}

	static CancelOrderCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.CANCEL_ORDER;
		
		return new CallerFactory<CancelOrderCaller>()
			.xmlBuild(CancelOrderCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}
	
	
}
