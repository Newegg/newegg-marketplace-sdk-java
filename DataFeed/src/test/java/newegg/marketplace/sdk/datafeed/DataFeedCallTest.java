package newegg.marketplace.sdk.datafeed;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import newegg.marketplace.sdk.common.APIConfig;

public class DataFeedCallTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		APIConfig.load(DataFeedConfig.class);
	}

	//@Test
	public void testGetFeedStatus() {
		fail("Not yet implemented");
	}

	//@Test
	public void testGetFeedResult() {
		fail("Not yet implemented");
	}

}
