package newegg.marketplace.sdk.rma.inner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import newegg.marketplace.sdk.common.BaseClient;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.rma.Variables;
import newegg.marketplace.sdk.rma.Variables.UpdateRMARequestType;

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
 * 
 * @author Achilles.K.Lin
 *
 */

public class RMAClient extends BaseClient {
	private static Logger log = LogManager.getLogger(RMAClient.class);

	public static Client genClient() {
		Client client = null;
		if (Variables.SimulationEnabled) {
			log.debug("SimulationEnabled:{}", Variables.SimulationEnabled);
			switch (Variables.MediaType) {
			case JSON:
				client = genMockClient(client, "/RMASubmitResponse.json", HttpMethod.POST, "/servicemgmt/rma/newrma?sellerid=" + Content.SellerID + "&version=307");
				client = genMockClient(client, "/RMAInformationResponse.json", HttpMethod.PUT, "/servicemgmt/rma/rmainfo?sellerid=" + Content.SellerID + "&version=307");
				if (Variables.UpdateRequestType == UpdateRMARequestType.Update)
					client = genMockClient(client, "/RMAUpdateResponse.json", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				else if (Variables.UpdateRequestType == UpdateRMARequestType.Reject)
					client = genMockClient(client, "/RMARejectResponse.json", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				else if (Variables.UpdateRequestType == UpdateRMARequestType.Void)
					client = genMockClient(client, "/RMAVoidResponse.json", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				else if (Variables.UpdateRequestType == UpdateRMARequestType.Receive)
					client = genMockClient(client, "/RMAReceiveResponse.json", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				client = genMockClient(client, "/CRStatusResponse.json", HttpMethod.PUT, "/servicemgmt/courtesyrefund/requeststatus?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/CRInfoResponse.json", HttpMethod.PUT, "/servicemgmt/courtesyrefund/info?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/CRIssueResponse.json", HttpMethod.POST, "/servicemgmt/courtesyrefund/new?sellerid=" + Content.SellerID);
				break;

			case XML:
				client = genMockClient(client, "/RMASubmitResponse.xml", HttpMethod.POST, "/servicemgmt/rma/newrma?sellerid=" + Content.SellerID + "&version=307");
				client = genMockClient(client, "/RMAInformationResponse.xml", HttpMethod.PUT, "/servicemgmt/rma/rmainfo?sellerid=" + Content.SellerID + "&version=307");
				if (Variables.UpdateRequestType == UpdateRMARequestType.Update)
					client = genMockClient(client, "/RMAUpdateResponse.xml", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				else if (Variables.UpdateRequestType == UpdateRMARequestType.Reject)
					client = genMockClient(client, "/RMARejectResponse.xml", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				else if (Variables.UpdateRequestType == UpdateRMARequestType.Void)
					client = genMockClient(client, "/RMAVoidResponse.xml", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				else if (Variables.UpdateRequestType == UpdateRMARequestType.Receive)
					client = genMockClient(client, "/RMAReceiveResponse.xml", HttpMethod.POST, "/servicemgmt/rma/updaterma?sellerid=" + Content.SellerID + "&version=307");
				client = genMockClient(client, "/CRStatusResponse.xml", HttpMethod.PUT, "/servicemgmt/courtesyrefund/requeststatus?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/CRInfoResponse.xml", HttpMethod.PUT, "/servicemgmt/courtesyrefund/info?sellerid=" + Content.SellerID);
				client = genMockClient(client, "/CRIssueResponse.xml", HttpMethod.POST, "/servicemgmt/courtesyrefund/new?sellerid=" + Content.SellerID);
				break;

			default:
				break;
			}
		}
		return client == null ? new Client.Default(null, null) : client;
	}

}
