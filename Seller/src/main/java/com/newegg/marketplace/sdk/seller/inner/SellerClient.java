package com.newegg.marketplace.sdk.seller.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.newegg.marketplace.sdk.common.BaseClient;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.seller.Variables;

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
public class SellerClient extends BaseClient{

	private static Logger log = LogManager.getLogger(SellerClient.class);
	
	public static Client genClient(){	//GetSubcategoryPropertyValueResponse	
		Client client=null;
		if(Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}",Variables.SimulationEnabled);
			switch(Variables.MediaType){
			case JSON:
				if(Content.Platform == Content.PLATFORM.USA) {
					client=genMockClient(client,"/GetSellerAccountStatusResponse307.json",HttpMethod.GET,"/sellermgmt/seller/accountstatus?sellerid=" + Content.SellerID + "&version=307");
				} else {
					client=genMockClient(client,"/GetSellerAccountStatusResponse.json",HttpMethod.GET,"/sellermgmt/seller/accountstatus?sellerid=" + Content.SellerID);					
				}	
				client=genMockClient(client,"/GetIndustryResponse.json",HttpMethod.GET,"/sellermgmt/seller/industry?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/schema.zip",HttpMethod.PUT,"/sellermgmt/seller/feedschema?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcatetoryResponse.json",HttpMethod.PUT,"/sellermgmt/seller/subcategory?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcatetoryResponseV2.json",HttpMethod.PUT,"/sellermgmt/seller/subcategory/V2?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcatetoryPropertiesResponse.json",HttpMethod.PUT,"/sellermgmt/seller/subcategoryproperty?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcategoryPropertyValueResponse.json",HttpMethod.PUT,"/sellermgmt/seller/propertyvalue?sellerid=" + Content.SellerID);
				break;	
			case XML:
				if (Content.Platform == Content.PLATFORM.USA) {
					client=genMockClient(client,"/GetSellerAccountStatusResponse307.xml",HttpMethod.GET,"/sellermgmt/seller/accountstatus?sellerid=" + Content.SellerID + "&version=307");						
				}else {
					client=genMockClient(client,"/GetSellerAccountStatusResponse.xml",HttpMethod.GET,"/sellermgmt/seller/accountstatus?sellerid=" + Content.SellerID);						
				}
				client=genMockClient(client,"/GetIndustryResponse.xml",HttpMethod.GET,"/sellermgmt/seller/industry?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/schema.zip",HttpMethod.PUT,"/sellermgmt/seller/feedschema?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcatetoryResponse.xml",HttpMethod.PUT,"/sellermgmt/seller/subcategory?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcatetoryResponseV2.xml",HttpMethod.PUT,"/sellermgmt/seller/subcategory/V2?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcatetoryPropertiesResponse.xml",HttpMethod.PUT,"/sellermgmt/seller/subcategoryproperty?sellerid=" + Content.SellerID);
				client=genMockClient(client,"/GetSubcategoryPropertyValueResponse.xml",HttpMethod.PUT,"/sellermgmt/seller/propertyvalue?sellerid=" + Content.SellerID);
				break;
			}
		}
		
		return client==null? new Client.Default(null, null): client;
	}
	
}
