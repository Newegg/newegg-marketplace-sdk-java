package com.newegg.marketplace.sdk.order;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.order.inner.AdditionalOrderInforCaller;
import com.newegg.marketplace.sdk.order.inner.CancelOrderCaller;
import com.newegg.marketplace.sdk.order.inner.OrderConfirmCaller;
import com.newegg.marketplace.sdk.order.inner.OrderInfoCaller;
import com.newegg.marketplace.sdk.order.inner.OrderStatusCaller;
import com.newegg.marketplace.sdk.order.inner.RemoveItemCaller;
import com.newegg.marketplace.sdk.order.inner.SBNOrderCancellationCaller;
import com.newegg.marketplace.sdk.order.inner.ShipmentCaller;
import com.newegg.marketplace.sdk.order.model.CancelOrderRequest;
import com.newegg.marketplace.sdk.order.model.CancelOrderResponse;
import com.newegg.marketplace.sdk.order.model.GetAdditionalOrderInformationRequest;
import com.newegg.marketplace.sdk.order.model.GetAdditionalOrderInformationResponse;
import com.newegg.marketplace.sdk.order.model.GetOrderInformationRequest;
import com.newegg.marketplace.sdk.order.model.GetOrderInformationResponse;
import com.newegg.marketplace.sdk.order.model.GetOrderStatusResponse;
import com.newegg.marketplace.sdk.order.model.GetSBNOrderCancellationRequestResultResponse;
import com.newegg.marketplace.sdk.order.model.OrderConfirmationRequest;
import com.newegg.marketplace.sdk.order.model.OrderConfirmationResponse;
import com.newegg.marketplace.sdk.order.model.RemoveItemRequest;
import com.newegg.marketplace.sdk.order.model.RemoveItemResponse;
import com.newegg.marketplace.sdk.order.model.ShipOrderRequestImpl;
import com.newegg.marketplace.sdk.order.model.ShipOrderResponse;



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
 * 
 * @author Zack.J.Hung
 *
 */
public class OrderCall {
	private OrderConfirmCaller ocCaller;
	private OrderStatusCaller osCaller;
	private CancelOrderCaller coCaller;
	private AdditionalOrderInforCaller aoCaller;
    private ShipmentCaller shipCaller;
    private OrderInfoCaller oiCaller;
    private SBNOrderCancellationCaller sbnCaller;
    private RemoveItemCaller rmItemCaller;
	
	public OrderCall() {
		this(Content.MEDIA_TYPE.XML);
	}
	
	private OrderCall(Content.MEDIA_TYPE mediaType) {
		switch (mediaType) {
		case XML:
			ocCaller = OrderConfirmCaller.buildXML();
			osCaller = OrderStatusCaller.buildXML();
			coCaller = CancelOrderCaller.buildXML();
			aoCaller = AdditionalOrderInforCaller.buildXML();
			shipCaller = ShipmentCaller.buildXML();
			oiCaller = OrderInfoCaller.buildXML();
			sbnCaller = SBNOrderCancellationCaller.buildXML();
			rmItemCaller = RemoveItemCaller.buildXML();			
			break;
			
		case JSON:
			ocCaller = OrderConfirmCaller.buildJSON();
			osCaller = OrderStatusCaller.buildJSON();
			coCaller = CancelOrderCaller.buildJSON();
			aoCaller = AdditionalOrderInforCaller.buildJSON();
			shipCaller = ShipmentCaller.buildJSON();
			oiCaller = OrderInfoCaller.buildJSON();
			sbnCaller = SBNOrderCancellationCaller.buildJSON();
			rmItemCaller = RemoveItemCaller.buildJSON();
			break;
			
		default:
			throw new RuntimeException("Never Happened!");
		}
	}
	
	
	
	// Redefine method of interface class of com.newegg.marketplace.sdk.order.inner package
	// request command
	public OrderConfirmationResponse orderConfirmation(OrderConfirmationRequest body) {
		return ocCaller.sendOrderConfirmRequest(body);
	}
	
	public GetOrderStatusResponse getOrderStatus(String orderNumber,String version) {
		return osCaller.sendOrderStatusRequest(orderNumber,version);
	}
	
	public CancelOrderResponse cancelOrder(CancelOrderRequest body,String orderNumber,String version) {
		return coCaller.sendCancelOrderRequest(body,orderNumber,version);
	}
	
	public GetAdditionalOrderInformationResponse getAdditionalOrderInformation(GetAdditionalOrderInformationRequest body) {
		if (Content.Platform == Content.PLATFORM.USA) {
			return aoCaller.sendAdditionalOrderInforRequest(body);
		} else {
			throw new PlatformException(Content.PLATFORM.USB.name() + ", " + Content.PLATFORM.CAN.name());
		}
	}
	
	public ShipOrderResponse shipOrder(ShipOrderRequestImpl/*ShipOrderRequest*/ body,String orderNumber,String version) {
		return shipCaller.sendShipmentRequest(body,orderNumber,version);
	}
	
	/*public ShipmentResponse sendShipmentRequestJSON(ShipOrderRequest body) {
		return shipCaller.sendShipOrderRequestJSON(body);
	}
	
	public ShipmentResponse sendShipmentRequestXML(ShipOrderWrapper body) {
		return shipCaller.sendShipOrderRequestXML(body);
	}*/
	
	public GetOrderInformationResponse getOrderInformation(GetOrderInformationRequest body,String version) {
		return oiCaller.sendOrderInfoRequest(body,version);
	}
	
	public GetSBNOrderCancellationRequestResultResponse getSBNOrderCancellationRequestResult(String orderNumber) {
		return sbnCaller.sendSBNOrderCancellationCallerRequest(orderNumber);
	}
	
	public RemoveItemResponse removeItem(RemoveItemRequest body,String orderNumber) {
		return rmItemCaller.sendRemoveItemRequest(body, orderNumber);
	}
	
}
