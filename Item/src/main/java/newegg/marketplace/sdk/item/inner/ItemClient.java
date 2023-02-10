package newegg.marketplace.sdk.item.inner;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import newegg.marketplace.sdk.common.BaseClient;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.item.Variables;

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
 * @author QB
 *
 */
public class ItemClient extends BaseClient{

	private static Logger log = LogManager.getLogger(ItemClient.class);
	
	public static Client genClient(){		
		Client client=null;
		if(Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}",Variables.SimulationEnabled);
			switch(Variables.MediaType){//UpdateInventoryAndPriceResult
			case JSON:
				client=genMockClient(client,"/GetItemPriceListResponse.json",HttpMethod.POST,"/contentmgmt/item/Pricelist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetVolumeDiscountResponse.json",HttpMethod.PUT,"/contentmgmt/item/volumediscount?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/SubmitVolumeDiscountResponse.json",HttpMethod.POST,"/contentmgmt/item/volumediscount?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/AddManufacturerResponse.json",HttpMethod.POST,"/contentmgmt/manufacturer/creationrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetManufacturerResponse.json",HttpMethod.PUT,"/contentmgmt/manufacturer/manufacturerinfo?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetManufacturerResponseV2.json",HttpMethod.PUT,"/contentmgmt/manufacturer/manufacturerinfo/V2?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetManufacturerProcessStatusResponse.json",HttpMethod.PUT,"/contentmgmt/manufacturer/creationrequeststatus?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ItemWarrantyResponse.json",HttpMethod.POST,"/contentmgmt/item/warranty?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/InventoryResult.json",HttpMethod.PUT,"/contentmgmt/item/international/inventory?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetPriceResponse.json",HttpMethod.PUT,"/contentmgmt/item/international/price?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/UpdateInventoryResult.json",HttpMethod.POST,"/contentmgmt/item/international/inventory?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/UpdatePriceResult.json",HttpMethod.POST,"/contentmgmt/item/international/price?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/InventoryResultV2.json",HttpMethod.POST,"/contentmgmt/item/inventory?sellerid=" + Content.SellerID+"&version=304");
				client=genMockClient(client,"/PriceResultV2.json",HttpMethod.POST,"/contentmgmt/item/price?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/UpdateInventoryAndPriceResult.json",HttpMethod.PUT,"/contentmgmt/item/inventoryandprice?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetItemInternationalInventoryListResponse.json",HttpMethod.POST,"/contentmgmt/item/international/inventorylist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetItemInventoryListResponse.json",HttpMethod.POST,"/contentmgmt/item/inventorylist?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetInternationalItemPriceListResponse.json",HttpMethod.POST,"/contentmgmt/item/international/Pricelist?sellerid=" + Content.SellerID);
				break;	
			case XML:
				client=genMockClient(client,"/GetVolumeDiscountResponse.xml",HttpMethod.PUT,"/contentmgmt/item/volumediscount?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/SubmitVolumeDiscountResponse.xml",HttpMethod.POST,"/contentmgmt/item/volumediscount?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/AddManufacturerResponse.xml",HttpMethod.POST,"/contentmgmt/manufacturer/creationrequest?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetManufacturerResponse.xml",HttpMethod.PUT,"/contentmgmt/manufacturer/manufacturerinfo?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetManufacturerResponseV2.xml",HttpMethod.PUT,"/contentmgmt/manufacturer/manufacturerinfo/V2?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetManufacturerProcessStatusResponse.xml",HttpMethod.PUT,"/contentmgmt/manufacturer/creationrequeststatus?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/ItemWarrantyResponse.xml",HttpMethod.POST,"/contentmgmt/item/warranty?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/InventoryResult.xml",HttpMethod.PUT,"/contentmgmt/item/international/inventory?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetPriceResponse.xml",HttpMethod.PUT,"/contentmgmt/item/international/price?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/UpdateInventoryResult.xml",HttpMethod.POST,"/contentmgmt/item/international/inventory?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/UpdatePriceResult.xml",HttpMethod.POST,"/contentmgmt/item/international/price?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/InventoryResultV2.xml",HttpMethod.POST,"/contentmgmt/item/inventory?sellerid=" + Content.SellerID+"&version=304");
				client=genMockClient(client,"/PriceResultV2.xml",HttpMethod.POST,"/contentmgmt/item/price?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/UpdateInventoryAndPriceResult.xml",HttpMethod.PUT,"/contentmgmt/item/inventoryandprice?sellerid=" + Content.SellerID);
				break;
			}
		}
		return client==null? new Client.Default(null, null): client;
	}
	
}
