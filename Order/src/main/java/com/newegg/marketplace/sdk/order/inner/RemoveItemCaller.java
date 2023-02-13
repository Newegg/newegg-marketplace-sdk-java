package com.newegg.marketplace.sdk.order.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.order.Variables;
import com.newegg.marketplace.sdk.order.model.RemoveItemRequest;
import com.newegg.marketplace.sdk.order.model.RemoveItemResponse;

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
public interface RemoveItemCaller {
	/*
	 * Command define from Order Confirmation API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /ordermgmt/killitem/orders/{ordernumber}?sellerid={sellerid}")
	RemoveItemResponse sendRemoveItemRequestJSON(@Param("ordernumber") String orderNumber, @Param("sellerid") String sellerID, RemoveItemRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /ordermgmt/killitem/orders/{ordernumber}?sellerid={sellerid}")
	RemoveItemResponse sendRemoveItemRequestXML(@Param("ordernumber") String orderNumber, @Param("sellerid") String sellerID, RemoveItemRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default RemoveItemResponse sendRemoveItemRequest(RemoveItemRequest body,String orderNumber) {
		switch(Variables.MediaType) {
		case JSON:		
			if(Variables.SimulationEnabled)
				return sendRemoveItemRequestJSON("123456", Content.SellerID, body);
			else
				return sendRemoveItemRequestJSON(orderNumber, Content.SellerID, body);
			
		case XML:
			if(Variables.SimulationEnabled)
				return sendRemoveItemRequestXML("123456", Content.SellerID, body);
			else
				return sendRemoveItemRequestXML(orderNumber, Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static RemoveItemCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		
		return new CallerFactory<RemoveItemCaller>()
			.jsonBuild(RemoveItemCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}

	static RemoveItemCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		
		return new CallerFactory<RemoveItemCaller>()
			.xmlBuild(RemoveItemCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}
}
