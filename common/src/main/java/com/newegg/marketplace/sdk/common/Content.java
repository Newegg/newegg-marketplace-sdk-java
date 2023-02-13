package com.newegg.marketplace.sdk.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import feign.Logger;
import feign.Retryer;
import feign.jaxb.JAXBContextFactory;
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
public class Content {

	public enum MEDIA_TYPE{XML,JSON}

	/**
	 *USB == B2B
	 */
	public enum PLATFORM {
		USA, USB, CAN;
		@Override
		public String toString() {
			switch (this) {
			case USB:
				return "/b2b";
			case CAN:
				return "/can";
			default:
				return "";
			}
		}
	}
	
	public static final String VERSION_NAME="JVER";
	public static final String AUTHORIZATION_NAME="Authorization";
	public static final String SECRET_KEY_NAME="SecretKey";	
	public static final ObjectMapper JSON_MAPPER = new ObjectMapper()
	        .setSerializationInclusion(JsonInclude.Include.NON_NULL)
	        .configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
	        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
	        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
	        .setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL)
	        .enable(JsonParser.Feature.ALLOW_COMMENTS);
	public static final JAXBContextFactory JAXB_FACTORY = new JAXBContextFactory.Builder()
		    .withMarshallerJAXBEncoding("UTF-8")			   
		    .build();	
	
	public static PLATFORM Platform=PLATFORM.USA;
	public static Logger.Level DEFAULT_LOG_LEVEL=Logger.Level.FULL;
	public static Retryer RETRYER = new Retryer.Default();
	public static boolean SIMULATION_ENABLED=true;
	public static String HostURL="http://xxx.xxx.xxx/marketplace";
	public static String SellerID="AXXX";
	public static String Authorization="none";
	public static String SecretKey="none";
	public static int ConnectTimeoutMillis=10000;
	public static int ReadTimeoutMillis=60000;
	
}
