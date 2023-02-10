package newegg.marketplace.sdk.common;

import static org.junit.Assert.*;

import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.Test;

public class APIConfigTest {

	@Test
	public void testAPIConfig() throws ConfigurationException {
		APIConfig conf=new APIConfig();
		String id=conf.getConfig().getString("newegg.sellerid");
		assertTrue("A006".equals(id));
	}

}
