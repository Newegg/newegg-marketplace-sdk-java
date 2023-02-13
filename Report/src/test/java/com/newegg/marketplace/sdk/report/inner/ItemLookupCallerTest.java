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
import com.newegg.marketplace.sdk.report.model.get.GetItemLookupReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetItemLookupReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.ItemLookupRequest;
import com.newegg.marketplace.sdk.report.model.submit.ItemLookupResponse;

public class ItemLookupCallerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	private GetItemLookupReportRequest buildGetItemLookupRequest(PLATFORM p) {
		GetItemLookupReportRequest request = new GetItemLookupReportRequest();
		GetItemLookupReportRequest.RequestBody body = new GetItemLookupReportRequest.RequestBody();
		GetItemLookupReportRequest.RequestBody.PageInfo page = new GetItemLookupReportRequest.RequestBody.PageInfo();
		
		switch (p) {
		case USA:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("23A628IKC7YWW");
			break;
			
		case CAN:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("ZL3QTLXLHDMV");
			break;
			
		case USB:
			page.setPageIndex(1);
			page.setPageSize(10);
			body.setRequestID("25LHSE7T08JAU");
			break;
			
		default:
			break;
		}
		
		body.setPageInfo(page);
		request.setRequestBody(body);
		request.setOperationType("ItemLookupRequest");
		
		return request;
	}
	
	private ItemLookupRequest buildSubmitItemLookupRequest(PLATFORM p) {
		ItemLookupRequest submitRequest = new ItemLookupRequest();
		ItemLookupRequest.RequestBody submitBody = new ItemLookupRequest.RequestBody();
		ItemLookupRequest.RequestBody.RequestCriteria critera = 
				new ItemLookupRequest.RequestBody.RequestCriteria();
		
		ItemLookupRequest.RequestBody.RequestCriteria.Item items = 
				new ItemLookupRequest.RequestBody.RequestCriteria.Item();
		
		switch (p) {
		case USA:
			items.setUPC("886111563425");
			items.setManufacturerName("HP");
			items.setManufacturerPartNumber("652241-B21");
			break;
			
		case CAN:
			items.setUPC("0514105907175");
			items.setManufacturerName("test20131");
			items.setManufacturerPartNumber("Test180514105907175");
			break;
			
		case USB:
			items.setUPC("619659075934");
			items.setManufacturerName("SanDisk");
			items.setManufacturerPartNumber("619659075934");
			break;
			
		default:
			break;
		}
		
		critera.getItem().add(items);
		submitBody.setRequestCriteria(critera);
		submitRequest.setOperationType("ItemLookupRequest");
		submitRequest.setRequestBody(submitBody);
		
		return submitRequest;
	}
	
	private void sendGetItemLookup(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		GetItemLookupReportResponse response = null;
		GetItemLookupReportRequest request = null;
		ItemLookupCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildGetItemLookupRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = ItemLookupCaller.buildXML();
			else
				sender = ItemLookupCaller.buildJSON();
			
			response = sender.sendItemLookupRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	private void sendSubmitItemLookup(boolean mock, MEDIA_TYPE type, PLATFORM flatofrm) {
		ItemLookupResponse response = null;
		ItemLookupRequest request = null;
		ItemLookupCaller sender = null;
		boolean sim = Variables.SimulationEnabled;
		
		Variables.MediaType = type;
		Variables.SimulationEnabled = mock;
		
		try {
			Content.Platform = flatofrm;
			
			request = buildSubmitItemLookupRequest(flatofrm);
			if (type == MEDIA_TYPE.XML)
				sender = ItemLookupCaller.buildXML();
			else
				sender = ItemLookupCaller.buildJSON();
			
			response = sender.sendSubmitItemLookupRequest(request);
			assertTrue("true".equals(response.getIsSuccess()));
		} catch(NeweggException e) {
			RequireSetting.log.info("Zack-Test NeweggException happened");
			RequireSetting.printError(e, Variables.MediaType);
		}
		
		Variables.SimulationEnabled = sim;
	}
	
	@Test
	public void testSendGetItemLookup_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendGetItemLookup_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitItemLookup_XML() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(false, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(false, MEDIA_TYPE.XML, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(false, MEDIA_TYPE.XML, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	@Test
	public void testSendSubmitItemLookup_XML_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(true, MEDIA_TYPE.XML, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	// JSON
	//@Test
	public void testSendGetItemLookup_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendGetItemLookup_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendGetItemLookup(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitItemLookup_JSON() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(false, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.authKeySetting("A3TV");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(false, MEDIA_TYPE.JSON, PLATFORM.CAN);
		
		RequireSetting.authKeySetting("A44S");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(false, MEDIA_TYPE.JSON, PLATFORM.USB);
		
		RequireSetting.log.info("Zack-Test END");
	}
	
	//@Test
	public void testSendSubmitItemLookup_JSON_MOCK() {
		RequireSetting.authKeySetting("A006");
		RequireSetting.log.info(RequireSetting.getTestInfo());
		sendSubmitItemLookup(true, MEDIA_TYPE.JSON, PLATFORM.USA);
		
		RequireSetting.log.info("Zack-Test END");
	}

}
