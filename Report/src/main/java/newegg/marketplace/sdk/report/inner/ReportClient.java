package newegg.marketplace.sdk.report.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import newegg.marketplace.sdk.common.BaseClient;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.report.Variables;

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
 * 
 * @author Zack.J.Hung
 *
 */
public class ReportClient extends BaseClient {
	private static Logger log = LogManager.getLogger(ReportClient.class);

	public static Client genClient() {		
		Client client = null;
		if (Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}", Variables.SimulationEnabled);
			
			switch (Variables.MediaType) {
			case JSON: 
				switch (Variables.URIHash) {
				case ITEM_BASIC:
					client = genMockClient(client, "/GetItemBasicInformationReportResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitItemBasicInformationReport.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
				case REPORT_STATUS:
					client = genMockClient(client, "/GetReportStatusResponse.json", HttpMethod.PUT, "/reportmgmt/report/status?sellerid=" + Content.SellerID);
					break;
					
				case ORDER_LIST:
					client = genMockClient(client, "/OrderListResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID + "&version=309");
					client = genMockClient(client, "/SubmitOrderListResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SETTLEMENT_SUMMARY:
					client = genMockClient(client, "/SettlementSummaryResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitSettlementSummaryResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SETTLEMENT_TRANSACTION:
					client = genMockClient(client, "/SettlementTransactionResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitSettlementTransactionResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case RMA_LIST:
					client = genMockClient(client, "/RMAListResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID + "&version=309");
					client = genMockClient(client, "/SubmitRMAListResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case ITEM_LOOKUP:
					client = genMockClient(client, "/ItemLookupResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitItemLookupResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case DAILY_INVENTORY:
					client = genMockClient(client, "/DailyInventoryResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitDailyInventoryResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=310");
					break;
					
				case DAILY_PRICE:
					client = genMockClient(client, "/DailyPriceResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitDailyPriceResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=310");
					break;
					
				case DAILY_INVENTORY_CA:
					client = genMockClient(client, "/DailyInventBtoBCANResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitDailyInventoryResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=310");
					break;
					
				case PREMIER_ITEM:
					client = genMockClient(client, "/PremierItemResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitPremierItemResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case CA_PRO_65:
					client = genMockClient(client, "/CAPropSixtyFiveResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitCAPropSixtyFiveResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case TAX_SET_ITEMS_ON_FOR_CHINA:
					client = genMockClient(client, "/ItemChinaTaxSettingResponse.json", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitItemChinaTaxSettingResponse.json", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				default:
					break;
				}
				break; 
				
				
			case XML:
				switch (Variables.URIHash) {
				case REPORT_STATUS:
					client = genMockClient(client, "/GetReportStatusResponse.xml", HttpMethod.PUT, "/reportmgmt/report/status?sellerid=" + Content.SellerID);
					break;
					
				case ORDER_LIST:	
					client = genMockClient(client, "/OrderListResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID + "&version=309");
					client = genMockClient(client, "/SubmitOrderListResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SETTLEMENT_SUMMARY:	
					client = genMockClient(client, "/SettlementSummaryResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitSettlementSummaryResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SETTLEMENT_TRANSACTION:
					client = genMockClient(client, "/SettlementTransactionResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitSettlementTransactionResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case RMA_LIST:
					client = genMockClient(client, "/RMAListResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID + "&version=309");
					client = genMockClient(client, "/SubmitRMAListResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case ITEM_LOOKUP:	
					client = genMockClient(client, "/ItemLookupResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitItemLookupResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case DAILY_INVENTORY:	
					client = genMockClient(client, "/DailyInventoryResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitDailyInventoryResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=310");
					break;
					
				case DAILY_PRICE:	
					client = genMockClient(client, "/DailyPriceResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitDailyPriceResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=310" );
					break;
					
				case DAILY_INVENTORY_CA:
					client = genMockClient(client, "/DailyInventBtoBCANResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitDailyInventBtoBCANResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=310");
					break;
					
				case PREMIER_ITEM:	
					client = genMockClient(client, "/PremierItemResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitPremierItemResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case CA_PRO_65:	
					client = genMockClient(client, "/CAPropSixtyFiveResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitCAPropSixtyFiveResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case TAX_SET_ITEMS_ON_FOR_CHINA:	
					client = genMockClient(client, "/ItemChinaTaxSettingResponse.xml", HttpMethod.PUT, "/reportmgmt/report/result?sellerid=" + Content.SellerID);
					client = genMockClient(client, "/SubmitItemChinaTaxSettingResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
					// submit
				/*case SUBMIT_ORDER_LIST:		
					client = genMockClient(client, "/SubmitOrderListResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_SETTLEMENT_SUMMARY:	
					client = genMockClient(client, "/SubmitSettlementSummaryResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_SETTLEMENT_TRANSACTION:	
					client = genMockClient(client, "/SubmitSettlementTransactionResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_RMA_LIST:	
					client = genMockClient(client, "/SubmitRMAListResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_ITEM_LOOKUP:	
					client = genMockClient(client, "/SubmitItemLookupResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_DAILY_INVENTORY:	
					client = genMockClient(client, "/SubmitDailyInventoryResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=" + Variables.version);
					break;
					
				case SUBMIT_DAILY_PRICE:	
					client = genMockClient(client, "/SubmitDailyPriceResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=" + Variables.version);
					break;
					
				case SUBMIT_DAILY_INVENTORY_CA:	
					client = genMockClient(client, "/SubmitDailyInventBtoBCANResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID + "&version=" + Variables.version);
					break;
					
				case SUBMIT_PREMIER_ITEM:	
					client = genMockClient(client, "/SubmitPremierItemResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_CA_PRO_65:	
					client = genMockClient(client, "/SubmitCAPropSixtyFiveResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;
					
				case SUBMIT_TAX_SET_ITEMS_ON_FOR_CHINA:	
					client = genMockClient(client, "/SubmitItemChinaTaxSettingResponse.xml", HttpMethod.POST, "/reportmgmt/report/submitrequest?sellerid=" + Content.SellerID);
					break;*/
					
					default:
						break;
				}
				break;
				
			default:
				break;
			}
		}
		return client == null ? new Client.Default(null, null) : client;
	}
}
