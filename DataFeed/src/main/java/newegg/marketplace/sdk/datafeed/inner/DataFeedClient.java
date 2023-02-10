package newegg.marketplace.sdk.datafeed.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import newegg.marketplace.sdk.common.BaseClient;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.datafeed.Variables;

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
public class DataFeedClient extends BaseClient{

	private static Logger log = LogManager.getLogger(DataFeedClient.class);
	
	public static Client genClient() {	
		Client client=null;
		if(Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}",Variables.SimulationEnabled);
			switch(Variables.MediaType){
			case JSON:
				client=genMockClient(client,"/GetFeedStatusResponse.json",HttpMethod.PUT,"/datafeedmgmt/feeds/status?sellerid=" + Content.SellerID);				
				client=genMockClient(client,"/ProcessingReportResponse.json",HttpMethod.GET,"/datafeedmgmt/feeds/result/test?sellerid=" + Content.SellerID);
				
				client=genMockClient(client,"/ItemChinaTaxSettingResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_CHINATAXSETTING_DATA");
				client=genMockClient(client,"/AddingCAProp65Response.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_CAPROP65_DATA");
				client=genMockClient(client,"/ItemSubscriptionResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_SUBSCRIPTION");
				
				client=genMockClient(client,"/ShipNoticeResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ORDER_SHIP_NOTICE_DATA");
				client=genMockClient(client,"/MultiChannelOrderResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=MULTICHANNEL_ORDER_DATA");
				
				client=genMockClient(client,"/VolumeDiscountResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=VOLUME_DISCOUNT_DATA");
				client=genMockClient(client,"/ItemPromotionResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_PROMOTION_DATA");
				client=genMockClient(client,"/PremierItemMarkResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_PREMIER_MARK_DATA");
				
				client=genMockClient(client,"/InventoryAndPriceResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=INVENTORY_AND_PRICE_DATA");				
				client=genMockClient(client,"/PriceUpdateResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=PRICE_DATA");				
				client=genMockClient(client,"/InventoryUpdateResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=INVENTORY_DATA");
				
				client=genMockClient(client,"/ItemUpdateResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_DATA&v3");
				client=genMockClient(client,"/ExistingFeedResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_DATA&v2");
				client=genMockClient(client,"/ItemfeedResponse.json",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_DATA&v1");
				break;	
			case XML:
				client=genMockClient(client,"/GetFeedStatusResponse.xml",HttpMethod.PUT,"/datafeedmgmt/feeds/status?sellerid=" + Content.SellerID);								
				client=genMockClient(client,"/ProcessingReportResponse.xml",HttpMethod.GET,"/datafeedmgmt/feeds/result/test?sellerid=" + Content.SellerID);
				
				client=genMockClient(client,"/ItemChinaTaxSettingResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_CHINATAXSETTING_DATA");
				client=genMockClient(client,"/AddingCAProp65Response.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_CAPROP65_DATA");
				client=genMockClient(client,"/ItemSubscriptionResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_SUBSCRIPTION");				
				
				client=genMockClient(client,"/ShipNoticeResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ORDER_SHIP_NOTICE_DATA");
				client=genMockClient(client,"/MultiChannelOrderResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=MULTICHANNEL_ORDER_DATA");
				
				client=genMockClient(client,"/VolumeDiscountResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=VOLUME_DISCOUNT_DATA");
				client=genMockClient(client,"/ItemPromotionResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_PROMOTION_DATA");
				client=genMockClient(client,"/PremierItemMarkResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_PREMIER_MARK_DATA");
				
				client=genMockClient(client,"/InventoryAndPriceResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=INVENTORY_AND_PRICE_DATA");				
				client=genMockClient(client,"/PriceUpdateResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=PRICE_DATA");				
				client=genMockClient(client,"/InventoryUpdateResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=INVENTORY_DATA");
				
				client=genMockClient(client,"/ItemUpdateResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_DATA&v3");
				client=genMockClient(client,"/ExistingFeedResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_DATA&v2");
				client=genMockClient(client,"/ItemfeedResponse.xml",HttpMethod.POST,"/datafeedmgmt/feeds/submitfeed?sellerid=" + Content.SellerID+"&requesttype=ITEM_DATA&v1");
				break;
			}
		}
		
		return client==null? new Client.Default(null, null): client;
	}
	
}
