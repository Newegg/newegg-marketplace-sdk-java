package com.newegg.marketplace.sdk.datafeed.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ExistingItemCreationFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemBasicInformationFeedResponse;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedRequest;
import com.newegg.marketplace.sdk.datafeed.model.ItemCreationOrUpdateFeedResponse;

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
 * 
 * @author QB
 *
 */
public interface SubmitCreationCaller {

	/*
	 * Item Creation/Update Feed
	 */

	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v3")
	ItemBasicInformationFeedResponse itemBasicInformationFeedJSON(@Param("sellerid") String sellerID, ItemBasicInformationFeedRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v3")
	ItemBasicInformationFeedResponse itemBasicInformationFeedXML(@Param("sellerid") String sellerID, ItemBasicInformationFeedRequest body);

	default ItemBasicInformationFeedResponse itemBasicInformationFeed(ItemBasicInformationFeedRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return itemBasicInformationFeedJSON(Content.SellerID, body);
		case XML:
			return itemBasicInformationFeedXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v2")
	ExistingItemCreationFeedResponse existingItemCreationFeedJSON(@Param("sellerid") String sellerID, ExistingItemCreationFeedRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v2")
	ExistingItemCreationFeedResponse existingItemCreationFeedXML(@Param("sellerid") String sellerID, ExistingItemCreationFeedRequest body);

	default ExistingItemCreationFeedResponse existingItemCreationFeed(ExistingItemCreationFeedRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return existingItemCreationFeedJSON(Content.SellerID, body);
		case XML:
			return existingItemCreationFeedXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v1")
	ItemCreationOrUpdateFeedResponse itemCreationFeedJSON(@Param("sellerid") String sellerID, ItemCreationOrUpdateFeedRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /datafeedmgmt/feeds/submitfeed?sellerid={sellerid}&requesttype=ITEM_DATA&v1")
	ItemCreationOrUpdateFeedResponse itemCreationFeedXML(@Param("sellerid") String sellerID, ItemCreationOrUpdateFeedRequest body);

	default ItemCreationOrUpdateFeedResponse itemCreationFeed(ItemCreationOrUpdateFeedRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return itemCreationFeedJSON(Content.SellerID, body);
		case XML:
			return itemCreationFeedXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	static SubmitCreationCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		return new CallerFactory<SubmitCreationCaller>()
				.jsonBuild(SubmitCreationCaller.class, Variables.LogLevel, Variables.Retryer, DataFeedClient.genClient());
	}

	static SubmitCreationCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;
		return new CallerFactory<SubmitCreationCaller>()
				.xmlBuild(SubmitCreationCaller.class, Variables.LogLevel, Variables.Retryer, DataFeedClient.genClient());
	}
}
