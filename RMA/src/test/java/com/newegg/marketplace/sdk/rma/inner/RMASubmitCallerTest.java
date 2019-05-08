package com.newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.rma.RMAConfig;
import com.newegg.marketplace.sdk.rma.Variables;
import com.newegg.marketplace.sdk.rma.model.SubmitRMARequest;
import com.newegg.marketplace.sdk.rma.model.SubmitRMAResponse;

public class RMASubmitCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	// @Test
	public void sendRMASubmitRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	// @Test
	public void sendRMASubmitRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void testRMASubmitRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMASubmitRequest_XML();
		Variables.SimulationEnabled = false;
	}

	@Test
	public void testRMASubmitRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMASubmitRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailRMACaller(Content.MEDIA_TYPE type) {
		RMASubmitCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = RMASubmitCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			call = RMASubmitCaller.buildJSON();
		}

		SubmitRMARequest request = new SubmitRMARequest();
		// request.setOperationType("IssueRMARequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		SubmitRMAResponse response = new SubmitRMAResponse();
		try {
			response = call.sendRMASubmitRequest(request, "307");
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
				assertTrue(
						"RMASubmitCaller.SendRMASubmitRequest [" + type + "] command fail (Status:" + rsStatus + ").",
						"true".equals(response.getIsSuccess()));
		}
	}

	private SubmitRMARequest.RequestBody getBody() {
		SubmitRMARequest.RequestBody body = new SubmitRMARequest.RequestBody();
		SubmitRMARequest.RequestBody.IssueRMA issueRMA = new SubmitRMARequest.RequestBody.IssueRMA();
		SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList.RMATransaction rmaTrans = new SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList.RMATransaction();
		SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList list = new SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList();

		rmaTrans.setSellerPartNumber("test001");
		rmaTrans.setReturnQuantity(BigInteger.valueOf(1));
		rmaTrans.setReturnUnitPrice(BigDecimal.valueOf(1.00));
		rmaTrans.setRefundShippingPrice(BigDecimal.valueOf(1.00));
		rmaTrans.setRmaReason(2);

		list.getRmaTransaction().add(rmaTrans);

		issueRMA.setRmaType(2);
		issueRMA.setSourceSONumber(123456789);
		issueRMA.setSellerRMANumber("E12345678");
		issueRMA.setAutoReceiveMark(1);
		issueRMA.setRmaNote("This is a test RMA");
		issueRMA.setRmaTransactionList(list);

		body.setIssueRMA(issueRMA);

		return body;
	}

}
