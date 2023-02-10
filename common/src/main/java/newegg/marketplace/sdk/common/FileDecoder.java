package newegg.marketplace.sdk.common;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import feign.FeignException;
import feign.Response;
import feign.codec.Decoder;
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
public class FileDecoder implements Decoder {

	@Override
	public Object decode(Response response, Type type) throws IOException,FeignException {		
		if (!"java.io.File".equals(type.getTypeName()))
		      return null;
		if (response.status() == 200 && response.body() != null) {
			Path path=Files.createTempFile(null, ".zip");
			Files.copy(response.body().asInputStream(), path,StandardCopyOption.REPLACE_EXISTING);	
			return path.toFile();			
		}
		return null;    
	}

}
