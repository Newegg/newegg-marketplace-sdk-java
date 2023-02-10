package newegg.marketplace.sdk.other.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import newegg.marketplace.sdk.common.BaseClient;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.other.Variables;

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
public class OtherClient extends BaseClient{

	private static Logger log = LogManager.getLogger(OtherClient.class);
	
	public static Client genClient() {	
		Client client=null;
		if(Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}",Variables.SimulationEnabled);
			switch(Variables.MediaType){
			case JSON:
				client=genMockClient(client,"/GetServiceStatusResponse2.json",HttpMethod.GET,"/contentmgmt/servicestatus?sellerid=" + Content.SellerID);
				break;	
			case XML:
				client=genMockClient(client,"/GetServiceStatusResponse2.xml",HttpMethod.GET,"/contentmgmt/servicestatus?sellerid=" + Content.SellerID);
				break;
			}
		}
		
		return client==null? new Client.Default(null, null): client;
	}
	
}
