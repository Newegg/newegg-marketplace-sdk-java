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
import com.newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportResponse;
import com.newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.DailyInventoryReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.DailyInventoryReportResponse;

public class DailyInventoryCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetDailyInventoryReportRequest buildGetDailyInventoryRequest(PLATFORM p) {
		GetDailyInventoryReportRequest request = new GetDailyInventoryReportRequest();
		GetDailyInventoryReportRequest.RequestBody body = new GetDailyInventoryReportRequest.RequestBody();
		GetDailyInventoryReportRequest.RequestBody.PageInfo page = new GetDailyInventoryReportRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("24WIDB87KEHHQ");
			request.setOperationType("InternationalInventoryReportRequest");
			break;
			
		case CAN:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("26626K71Y8V6M");
			request.setOperationType("DailyInventoryReportRequest");
			break;
			
		case USB:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("27FY2VRBYUKZQ");
			request.setOperationType("DailyInventoryReportRequest");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		
		return request;
	}
	
	private DailyInventoryReportRequest buildSubmitDailyInventoryRequest(PLATFORM p) {
		DailyInventoryReportRequest submitRequest = new DailyInventoryReportRequest();
		DailyInventoryReportRequest.RequestBody submitBody = new DailyInventoryReportRequest.RequestBody();
		DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria criteria = 
				new DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria();
		
		DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria.WarehouseList whList = 
				new DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria.WarehouseList();
		
		switch (p) {
		case USA:
			whList.getWarehouseLocation().add("USA");
			criteria.setFulfillType(new Integer(0));
			criteria.setFileType("XLS");
			criteria.setRequestType("INTERNATIONAL_INVENTORY_REPORT");
			submitRequest.setOperationType("InternationalInventoryReportRequest");
			criteria.setWarehouseList(whList);
			break;
			
		case CAN:
			criteria.setFulfillType(new Integer(0));
			criteria.setFileType("XLS");
			criteria.setRequestType("DAILY_INVENTORY_REPORT");
			submitRequest.setOperationType("DailyInventoryReportRequest");
			break;
			
		case USB:
			criteria.setFulfillType(new Integer(0));
			criteria.setFileType("XLS");
			criteria.setRequestType("DAILY_INVENTORY_REPORT");
			submitRequest.setOperationType("DailyInventoryReportRequest");
			break;
			
		default:
			break;
		}
		
		submitBody.setDailyInventoryReportCriteria(criteria);
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetDailyInventory(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		GetDailyInventoryReportResponse response = null;
		GetDailyInventoryReportRequest request = null;
		DailyInventoryCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildGetDailyInventoryRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				
				sender = DailyInventoryCaller.buildXML();
			else
				sender = DailyInventoryCaller.buildJSON();
			
			response = sender.sendDailyInventoryRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitDailyInventory(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm,String version) {
		DailyInventoryReportResponse response = null;
		DailyInventoryReportRequest request = null;
		DailyInventoryCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildSubmitDailyInventoryRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = DailyInventoryCaller.buildXML();
			else
				sender = DailyInventoryCaller.buildJSON();
			
			response = sender.sendSubmitDailyInventoryRequest(request,version);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendGetDailyInventory_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetDailyInventory_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitDailyInventory_XML() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USA,"310");
		
		RequireSetting.authKeySetting("A3TV");
		//Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.CAN,"310");
		
		RequireSetting.authKeySetting("A44S");
		//Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USB,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitDailyInventory_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
	

	// JSON for this command that didn't test
	@Test
	public void testSendGetDailyInventory_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetDailyInventory_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		/*RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetDailyInventory(false, MEDIA_TYPE.JSON, PLATFORM.USB);*/
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitDailyInventory_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		//Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA,"310");
		
		RequireSetting.log.info("Zack-Test END");
	}
	
}
