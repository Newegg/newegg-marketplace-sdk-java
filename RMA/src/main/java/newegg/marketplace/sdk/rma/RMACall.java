package newegg.marketplace.sdk.rma;

import com.fasterxml.jackson.databind.DeserializationFeature;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.rma.inner.CRInfoCaller;
import newegg.marketplace.sdk.rma.inner.CRIssueCaller;
import newegg.marketplace.sdk.rma.inner.CRStatusCaller;
import newegg.marketplace.sdk.rma.inner.RMAInformationCaller;
import newegg.marketplace.sdk.rma.inner.RMAReceiveCaller;
import newegg.marketplace.sdk.rma.inner.RMARejectCaller;
import newegg.marketplace.sdk.rma.inner.RMASubmitCaller;
import newegg.marketplace.sdk.rma.inner.RMAUpdateCaller;
import newegg.marketplace.sdk.rma.inner.RMAVoidCaller;
import newegg.marketplace.sdk.rma.model.EditRMARequest;
import newegg.marketplace.sdk.rma.model.EditRMAResponse;
import newegg.marketplace.sdk.rma.model.GetCourtesyRefundInformationRequest;
import newegg.marketplace.sdk.rma.model.GetCourtesyRefundInformationResponse;
import newegg.marketplace.sdk.rma.model.GetCourtesyRefundRequestStatusRequest;
import newegg.marketplace.sdk.rma.model.GetCourtesyRefundRequestStatusResponse;
import newegg.marketplace.sdk.rma.model.GetRMAInformationRequest;
import newegg.marketplace.sdk.rma.model.GetRMAInformationResponse;
import newegg.marketplace.sdk.rma.model.IssueCourtesyRefundRequest;
import newegg.marketplace.sdk.rma.model.IssueCourtesyRefundResponse;
import newegg.marketplace.sdk.rma.model.ReceiveRMARequest;
import newegg.marketplace.sdk.rma.model.ReceiveRMAResponse;
import newegg.marketplace.sdk.rma.model.RejectRMARequest;
import newegg.marketplace.sdk.rma.model.RejectRMAResponse;
import newegg.marketplace.sdk.rma.model.SubmitRMARequest;
import newegg.marketplace.sdk.rma.model.SubmitRMAResponse;
import newegg.marketplace.sdk.rma.model.VoidRMARequest;
import newegg.marketplace.sdk.rma.model.VoidRMAResponse;

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

	// Redefine method of interface class of newegg.marketplace.sdk.rma.inner
	// package
	// request command
	public SubmitRMAResponse submitRMA(SubmitRMARequest body, String version) {
		return rmaSubmitCaller.sendRMASubmitRequest(body, version);
	}

	public GetRMAInformationResponse getRMAInformation(GetRMAInformationRequest body, String version) {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		GetRMAInformationResponse r = rmaInfoCaller.getRMAInformationRequest(body, version);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}

	public EditRMAResponse editRMA(EditRMARequest body, String version) {
		return rmaUpdateCaller.sendRMAUpdateRequest(body, version);
	}

	public RejectRMAResponse rejectRMA(RejectRMARequest body, String version) {
		return rmaRejectCaller.sendRMARejectRequest(body, version);
	}

	public VoidRMAResponse voidRMA(VoidRMARequest body, String version) {
		return rmaVoidCaller.sendRMAVoidRequest(body, version);
	}

	public ReceiveRMAResponse receiveRMA(ReceiveRMARequest body, String version) {
		return rmaReceiveCaller.sendRMAReceiveRequest(body, version);
	}

	public GetCourtesyRefundRequestStatusResponse getCourtesyRefundRequestStatus(
			GetCourtesyRefundRequestStatusRequest body) {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		GetCourtesyRefundRequestStatusResponse r = crStatusCaller.getCourtesyRefundStatusRequest(body);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}

	public GetCourtesyRefundInformationResponse getCourtesyRefundInformation(GetCourtesyRefundInformationRequest body) {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		GetCourtesyRefundInformationResponse r = crInfoCaller.getCourtesyRefundInfoRequest(body);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		return r;
	}

	public IssueCourtesyRefundResponse issueCourtesyRefund(IssueCourtesyRefundRequest body) {
		return crIssueCaller.getCourtesyRefundIssueRequest(body);
	}

}
