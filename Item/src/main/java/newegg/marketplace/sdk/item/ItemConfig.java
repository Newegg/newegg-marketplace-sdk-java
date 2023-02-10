package newegg.marketplace.sdk.item;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.LogManager;

import newegg.marketplace.sdk.common.APIConfig;

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
 * configure of library
 * @author QB
 *
 */
public class ItemConfig extends APIConfig {
	
	private org.apache.logging.log4j.Logger log = LogManager.getLogger(ItemConfig.class);
	
	public ItemConfig() throws ConfigurationException {
		super();
		load();
	}

	private void load() {
		log.info("Load Item Properties");
		Configuration config=this.getConfig();
		Variables.SimulationEnabled = config.getBoolean("newegg.item.simulation");
		Variables.Retryer = new Retryer.Default(config.getInt("newegg.item.retry.period"),
				config.getInt("newegg.item.retry.maxperiod"), config.getInt("newegg.item.retry.maxattempts"));
		Variables.LogLevel=Logger.Level.valueOf(config.getString("newegg.item.loglevel"));
	}
}
