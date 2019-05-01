package com.newegg.marketplace.sdk.rma;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.rma.inner.CRInfoCaller;
import com.newegg.marketplace.sdk.rma.inner.CRIssueCaller;
import com.newegg.marketplace.sdk.rma.inner.CRStatusCaller;
import com.newegg.marketplace.sdk.rma.inner.RMAInformationCaller;
import com.newegg.marketplace.sdk.rma.inner.RMAReceiveCaller;
import com.newegg.marketplace.sdk.rma.inner.RMARejectCaller;
import com.newegg.marketplace.sdk.rma.inner.RMASubmitCaller;
import com.newegg.marketplace.sdk.rma.inner.RMAUpdateCaller;
import com.newegg.marketplace.sdk.rma.inner.RMAVoidCaller;
import com.newegg.marketplace.sdk.rma.model.CRInfoRequest;
import com.newegg.marketplace.sdk.rma.model.CRInfoResponse;
import com.newegg.marketplace.sdk.rma.model.CRIssueRequest;
import com.newegg.marketplace.sdk.rma.model.CRIssueResponse;
import com.newegg.marketplace.sdk.rma.model.CRStatusRequest;
import com.newegg.marketplace.sdk.rma.model.CRStatusResponse;
import com.newegg.marketplace.sdk.rma.model.RMAInformationRequest;
import com.newegg.marketplace.sdk.rma.model.RMAInformationResponse;
import com.newegg.marketplace.sdk.rma.model.RMAReceiveRequest;
import com.newegg.marketplace.sdk.rma.model.RMAReceiveResponse;
import com.newegg.marketplace.sdk.rma.model.RMARejectRequest;
import com.newegg.marketplace.sdk.rma.model.RMARejectResponse;
import com.newegg.marketplace.sdk.rma.model.RMASubmitRequest;
import com.newegg.marketplace.sdk.rma.model.RMASubmitResponse;
import com.newegg.marketplace.sdk.rma.model.RMAUpdateRequest;
import com.newegg.marketplace.sdk.rma.model.RMAUpdateResponse;
import com.newegg.marketplace.sdk.rma.model.RMAVoidRequest;
import com.newegg.marketplace.sdk.rma.model.RMAVoidResponse;

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
 * @author Achilles.K.Lin
 *
 */
public class RMACall {
	private RMASubmitCaller rmaSubmitCaller;
	private RMAInformationCaller rmaInfoCaller;
	private RMAUpdateCaller rmaUpdateCaller;
	private RMARejectCaller rmaRejectCaller;
	private RMAVoidCaller rmaVoidCaller;
	private RMAReceiveCaller rmaReceiveCaller;
	private CRStatusCaller crStatusCaller;
	private CRInfoCaller crInfoCaller;
	private CRIssueCaller crIssueCaller;

	public RMACall() {
		this(Content.MEDIA_TYPE.XML);
	}

	private RMACall(Content.MEDIA_TYPE mediaType) {
		switch (mediaType) {
		case XML:
			rmaSubmitCaller = RMASubmitCaller.buildXML();
			rmaInfoCaller = RMAInformationCaller.buildXML();
			rmaUpdateCaller = RMAUpdateCaller.buildXML();
			rmaRejectCaller = RMARejectCaller.buildXML();
			rmaVoidCaller = RMAVoidCaller.buildXML();
			rmaReceiveCaller = RMAReceiveCaller.buildXML();
			crStatusCaller = CRStatusCaller.buildXML();
			crInfoCaller = CRInfoCaller.buildXML();
			crIssueCaller = CRIssueCaller.buildXML();
			break;

		case JSON:
			rmaSubmitCaller = RMASubmitCaller.buildJSON();
			rmaInfoCaller = RMAInformationCaller.buildJSON();
			rmaUpdateCaller = RMAUpdateCaller.buildJSON();
			rmaRejectCaller = RMARejectCaller.buildJSON();
			rmaVoidCaller = RMAVoidCaller.buildJSON();
			rmaReceiveCaller = RMAReceiveCaller.buildJSON();
			crStatusCaller = CRStatusCaller.buildJSON();
			crInfoCaller = CRInfoCaller.buildJSON();
			crIssueCaller = CRIssueCaller.buildJSON();
			break;

		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	// Redefine method of interface class of com.newegg.marketplace.sdk.rma.inner package
	// request command
	public RMASubmitResponse submitRMA(String version, RMASubmitRequest body) {
		return rmaSubmitCaller.sendRMASubmitRequest(version, body);
	}

	public RMAInformationResponse getRMAInformation(String version, RMAInformationRequest body) {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		RMAInformationResponse r = rmaInfoCaller.getRMAInformationRequest(version, body);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}

	public RMAUpdateResponse editRMA(String version, RMAUpdateRequest body) {
		return rmaUpdateCaller.sendRMAUpdateRequest(version, body);
	}

	public RMARejectResponse rejectRMA(String version, RMARejectRequest body) {
		return rmaRejectCaller.sendRMARejectRequest(version, body);
	}

	public RMAVoidResponse voidRMA(String version, RMAVoidRequest body) {
		return rmaVoidCaller.sendRMAVoidRequest(version, body);
	}

	public RMAReceiveResponse receiveRMA(String version, RMAReceiveRequest body) {
		return rmaReceiveCaller.sendRMAReceiveRequest(version, body);
	}

	public CRStatusResponse getCourtesyRefundRequestStatus(CRStatusRequest body) {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		CRStatusResponse r = crStatusCaller.getCourtesyRefundStatusRequest(body);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}

	public CRInfoResponse getCourtesyRefundInformation(CRInfoRequest body) {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		CRInfoResponse r = crInfoCaller.getCourtesyRefundInfoRequest(body);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}

	public CRIssueResponse issueCourtesyRefund(CRIssueRequest body) {
		return crIssueCaller.getCourtesyRefundIssueRequest(body);
	}

}
