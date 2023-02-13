package com.newegg.marketplace.sdk.seller;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.newegg.marketplace.sdk.common.APIConfig;
import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.seller.model.GetIndustryListResponse;
import com.newegg.marketplace.sdk.seller.model.GetSubcategoryStatusForInternationalCountryRequest;
import com.newegg.marketplace.sdk.seller.model.SellerStatusCheckResponse;

public class SellerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(SellerConfig.class);
	}
	@Before
	public void before() {
		Variables.SimulationEnabled = true;
	}
	
	@After
	public void After() {
		Variables.SimulationEnabled = false;
	}

	@Test
	public void testGetSellerAccountStatus() {
		SellerCall s=new SellerCall();
		SellerStatusCheckResponse r=s.sellerStatusCheck();
		assertTrue(r.getIsSuccess());
		assertTrue("            Test_MKTPLS".trim().equalsIgnoreCase(r.getResponseBody().getSellerName().trim()));
	}

	
	@Test
	public void testGetIndustryList(){
		SellerCall s=new SellerCall();
		GetIndustryListResponse r=s.getIndustryList(Optional.empty());
		//GetIndustryResponse r=s.GetIndustryList(Optional.of("MI"));
		assertTrue(r.getIsSuccess());
	}
	
	@Test
	public void testNoneUSAGetSubcategory4InternationalCountry() {
		boolean assertFlag=false;
		Content.PLATFORM tmp=Content.Platform;		
		Content.Platform=Content.PLATFORM.CAN;
		SellerCall s=new SellerCall();
		GetSubcategoryStatusForInternationalCountryRequest body =new GetSubcategoryStatusForInternationalCountryRequest();
		try {
			s.getSubcategoryStatusForInternationalCountry(body);
		}catch(PlatformException ex) {
			assertFlag=true;
		}
		Content.Platform=tmp;	
		assertTrue(assertFlag);
	}
}
