package com.newegg.marketplace.sdk.report.inner;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.report.ReportConfig;
import com.newegg.marketplace.sdk.report.RequireSetting;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.model.get.GetReportStatusRequest;
import com.newegg.marketplace.sdk.report.model.get.GetReportStatusResponse;

public class ReportStatusCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetReportStatusRequest buildGetReportStatusRequest(PLATFORM p) {
		GetReportStatusRequest request = new GetReportStatusRequest();
		GetReportStatusRequest.RequestBody body = new GetReportStatusRequest.RequestBody();
		GetReportStatusRequest.RequestBody.GetRequestStatus status = new GetReportStatusRequest.RequestBody.GetRequestStatus();
		GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList idList = 
				new GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
		
		switch (p) {
		case USA:
			idList.getRequestID().add("23NPUG2D8V21U");
			status.setRequestIDList(idList);
			status.setMaxCount(20);
			break;
			
		case CAN:
			idList.getRequestID().add("22MZFTW09GQVU");
			status.setRequestIDList(idList);
			status.setMaxCount(20);
			break;
			
		case USB:
			idList.getRequestID().add("2524NA6NYM2KH");
			status.setRequestIDList(idList);
			status.setMaxCount(20);
			break;
			
		default:
			break;
		}
		
		body.setGetRequestStatus(status);
		request.setRequestBody(body);
		request.setOperationType("GetReportStatusRequest");
		
		return request;
	}
	
	@Test
	public void testGetReportStatus_XML() {
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		sendGetReportStatus(false, MEDIA_TYPE.XML, PLATFORM.USB);
	}
	
	//@Test
	public void testGetReportStatus_JSON() {
		// USA
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.USA);

		// CAN
		RequireSetting.authKeySetting("A3TV");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		// USB
		RequireSetting.authKeySetting("A44S");
		sendGetReportStatus(false, MEDIA_TYPE.JSON, PLATFORM.USB);
	}
	
	private void sendGetReportStatus(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		GetReportStatusResponse response = null;
		GetReportStatusRequest request = null;
		ReportStatusCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		// only USA
		try {
			Content.Platform = flatofrm;
			RequireSetting.log.info(RequireSetting.getTestInfo());
			
			request = buildGetReportStatusRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = ReportStatusCaller.buildXML();
			else
				sender = ReportStatusCaller.buildJSON();
			
			response = sender.sendReportStatusRequest(request);
			RequireSetting.log.info("Zack-Test END");
			assertTrue("true".equalsIgnoreCase(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testGetReportStatus_MOCK_XML() {
		RequireSetting.authKeySetting("A006");
		sendGetReportStatus(true, MEDIA_TYPE.XML, PLATFORM.USA);
		System.out.println(PLATFORM.USA.name() + ", " + PLATFORM.CAN);
	}
	
	//@Test
	public void testGetReportStatus_MOCK_JSON() {
		// only JSON
		sendGetReportStatus(true, MEDIA_TYPE.JSON, PLATFORM.USA);
	}
	
	

}
