package newegg.marketplace.sdk.common;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.FileBasedBuilderParameters;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.convert.DefaultListDelimiterHandler;
import org.apache.commons.configuration2.convert.ListDelimiterHandler;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.ClasspathLocationStrategy;
import org.apache.commons.configuration2.io.CombinedLocationStrategy;
import org.apache.commons.configuration2.io.FileLocationStrategy;
import org.apache.commons.configuration2.io.FileSystemLocationStrategy;
import org.apache.logging.log4j.LogManager;

import newegg.marketplace.sdk.common.Content.PLATFORM;

import feign.Logger;
import feign.Retryer;

/**
Copyright (c) 2000-present, Newegg Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

/**
 * @author QB
 *
 */
public class APIConfig{
	
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(APIConfig.class);
	private static Configuration config;
	
	public APIConfig() throws ConfigurationException {
		if (APIConfig.config == null) {
			List<FileLocationStrategy> subs = Arrays.asList(new FileSystemLocationStrategy(),
					new ClasspathLocationStrategy());
			FileLocationStrategy strategy = new CombinedLocationStrategy(subs);

			ListDelimiterHandler delimiter = new DefaultListDelimiterHandler(',');
			Parameters params = new Parameters();
			FileBasedBuilderParameters parameters = params.fileBased().setFileName("newegg.properties")
					.setEncoding("UTF-8").setLocationStrategy(strategy).setThrowExceptionOnMissing(true)
					.setListDelimiterHandler(delimiter);
			FileBasedConfigurationBuilder<PropertiesConfiguration> builder = new FileBasedConfigurationBuilder<PropertiesConfiguration>(
					PropertiesConfiguration.class);
			builder.configure(parameters);

			PropertiesConfiguration config = builder.getConfiguration();
			APIConfig.config = config;
			globalConfig();
		}
	}
	
	private void globalConfig() {
		log.info("Load Global Properties");
		Content.Authorization = config.getString("newegg.authorization");
		Content.SecretKey = config.getString("newegg.secretkey");
		Content.SellerID = config.getString("newegg.sellerid");
		Content.Platform=PLATFORM.valueOf(config.getString("newegg.platform"));
		Content.HostURL = config.getString("newegg.hosturl");
		Content.SIMULATION_ENABLED = config.getBoolean("newegg.simulation");
		Content.RETRYER = new Retryer.Default(config.getInt("newegg.retry.period"),
				config.getInt("newegg.retry.maxperiod"), config.getInt("newegg.retry.maxattempts"));
		Content.DEFAULT_LOG_LEVEL=Logger.Level.valueOf(config.getString("newegg.loglevel"));
		Content.ConnectTimeoutMillis=config.getInt("newegg.connectTimeoutMillis");
		Content.ReadTimeoutMillis=config.getInt("newegg.readTimeoutMillis");
	}

	public Configuration getConfig() {
		return config;
	}
	
	public static void load(Class c) {
		try {
			c.newInstance();
		} catch (Exception e) {
			log.warn("Propertie load fail!",e);
		}
	}
}
