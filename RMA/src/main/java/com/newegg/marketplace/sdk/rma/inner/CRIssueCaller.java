package com.newegg.marketplace.sdk.rma.inner;

import com.newegg.marketplace.sdk.common.CallerFactory;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.rma.Variables;
import com.newegg.marketplace.sdk.rma.model.CRIssueRequest;
import com.newegg.marketplace.sdk.rma.model.CRIssueResponse;

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
public interface CRIssueCaller {
	/*
	 * Command define from Order Confirmation API Guide JSON and XML format
	 */
	@Headers({ "Accept: application/json", "Content-Type: application/json" })
	@RequestLine("POST /servicemgmt/courtesyrefund/new?sellerid={sellerid}")
	CRIssueResponse getCourtesyRefundIssueRequestJSON(@Param("sellerid") String sellerID, CRIssueRequest body);

	@Headers({ "Accept: application/xml", "Content-Type: application/xml" })
	@RequestLine("POST /servicemgmt/courtesyrefund/new?sellerid={sellerid}")
	CRIssueResponse getCourtesyRefundIssueRequestXML(@Param("sellerid") String sellerID, CRIssueRequest body);

	// Implement default method of interface class that according to Variables.MediaType to run at JSON or XML request.
	default CRIssueResponse getCourtesyRefundIssueRequest(CRIssueRequest body) {
		switch (Variables.MediaType) {
		case JSON:
			return getCourtesyRefundIssueRequestJSON(Content.SellerID, body);
		case XML:
			return getCourtesyRefundIssueRequestXML(Content.SellerID, body);
		default:
			throw new RuntimeException("Never Happened!");
		}

	}

	static CRIssueCaller buildJSON() {
		Variables.MediaType = MEDIA_TYPE.JSON;

		return new CallerFactory<CRIssueCaller>()
				.jsonBuild(CRIssueCaller.class, Variables.LogLevel, Variables.Retryer, RMAClient.genClient());
	}

	static CRIssueCaller buildXML() {
		Variables.MediaType = MEDIA_TYPE.XML;

		return new CallerFactory<CRIssueCaller>()
				.xmlBuild(CRIssueCaller.class, Variables.LogLevel, Variables.Retryer, RMAClient.genClient());
	}

}
