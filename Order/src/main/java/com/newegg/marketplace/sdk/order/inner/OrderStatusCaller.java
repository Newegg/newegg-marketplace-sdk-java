package com.newegg.marketplace.sdk.order.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.order.Variables;
import com.newegg.marketplace.sdk.order.model.*;


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
public interface OrderStatusCaller {
	/*
	 * Command define from Get Order Status API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /ordermgmt/orderstatus/orders/{ordernumber}?sellerid={sellerid}&version={version}")
	GetOrderStatusResponse sendOrderStatusRequestJSON(
			@Param("ordernumber") String orderNUM,
			@Param("sellerid") String sellerID, 
			@Param("version") String version);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /ordermgmt/orderstatus/orders/{ordernumber}?sellerid={sellerid}&version={version}")
	GetOrderStatusResponse sendOrderStatusRequestXML(
			@Param("ordernumber") String orderNUM,
			@Param("sellerid") String sellerID, 
			@Param("version") String version); 

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetOrderStatusResponse sendOrderStatusRequest() {
		switch(Variables.MediaType) {
		case JSON:			
			return sendOrderStatusRequestJSON(Variables.orderNumber, Content.SellerID, Variables.version);
			
		case XML:			
			return sendOrderStatusRequestXML(Variables.orderNumber, Content.SellerID, Variables.version);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static OrderStatusCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		
		return new CallerFactory<OrderStatusCaller>()
				.jsonBuild(OrderStatusCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}

	static OrderStatusCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		
		return new CallerFactory<OrderStatusCaller>()
				.xmlBuild(OrderStatusCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}
}
