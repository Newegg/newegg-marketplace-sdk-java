package newegg.marketplace.sdk.order.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.Variables.URILock;
import newegg.marketplace.sdk.order.model.*;

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
public interface ShipmentCaller {
	/*
	 * Command define from Order Confirmation API Guide
	 * JSON and XML format
	 */
	@Headers({"Accept: application/json","Content-Type: application/json"})
	@RequestLine("PUT /ordermgmt/orderstatus/orders/{ordernumber}?sellerid={sellerid}&version={version}")
	ShipOrderResponse sendShipmentRequestJSON(
			@Param("ordernumber") String orderNumber,
			@Param("sellerid") String sellerID, 
			@Param("version") String version,
			ShipOrderRequestJSON body);
	
	@Headers({"Accept: application/xml","Content-Type: application/xml"})
	@RequestLine("PUT /ordermgmt/orderstatus/orders/{ordernumber}?sellerid={sellerid}&version={version}")
	ShipOrderResponse sendShipmentRequestXML(
			@Param("ordernumber") String orderNumber,
			@Param("sellerid") String sellerID, 
			@Param("version") String version,
			ShipOrderRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	/*default ShipmentResponse sendShipOrderRequestJSON(ShipOrderRequest body) {
		return sendShipmentRequestJSON(Variables.orderNumber, Content.SellerID, Variables.version, body);
	}
	
	default ShipmentResponse sendShipOrderRequestXML(ShipOrderWrapper body) {
		return sendShipmentRequestXML(Variables.orderNumber, Content.SellerID, Variables.version, body);
	}*/
	
	default ShipOrderResponse sendShipmentRequest(ShipOrderRequestImpl body,String orderNumber,String version) {
		switch(Variables.MediaType) {
		case JSON:	
			if(Variables.SimulationEnabled)
				return sendShipmentRequestJSON("123456", Content.SellerID, null, (ShipOrderRequestJSON)body);
			else
				return sendShipmentRequestJSON(orderNumber, Content.SellerID, version, (ShipOrderRequestJSON)body);
			
		case XML:	
			if(Variables.SimulationEnabled)
				return sendShipmentRequestXML("123456", Content.SellerID, null, (ShipOrderRequest)body);
			else
				return sendShipmentRequestXML(orderNumber, Content.SellerID, version, (ShipOrderRequest)body);	
			
		default:
			throw new RuntimeException("Never Happened!");
		}
				
	}
	
	static ShipmentCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.URIHash = URILock.SHIPMENT;
		
		return new CallerFactory<ShipmentCaller>()
			.jsonBuild(ShipmentCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}

	static ShipmentCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		Variables.URIHash = URILock.SHIPMENT;
		
		return new CallerFactory<ShipmentCaller>()
			.xmlBuild(ShipmentCaller.class, Variables.LogLevel, Variables.Retryer, OrderClient.genClient());		
	}
	
	
	
	
	
}
