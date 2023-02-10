package newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.rma.RMAConfig;
import newegg.marketplace.sdk.rma.Variables;
import newegg.marketplace.sdk.rma.model.RejectRMARequest;
import newegg.marketplace.sdk.rma.model.RejectRMAResponse;
import newegg.marketplace.sdk.rma.model.bean.RejectRMAInfo;

public class RMARejectCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	// @Test
	public void sendRMARejectRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	// @Test
	public void sendRMARejectRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void sendRMARejectRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMARejectRequest_XML();
		Variables.SimulationEnabled = false;
	}

//	@Test
	public void sendRMARejectRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMARejectRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailRMACaller(Content.MEDIA_TYPE type) {
		RMARejectCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = RMARejectCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			call = RMARejectCaller.buildJSON();
		}

		RejectRMARequest request = new RejectRMARequest();
		// request.setOperationType("RejectRMARequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		RejectRMAResponse response = new RejectRMAResponse();
		try {
			response = call.sendRMARejectRequest(request, "307");
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
						"RMARejectCaller.sendRMARejectRequest [" + type + "] command fail (Status:" + rsStatus + ").",
						"true".equals(response.getIsSuccess()));
		}
	}

	private RejectRMARequest.RequestBody getBody() {
		RejectRMARequest.RequestBody body = new RejectRMARequest.RequestBody();

		RejectRMAInfo rejectInfo = new RejectRMAInfo();
		RejectRMAInfo.TrackingNumberList transList = new RejectRMAInfo.TrackingNumberList();

		transList.getTrackingNumber().add("123123123123");

		rejectInfo.setRmaNumber(38875640);
		rejectInfo.setRejectReason(3);
		rejectInfo.setShipCarrier(5);
		rejectInfo.setOtherShipCarrier("other");
		rejectInfo.setShipService("Ground");
		rejectInfo.setTrackingNumberList(transList);

		body.setRejectRMAInfo(rejectInfo);

		return body;
	}

}
