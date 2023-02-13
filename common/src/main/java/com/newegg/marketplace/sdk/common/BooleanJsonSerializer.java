package com.newegg.marketplace.sdk.common;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
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
public class BooleanJsonSerializer extends JsonSerializer<Boolean> {

	@Override
	public void serialize(Boolean value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		gen.writeString(value.booleanValue()?"True":"False");	
	}

}
