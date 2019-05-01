package com.newegg.marketplace.sdk.shipping.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.shipping.Variables;
import com.newegg.marketplace.sdk.shipping.model.ShippingComfirmRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingComfirmResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingDetailRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingDetailResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingSubmitRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingSubmitResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingVoidRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingVoidResponse;

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
 * Operation function
 * @author QB
 *
 */
public interface ShipOPCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /shippingservice/shippinglabel/shippingrequest?sellerid={sellerid}")
	ShippingSubmitResponse submitShippingRequestJSON(@Param("sellerid") String sellerID,ShippingSubmitRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /shippingservice/shippinglabel/shippingrequest?sellerid={sellerid}")
	ShippingSubmitResponse submitShippingRequestXML(@Param("sellerid") String sellerID,ShippingSubmitRequest body);
	
	default ShippingSubmitResponse submitShippingRequest(ShippingSubmitRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return submitShippingRequestJSON(Content.SellerID,body);			
		case XML:
			return submitShippingRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /shippingservice/shippinglabel/shippingdetail?sellerid={sellerid}")
	ShippingDetailResponse getShippingRequestDetailJSON(@Param("sellerid") String sellerID,ShippingDetailRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /shippingservice/shippinglabel/shippingdetail?sellerid={sellerid}")
	ShippingDetailResponse getShippingRequestDetailXML(@Param("sellerid") String sellerID,ShippingDetailRequest body);
	
	default ShippingDetailResponse getShippingRequestDetail(ShippingDetailRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getShippingRequestDetailJSON(Content.SellerID,body);			
		case XML:
			return getShippingRequestDetailXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /shippingservice/shippinglabel/confirmshippingrequest?sellerid={sellerid}")
	ShippingComfirmResponse confirmShippingRequestJSON(@Param("sellerid") String sellerID,ShippingComfirmRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /shippingservice/shippinglabel/confirmshippingrequest?sellerid={sellerid}")
	ShippingComfirmResponse confirmShippingRequestXML(@Param("sellerid") String sellerID,ShippingComfirmRequest body);
	
	default ShippingComfirmResponse confirmShippingRequest(ShippingComfirmRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return confirmShippingRequestJSON(Content.SellerID,body);			
		case XML:
			return confirmShippingRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /shippingservice/shippinglabel/voidshippingrequest?sellerid={sellerid}")
	ShippingVoidResponse voidShippingRequestJSON(@Param("sellerid") String sellerID,ShippingVoidRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /shippingservice/shippinglabel/voidshippingrequest?sellerid={sellerid}")
	ShippingVoidResponse voidShippingRequestXML(@Param("sellerid") String sellerID,ShippingVoidRequest body);
	
	default ShippingVoidResponse voidShippingRequest(ShippingVoidRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return voidShippingRequestJSON(Content.SellerID,body);			
		case XML:
			return voidShippingRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	
	static ShipOPCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<ShipOPCaller>()
		.jsonBuild(ShipOPCaller.class, Variables.LogLevel, Variables.Retryer,ShipClient.genClient());		
	}			
	
	static ShipOPCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<ShipOPCaller>()
		.xmlBuild(ShipOPCaller.class, Variables.LogLevel, Variables.Retryer,ShipClient.genClient());		
	}
}
