package com.newegg.marketplace.sdk.report.inner;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import com.newegg.marketplace.sdk.report.ReportConfig;
import com.newegg.marketplace.sdk.report.Variables;
import com.newegg.marketplace.sdk.report.Variables.URILock;
import com.newegg.marketplace.sdk.report.model.get.GetItemBasicInformationReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetItemBasicInformationReportResponse;
import com.newegg.marketplace.sdk.report.model.submit.SubmitItemBasicInformationReportRequest;
import com.newegg.marketplace.sdk.report.model.submit.SubmitItemBasicInformationReportResponse;

public class ItemBasicInformatioCallerTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
//	@Test
//	public void testgetItemBasicInformationReport_JSON_MOCK() {
//		Variables.MediaType = MEDIA_TYPE.JSON;
//		Variables.SimulationEnabled = true;
//		Variables.URIHash=URILock.ITEM_BASIC;
//		 ItemBasicInformatioCaller item = ItemBasicInformatioCaller.buildJSON();
//		 
//	        
//		 GetItemBasicInformationReportRequest body=new GetItemBasicInformationReportRequest();
//        
//		 GetItemBasicInformationReportRequest.RequestBody requestBody=new  GetItemBasicInformationReportRequest.RequestBody();
//		 requestBody.setRequestID("24YEEI3GMBKCT");
//		 body.setRequestBody(requestBody);
//
//		   GetItemBasicInformationReportResponse res = item.getItemBasicInformationReport(body);
//		   System.out.println(res.getNeweggAPIResponse());
//			Variables.SimulationEnabled = false;
//	}
	
	@Test
	public void testSubmitItemBasicInformationReport_JSON_MOCK() {
		Variables.MediaType = MEDIA_TYPE.JSON;
		Variables.SimulationEnabled = true;
		Variables.URIHash=URILock.ITEM_BASIC;
		 ItemBasicInformatioCaller item = ItemBasicInformatioCaller.buildJSON();
		 
		 SubmitItemBasicInformationReportRequest.RequestBody.ItemBasicInfoReportCriteria criteria=new 		 SubmitItemBasicInformationReportRequest.RequestBody.ItemBasicInfoReportCriteria ();
		 criteria.setStatus(2);
		 criteria.setFileType("XLS");
		 SubmitItemBasicInformationReportRequest body=new SubmitItemBasicInformationReportRequest();
		 body.setIssueUser("xx");
		 
		 SubmitItemBasicInformationReportRequest.RequestBody requestBody=new SubmitItemBasicInformationReportRequest.RequestBody();
		 requestBody.setItemBasicInfoReportCriteria(criteria);
		 body.setRequestBody(requestBody);
		 SubmitItemBasicInformationReportResponse res = item.submitItemBasicInformationReport(body);
		   System.out.println(res);
		   Variables.SimulationEnabled = false;
	}
}
