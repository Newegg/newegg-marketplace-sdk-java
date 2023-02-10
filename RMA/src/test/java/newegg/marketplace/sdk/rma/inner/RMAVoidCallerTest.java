package newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.rma.RMAConfig;
import newegg.marketplace.sdk.rma.Variables;
import newegg.marketplace.sdk.rma.model.VoidRMARequest;
import newegg.marketplace.sdk.rma.model.VoidRMAResponse;
import newegg.marketplace.sdk.rma.model.bean.VoidRMAInfo;

public class RMAVoidCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	// @Test
	public void sendRMAVoidRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	// @Test
	public void sendRMAVoidRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void sendRMAVoidRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAVoidRequest_XML();
		Variables.SimulationEnabled = false;
	}

//	@Test
	public void sendRMAVoidRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAVoidRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailRMACaller(Content.MEDIA_TYPE type) {
		RMAVoidCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = RMAVoidCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			call = RMAVoidCaller.buildJSON();
		}

		VoidRMARequest request = new VoidRMARequest();
		// request.setOperationType("VoidRMARequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		VoidRMAResponse response = new VoidRMAResponse();
		try {
			response = call.sendRMAVoidRequest(request, "307");
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
				assertTrue("RMAVoidCaller.sendRMAVoidRequest [" + type + "] command fail (Status:" + rsStatus + ").",
						"true".equals(response.getIsSuccess()));
		}

	}

	private VoidRMARequest.RequestBody getBody() {
		VoidRMARequest.RequestBody body = new VoidRMARequest.RequestBody();

		VoidRMAInfo voidInfo = new VoidRMAInfo();
		voidInfo.setRmaNumber(38875600);
		voidInfo.setVoidReason("Customer Requested");

		body.setVoidRMAInfo(voidInfo);

		return body;
	}

}
