package com.newegg.marketplace.sdk.order.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.order.Variables;
import com.newegg.marketplace.sdk.order.model.GetOrderInformationRequest;
import com.newegg.marketplace.sdk.order.model.GetOrderInformationResponse;

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
public interface OrderInfoCaller {
	/*
	 * Command define from Get Order Information API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /ordermgmt/order/orderinfo?sellerid={sellerid}&version={version}")
	GetOrderInformationResponse sendOrderInfoRequestJSON(@Param("sellerid") String sellerID, @Param("version") String version, GetOrderInformationRequest body);

	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /ordermgmt/order/orderinfo?sellerid={sellerid}&version={version}")
	GetOrderInformationResponse sendOrderInfoRequestXML(@Param("sellerid") String sellerID, @Param("version") String version, GetOrderInformationRequest body);
	
	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetOrderInformationResponse sendOrderInfoRequest(GetOrderInformationRequest body,String version) {
		switch(Variables.MediaType) {
		case JSON:	
			if(Variables.SimulationEnabled) {
				return sendOrderInfoRequestJSON(Content.SellerID, "304", body);
			}else {
				return sendOrderInfoRequestJSON(Content.SellerID, version, body);
			}						
		case XML:
			if(Variables.SimulationEnabled) {
				return sendOrderInfoRequestXML(Content.SellerID, "304", body);
			}else {
				return sendOrderInfoRequestXML(Content.SellerID, version, body);
			}				
			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	static OrderInfoCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		
		return new CallerFactory<OrderInfoCaller>()
			.jsonBuild(OrderInfoCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}

	static OrderInfoCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		
		return new CallerFactory<OrderInfoCaller>()
			.xmlBuild(OrderInfoCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}	
}
