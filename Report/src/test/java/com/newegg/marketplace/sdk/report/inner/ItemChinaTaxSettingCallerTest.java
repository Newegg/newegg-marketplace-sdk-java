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
import com.newegg.marketplace.sdk.report.model.get.GetTaxSettingReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetTaxSettingReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.ItemChinaTaxSettingReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.ItemChinaTaxSettingReportResponse;

public class ItemChinaTaxSettingCallerTest {
	/*ItemChinaTaxSettingRequest request = new ItemChinaTaxSettingRequest();
	ItemChinaTaxSettingRequest.RequestBody body = new ItemChinaTaxSettingRequest.RequestBody();
	ItemChinaTaxSettingRequest.RequestBody.PageInfo page = new ItemChinaTaxSettingRequest.RequestBody.PageInfo();
	ItemChinaTaxSettingResponse response = new ItemChinaTaxSettingResponse();
	ItemChinaTaxSettingCaller sender = null;
	
	SItemChinaTaxSettingResponse SubmitResponse = new SItemChinaTaxSettingResponse();
	SItemChinaTaxSettingRequest SubmitRequest = new SItemChinaTaxSettingRequest();
	SItemChinaTaxSettingRequest.RequestBody SubmitBody = new SItemChinaTaxSettingRequest.RequestBody();
	SItemChinaTaxSettingRequest.RequestBody.ItemChinaTaxSettingReportCriteria criteria = 
			new SItemChinaTaxSettingRequest.RequestBody.ItemChinaTaxSettingReportCriteria();*/
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetTaxSettingReportRequest buildGetItemChinaTaxSettingRequest(PLATFORM p) {
		GetTaxSettingReportRequest request = new GetTaxSettingReportRequest();
		GetTaxSettingReportRequest.RequestBody body = new GetTaxSettingReportRequest.RequestBody();
		GetTaxSettingReportRequest.RequestBody.PageInfo page = new GetTaxSettingReportRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("219O8NZS6DQV0");
			break;
			
		case CAN:
			
			break;
			
		case USB:
			
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("ItemChinaTaxSettingReportRequest");
		
		return request;
	}
	
	private ItemChinaTaxSettingReportRequest buildSubmitItemChinaTaxSettingRequest(PLATFORM p) {
		ItemChinaTaxSettingReportRequest submitRequest = new ItemChinaTaxSettingReportRequest();
		ItemChinaTaxSettingReportRequest.RequestBody submitBody = new ItemChinaTaxSettingReportRequest.RequestBody();
		ItemChinaTaxSettingReportRequest.RequestBody.ItemChinaTaxSettingReportCriteria criteria = 
				new ItemChinaTaxSettingReportRequest.RequestBody.ItemChinaTaxSettingReportCriteria();
		
		switch (p) {
		case USA:
			criteria.setFileType("XLS");
			break;
			
		case CAN:
			break;
			
		case USB:
			break;
			
		default:
			break;
		}
		
		criteria.setRequestType("ITEM_CHINATAXSETTING_REPORT");
		submitBody.setItemChinaTaxSettingReportCriteria(criteria);
		submitRequest.setOperationType("ItemChinaTaxSettingReportRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetItemChinaTaxSetting(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		GetTaxSettingReportResponse response = null;
		GetTaxSettingReportRequest request = null;
		ItemChinaTaxSettingCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildGetItemChinaTaxSettingRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = ItemChinaTaxSettingCaller.buildXML();
			else
				sender = ItemChinaTaxSettingCaller.buildJSON();
			
			response = sender.sendItemChinaTaxSettingRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitItemChinaTaxSetting(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		ItemChinaTaxSettingReportResponse response = null;
		ItemChinaTaxSettingReportRequest request = null;
		ItemChinaTaxSettingCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildSubmitItemChinaTaxSettingRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = ItemChinaTaxSettingCaller.buildXML();
			else
				sender = ItemChinaTaxSettingCaller.buildJSON();
			
			response = sender.sendSubmitItemChinaTaxSettingRequest(request);
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
		request.setOperationType("ItemChinaTaxSettingReportRequest");
	}
	
	private void buildSubmitRequest() {
		criteria.setRequestType("ITEM_CHINATAXSETTING_REPORT");
		criteria.setFileType("XLS");
		SubmitBody.setItemChinaTaxSettingReportCriteria(criteria);
		SubmitRequest.setOperationType("ItemChinaTaxSettingReportRequest");
		SubmitRequest.setRequestBody(SubmitBody);
	}*/
	
	@Test
	public void testSendItemChinaTaxSettingRequest_XML() {
		/*buildRequest();
		sender = ItemChinaTaxSettingCaller.buildXML();
		response = sender.sendItemChinaTaxSettingRequest(request);
		assertTrue("true".equalsIgnoreCase(response.getIsSuccess()));*/
		
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemChinaTaxSetting(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendItemChinaTaxSettingRequest_XML_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemChinaTaxSetting(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitItemChinaTaxSettingRequest_XML() {
		/*buildSubmitRequest();
		sender = ItemChinaTaxSettingCaller.buildXML();
		SubmitResponse = sender.sendSubmitItemChinaTaxSettingRequest(SubmitRequest);
		assertTrue("true".equalsIgnoreCase(SubmitResponse.getIsSuccess()));*/
		
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemChinaTaxSetting(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitItemChinaTaxSettingRequest_XML_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemChinaTaxSetting(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	// JSON
	//@Test
	public void testSendItemChinaTaxSettingRequest_JSON() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemChinaTaxSetting(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendItemChinaTaxSettingRequest_JSON_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemChinaTaxSetting(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitItemChinaTaxSettingRequest_JSON() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemChinaTaxSetting(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitItemChinaTaxSettingRequest_JSON_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemChinaTaxSetting(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}

}
