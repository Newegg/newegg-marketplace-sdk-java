package com.newegg.marketplace.sdk.seller;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.seller.model.GetIndustryResponse;
import com.newegg.marketplace.sdk.seller.model.GetSellerAccountStatusResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcatetoryRequestV2;

public class SellerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SellerConfig.class);
	}
	

	@Test
	public void testGetSellerAccountStatus() {
		SellerCall s=new SellerCall();
		GetSellerAccountStatusResponse r=s.sellerStatusCheck();
		assertTrue(r.getIsSuccess());
		assertTrue("Test_SandBox_MKTPLS".equals(r.getResponseBody().getSellerName()));
	}

	
	@Test
	public void testGetIndustryList(){
		Variables.SimulationEnabled=true;
		SellerCall s=new SellerCall();
		GetIndustryResponse r=s.getIndustryList(Optional.empty());
		//GetIndustryResponse r=s.GetIndustryList(Optional.of("MI"));
		assertTrue(r.getIsSuccess());
	}
	
	@Test
	public void testNoneUSAGetSubcategory4InternationalCountry() {
		boolean assertFlag=false;
		Content.PLATFORM tmp=Content.Platform;		
		Content.Platform=Content.PLATFORM.CAN;
		SellerCall s=new SellerCall();
		GetSubcatetoryRequestV2 body =new GetSubcatetoryRequestV2();
		try {
			s.getSubcategoryStatusForInternationalCountry(body);
		}catch(PlatformException ex) {
			assertFlag=true;
		}
		Content.Platform=tmp;	
		assertTrue(assertFlag);
	}
}
