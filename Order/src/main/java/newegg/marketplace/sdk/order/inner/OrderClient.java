package newegg.marketplace.sdk.order.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import newegg.marketplace.sdk.common.BaseClient;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.order.inner.OrderClient;
import newegg.marketplace.sdk.order.Variables;
import newegg.marketplace.sdk.order.Variables.URILock;

import feign.Client;
import feign.mock.HttpMethod;

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
 * To Generated client which is simulation or not
 * @author Zack.J.Hung
 *
 */

public class OrderClient extends BaseClient {
	private static Logger log = LogManager.getLogger(OrderClient.class);
	
	public static Client genClient() {	
		Client client = null;
		if (Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}", Variables.SimulationEnabled);
			switch (Variables.MediaType) {
			case JSON:
				client = genMockClient(client, "/GetOrderStatusResponse.json", HttpMethod.GET, "/ordermgmt/orderstatus/orders/123456?sellerid=" + Content.SellerID );
				
				if (Variables.URIHash == URILock.CANCEL_ORDER) {
					client = genMockClient(client, "/CancelOrderResponse.json", HttpMethod.PUT, "/ordermgmt/orderstatus/orders/123456?sellerid=" + Content.SellerID );
				} else if (Variables.URIHash == URILock.SHIPMENT) {
					client = genMockClient(client, "/ShipmentResponse.json", HttpMethod.PUT, "/ordermgmt/orderstatus/orders/123456?sellerid=" + Content.SellerID );
				}
					
				client = genMockClient(client, "/OrderConfirmResponse.json", HttpMethod.POST, "/ordermgmt/orderstatus/orders/confirmation?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/RemoveItemResponse.json", HttpMethod.PUT, "/ordermgmt/killitem/orders/123456?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/GetOrderInfoResponse.json", HttpMethod.PUT, "/ordermgmt/order/orderinfo?sellerid=" + Content.SellerID +"&version=304");
				//client = genMockClient(client, "/GetOrderInfoResponseBtoB.json", HttpMethod.PUT, "/ordermgmt/order/orderinfo?sellerid=" + Content.SellerID + "&version=" + Variables.version);
				//client = genMockClient(client, "/GetOrderInfoResponseCAN.json", HttpMethod.PUT, "/ordermgmt/order/orderinfo?sellerid=" + Content.SellerID + "&version=" + Variables.version);
				client = genMockClient(client, "/GetSBNOrderCancellationResponse.json", HttpMethod.GET, "/ordermgmt/sbnorder/cancellationresult/123456?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/GetAddOrderInfoResponse.json", HttpMethod.POST, "/ordermgmt/order/addorderinfo?sellerid=" + Content.SellerID);
				break;
				
			case XML:
				client = genMockClient(client, "/GetOrderStatusResponse.xml", HttpMethod.GET, "/ordermgmt/orderstatus/orders/123456?sellerid=" + Content.SellerID );
				
				if (Variables.URIHash == URILock.CANCEL_ORDER) {
					client = genMockClient(client, "/CancelOrderResponse.xml", HttpMethod.PUT, "/ordermgmt/orderstatus/orders/123456?sellerid=" + Content.SellerID );
				} else if (Variables.URIHash == URILock.SHIPMENT) {
					client = genMockClient(client, "/ShipmentResponse.xml", HttpMethod.PUT, "/ordermgmt/orderstatus/orders/123456?sellerid=" + Content.SellerID );
				}
				
				client = genMockClient(client, "/OrderConfirmResponse.xml", HttpMethod.POST, "/ordermgmt/orderstatus/orders/confirmation?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/RemoveItemResponse.xml", HttpMethod.PUT, "/ordermgmt/killitem/orders/123456?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/GetOrderInfoResponse.xml", HttpMethod.PUT, "/ordermgmt/order/orderinfo?sellerid=" + Content.SellerID +"&version=304");
				//client = genMockClient(client, "/GetOrderInfoResponseBtoB.xml", HttpMethod.PUT, "/ordermgmt/order/orderinfo?sellerid=" + Content.SellerID + "&version=" + Variables.version);
				//client = genMockClient(client, "/GetOrderInfoResponseCAN.xml", HttpMethod.PUT, "/ordermgmt/order/orderinfo?sellerid=" + Content.SellerID + "&version=" + Variables.version);
				client = genMockClient(client, "/GetSBNOrderCancellationResponse.xml", HttpMethod.GET, "/ordermgmt/sbnorder/cancellationresult/123456?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/GetAddOrderInfoResponse.xml", HttpMethod.POST, "/ordermgmt/order/addorderinfo?sellerid=" + Content.SellerID);
				break;
				
			default:
				break;
			}
		}
		return client == null ? new Client.Default(null, null) : client;
	}

}
