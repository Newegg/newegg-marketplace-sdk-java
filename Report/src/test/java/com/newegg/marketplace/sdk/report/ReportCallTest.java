package com.newegg.marketplace.sdk.report;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.report.model.get.OrderListRequest;

public class ReportCallTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(ReportConfig.class);
	}
	
	@Test
	public void test() {
		RequireSetting.authKeySetting("A006");
		OrderListRequest request = new OrderListRequest();
		OrderListRequest.RequestBody body = new OrderListRequest.RequestBody();
	}

}
