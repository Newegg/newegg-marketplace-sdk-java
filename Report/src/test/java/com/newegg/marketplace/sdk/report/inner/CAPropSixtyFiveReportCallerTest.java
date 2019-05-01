package com.newegg.marketplace.sdk.report.inner;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
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
import com.newegg.marketplace.sdk.report.model.get.CAPropSixtyFiveReportRequest;
import com.newegg.marketplace.sdk.report.model.get.CAPropSixtyFiveReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.SCAPropSixtyFiveRequest;
import com.newegg.marketplace.sdk.report.model.submit.SCAPropSixtyFiveResponse;

public class CAPropSixtyFiveReportCallerTest {
	/*private org.apache.logging.log4j.Logger log = LogManager.getLogger(ReportConfig.class);
	CAPropSixtyFiveReportResponse response = new CAPropSixtyFiveReportResponse();
	CAPropSixtyFiveReportRequest request = new CAPropSixtyFiveReportRequest();
	CAPropSixtyFiveReportRequest.RequestBody body = new CAPropSixtyFiveReportRequest.RequestBody();
	CAPropSixtyFiveReportRequest.RequestBody.PageInfo page = new CAPropSixtyFiveReportRequest.RequestBody.PageInfo();
	CAPropSixtyFiveReportCaller sender = null;
	
	SCAPropSixtyFiveResponse SubmitResponse = new SCAPropSixtyFiveResponse();
	SCAPropSixtyFiveRequest SubmitRequest = new SCAPropSixtyFiveRequest();
	SCAPropSixtyFiveRequest.RequestBody SubmitBody = new SCAPropSixtyFiveRequest.RequestBody();
	SCAPropSixtyFiveRequest.RequestBody.ItemCAProp65ReportCriteria criteria = 
			new SCAPropSixtyFiveRequest.RequestBody.ItemCAProp65ReportCriteria();*/
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private CAPropSixtyFiveReportRequest buildGetCAProp65Request(PLATFORM p) {
		CAPropSixtyFiveReportRequest request = new CAPropSixtyFiveReportRequest();
		CAPropSixtyFiveReportRequest.RequestBody body = new CAPropSixtyFiveReportRequest.RequestBody();
		CAPropSixtyFiveReportRequest.RequestBody.PageInfo page = new CAPropSixtyFiveReportRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("26HECBSHO1LBT");
			break;
			
		case CAN:
			
			break;
			
		case USB:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("23GUN89SPPMWD");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("CAProp65ReportRequest");
		
		return request;
	}
	
	private SCAPropSixtyFiveRequest buildSubmitCAProp65Request(PLATFORM p) {
		SCAPropSixtyFiveRequest submitRequest = new SCAPropSixtyFiveRequest();
		SCAPropSixtyFiveRequest.RequestBody submitBody = new SCAPropSixtyFiveRequest.RequestBody();
		SCAPropSixtyFiveRequest.RequestBody.ItemCAProp65ReportCriteria criteria = 
				new SCAPropSixtyFiveRequest.RequestBody.ItemCAProp65ReportCriteria();
		
		switch (p) {
		case USA:
			criteria.setFileType("TXT");
			break;
			
		case CAN:
			
			break;
			
		case USB:
			
			break;
			
		default:
			break;
		}
		
		criteria.setRequestType("CAPROP65_REPORT");
		submitBody.setItemCAProp65ReportCriteria(criteria);
		submitRequest.setOperationType("CAProp65ReportRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetCAProp65(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		CAPropSixtyFiveReportResponse response = null;
		CAPropSixtyFiveReportRequest request = null;
		CAPropSixtyFiveReportCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildGetCAProp65Request(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = CAPropSixtyFiveReportCaller.buildXML();
			else
				sender = CAPropSixtyFiveReportCaller.buildJSON();
			
			response = sender.sendCAPropSixtyFiveReportRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitCAProp65(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		SCAPropSixtyFiveResponse response = null;
		SCAPropSixtyFiveRequest request = null;
		CAPropSixtyFiveReportCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildSubmitCAProp65Request(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = CAPropSixtyFiveReportCaller.buildXML();
			else
				sender = CAPropSixtyFiveReportCaller.buildJSON();
			
			response = sender.sendSubmitCAPropSixtyFiveReportRequest(request);
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
		request.setOperationType("CAProp65ReportRequest");
	}
	
	private void buildSubmitRequest() {
		criteria.setFileType("XLS");
		criteria.setRequestType("CAPROP65_REPORT");
		SubmitBody.setItemCAProp65ReportCriteria(criteria);
		SubmitRequest.setOperationType("CAProp65ReportRequest");
		SubmitRequest.setRequestBody(SubmitBody);
	}*/
	
	@Test
	public void testSendGetCAPropSixtyFiveReport_XML() {
		/*buildRequest();
		sender = CAPropSixtyFiveReportCaller.buildXML();
		try {
			response = sender.sendCAPropSixtyFiveReportRequest(request);
			assertTrue("true".equalsIgnoreCase(response.getIsSuccess()));
		} catch (NeweggException fe) {
			log.info(fe.getMessage());
			log.info(fe.status());
		}*/
		
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetCAProp65(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetCAProp65(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetCAPropSixtyFiveReport_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetCAProp65(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitCAPropSixtyFiveReport_XML() {
		/*buildSubmitRequest();
		sender = CAPropSixtyFiveReportCaller.buildXML();
		SubmitResponse = sender.sendSubmitCAPropSixtyFiveReportRequest(SubmitRequest);
		assertTrue("true".equalsIgnoreCase(SubmitResponse.getIsSuccess()));*/
		
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitCAProp65(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitCAProp65(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitCAPropSixtyFiveReport_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitCAProp65(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}

	// JSON
	//@Test
	public void testSendGetCAPropSixtyFiveReport_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetCAProp65(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetCAProp65(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendGetCAPropSixtyFiveReport_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetCAProp65(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitCAPropSixtyFiveReport_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitCAProp65(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitCAProp65(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitCAPropSixtyFiveReport_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitCAProp65(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
}
