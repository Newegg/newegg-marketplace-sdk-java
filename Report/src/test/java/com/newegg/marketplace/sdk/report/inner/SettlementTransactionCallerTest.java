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
import com.newegg.marketplace.sdk.report.model.get.GetSettlementTransactionReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetSettlementTransactionReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.SettlementTransactionRequest;
import com.newegg.marketplace.sdk.report.model.submit.SettlementTransactionResponse;

public class SettlementTransactionCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetSettlementTransactionReportRequest buildGetSettlementTransactionRequest(PLATFORM p) {
		GetSettlementTransactionReportRequest request = new GetSettlementTransactionReportRequest();
		GetSettlementTransactionReportRequest.RequestBody body = new GetSettlementTransactionReportRequest.RequestBody();
		GetSettlementTransactionReportRequest.RequestBody.PageInfo page = new GetSettlementTransactionReportRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("24JW8D51O5V2D");
			
			break;
			
		case CAN:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("25EN5T559Z6JF");
			break;
			
		case USB:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("25EN5T559Z6JF");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("SettlementTransactionReportRequest");
		
		return request;
	}
	
	private SettlementTransactionRequest buildSubmitSettlementTransactionRequest(PLATFORM p) {
		SettlementTransactionRequest submitRequest = new SettlementTransactionRequest();
		SettlementTransactionRequest.RequestBody submitBody = new SettlementTransactionRequest.RequestBody();
		SettlementTransactionRequest.RequestBody.SettlementTransactionReportCriteria criteria = 
				new SettlementTransactionRequest.RequestBody.SettlementTransactionReportCriteria();
		
		switch (p) {
		case USA:
			criteria.setSettlementDateFrom("2017-01-01");
			criteria.setSettlementDate("03/11/2019");
			criteria.setSettlementDateTo("2019-12-31");
			criteria.setTransactionType(0);
			break;
			
		case CAN:
			criteria.setSettlementDateFrom("2017-01-01");
			criteria.setSettlementDate("03/11/2019");
			criteria.setSettlementDateTo("2019-12-31");
			criteria.setTransactionType(0);
			break;
			
		case USB:
			criteria.setSettlementDateFrom("2017-01-01");
			criteria.setSettlementDate("03/11/2019");
			criteria.setSettlementDateTo("2019-12-31");
			criteria.setTransactionType(0);
			break;
			
		default:
			break;
		}
		
		criteria.setRequestType("SETTLEMENT_TRANSACTION_REPORT");
		submitBody.setSettlementTransactionReportCriteria(criteria);
		submitRequest.setOperationType("SettlementTransactionReportRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetSettlementTransaction(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		GetSettlementTransactionReportResponse response = null;
		GetSettlementTransactionReportRequest request = null;
		SettlementTransactionCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildGetSettlementTransactionRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = SettlementTransactionCaller.buildXML();
			else
				sender = SettlementTransactionCaller.buildJSON();
			
			response = sender.sendSettlementTransactionRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitSettlementTransaction(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		SettlementTransactionResponse response = null;
		SettlementTransactionRequest request = null;
		SettlementTransactionCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildSubmitSettlementTransactionRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = SettlementTransactionCaller.buildXML();
			else
				sender = SettlementTransactionCaller.buildJSON();
			
			response = sender.sendSubmitSettlementTransactionRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendGetSettlementTransaction_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}

	@Test
	public void testSendGetSettlementTransaction_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitSettlementTransaction_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitSettlementTransaction_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitSettlementTransaction_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitSettlementTransaction_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitSettlementTransaction(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendGetSettlementTransaction_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendGetSettlementTransaction_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetSettlementTransaction(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
}
