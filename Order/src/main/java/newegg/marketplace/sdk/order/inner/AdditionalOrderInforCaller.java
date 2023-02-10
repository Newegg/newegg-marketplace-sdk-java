package newegg.marketplace.sdk.order.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.model.GetAdditionalOrderInformationRequest;
import newegg.marketplace.sdk.order.model.GetAdditionalOrderInformationResponse;

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
public interface AdditionalOrderInforCaller {
	/*
	 * Command define from Order Confirmation API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /ordermgmt/order/addorderinfo?sellerid={sellerid}")
	GetAdditionalOrderInformationResponse sendAdditionalOrderInforRequestJSON(@Param("sellerid") String sellerID, GetAdditionalOrderInformationRequest body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /ordermgmt/order/addorderinfo?sellerid={sellerid}")
	GetAdditionalOrderInformationResponse sendAdditionalOrderInforRequestXML(@Param("sellerid") String sellerID, GetAdditionalOrderInformationRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default GetAdditionalOrderInformationResponse sendAdditionalOrderInforRequest(GetAdditionalOrderInformationRequest body) {
		switch(Variables.MediaType) {
		case JSON:			
			return sendAdditionalOrderInforRequestJSON(Content.SellerID, body);
			
		case XML:			
			return sendAdditionalOrderInforRequestXML(Content.SellerID, body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static AdditionalOrderInforCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		
		return new CallerFactory<AdditionalOrderInforCaller>()
			.jsonBuild(AdditionalOrderInforCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}

	static AdditionalOrderInforCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		
		return new CallerFactory<AdditionalOrderInforCaller>()
			.xmlBuild(AdditionalOrderInforCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}
	
}
