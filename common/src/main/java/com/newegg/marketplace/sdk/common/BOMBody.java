package com.newegg.marketplace.sdk.common;

import static feign.Util.UTF_8;
import static feign.Util.checkNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

import org.apache.commons.io.input.BOMInputStream;

import feign.Response.Body;
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
 * To handle the BOM of UTF8 
 * @author QB
 *
 */
public class BOMBody implements Body {

	private Body body;
	
	public BOMBody(Body body){
		this.body=body;
	}
	
	@Override
	public void close() throws IOException {		
		body.close();
	}

	@Override
	public Integer length() {		
		return body.length();
	}

	@Override
	public boolean isRepeatable() {		
		return body.isRepeatable();
	}
	
	@Override
	public InputStream asInputStream() throws IOException {		
		return new BOMInputStream(body.asInputStream());
	}

	@Override
	public Reader asReader() throws IOException {
		return new InputStreamReader(asInputStream(), UTF_8);
	}

	@Override
	public Reader asReader(Charset charset) throws IOException {
		checkNotNull(charset, "charset should not be null");
		return new InputStreamReader(asInputStream(), charset);
	}

}
