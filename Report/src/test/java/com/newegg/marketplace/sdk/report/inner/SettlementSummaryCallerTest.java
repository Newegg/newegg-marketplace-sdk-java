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
import com.newegg.marketplace.sdk.report.model.get.SettlementSummaryRequest;
import com.newegg.marketplace.sdk.report.model.get.SettlementSummaryResponse;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementSummaryRequest;
import com.newegg.marketplace.sdk.report.model.submit.SSettlementSummaryResponse;

public class SettlementSummaryCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private SettlementSummaryRequest buildGetSettlementSummaryRequest(PLATFORM p) {
		SettlementSummaryRequest request = new SettlementSummaryRequest();
		SettlementSummaryRequest.RequestBody body = new SettlementSummaryRequest.RequestBody();
		SettlementSummaryRequest.RequestBody.PageInfo page = new SettlementSummaryRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("24SQB8YLHGLSL");
			break;
			
		case CAN:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("ZV0JP9P64SZJ");
			break;
			
		case USB:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("ZY6VGFHB3AOQ");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("SettlementSummaryReportRequest");
		
		return request;
	}
	
	private SSettlementSummaryRequest buildSubmitSettlementSummaryRequest(PLATFORM p) {
		SSettlementSummaryRequest submitRequest = new SSettlementSummaryRequest();
		SSettlementSummaryRequest.RequestBody submitBody = new SSettlementSummaryRequest.RequestBody();
		SSettlementSummaryRequest.RequestBody.SettlementSummaryReportCriteria criteria = 
				new SSettlementSummaryRequest.RequestBody.SettlementSummaryReportCriteria();
		
		switch (p) {
		case USA:
			criteria.setDateFrom("2017-01-23");
			criteria.setDateTo("2019-12-31");
			break;
			
		case CAN:
			criteria.setDateFrom("2017-01-23");
			criteria.setDateTo("2019-12-31");
			break;
			
		case USB:
			criteria.setDateFrom("2017-01-23");
			criteria.setDateTo("2019-12-31");
			break;
			
		default:
			break;
		}
		
		criteria.setRequestType("SETTLEMENT_SUMMARY_REPORT");
		submitBody.setSettlementSummaryReportCriteria(criteria);
		submitRequest.setRequestBody(submitBody);
		submitRequest.setOperationType("SettlementSummaryReportRequest");
		
		return submitRequest;
	}
	
	private void sendGetSettlementSummary(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		SettlementSummaryResponse response = null;
		SettlementSummaryRequest request = null;
		SettlementSummaryCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildGetSettlementSummaryRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = SettlementSummaryCaller.buildXML();
			else
				sender = SettlementSummaryCaller.buildJSON();
			
			response = sender.sendSettlementSummaryRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	 
	private void sendSubmitSettlementSummary(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		SSettlementSummaryResponse response = null;
		SSettlementSummaryRequest request = null;
		SettlementSummaryCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildSubmitSettlementSummaryRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = SettlementSummaryCaller.buildXML();
			else
				sender = SettlementSummaryCaller.buildJSON();
			
			response = sender.sendSubmitSettlementSummaryRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testGetSettlementSummary_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testGetSettlementSummary_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSubmitSettlementSummary_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSubmitSettlementSummary_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSubmitSettlementSummary_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSubmitSettlementSummary_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementSummary(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}

	//@Test
	public void testGetSettlementSummary_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	
	//@Test
	public void testGetSettlementSummary_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementSummary(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
}