package com.newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.rma.RMAConfig;
import com.newegg.marketplace.sdk.rma.Variables;
import com.newegg.marketplace.sdk.rma.model.RMAReceiveRequest;
import com.newegg.marketplace.sdk.rma.model.RMAReceiveResponse;
import com.newegg.marketplace.sdk.rma.model.bean.ReceiveRMAInfo;

public class RMAReceiveCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	//@Test
	public void sendRMAReceiveRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	//@Test
	public void sendRMAReceiveRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void sendRMAReceiveRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAReceiveRequest_XML();
		Variables.SimulationEnabled = false;
	}

	@Test
	public void sendRMAReceiveRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAReceiveRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailRMACaller(Content.MEDIA_TYPE type) {
		RMAReceiveCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = RMAReceiveCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			call = RMAReceiveCaller.buildJSON();
		}

		RMAReceiveRequest request = new RMAReceiveRequest();
		request.setOperationType("ReceiveRMARequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		RMAReceiveResponse response = new RMAReceiveResponse();
		try {
			response = call.sendRMAReceiveRequest("307", request);
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
				assertTrue("RMAReceiveCaller.sendRMAReceiveRequest [" + type + "] command fail (Status:" + rsStatus + ").", "true".equals(response.getIsSuccess()));
		}
	}

	private RMAReceiveRequest.RequestBody getBody() {
		RMAReceiveRequest.RequestBody body = new RMAReceiveRequest.RequestBody();

		ReceiveRMAInfo receiveInfo = new ReceiveRMAInfo();
		receiveInfo.setRmaNumber(38873480);

		body.setReceiveRMAInfo(receiveInfo);

		return body;
	}

}
