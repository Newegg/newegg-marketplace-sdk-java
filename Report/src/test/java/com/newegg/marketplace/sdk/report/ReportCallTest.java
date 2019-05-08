package com.newegg.marketplace.sdk.report;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportB2bCanRequest;
import com.newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportB2bCanResponse;
import com.newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportRequest;
import com.newegg.marketplace.sdk.report.model.get.GetDailyInventoryReportResponse;
import com.newegg.marketplace.sdk.report.model.get.OrderListReportRequest;

public class ReportCallTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	@Test
	public void test() {
		RequireSetting.authKeySetting("A006");
		OrderListReportRequest request = new OrderListReportRequest();
		OrderListReportRequest.RequestBody body = new OrderListReportRequest.RequestBody();
	}

	@Test
	public void getDailyInventoryReport_USA() {
		// 是否需要使用Mock模式 : true/ false
		Variables.SimulationEnabled = true;
		// 環境變數設定
		RequireSetting.authKeySetting("A006");

		// 使用API的物件 >> 不用動。
		ReportCall call = new ReportCall();

		// 即將使用API Method 物件呼叫內容 >> 每次都要修改
		GetDailyInventoryReportRequest body = new GetDailyInventoryReportRequest();
		GetDailyInventoryReportRequest.RequestBody rebody = new GetDailyInventoryReportRequest.RequestBody();
		GetDailyInventoryReportRequest.RequestBody.PageInfo page = new GetDailyInventoryReportRequest.RequestBody.PageInfo();

		page.setPageIndex(1);
		page.setPageSize(10);
		rebody.setRequestID("24WIDB87KEHHQ");
		rebody.setPageInfo(page);
		body.setRequestBody(rebody);

		// 即將使用API Method >> 每次都要修改
		GetDailyInventoryReportResponse rs = call.getDailyInventoryReport(body);

		// 驗證結果
		assertNotNull(rs);

		Variables.SimulationEnabled = false;
	}
	
	@Test
	public void getDailyInventoryReportB2bCan_B2B() {
		// 是否需要使用Mock模式 : true/ false
		Variables.SimulationEnabled = true;
		// 環境變數設定
		RequireSetting.authKeySetting("A3TV");
		Content.Platform = PLATFORM.CAN;

		// 使用API的物件 >> 不用動。
		ReportCall call = new ReportCall();

		// 即將使用API Method 物件呼叫內容 >> 每次都要修改
		GetDailyInventoryReportB2bCanRequest body = new GetDailyInventoryReportB2bCanRequest();
		GetDailyInventoryReportB2bCanRequest.RequestBody rebody = new GetDailyInventoryReportB2bCanRequest.RequestBody();
		GetDailyInventoryReportB2bCanRequest.RequestBody.PageInfo page = new GetDailyInventoryReportB2bCanRequest.RequestBody.PageInfo();

		page.setPageIndex(1);
		page.setPageSize(10);
		rebody.setRequestID("27FY2VRBYUKZQ");
		rebody.setPageInfo(page);
		body.setRequestBody(rebody);

		// 即將使用API Method >> 每次都要修改
		GetDailyInventoryReportB2bCanResponse rs = null;
		boolean result = false;
		try {
			rs = call.getDailyInventoryReportB2bCan(body);
			Marshaller marshaller = JAXBContext.newInstance(GetDailyInventoryReportB2bCanRequest.class).createMarshaller();
			StringWriter w = new StringWriter();
			marshaller.marshal(body, w);
			result = w.toString().indexOf("<OperationType>DailyInventoryReportRequest</OperationType>") > -1 ? true : false;
		} catch (Exception e) {
			assertTrue("Exception", false);
		}
		// 驗證結果
		assertTrue(result);   
		

		// 驗證結果
		//assertNotNull(rs);

		Variables.SimulationEnabled = false;
	}
}
