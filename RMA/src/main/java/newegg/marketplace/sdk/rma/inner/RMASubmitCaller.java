package newegg.marketplace.sdk.rma.inner;

import newegg.marketplace.sdk.common.CallerFactory;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.rma.Variables;
import newegg.marketplace.sdk.rma.model.SubmitRMARequest;
import newegg.marketplace.sdk.rma.model.SubmitRMAResponse;

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
 * @author Achilles.K.Lin
 *
 */
public interface RMASubmitCaller {
	/*
	 * Command define from Order Confirmation API Guide JSON and XML format
	 */
	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /servicemgmt/rma/newrma?sellerid={sellerid}&version={version}")
	SubmitRMAResponse sendRMASubmitRequestJSON(@Param("sellerid") String sellerID, @Param("version") String version,
			SubmitRMARequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /servicemgmt/rma/newrma?sellerid={sellerid}&version={version}")
	SubmitRMAResponse sendRMASubmitRequestXML(@Param("sellerid") String sellerID, @Param("version") String version,
			SubmitRMARequest body);

	// Implement default method of interface class that according to
	// Variables.MediaType to run at JSON or XML request.
	default SubmitRMAResponse sendRMASubmitRequest(SubmitRMARequest body, String version) {
		switch (Variables.MediaType) {
		case JSON:
			if (Variables.SimulationEnabled)
				return sendRMASubmitRequestJSON(Content.SellerID, "307", body);
			else
				return sendRMASubmitRequestJSON(Content.SellerID, version, body);

		case XML:
			if (Variables.SimulationEnabled)
				return sendRMASubmitRequestXML(Content.SellerID, "307", body);
			else
				return sendRMASubmitRequestXML(Content.SellerID, version, body);

		default:
			throw new RuntimeException("Never Happened!");
		}

	}

	static RMASubmitCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;

		return new CallerFactory<RMASubmitCaller>().jsonBuild(RMASubmitCaller.class, Variables.LogLevel,
				Variables.Retryer, RMAClient.genClient());
	}

	static RMASubmitCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;

		return new CallerFactory<RMASubmitCaller>().xmlBuild(RMASubmitCaller.class, Variables.LogLevel,
				Variables.Retryer, RMAClient.genClient());
	}

}
