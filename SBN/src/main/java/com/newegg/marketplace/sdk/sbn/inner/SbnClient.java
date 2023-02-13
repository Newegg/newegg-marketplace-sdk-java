package com.newegg.marketplace.sdk.sbn.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.newegg.marketplace.sdk.common.BaseClient;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.sbn.Variables;

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
public class SbnClient extends BaseClient{

	private static Logger log = LogManager.getLogger(SbnClient.class);
	
	public static Client genClient() {	
		Client client=null;
		if(Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}",Variables.SimulationEnabled);
			switch(Variables.MediaType){
			case JSON:
				client=genMockClient(client,"/GetInboundShipmentPlanResponse.json",HttpMethod.PUT,"/sbnmgmt/inboundshipment/plansuggestion?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/SubmitInboundShipmentCreateResponse.json",HttpMethod.POST,"/sbnmgmt/inboundshipment/shipmentrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetShipmentStatusResponse.json",HttpMethod.PUT,"/sbnmgmt/inboundshipment/shipmentstatus?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetInboundShipmentResultResponse.json",HttpMethod.GET,"/sbnmgmt/inboundshipment/shipmentresult/testid?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetShipmentListResponse.json",HttpMethod.PUT,"/sbnmgmt/inboundshipment/shipmentlist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetWarehouseListResponse.json",HttpMethod.PUT,"/sbnmgmt/inboundshipment/warehouse?sellerid=" + Content.SellerID);
				break;	
			case XML:
				client=genMockClient(client,"/GetInboundShipmentPlanResponse.xml",HttpMethod.PUT,"/sbnmgmt/inboundshipment/plansuggestion?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/SubmitInboundShipmentCreateResponse.xml",HttpMethod.POST,"/sbnmgmt/inboundshipment/shipmentrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetShipmentStatusResponse.xml",HttpMethod.PUT,"/sbnmgmt/inboundshipment/shipmentstatus?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetInboundShipmentResultResponse.xml",HttpMethod.GET,"/sbnmgmt/inboundshipment/shipmentresult/testid?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetShipmentListResponse.xml",HttpMethod.PUT,"/sbnmgmt/inboundshipment/shipmentlist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetWarehouseListResponse.xml",HttpMethod.PUT,"/sbnmgmt/inboundshipment/warehouse?sellerid=" + Content.SellerID);
				break;
			}
		}
		
		return client==null? new Client.Default(null, null): client;
	}
	
}
