package com.newegg.marketplace.sdk.shipping.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.newegg.marketplace.sdk.common.BaseClient;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.shipping.Variables;

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
 * @author QB
 *
 */
public class ShipClient extends BaseClient{

	private static Logger log = LogManager.getLogger(ShipClient.class);
	
	public static Client genClient(){		
		Client client=null;
		if(Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}",Variables.SimulationEnabled);
			switch(Variables.MediaType){
			case JSON:
				client=genMockClient(client,"/ShippingSubmitResponse.json",HttpMethod.POST,"/shippingservice/shippinglabel/shippingrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ShippingDetailResponse.json",HttpMethod.PUT,"/shippingservice/shippinglabel/shippingdetail?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ShippingComfirmResponse.json",HttpMethod.POST,"/shippingservice/shippinglabel/confirmshippingrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ShippingVoidResponse.json",HttpMethod.POST,"/shippingservice/shippinglabel/voidshippingrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetPackageListResponse.json",HttpMethod.PUT,"/shippingservice/shippinglabel/packagelist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetShippingLabelResponse.json",HttpMethod.PUT,"/shippingservice/shippinglabel/shippinglabels?sellerid=" + Content.SellerID);
				break;	
			case XML:				
				client=genMockClient(client,"/ShippingSubmitResponse.xml",HttpMethod.POST,"/shippingservice/shippinglabel/shippingrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ShippingDetailResponse.xml",HttpMethod.PUT,"/shippingservice/shippinglabel/shippingdetail?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ShippingComfirmResponse.xml",HttpMethod.POST,"/shippingservice/shippinglabel/confirmshippingrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ShippingVoidResponse.xml",HttpMethod.POST,"/shippingservice/shippinglabel/voidshippingrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetPackageListResponse.xml",HttpMethod.PUT,"/shippingservice/shippinglabel/packagelist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetShippingLabelResponse.xml",HttpMethod.PUT,"/shippingservice/shippinglabel/shippinglabels?sellerid=" + Content.SellerID);
				break;
			}
		}
		
		return client==null? new Client.Default(null, null): client;
	}
	
}
