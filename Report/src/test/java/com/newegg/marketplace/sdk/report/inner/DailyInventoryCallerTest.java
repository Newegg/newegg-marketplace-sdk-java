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
import com.newegg.marketplace.sdk.report.SerializationObjectParser;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.model.get.DailyInventoryRequest;
import com.newegg.marketplace.sdk.report.model.get.DailyInventoryResponse;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventoryRequest;
import com.newegg.marketplace.sdk.report.model.submit.SDailyInventoryResponse;

public class DailyInventoryCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private DailyInventoryRequest buildGetDailyInventoryRequest(PLATFORM p) {
		DailyInventoryRequest request = new DailyInventoryRequest();
		DailyInventoryRequest.RequestBody body = new DailyInventoryRequest.RequestBody();
		DailyInventoryRequest.RequestBody.PageInfo page = new DailyInventoryRequest.RequestBody.PageInfo();
		
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
	
	private SDailyInventoryRequest buildSubmitDailyInventoryRequest(PLATFORM p) {
		SDailyInventoryRequest submitRequest = new SDailyInventoryRequest();
		SDailyInventoryRequest.RequestBody submitBody = new SDailyInventoryRequest.RequestBody();
		SDailyInventoryRequest.RequestBody.DailyInventoryReportCriteria criteria = 
				new SDailyInventoryRequest.RequestBody.DailyInventoryReportCriteria();
		
		SDailyInventoryRequest.RequestBody.DailyInventoryReportCriteria.WarehouseList whList = 
				new SDailyInventoryRequest.RequestBody.DailyInventoryReportCriteria.WarehouseList();
		
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
		DailyInventoryResponse response = null;
		DailyInventoryRequest request = null;
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
	
	private void sendSubmitDailyInventory(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		SDailyInventoryResponse response = null;
		SDailyInventoryRequest request = null;
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
			
			response = sender.sendSubmitDailyInventoryRequest(request);
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
		Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitDailyInventory_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
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
		Variables.version = "310"; // only 310
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitDailyInventory(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
}
