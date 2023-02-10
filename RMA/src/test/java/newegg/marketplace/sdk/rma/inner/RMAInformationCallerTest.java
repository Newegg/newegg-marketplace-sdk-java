package newegg.marketplace.sdk.rma.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.rma.RMAConfig;
import newegg.marketplace.sdk.rma.Variables;
import newegg.marketplace.sdk.rma.model.GetRMAInformationRequest;
import newegg.marketplace.sdk.rma.model.GetRMAInformationResponse;

public class RMAInformationCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(RMAConfig.class);
	}

	// @Test
	public void getRMAInformationRequest_XML() {
		initailRMACaller(Content.MEDIA_TYPE.XML);
	}

	// @Test
	public void getRMAInformationRequest_JSON() {
		initailRMACaller(Content.MEDIA_TYPE.JSON);
	}

	@Test
	public void getRMAInformationRequest_XML_MOCK() {
		Variables.SimulationEnabled = true;
		getRMAInformationRequest_XML();
		Variables.SimulationEnabled = false;
	}

	@Test
	public void getRMAInformationRequest_JSON_MOCK() {
		Variables.SimulationEnabled = true;
		getRMAInformationRequest_JSON();
		Variables.SimulationEnabled = false;
	}

	private void initailRMACaller(Content.MEDIA_TYPE type) {
		RMAInformationCaller call = null;

		if (type == Content.MEDIA_TYPE.XML) {
			call = RMAInformationCaller.buildXML();
		} else if (type == Content.MEDIA_TYPE.JSON) {
			Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
			call = RMAInformationCaller.buildJSON();
		}

		GetRMAInformationRequest request = new GetRMAInformationRequest();
		// request.setOperationType("GetRMAInfoRequest");
		request.setRequestBody(getBody());

		int rsStatus = 200;
		GetRMAInformationResponse response = new GetRMAInformationResponse();
		try {
			response = call.getRMAInformationRequest(request, "309");
		} catch (NeweggException e) {
			rsStatus = e.status();

			if (e.status() == 400 || e.status() == 429)
				System.out.println("HTTP Response Message : " + e.contentUTF8());

			if (type == Content.MEDIA_TYPE.XML)
				System.out.println(e.toXML(e.genErors()));
			else if (type == Content.MEDIA_TYPE.JSON)
				System.out.println(e.toJson(e.genErors()));
		} catch (Exception e) {
//			assertTrue(false);

		} finally {
//			assertTrue("RMAInformationCaller.getRMAInformationRequest [" + type + "] command fail (Status:" + rsStatus
//					+ ").", "true".equals(response.getIsSuccess()));

			if (type == Content.MEDIA_TYPE.JSON)
				Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);

		}
	}

	private GetRMAInformationRequest.RequestBody getBody() {
		GetRMAInformationRequest.RequestBody body = new GetRMAInformationRequest.RequestBody();
		GetRMAInformationRequest.RequestBody.PageInfo pageInfo = new GetRMAInformationRequest.RequestBody.PageInfo();

		pageInfo.setPageIndex(1);
		pageInfo.setPageSize(10);
		body.setPageInfo(pageInfo);
		body.setKeywordsType(1);
		body.setKeywordsValue("2135422");
		body.setStatus(0);
		body.setRmaDateFrom("1999-01-01");
		body.setRmaDateFrom("2019-12-31");
		body.setRmaType(0);
		body.setProcessedBy(0);

		return body;
	}

}
