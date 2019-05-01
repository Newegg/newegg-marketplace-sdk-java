package com.newegg.marketplace.sdk.sbn.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.sbn.Variables;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanRequest;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanResponse;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentResultResponse;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusRequest;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusResponse;
import com.newegg.marketplace.sdk.sbn.model.SubmitInboundShipmentCreateRequest;
import com.newegg.marketplace.sdk.sbn.model.SubmitInboundShipmentCreateResponse;

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
 * @author QB
 *
 */
public interface SbnOPCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/plansuggestion?sellerid={sellerid}")
	GetInboundShipmentPlanResponse getInboundShipmentPlanSuggestionJSON(@Param("sellerid") String sellerID,GetInboundShipmentPlanRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/plansuggestion?sellerid={sellerid}")
	GetInboundShipmentPlanResponse getInboundShipmentPlanSuggestionXML(@Param("sellerid") String sellerID,GetInboundShipmentPlanRequest body);
	
	default GetInboundShipmentPlanResponse getInboundShipmentPlanSuggestion(GetInboundShipmentPlanRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getInboundShipmentPlanSuggestionJSON(Content.SellerID,body);			
		case XML:
			return getInboundShipmentPlanSuggestionXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /sbnmgmt/inboundshipment/shipmentrequest?sellerid={sellerid}")
	SubmitInboundShipmentCreateResponse submitCreateInboundShipmentPlanSuggestionJSON(@Param("sellerid") String sellerID,SubmitInboundShipmentCreateRequest body);	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /sbnmgmt/inboundshipment/shipmentrequest?sellerid={sellerid}")
	SubmitInboundShipmentCreateResponse submitCreateInboundShipmentPlanSuggestionXML(@Param("sellerid") String sellerID,SubmitInboundShipmentCreateRequest body);
	
	default SubmitInboundShipmentCreateResponse submitCreateInboundShipmentPlanSuggestion(SubmitInboundShipmentCreateRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return submitCreateInboundShipmentPlanSuggestionJSON(Content.SellerID,body);			
		case XML:
			return submitCreateInboundShipmentPlanSuggestionXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
/*	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("POST /sbnmgmt/inboundshipment/shipmentrequest?sellerid={sellerid}")
	SubmitInboundShipmentVoidResponse submitVoidInboundShipmentRequestJson(@Param("sellerid") String sellerID,SubmitInboundShipmentVoidRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("POST /sbnmgmt/inboundshipment/shipmentrequest?sellerid={sellerid}")
	SubmitInboundShipmentVoidResponse submitVoidInboundShipmentRequestXML(@Param("sellerid") String sellerID,SubmitInboundShipmentVoidRequest body);
	
	default SubmitInboundShipmentVoidResponse submitVoidInboundShipmentRequest(SubmitInboundShipmentVoidRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return submitVoidInboundShipmentRequestJson(Content.SellerID,body);			
		case XML:
			return submitVoidInboundShipmentRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}*/
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/shipmentstatus?sellerid={sellerid}")
	GetShipmentStatusResponse getInboundShipmentStatusRequestJson(@Param("sellerid") String sellerID,GetShipmentStatusRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/shipmentstatus?sellerid={sellerid}")
	GetShipmentStatusResponse getInboundShipmentStatusRequestXML(@Param("sellerid") String sellerID,GetShipmentStatusRequest body);
	
	default GetShipmentStatusResponse getInboundShipmentStatusRequest(GetShipmentStatusRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getInboundShipmentStatusRequestJson(Content.SellerID,body);			
		case XML:
			return getInboundShipmentStatusRequestXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("GET /sbnmgmt/inboundshipment/shipmentresult/{requestid}?sellerid={sellerid}")
	GetInboundShipmentResultResponse getInboundShipmentRequestResultJSON(@Param("sellerid") String sellerID,@Param("requestid") String requestID);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("GET /sbnmgmt/inboundshipment/shipmentresult/{requestid}?sellerid={sellerid}")
	GetInboundShipmentResultResponse getInboundShipmentRequestResultXML(@Param("sellerid") String sellerID,@Param("requestid") String requestID);
	
	default GetInboundShipmentResultResponse getInboundShipmentRequestResult(String requestID) {
		switch(Variables.MediaType){
		case JSON:	
			if(Variables.SimulationEnabled)
				return getInboundShipmentRequestResultJSON(Content.SellerID,"testid");
			else
				return getInboundShipmentRequestResultJSON(Content.SellerID,requestID);			
		case XML:
			if(Variables.SimulationEnabled)
				return getInboundShipmentRequestResultXML(Content.SellerID,"testid");
			else
				return getInboundShipmentRequestResultXML(Content.SellerID,requestID);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	static SbnOPCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SbnOPCaller>()
		.jsonBuild(SbnOPCaller.class, Variables.LogLevel, Variables.Retryer,SbnClient.genClient());		
	}		
	
	static SbnOPCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SbnOPCaller>()
		.xmlBuild(SbnOPCaller.class, Variables.LogLevel, Variables.Retryer,SbnClient.genClient());		
	}
}
