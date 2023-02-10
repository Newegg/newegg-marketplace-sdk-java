package newegg.marketplace.sdk.report;

import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;

import feign.Logger;
import feign.Retryer;

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
 * The variables that could be overwrite global setting  used by library
 * 
 * @author Zack.J.Hung
 *
 */

public class Variables {
	public static Logger.Level LogLevel = Content.DEFAULT_LOG_LEVEL;
	public static Retryer Retryer = Content.RETRYER;
	public static MEDIA_TYPE MediaType = MEDIA_TYPE.XML;
	public static boolean SimulationEnabled = Content.SIMULATION_ENABLED;
	public static URILock URIHash;
	public enum URILock {
		REPORT_STATUS,
		ORDER_LIST,
		SETTLEMENT_SUMMARY,
		SETTLEMENT_TRANSACTION,
		RMA_LIST,
		ITEM_LOOKUP,
		DAILY_INVENTORY,
		DAILY_PRICE,
		DAILY_INVENTORY_CA,
		PREMIER_ITEM,
		CA_PRO_65,
		TAX_SET_ITEMS_ON_FOR_CHINA,
		ITEM_BASIC
	}
}
