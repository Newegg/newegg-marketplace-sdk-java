package com.newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.rma.RMAConfig;
import com.newegg.marketplace.sdk.rma.Variables;
import com.newegg.marketplace.sdk.rma.model.IssueCourtesyRefundRequest;
import com.newegg.marketplace.sdk.rma.model.IssueCourtesyRefundResponse;

public class CRIssueCallerTest {

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

		CRIssueCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = CRIssueCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			call = CRIssueCaller.buildJSON();
		}

		IssueCourtesyRefundRequest request = new IssueCourtesyRefundRequest();
		//request.setOperationType("IssueCourtesyRefund");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		IssueCourtesyRefundResponse response = new IssueCourtesyRefundResponse();
		try {
			response = call.getCourtesyRefundIssueRequest(request);

		} catch (NeweggException e) {
			rsStatus = e.status();

			if (e.status() == 400 || e.status() == 429)
				System.out.println("HTTP Response Message : " + e.contentUTF8());

			if (type == Content.MEDIA_TYPE.XML)
				System.out.println(e.toXML(e.genErors()));
			else if (type == Content.MEDIA_TYPE.JSON)
				System.out.println(e.toJson(e.genErors()));

		} finally {
			if (Variables.SimulationEnabled)
				assertTrue("CRIssueCaller.getCourtesyRefundIssueRequest [" + type + "] command fail (Status:" + rsStatus + ").", "true".equals(response.getIsSuccess()));
		}
	}

	private IssueCourtesyRefundRequest.RequestBody getBody() {
		IssueCourtesyRefundRequest.RequestBody body = new IssueCourtesyRefundRequest.RequestBody();
		IssueCourtesyRefundRequest.RequestBody.IssueCourtesyRefund issueRefund = new IssueCourtesyRefundRequest.RequestBody.IssueCourtesyRefund();
		issueRefund.setSourceSONumber(299395404);
		issueRefund.setRefundReason(3);
		issueRefund.setTotalRefundAmount(BigDecimal.valueOf(1));
		issueRefund.setNoteToCustomer("can courtesy refund 0528");

		body.setIssueCourtesyRefund(issueRefund);

		return body;
	}

}
