package com.newegg.marketplace.sdk.datafeed.inner;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.datafeed.DataFeedConfig;
import com.newegg.marketplace.sdk.datafeed.Variables;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest.RequestBody.GetRequestStatus;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusRequest.RequestBody.GetRequestStatus.RequestIDList;
import com.newegg.marketplace.sdk.datafeed.model.GetFeedStatusResponse;
import com.newegg.marketplace.sdk.datafeed.model.ProcessingReportResponse;

public class DataFeedCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
	}

	@Test
	public void testGetFeedStatus_XML() {
		DataFeedCaller call = DataFeedCaller.buildXML();
		GetFeedStatusRequest request = new GetFeedStatusRequest();
		GetFeedStatusRequest.RequestBody body = new GetFeedStatusRequest.RequestBody();
		GetRequestStatus s = new GetRequestStatus();
		s.setMaxCount(100);
		s.setRequestDateFrom("");
		s.setRequestDateTo("");
		s.setRequestStatus("ALL");
		RequestIDList listID = new RequestIDList();
		listID.getRequestID().add("Z98EUQG1FUGC");
		s.setRequestIDList(listID);
		body.setGetRequestStatus(s);
		request.setRequestBody(body);
		GetFeedStatusResponse r = call.getFeedStatus(request);
		assertTrue(r.getIsSuccess());
		assertEquals("Z98EUQG1FUGC", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
	}

	@Test
	public void testGetFeedResult_XML() {
		Variables.SimulationEnabled = true;
		DataFeedCaller call = DataFeedCaller.buildXML();
		ProcessingReportResponse r = call.getFeedResult("Z98EUQG1FUGC");
		Variables.SimulationEnabled = false;
		assertEquals("ProcessingReport", r.getMessageType());
		assertTrue(r.getMessage().getProcessingReport().getProcessingSummary().getProcessedCount() > 0);
		assertTrue(r.getMessage().getProcessingReport().getResult().get(0).getErrorList().getErrorDescription().size() > 0);
		assertEquals(new BigDecimal("1.0"), r.getHeader().getDocumentVersion());
		assertTrue(r.getMessage().getProcessingReport().getResult().get(0).getErrorList().getErrorDescription().size() == 2);
		assertEquals("1508", r.getMessage().getProcessingReport().getResult().get(0).getAdditionalInfo().getSubCategoryID());
		assertNotNull(r.getMessage().getProcessingReport().getResult().get(0).getAdditionalInfo().getUpc());
	}

	@Test
	public void testMockGetFeedStatus_XML() {
		Variables.SimulationEnabled = true;
		DataFeedCaller call = DataFeedCaller.buildXML();
		GetFeedStatusRequest request = new GetFeedStatusRequest();
		GetFeedStatusRequest.RequestBody body = new GetFeedStatusRequest.RequestBody();
		GetRequestStatus s = new GetRequestStatus();
		s.setMaxCount(100);
		s.setRequestDateFrom("");
		s.setRequestDateTo("");
		s.setRequestStatus("ALL");
		RequestIDList listID = new RequestIDList();
		listID.getRequestID().add("Z98EUQG1FUGC");
		s.setRequestIDList(listID);
		body.setGetRequestStatus(s);
		request.setRequestBody(body);
		GetFeedStatusResponse r = call.getFeedStatus(request);
		Variables.SimulationEnabled = true;
		assertTrue(r.getIsSuccess());
		assertEquals("Z98EUQG1FUGC", r.getResponseBody().getResponseList().getResponseInfo().get(0).getRequestId());
	}

	@Test
	public void testMockGetFeedResult_XML() throws Exception {
		Variables.SimulationEnabled = true;
		DataFeedCaller call = DataFeedCaller.buildXML();
		ProcessingReportResponse r = call.getFeedResult("test");
		Variables.SimulationEnabled = false;
		// assertEquals("Thu Aug 12 21:32:33 CST 2010",r.getMessage().getProcessingReport().getProcessedStamp());
		assertEquals(new BigDecimal("1.0"), r.getHeader().getDocumentVersion());
		assertTrue(r.getMessage().getProcessingReport().getResult().get(0).getErrorList().getErrorDescription().size() == 2);
		assertEquals("1508", r.getMessage().getProcessingReport().getResult().get(0).getAdditionalInfo().getSubCategoryID());
		assertNotNull(r.getMessage().getProcessingReport().getResult().get(0).getAdditionalInfo().getUpc());
	}
}
