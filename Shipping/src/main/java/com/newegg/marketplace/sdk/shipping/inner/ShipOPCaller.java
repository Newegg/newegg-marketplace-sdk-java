package com.newegg.marketplace.sdk.shipping.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.shipping.Variables;
import com.newegg.marketplace.sdk.shipping.model.ConfirmShipRequest;
import com.newegg.marketplace.sdk.shipping.model.ConfirmShipResponse;
import com.newegg.marketplace.sdk.shipping.model.GetShippingDetailRequest;
import com.newegg.marketplace.sdk.shipping.model.GetShippingDetailResponse;
import com.newegg.marketplace.sdk.shipping.model.SubmitShippingRequest;
import com.newegg.marketplace.sdk.shipping.model.SubmitShippingResponse;
import com.newegg.marketplace.sdk.shipping.model.VoidShippingRequest;
import com.newegg.marketplace.sdk.shipping.model.VoidShippingResponse;

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
	SubmitShippingResponse submitShippingRequestJSON(@Param("sellerid") String sellerID,SubmitShippingRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /shippingservice/shippinglabel/shippingrequest?sellerid={sellerid}")
	SubmitShippingResponse submitShippingRequestXML(@Param("sellerid") String sellerID,SubmitShippingRequest body);
	
	default SubmitShippingResponse submitShippingRequest(SubmitShippingRequest body) {
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
	GetShippingDetailResponse getShippingRequestDetailJSON(@Param("sellerid") String sellerID,GetShippingDetailRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /shippingservice/shippinglabel/shippingdetail?sellerid={sellerid}")
	GetShippingDetailResponse getShippingRequestDetailXML(@Param("sellerid") String sellerID,GetShippingDetailRequest body);
	
	default GetShippingDetailResponse getShippingRequestDetail(GetShippingDetailRequest body) {
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
	ConfirmShipResponse confirmShippingRequestJSON(@Param("sellerid") String sellerID,ConfirmShipRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /shippingservice/shippinglabel/confirmshippingrequest?sellerid={sellerid}")
	ConfirmShipResponse confirmShippingRequestXML(@Param("sellerid") String sellerID,ConfirmShipRequest body);
	
	default ConfirmShipResponse confirmShippingRequest(ConfirmShipRequest body) {
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
	VoidShippingResponse voidShippingRequestJSON(@Param("sellerid") String sellerID,VoidShippingRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /shippingservice/shippinglabel/voidshippingrequest?sellerid={sellerid}")
	VoidShippingResponse voidShippingRequestXML(@Param("sellerid") String sellerID,VoidShippingRequest body);
	
	default VoidShippingResponse voidShippingRequest(VoidShippingRequest body) {
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
