package newegg.marketplace.sdk.datafeed.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.datafeed.Variables;
import newegg.marketplace.sdk.datafeed.model.InventoryAndPriceFeedRequest;
import newegg.marketplace.sdk.datafeed.model.InventoryAndPriceFeedResponse;
import newegg.marketplace.sdk.datafeed.model.InventoryUpdateFeedRequest;
import newegg.marketplace.sdk.datafeed.model.InventoryUpdateFeedResponse;
import newegg.marketplace.sdk.datafeed.model.PriceUpdateFeedRequest;
import newegg.marketplace.sdk.datafeed.model.PriceUpdateFeedResponse;

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
 * <pre>
 * IAP (Inventory And Price)
 * For openfeign used
 * </pre>
 * 
 * @author QB
 *
 */
public interface SubmitIAPCaller {

	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_AND_PRICE_DATA")
	InventoryAndPriceFeedResponse inventoryAndPriceFeedJSON(@Param("sellerid") String sellerID, InventoryAndPriceFeedRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_AND_PRICE_DATA")
	InventoryAndPriceFeedResponse inventoryAndPriceFeedXML(@Param("sellerid") String sellerID, InventoryAndPriceFeedRequest body);

	default InventoryAndPriceFeedResponse inventoryAndPriceFeed(InventoryAndPriceFeedRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return inventoryAndPriceFeedJSON(Content.SellerID, body);
		case XML:
			return inventoryAndPriceFeedXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}

	}

	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=PRICE_DATA")
	PriceUpdateFeedResponse priceUpdateFeedJSON(@Param("sellerid") String sellerID, PriceUpdateFeedRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=PRICE_DATA")
	PriceUpdateFeedResponse priceUpdateFeedXML(@Param("sellerid") String sellerID, PriceUpdateFeedRequest body);

	default PriceUpdateFeedResponse priceUpdateFeed(PriceUpdateFeedRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return priceUpdateFeedJSON(Content.SellerID, body);
		case XML:
			return priceUpdateFeedXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}

	}

	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_DATA")
	InventoryUpdateFeedResponse inventoryUpdateFeedJSON(@Param("sellerid") String sellerID, InventoryUpdateFeedRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=INVENTORY_DATA")
	InventoryUpdateFeedResponse inventoryUpdateFeedXML(@Param("sellerid") String sellerID, InventoryUpdateFeedRequest body);

	default InventoryUpdateFeedResponse inventoryUpdateFeed(InventoryUpdateFeedRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return inventoryUpdateFeedJSON(Content.SellerID, body);
		case XML:
			return inventoryUpdateFeedXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}

	}

	static SubmitIAPCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		return new CallerFactory<SubmitIAPCaller>()
				.jsonBuild(SubmitIAPCaller.class, Variables.LogLevel, Variables.Retryer, DataFeedClient.genClient());
	}

	static SubmitIAPCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		return new CallerFactory<SubmitIAPCaller>()
				.xmlBuild(SubmitIAPCaller.class, Variables.LogLevel, Variables.Retryer, DataFeedClient.genClient());
	}
}
