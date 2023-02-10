package newegg.marketplace.sdk.other;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.other.model.ServiceDomain;
import newegg.marketplace.sdk.other.model.VerifyServiceStatusResponse;

public class OtherCallTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(OtherConfig.class);
	}

	@Test
	public void testVerifyServiceStatus() {
		Variables.SimulationEnabled=true;
		OtherCall s=new OtherCall();
		VerifyServiceStatusResponse r=s.verifyServiceStatus(ServiceDomain.datafeedmgmt);
		Variables.SimulationEnabled=false;
		assertTrue(r.getIsSuccess());
		assertTrue(r.getResponseBody().getTimestamp().length()>0);
	}

}
