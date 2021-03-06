package com.newegg.marketplace.sdk.other;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.logging.log4j.LogManager;

import com.newegg.marketplace.sdk.common.APIConfig;

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
public class OtherConfig extends APIConfig{

	private org.apache.logging.log4j.Logger log = LogManager.getLogger(OtherConfig.class);
	
	public OtherConfig() throws ConfigurationException {
		super();
		load();
	}

	private void load() {
		log.info("Load Other Properties");
		Configuration config=this.getConfig();
		Variables.SimulationEnabled = config.getBoolean("newegg.other.simulation");
		Variables.Retryer = new Retryer.Default(config.getInt("newegg.other.retry.period"),
				config.getInt("newegg.other.retry.maxperiod"), config.getInt("newegg.other.retry.maxattempts"));
		Variables.LogLevel=Logger.Level.valueOf(config.getString("newegg.other.loglevel"));
	}
}
