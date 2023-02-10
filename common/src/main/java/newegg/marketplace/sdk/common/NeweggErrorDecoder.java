package newegg.marketplace.sdk.common;

import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;

import feign.FeignException;
import feign.Response;
import feign.codec.ErrorDecoder.Default;
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
 * For NeweggException
 * @author QB
 *
 */
public class NeweggErrorDecoder extends Default {

	private MEDIA_TYPE mediaType=MEDIA_TYPE.XML;
	
	public NeweggErrorDecoder(MEDIA_TYPE mediaType) {
		super();
		this.mediaType=mediaType;
	}
	
	@Override
	public Exception decode(String methodKey, Response response) {
		Exception e=super.decode(methodKey, response);
		if(e instanceof FeignException) {
			FeignException tmpE=(FeignException)e;
			NeweggException nex=new NeweggException(tmpE.status(),tmpE.getMessage(),tmpE.content(),mediaType);
			return nex;
		}
		return e;
	}
}
