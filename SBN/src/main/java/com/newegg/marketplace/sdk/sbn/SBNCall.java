package com.newegg.marketplace.sdk.sbn;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.sbn.inner.SbnOPCaller;
import com.newegg.marketplace.sdk.sbn.inner.SbnOTCaller;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanRequest;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentPlanResponse;
import com.newegg.marketplace.sdk.sbn.model.GetInboundShipmentResultResponse;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListRequest;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListResponse;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusRequest;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentStatusResponse;
import com.newegg.marketplace.sdk.sbn.model.GetWarehouseListRequest;
import com.newegg.marketplace.sdk.sbn.model.GetWarehouseListResponse;
import com.newegg.marketplace.sdk.sbn.model.SubmitInboundShipmentCreateRequest;
import com.newegg.marketplace.sdk.sbn.model.SubmitInboundShipmentCreateResponse;


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
 * Only for USA
 * @author QB
 *
 */
public class SBNCall {

	private SbnOPCaller sbnOPCaller;
	private SbnOTCaller sbnOTCaller;
	
	public SBNCall() {
		this(Content.MEDIA_TYPE.XML);
	}
	
	private SBNCall(Content.MEDIA_TYPE mrdiaType) {
		switch(mrdiaType){
		case JSON:
			sbnOPCaller=SbnOPCaller.buildJSON();
			sbnOTCaller=SbnOTCaller.buildJSON();
			break;			
		case XML:
			sbnOPCaller=SbnOPCaller.buildXML();
			sbnOTCaller=SbnOTCaller.buildXML();
			break;			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	/**
	 * <pre>
	 * Get an inbound shipment plan suggestion to identify the shipments of the items that you want to send to Newegg warehouse. 
	 * By submitting the inbound shipment plan suggestion request, Newegg will provide the appropriate ship arrangement based on Newegg’s business intelligence. 
	 * This will make your items allocation more reasonable and competitive.
	 * </pre> 
	 * @param body {@linkplain GetInboundShipmentPlanRequest} 
	 * @return {@linkplain GetInboundShipmentPlanResponse}  
	 */
	public GetInboundShipmentPlanResponse getInboundShipmentPlanSuggestion(GetInboundShipmentPlanRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOPCaller.getInboundShipmentPlanSuggestion(body);
	}
	
	/**
	 * <pre>
	 * Submit a new inbound shipment request based on the information that was returned by Get Inbound Shipment Plan Suggestion.
	 * </pre> 
	 * @param body {@linkplain SubmitInboundShipmentCreateRequest}  
	 * @return {@linkplain SubmitInboundShipmentCreateResponse}  
	 */
	public SubmitInboundShipmentCreateResponse submitCreateInboundShipmentPlanSuggestion(SubmitInboundShipmentCreateRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOPCaller.submitCreateInboundShipmentPlanSuggestion(body);
	}
	
	/**
	 * <pre>
	 * Submit a request to Newegg for voiding existing shipment.
	 * </pre> 
	 * @param body {@linkplain SubmitInboundShipmentCreateRequest}  
	 * @return {@linkplain SubmitInboundShipmentCreateResponse}  
	 */
	public SubmitInboundShipmentCreateResponse submitVoidInboundShipmentRequest(SubmitInboundShipmentCreateRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOPCaller.submitCreateInboundShipmentPlanSuggestion(body);
	}
	
	/**
	 * <pre>
	 * Get the status of specified inbound shipment.
	 * </pre> 
	 * @param body {@linkplain GetShipmentStatusRequest}  
	 * @return {@linkplain GetShipmentStatusResponse}  
	 */
	public GetShipmentStatusResponse getInboundShipmentStatusRequest(GetShipmentStatusRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOPCaller.getInboundShipmentStatusRequest(body);
	}
	
	/**
	 * <pre>
	 * Get the processing result of a specified inbound shipment request.
	 * </pre> 
	 * @param requestID  request ID
	 * @return {@linkplain GetInboundShipmentResultResponse}  
	 */
	public GetInboundShipmentResultResponse getInboundShipmentRequestResult(String requestID) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOPCaller.getInboundShipmentRequestResult(requestID);
	}
	
	/**
	 * <pre>
	 * Get the inbound shipment list of a specified Shipment ID or certain time period.
	 * </pre> 
	 * @param body {@linkplain GetShipmentListRequest} 
	 * @return {@linkplain GetShipmentListResponse}  
	 */
	public GetShipmentListResponse getInboundShipmentList(GetShipmentListRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOTCaller.getInboundShipmentList(body);
	}
	
	/**
	 * <pre>
	 * Get the available information of Newegg’s warehouses.
	 * </pre> 
	 * @param body {@linkplain GetWarehouseListRequest} 
	 * @return {@linkplain GetWarehouseListResponse}  
	 */
	public GetWarehouseListResponse getWarehouseList(GetWarehouseListRequest body) {
		if(Content.Platform==Content.PLATFORM.CAN)
			throw new PlatformException(PLATFORM.CAN.name());
		else
			return sbnOTCaller.getWarehouseList(body);
	}
}
