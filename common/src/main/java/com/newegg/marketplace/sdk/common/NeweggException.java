package com.newegg.marketplace.sdk.common;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.logging.log4j.LogManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.newegg.marketplace.sdk.common.Content.MEDIA_TYPE;

import feign.FeignException;

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
 * Converted the String message to Errors object
 * 
 * @author QB
 *
 */
public class NeweggException extends FeignException {

	private static final long serialVersionUID = 3289908847469444738L;
	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(NeweggException.class);

	private MEDIA_TYPE mediaType = MEDIA_TYPE.XML;

	protected NeweggException(int status, String message, byte[] content, MEDIA_TYPE mediaType) {
		super(status, message, content);
		this.mediaType = mediaType;

	}

	public Errors genErors() {
		Errors errors = new Errors();
		if (this.status() == 400 || this.status() == 429) {
			try {
				switch (mediaType) {
				case JSON:
					CollectionType collectionType = Content.JSON_MAPPER.getTypeFactory()
							.constructCollectionType(List.class, Errors.Error.class);
					List<Errors.Error> list = Content.JSON_MAPPER.readValue(this.contentUTF8(), collectionType);
					errors.getError().addAll(list);
					return errors;
				case XML:
					Unmarshaller u = Content.JAXB_FACTORY.createUnmarshaller(Errors.class);
					StreamSource in = new StreamSource(new ByteArrayInputStream(this.content()));
					return u.unmarshal(in, Errors.class).getValue();
				}
			} catch (Exception e) {
				log.warn("Unmarshaller",e);
				Errors.Error er = new Errors.Error();
				er.setCode("Convert Error");
				er.setMessage(e.getMessage());
				errors.getError().add(er);
			}
		} else {
			Errors.Error er = new Errors.Error();
			er.setCode("UnExpect");
			er.setMessage(this.getMessage());
			errors.getError().add(er);
		}
		return errors;
	}

	@Override
	public String toString() {
		return "NeweggException [status()=" + status() + ", Error=" + genErors() + "]";
	}

	public String toJson(Errors errs) {
		String data = "";
		try {
			if (mediaType == Content.MEDIA_TYPE.JSON) {
				ObjectMapper objectMapper = Content.JSON_MAPPER;
				data = objectMapper.writeValueAsString(errs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public String toXML(Errors errs) {
		String data = "";
		try {
			if (mediaType == Content.MEDIA_TYPE.XML) {
				JAXBContext context = JAXBContext.newInstance(Errors.class);
				Marshaller marshaller = context.createMarshaller();
				StringWriter w = new StringWriter();
				marshaller.marshal(errs, w);
				data = w.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

}
