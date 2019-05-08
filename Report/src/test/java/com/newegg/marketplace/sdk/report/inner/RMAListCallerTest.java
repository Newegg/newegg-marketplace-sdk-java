package com.newegg.marketplace.sdk.report.inner;

import static org.junit.Assert.assertTrue;

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
import com.newegg.marketplace.sdk.report.model.get.GetRMAListReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetRMAListReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.SubmitRMAListReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.SubmitRMAListReportResponse;

public class RMAListCallerTest {
		 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetRMAListReportRequest buildGetRMAListRequest(PLATFORM p) {
		GetRMAListReportRequest request = new GetRMAListReportRequest();
		GetRMAListReportRequest.RequestBody body = new GetRMAListReportRequest.RequestBody();
		GetRMAListReportRequest.RequestBody.PageInfo page = new GetRMAListReportRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("27UMQ2D8D3CZY");
			break;
			
		case CAN:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("2409DG5ML2VLF");
			break;
			
		case USB:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("27A0RBCMLV904");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("RMAListReportRequest");
		
		return request;
	}
	
	private SubmitRMAListReportRequest buildSubmitRMAListRequest(PLATFORM p) {
		SubmitRMAListReportRequest submitRequest = new SubmitRMAListReportRequest();
		SubmitRMAListReportRequest.RequestBody submitBody = new SubmitRMAListReportRequest.RequestBody();
		SubmitRMAListReportRequest.RequestBody.RMAListReportCriteria criteria = new
				SubmitRMAListReportRequest.RequestBody.RMAListReportCriteria();
		
		switch (p) {
		case USA:
			criteria.setRMADateFrom("2015-01-11");
			criteria.setRMADateTo("2019-12-30");
			criteria.setRMAType(0);
			criteria.setProcessedBy(0);
			criteria.setStatus(0);
			criteria.setKeywordsType(1);
			criteria.setKeywordsValue("20169816");
			break;
			
		case CAN:
			criteria.setRMADateFrom("2015-01-11");
			criteria.setRMADateTo("2019-12-30");
			criteria.setRMAType(0);
			criteria.setProcessedBy(0);
			criteria.setStatus(0);
			criteria.setKeywordsType(1);
			criteria.setKeywordsValue("21315116");
			break;
			
		case USB:
			criteria.setRMADateFrom("2015-01-11");
			criteria.setRMADateTo("2019-12-30");
			criteria.setRMAType(0);
			criteria.setProcessedBy(0);
			criteria.setStatus(0);
			criteria.setKeywordsType(1);
			criteria.setKeywordsValue("20957370");
			break;
			
		default:
			break;
		}
		
		criteria.setRequestType("RMA_LIST_REPORT");
		submitBody.setRMAListReportCriteria(criteria);
		submitRequest.setOperationType("RMAListReportRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetRMAList(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String version) {
		GetRMAListReportResponse response = null;
		GetRMAListReportRequest request = null;
		RMAListCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildGetRMAListRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = RMAListCaller.buildXML();
			else
				sender = RMAListCaller.buildJSON();
			
			response = sender.sendRMAListRequest(request,version);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitRMAList(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		SubmitRMAListReportResponse response = null;
		SubmitRMAListReportRequest request = null;
		RMAListCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildSubmitRMAListRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = RMAListCaller.buildXML();
			else
				sender = RMAListCaller.buildJSON();
			
			response = sender.sendSubmitRMAListRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendGetRMAListRequest_XML() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(false, MEDIA_TYPE.XML, PLATFORM.USA,"306");
		
		RequireSetting.authKeySetting("A3TV");
		//Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(false, MEDIA_TYPE.XML, PLATFORM.CAN,"305");
		
		RequireSetting.authKeySetting("A44S");
		//Variables.version = "309"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(false, MEDIA_TYPE.XML, PLATFORM.USB,"309");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetRMAListRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(true, MEDIA_TYPE.XML, PLATFORM.USA,"306");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitRMAListRequest_XML() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		//Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		//Variables.version = "309"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitRMAListRequest_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	// JSON
	//@Test
	public void testSendGetRMAListRequest_JSON() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(false, MEDIA_TYPE.JSON, PLATFORM.USA,"306");
		
		RequireSetting.authKeySetting("A3TV");
		//Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(false, MEDIA_TYPE.JSON, PLATFORM.CAN,"305");
		
		RequireSetting.authKeySetting("A44S");
		//Variables.version = "309"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(false, MEDIA_TYPE.JSON, PLATFORM.USB,"309");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendGetRMAListRequest_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetRMAList(true, MEDIA_TYPE.JSON, PLATFORM.USA,"306");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitRMAListRequest_JSON() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		//Variables.version = "305"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		//Variables.version = "309"; // 305, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitRMAListRequest_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "306"; // 306, 307, 309
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitRMAList(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
}


