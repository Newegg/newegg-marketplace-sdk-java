package com.newegg.marketplace.sdk.other.inner;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.other.OtherConfig;
import com.newegg.marketplace.sdk.other.Variables;
import com.newegg.marketplace.sdk.other.model.Domain;
import com.newegg.marketplace.sdk.other.model.GetServiceStatusResponse;

public class OtherCallerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OtherConfig.class);
	}

	@Test
	public void testVerifyServiceStatus_XML() {
		OtherCaller call=OtherCaller.buildXML();
		GetServiceStatusResponse r=call.verifyServiceStatus(Domain.contentmgmt);
		assertTrue(r.getIsSuccess());
		assertEquals(r.getOperationType(),"GetServiceStatus");
		assertTrue(r.getResponseBody().getTimestamp().length()>0);
	}
	
	@Test
	public void testVerifyServiceStatus_JSON() {
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		OtherCaller call=OtherCaller.buildJSON();
		GetServiceStatusResponse r=call.verifyServiceStatus(Domain.contentmgmt);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		assertTrue(r.getIsSuccess());
		assertEquals(r.getOperationType(),"GetServiceStatus");
		assertTrue(r.getResponseBody().getTimestamp().length()>0);
	}
	
	
	@Test
	public void testMockVerifyServiceStatus_XML() {
		Variables.SimulationEnabled=true;
		OtherCaller call=OtherCaller.buildXML();
		GetServiceStatusResponse r=call.verifyServiceStatus(Domain.contentmgmt);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertEquals(r.getOperationType(),"GetServiceStatus");
		assertTrue(r.getResponseBody().getTimestamp().length()>0);		
	}
	
	@Test
	public void testMockVerifyServiceStatus_JSON() {
		Variables.SimulationEnabled=true;
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
		OtherCaller call=OtherCaller.buildJSON();
		GetServiceStatusResponse r=call.verifyServiceStatus(Domain.contentmgmt);
		Content.JSON_MAPPER.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertEquals(r.getOperationType(),"GetServiceStatus");
		assertTrue(r.getResponseBody().getTimestamp().length()>0);
	}
}
