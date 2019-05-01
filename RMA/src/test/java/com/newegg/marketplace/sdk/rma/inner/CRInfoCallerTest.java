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
import com.newegg.marketplace.sdk.rma.model.CRInfoRequest;
import com.newegg.marketplace.sdk.rma.model.CRInfoResponse;

public class CRInfoCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	@Test
	public void getCourtesyRefundStatusRequest_XML() {
		initailCRCaller(Content.MEDIA_TYPE.XML);
	}

	@Test
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

		CRInfoCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = CRInfoCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
			call = CRInfoCaller.buildJSON();
		}

		CRInfoRequest request = new CRInfoRequest();
		request.setOperationType("GetCourtesyRefundInfo");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		CRInfoResponse response = new CRInfoResponse();
		try {
			response = call.getCourtesyRefundInfoRequest(request);
		} catch (NeweggException e) {
			rsStatus = e.status();

			if (e.status() == 400 || e.status() == 429)
				System.out.println("HTTP Response Message : " + e.contentUTF8());

			if (type == Content.MEDIA_TYPE.XML)
				System.out.println(e.toXML(e.genErors()));
			else if (type == Content.MEDIA_TYPE.JSON)
				System.out.println(e.toJson(e.genErors()));

		} finally {
			assertTrue("CRInfoCaller.getCourtesyRefundInfoRequest [" + type + "] command fail (Status:" + rsStatus + ").", "true".equals(response.getIsSuccess()));

			if (type == Content.MEDIA_TYPE.JSON)
				Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		}

	}

	private CRInfoRequest.RequestBody getBody() {
		CRInfoRequest.RequestBody body = new CRInfoRequest.RequestBody();
		CRInfoRequest.RequestBody.PageInfo pageInfo = new CRInfoRequest.RequestBody.PageInfo();
		pageInfo.setPageIndex(1);
		pageInfo.setPageSize(10);

		body.setPageInfo(pageInfo);
		body.setKeywordsType(0);
		body.setStatus(0);
		body.setDateFrom("2001-12-17 09:30:47");
		body.setDateTo("2011-12-17 12:30:47");

		return body;
	}

}
