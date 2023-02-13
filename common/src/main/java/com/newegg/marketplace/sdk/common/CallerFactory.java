package com.newegg.marketplace.sdk.common;

import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;

import feign.Client;
import feign.Feign;
import feign.Feign.Builder;
import feign.Logger;
import feign.Request.Options;
import feign.Response;
import feign.Retryer;
import feign.codec.Encoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxb.JAXBDecoder;
import feign.jaxb.JAXBEncoder;
import feign.mock.MockClient;
import feign.mock.MockTarget;
import feign.slf4j.Slf4jLogger;
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
 * 
 * Factory to create instance of caller interface 
 * 
 * @author QB
 *
 * @param <T> feign interface
 */
public class CallerFactory<T> {

	public T jsonBuild(Class<T> class1,Logger.Level l,Retryer r,Client client) {	
		
		Builder b= Feign.builder()
        .encoder(new JacksonEncoder(Content.JSON_MAPPER))
        .mapAndDecode((response, type)->{
        		return Response.builder()
        		.body(new BOMBody(response.body()))
        		.reason(response.reason())
        		.request(response.request())
        		.status(response.status())
        		.headers(response.headers())
        		.build();
        },new JacksonDecoder(Content.JSON_MAPPER))
        .errorDecoder(new NeweggErrorDecoder(MEDIA_TYPE.JSON))
        .logger(new Slf4jLogger())
        .logLevel(l)
        .client(client)
        .requestInterceptor(new HeaderInterceptor())
        .options(new Options(Content.ConnectTimeoutMillis,Content.ReadTimeoutMillis))
        .retryer(r);
		if(client instanceof MockClient) {
			return b.target(new MockTarget<>(class1));
		}else {
			
			return b.target(class1, Content.HostURL+Content.Platform);
		}
	}
	
	
	public T xmlBuild(Class<T> class1,Logger.Level l,Retryer r,Client client) {
		Builder b=Feign.builder()
		.client(client)
        .encoder(new JAXBEncoder(Content.JAXB_FACTORY))        
        .decoder(new JAXBDecoder(Content.JAXB_FACTORY))
        .errorDecoder(new NeweggErrorDecoder(MEDIA_TYPE.XML))
        .logger(new Slf4jLogger())
        .logLevel(l)        
        .requestInterceptor(new HeaderInterceptor())
        .options(new Options(Content.ConnectTimeoutMillis,Content.ReadTimeoutMillis))
        .retryer(r);
		if(client instanceof MockClient) {
			return b.target(new MockTarget<>(class1));
		}else {
			return b.target(class1, Content.HostURL+Content.Platform);
			
		}       
	}
	
	public T downloadBuild(Class<T> class1,Logger.Level l,Retryer r,Client client,Encoder encode) {
		NeweggErrorDecoder errorDecoder=null;
		if(encode instanceof JacksonEncoder) {
			errorDecoder= new NeweggErrorDecoder(MEDIA_TYPE.JSON);
		}else {
			errorDecoder= new NeweggErrorDecoder(MEDIA_TYPE.XML);
		}
		Builder b=Feign.builder()
		.client(client)
        .encoder(encode)        
        .decoder(new FileDecoder())
        .errorDecoder(errorDecoder)
        .logger(new Slf4jLogger())
        .logLevel(l)        
        .requestInterceptor(new HeaderInterceptor())
        .options(new Options(Content.ConnectTimeoutMillis,Content.ReadTimeoutMillis))
        .retryer(r);
		if(client instanceof MockClient) {
			return b.target(new MockTarget<>(class1));
		}else {
			return b.target(class1, Content.HostURL+Content.Platform);
		}       
	}
}
