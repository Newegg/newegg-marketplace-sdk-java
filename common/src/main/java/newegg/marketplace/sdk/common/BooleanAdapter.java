package newegg.marketplace.sdk.common;

import javax.xml.bind.annotation.adapters.XmlAdapter;
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
public class BooleanAdapter extends XmlAdapter<String, Boolean> {

	@Override
	public Boolean unmarshal(String v) throws Exception {
		return "True".equals(v) || "true".equals(v);
	}

	@Override
	public String marshal(Boolean v) throws Exception {
		if (v) {
	        return "True";
	      }
	      return "False";
	}

}
