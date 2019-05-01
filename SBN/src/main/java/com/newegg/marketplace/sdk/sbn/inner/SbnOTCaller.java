package com.newegg.marketplace.sdk.sbn.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.sbn.Variables;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListRequest;
import com.newegg.marketplace.sdk.sbn.model.GetShipmentListResponse;
import com.newegg.marketplace.sdk.sbn.model.GetWarehouseListRequest;
import com.newegg.marketplace.sdk.sbn.model.GetWarehouseListResponse;

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
public interface SbnOTCaller {

	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/shipmentlist?sellerid={sellerid}")
	GetShipmentListResponse getInboundShipmentListJSON(@Param("sellerid") String sellerID,GetShipmentListRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/shipmentlist?sellerid={sellerid}")
	GetShipmentListResponse getInboundShipmentListXML(@Param("sellerid") String sellerID,GetShipmentListRequest body);
	
	default GetShipmentListResponse getInboundShipmentList(GetShipmentListRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getInboundShipmentListJSON(Content.SellerID,body);			
		case XML:
			return getInboundShipmentListXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}	
	
	
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/warehouse?sellerid={sellerid}")
	GetWarehouseListResponse getWarehouseListJSON(@Param("sellerid") String sellerID,GetWarehouseListRequest body);
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /sbnmgmt/inboundshipment/warehouse?sellerid={sellerid}")
	GetWarehouseListResponse getWarehouseListXML(@Param("sellerid") String sellerID,GetWarehouseListRequest body);
	
	default GetWarehouseListResponse getWarehouseList(GetWarehouseListRequest body) {
		switch(Variables.MediaType){
		case JSON:			
			return getWarehouseListJSON(Content.SellerID,body);			
		case XML:
			return getWarehouseListXML(Content.SellerID,body);			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	static SbnOTCaller buildJSON() {		
		Variables.MediaType=MEDIA_TYPE.JSON;			
		return new CallerFactory<SbnOTCaller>()
		.jsonBuild(SbnOTCaller.class, Variables.LogLevel, Variables.Retryer,SbnClient.genClient());		
	}		
	
	static SbnOTCaller buildXML() {
		Variables.MediaType=MEDIA_TYPE.XML;
		return new CallerFactory<SbnOTCaller>()
		.xmlBuild(SbnOTCaller.class, Variables.LogLevel, Variables.Retryer,SbnClient.genClient());		
	}
}
