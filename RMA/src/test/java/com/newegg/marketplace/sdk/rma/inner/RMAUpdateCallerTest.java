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
import com.newegg.marketplace.sdk.rma.model.RMAUpdateRequest;
import com.newegg.marketplace.sdk.rma.model.RMAUpdateResponse;
import com.newegg.marketplace.sdk.rma.model.bean.EditRMAInfo;

public class RMAUpdateCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	//@Test
	public void sendRMAUpdateRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	//@Test
	public void sendRMAUpdateRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void sendRMAUpdateRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAUpdateRequest_XML();
		Variables.SimulationEnabled = false;
	}

	@Test
	public void sendRMAUpdateRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAUpdateRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailRMACaller(Content.MEDIA_TYPE type) {
		RMAUpdateCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = RMAUpdateCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			call = RMAUpdateCaller.buildJSON();
		}

		RMAUpdateRequest request = new RMAUpdateRequest();
		request.setOperationType("EditRMARequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		RMAUpdateResponse response = new RMAUpdateResponse();
		try {
			response = call.sendRMAUpdateRequest("309", request);
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
				assertTrue("RMAUpdateCaller.sendRMAUpdateRequest [" + type + "] command fail  (Status:" + rsStatus + ").", "true".equals(response.getIsSuccess()));
		}

	}

	private RMAUpdateRequest.RequestBody getBody() {
		RMAUpdateRequest.RequestBody body = new RMAUpdateRequest.RequestBody();

		EditRMAInfo editInfo = new EditRMAInfo();
		EditRMAInfo.RMATransactionList transList = new EditRMAInfo.RMATransactionList();
		EditRMAInfo.RMATransactionList.RMATransaction trans = new EditRMAInfo.RMATransactionList.RMATransaction();
		trans.setSellerPartNumber("Ben_item_12");
		trans.setReturnQuantity(1);
		trans.setReturnUnitPrice(BigDecimal.valueOf(200));
		trans.setRefundShippingPrice(BigDecimal.valueOf(10));
		trans.setRmaReason(5);
		transList.getRmaTransaction().add(trans);

		editInfo.setRmaNumber(38875640);
		editInfo.setRmaType(2);
		editInfo.setSellerRMANumber("E12345678");
		editInfo.setRmaNote("your note here");
		editInfo.setRmaTransactionList(transList);
		body.setEditRMAInfo(editInfo);

		return body;
	}

}
