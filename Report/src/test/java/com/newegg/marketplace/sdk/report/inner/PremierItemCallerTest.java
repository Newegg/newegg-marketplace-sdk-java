package com.newegg.marketplace.sdk.report.inner;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.NeweggException;
import com.newegg.marketplace.sdk.report.ReportConfig;
import com.newegg.marketplace.sdk.report.RequireSetting;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.model.get.PremierItemRequest;
import com.newegg.marketplace.sdk.report.model.get.PremierItemResponse;
import com.newegg.marketplace.sdk.report.model.submit.SPremierItemRequest;
import com.newegg.marketplace.sdk.report.model.submit.SPremierItemResponse;

public class PremierItemCallerTest {
	/*PremierItemResponse response = new PremierItemResponse();
	PremierItemRequest request = new PremierItemRequest();
	PremierItemRequest.RequestBody body = new PremierItemRequest.RequestBody();
	PremierItemRequest.RequestBody.PageInfo page = new PremierItemRequest.RequestBody.PageInfo();
	PremierItemCaller sender = null;
	
	SPremierItemResponse SubmitResponse = new SPremierItemResponse();
	SPremierItemRequest SubmitRequest = new SPremierItemRequest();
	SPremierItemRequest.RequestBody SubmitBody = new SPremierItemRequest.RequestBody();
	SPremierItemRequest.RequestBody.PremierItemReportCriteria criteria = 
			new SPremierItemRequest.RequestBody.PremierItemReportCriteria();*/
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private PremierItemRequest buildGetPremierItemRequest(PLATFORM p) {
		PremierItemRequest request = new PremierItemRequest();
		PremierItemRequest.RequestBody body = new PremierItemRequest.RequestBody();
		PremierItemRequest.RequestBody.PageInfo page = new PremierItemRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			break;
			
		case CAN:
			
			break;
			
		case USB:
			
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		body.setRequestID("210CQTAFHO2N6");
		request.setRequestBody(body);
		request.setOperationType("PremierItemReportRequest");
		
		return request;
	}
	
	private SPremierItemRequest buildSubmitPremierItemRequest(PLATFORM p) {
		SPremierItemRequest submitRequest = new SPremierItemRequest();
		SPremierItemRequest.RequestBody submitBody = new SPremierItemRequest.RequestBody();
		SPremierItemRequest.RequestBody.PremierItemReportCriteria criteria = 
				new SPremierItemRequest.RequestBody.PremierItemReportCriteria();
		
		switch (p) {
		case USA:
			criteria.setSubcategoryID(20);
			criteria.setPremierMark(new BigInteger("0"));
			criteria.setFileType("CSV");
			break;
			
		case CAN:
			
			break;
			
		case USB:
			
			break;
			
		default:
			break;
		}
		
		criteria.setRequestType("PREMIER_ITEM_REPORT");
		submitBody.setPremierItemReportCriteria(criteria);
		submitRequest.setOperationType("PremierItemReportRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetPremierItem(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		PremierItemResponse response = null;
		PremierItemRequest request = null;
		PremierItemCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildGetPremierItemRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = PremierItemCaller.buildXML();
			else
				sender = PremierItemCaller.buildJSON();
			
			response = sender.sendPremierItemRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitPremierItem(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		SPremierItemResponse response = null;
		SPremierItemRequest request = null;
		PremierItemCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildSubmitPremierItemRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = PremierItemCaller.buildXML();
			else
				sender = PremierItemCaller.buildJSON();
			
			response = sender.sendSubmitPremierItemRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	/*private void buildRequest() {
		page.setPageIndex(1);
		page.setPageSize(10);
		body.setPageInfo(page);
		body.setRequestID("2PQBYWH4V68ZP");
		request.setRequestBody(body);
		request.setOperationType("PremierItemReportRequest");
	}
	
	private void buildSubmitRequest() {
		criteria.setSubcategoryID(new Integer(134));
		criteria.setPremierMark(new BigInteger("1"));
		criteria.setRequestType("PREMIER_ITEM_REPORT");
		criteria.setFileType("XLS");
		SubmitBody.setPremierItemReportCriteria(criteria);
		SubmitRequest.setOperationType("PremierItemReportRequest");
		SubmitRequest.setRequestBody(SubmitBody);
	}*/
	
	@Test
	public void testSendGetPremierItem_XML() {
		/*buildRequest();
		sender = PremierItemCaller.buildXML();
		response = sender.sendPremierItemRequest(request);
		assertTrue("true".equalsIgnoreCase(response.getIsSuccess()));*/
		
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetPremierItem(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetPremierItem_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetPremierItem(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitPremierItem_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitPremierItem(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}

	@Test
	public void testSendSubmitPremierItem_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitPremierItem(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	// JSON
	//@Test
	public void testSendGetPremierItem_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetPremierItem(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendGetPremierItem_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetPremierItem(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitPremierItem_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitPremierItem(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}

	//@Test
	public void testSendSubmitPremierItem_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitPremierItem(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
}
