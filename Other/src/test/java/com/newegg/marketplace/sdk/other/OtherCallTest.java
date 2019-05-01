package com.newegg.marketplace.sdk.other;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.other.model.Domain;
import com.newegg.marketplace.sdk.other.model.GetServiceStatusResponse;

public class OtherCallTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OtherConfig.class);
	}

	@Test
	public void testVerifyServiceStatus() {
		OtherCall s=new OtherCall();
		GetServiceStatusResponse r=s.verifyServiceStatus(Domain.datafeedmgmt);
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getTimestamp().length()>0);
	}

}
