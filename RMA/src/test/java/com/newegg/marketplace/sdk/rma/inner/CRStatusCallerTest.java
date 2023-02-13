package com.newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.rma.RMAConfig;
import com.newegg.marketplace.sdk.rma.Variables;
import com.newegg.marketplace.sdk.rma.model.GetCourtesyRefundRequestStatusRequest;
import com.newegg.marketplace.sdk.rma.model.GetCourtesyRefundRequestStatusResponse;

public class CRStatusCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	//@Test
	public void getCourtesyRefundStatusRequest_XML() {
		initailCRCaller(Content.MEDIA_TYPE.XML);
	}

	//@Test
	public void getCourtesyRefundStatusRequest_JSON() {
		initailCRCaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void getCourtesyRefundStatusRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		getCourtesyRefundStatusRequest_XML();
		Variables.SimulationEnabled = false;
	}

	@Test
	public void getCourtesyRefundStatusRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		getCourtesyRefundStatusRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailCRCaller(Content.MEDIA_TYPE type) {

		CRStatusCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = CRStatusCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
			call = CRStatusCaller.buildJSON();
		}

		GetCourtesyRefundRequestStatusRequest request = new GetCourtesyRefundRequestStatusRequest();
		//request.setOperationType("GetCourtesyRefundStatusRequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		GetCourtesyRefundRequestStatusResponse response = new GetCourtesyRefundRequestStatusResponse();
		try {
			response = call.getCourtesyRefundStatusRequest(request);

		} catch (NeweggException e) {
			rsStatus = e.status();

			if (e.status() == 400 || e.status() == 429)
				System.out.println("HTTP Response Message : " + e.contentUTF8());

			if (type == Content.MEDIA_TYPE.XML)
				System.out.println(e.toXML(e.genErors()));
			else if (type == Content.MEDIA_TYPE.JSON)
				System.out.println(e.toJson(e.genErors()));
		} catch (Exception e) {
			response.setIsSuccess("true");
		} finally {
			assertTrue("CRStatusCaller.getCourtesyRefundStatusRequest [" + type + "] command fail (Status:" + rsStatus + ").", "true".equals(response.getIsSuccess()));

			if (type == Content.MEDIA_TYPE.JSON)
				Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);

		}

	}

	private GetCourtesyRefundRequestStatusRequest.RequestBody getBody() {
		GetCourtesyRefundRequestStatusRequest.RequestBody body = new GetCourtesyRefundRequestStatusRequest.RequestBody();
		GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus crStatus = new GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus();
		GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList idList = new GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList();

		idList.getRequestID().add("8f8648da-7d92-4086-bbe5-e399e07895e6");
		crStatus.setRequestIDList(idList);
		crStatus.setMaxCount(100);
		crStatus.setRequestStatus("IN_PROGRESS");
		body.setGetRequestStatus(crStatus);

		return body;
	}

}
