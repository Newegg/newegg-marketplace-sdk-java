package newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.rma.RMAConfig;
import newegg.marketplace.sdk.rma.Variables;
import newegg.marketplace.sdk.rma.model.EditRMARequest;
import newegg.marketplace.sdk.rma.model.EditRMAResponse;
import newegg.marketplace.sdk.rma.model.bean.EditRMAInfo;

public class RMAUpdateCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	// @Test
	public void sendRMAUpdateRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	// @Test
	public void sendRMAUpdateRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void sendRMAUpdateRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		sendRMAUpdateRequest_XML();
		Variables.SimulationEnabled = false;
	}

//	@Test
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

		EditRMARequest request = new EditRMARequest();
		// request.setOperationType("EditRMARequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		EditRMAResponse response = new EditRMAResponse();
		try {
			response = call.sendRMAUpdateRequest(request, "309");
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
						"RMAUpdateCaller.sendRMAUpdateRequest [" + type + "] command fail  (Status:" + rsStatus + ").",
						"true".equals(response.getIsSuccess()));
		}

	}

	private EditRMARequest.RequestBody getBody() {
		EditRMARequest.RequestBody body = new EditRMARequest.RequestBody();

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
