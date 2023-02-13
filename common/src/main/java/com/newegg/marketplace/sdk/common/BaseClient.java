package com.newegg.marketplace.sdk.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import feign.Client;
import feign.Util;
import feign.mock.HttpMethod;
import feign.mock.MockClient;
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
public class BaseClient {

	private static Logger log = LogManager.getLogger(BaseClient.class);
	
	protected static MockClient genMockClient(Client client,String resources,HttpMethod method,String uri) {
		if(client ==null) {
			try (InputStream input = BaseClient.class.getResourceAsStream(resources)) {
				client = new MockClient().ok(method,uri,Util.toByteArray(input));
			} catch (IOException e) {
				log.warn("Simulation fail",e);						
				client=null;
			}
		}else if(client instanceof MockClient){
			try (InputStream input = BaseClient.class.getResourceAsStream(resources)) {
				MockClient mc=(MockClient)client;
				client=mc.add(method, uri, 200, Util.toByteArray(input));
			} catch (IOException e) {
				log.warn("Simulation fail",e);	
			}
		}
		
		return (MockClient) client;
	}
}
