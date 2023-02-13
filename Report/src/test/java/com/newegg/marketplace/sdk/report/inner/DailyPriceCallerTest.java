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
import com.newegg.marketplace.sdk.report.model.get.GetDailyPriceReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetDailyPriceReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.DailyPriceReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.DailyPriceReportResponse;

public class DailyPriceCallerTest {
	/*DailyPriceCaller sender = null;
	DailyPriceResponse response = new DailyPriceResponse();
	DailyPriceRequest request = new DailyPriceRequest();
	DailyPriceRequest.RequestBody body = new DailyPriceRequest.RequestBody();
	DailyPriceRequest.RequestBody.PageInfo page = new DailyPriceRequest.RequestBody.PageInfo();

	SDailyPriceResponse SubmitResponse = new SDailyPriceResponse();
	SDailyPriceRequest SubmitRequest = new SDailyPriceRequest();
	SDailyPriceRequest.RequestBody SubmitBody = new SDailyPriceRequest.RequestBody();
	SDailyPriceRequest.RequestBody.DailyPriceReportCriteria criteria =
			new SDailyPriceRequest.RequestBody.DailyPriceReportCriteria();
	
	SDailyPriceRequest.RequestBody.DailyPriceReportCriteria.CountryList countryList = 
			new SDailyPriceRequest.RequestBody.DailyPriceReportCriteria.CountryList();*/
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetDailyPriceReportRequest buildGetDailyInventoryRequest(PLATFORM p) {
		GetDailyPriceReportRequest request = new GetDailyPriceReportRequest();
		GetDailyPriceReportRequest.RequestBody body = new GetDailyPriceReportRequest.RequestBody();
		GetDailyPriceReportRequest.RequestBody.PageInfo page = new GetDailyPriceReportRequest.RequestBody.PageInfo();
		
		// only USA
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("26XZV07ERGI8B");
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
		request.setOperationType("InternationalPriceReportRequest");
		
		return request;
	}
	
	private DailyPriceReportRequest buildSubmitDailyInventoryRequest(PLATFORM p) {
		DailyPriceReportRequest submitRequest = new DailyPriceReportRequest();
		DailyPriceReportRequest.RequestBody submitBody = new DailyPriceReportRequest.RequestBody();
		DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria criteria =
				new DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria();
		
		DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList countryList = 
				new DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList();
		
		switch (p) {
		case USA:
			countryList.getCountryCode().add("USA");
			countryList.getCountryCode().add("AUS");
			criteria.setFileType("CSV");
			break;
			
		case CAN:
			
			break;
			
		case USB:
			
			break;
			
		default:
			break;
		}
		
		criteria.setCountryList(countryList);
		criteria.setRequestType("INTERNATIONAL_PRICE_REPORT");
		submitBody.setDailyPriceReportCriteria(criteria);
		submitRequest.setOperationType("InternationalPriceReportRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetDailyInventory(boolean mock, MEDIA_TYPE type, PLATFORM flatform) {
		GetDailyPriceReportResponse response = null;
		GetDailyPriceReportRequest request = null;
		DailyPriceCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildGetDailyInventoryRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = DailyPriceCaller.buildXML();
			else
				sender = DailyPriceCaller.buildJSON();
			
			response = sender.sendDailyPriceRequest(request);
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitDailyInventory(boolean mock, MEDIA_TYPE type, PLATFORM flatform,String version) {
		DailyPriceReportResponse response = null;
		DailyPriceReportRequest request = null;
		DailyPriceCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatform;
			
			request = buildSubmitDailyInventoryRequest(flatform);
			if (type == MEDIA_TYPE.XML)
				sender = DailyPriceCaller.buildXML();
			else
				sender = DailyPriceCaller.buildJSON();
			
			response = sender.sendSubmitDailyPriceRequest(request,version);
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
		request.setOperationType("InternationalPriceReportRequest");
	}
	
	private void buildSubmitRequest() {
		countryList.getCountryCode().add("USA");
		countryList.getCountryCode().add("AUS");
		criteria.setCountryList(countryList);
		criteria.setRequestType("INTERNATIONAL_PRICE_REPORT");
		criteria.setFileType("XLS");
		SubmitBody.setDailyPriceReportCriteria(criteria);
		SubmitRequest.setOperationType("InternationalPriceReportRequest");
		SubmitRequest.setRequestBody(SubmitBody);
	}*/
	
	@Test
	public void testSendGetDailyPriceRequest_XML() {
		/*buildRequest();
		sender = DailyPriceCaller.buildXML();
		response = sender.sendDailyPriceRequest(request);
		assertTrue("true".equalsIgnoreCase(response.getIsSuccess()));*/
		
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetDailyPriceRequest_XML_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitDailyPriceRequest_XML() {
		/*buildSubmitRequest();
		sender = DailyPriceCaller.buildXML();
		SubmitResponse = sender.sendSubmitDailyPriceRequest(SubmitRequest);
		assertTrue("true".equalsIgnoreCase(SubmitResponse.getIsSuccess()));*/
		
		// only USA
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310";	// only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USA,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitDailyPriceRequest_XML_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310";	// only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	// JSON
	//@Test
	public void testSendGetDailyPriceRequest_JSON() {
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetDailyPriceRequest_JSON_MOCK() {
		Variables.SimulationEnabled=true;
		// only USA
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
		Variables.SimulationEnabled=false;

	}
	
	//@Test
	public void testSendSubmitDailyPriceRequest_JSON() {
		// only USA
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310";	// only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.JSON, PLATFORM.USA,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitDailyPriceRequest_JSON_MOCK() {
		// only USA
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310";	// only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(true, MEDIA_TYPE.JSON, PLATFORM.USA,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
}
