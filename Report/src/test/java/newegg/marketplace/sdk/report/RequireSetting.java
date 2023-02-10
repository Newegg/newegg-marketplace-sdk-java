package newegg.marketplace.sdk.report;

import java.util.List;

import org.apache.logging.log4j.LogManager;

import newegg.marketplace.sdk.common.APIConfig;
import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Errors;
import newegg.marketplace.sdk.common.NeweggException;
import newegg.marketplace.sdk.common.Content.MEDIA_TYPE;
import newegg.marketplace.sdk.common.Content.PLATFORM;
import newegg.marketplace.sdk.common.Errors.Error;

public class RequireSetting {
	public static org.apache.logging.log4j.Logger log = LogManager.getLogger(APIConfig.class);
	
	static String[][] authKey = {
			{"A006", "****************************************", "********-****-****-****-************"}, // USA
			{"A2GS", "****************************************", "********-****-****-****-************"},
			{"A2EU", "****************************************", "********-****-****-****-************"},
			{"AEUG", "****************************************", "********-****-****-****-************"},
			{"A3VV", "****************************************", "********-****-****-****-************"},
			{"A44S", "****************************************", "********-****-****-****-************"}, // USB
			{"V047", "****************************************", "********-****-****-****-************"},
			{"A3TV", "****************************************", "********-****-****-****-************"}, // CAN
	}; // id, authorization, secret key
	
	public static String getTestInfo() {
		String msg = "";
		
		msg = String.format("Zack-Test BEGIN {Mock:%s, Media Type:%s, Platform:%s}", 
				Variables.SimulationEnabled, Variables.MediaType, Content.Platform);
		return msg;
	}
	
	public static void printError(NeweggException e, MEDIA_TYPE type) {
		Errors errObj;
		List<Error> ar;
		Errors.Error x;
		String msg = "";
		
		errObj = e.genErors();
		ar = errObj.getError(); 
		x = ar.get(0);
		if (!ar.isEmpty()) {
			if (type == MEDIA_TYPE.XML) {
				msg = String.format("<?xml version=\"1.0\" encoding=\"utf-8\"?>"
						+ "<Errors><Error><Code>%s</Code><Message>%s</Message></Error></Errors>", 
						x.getCode(), x.getMessage());
			} else {
				msg = String.format("{\"Code\": \"%s\", \"Message\": \"%s\"}", x.getCode(), x.getMessage());
			}
			
			log.info("error response is : " + msg);
		}
	}
	
	public static void authKeySetting(PLATFORM platform) {
		int index = 0;
		
		switch (platform) {
		case USA:
			index = 0;
			break;
		case USB:
			index = 5;
			break;
		case CAN:
			index = 7;
			break;
		}
		
		Content.SellerID = authKey[index][0];
		Content.Authorization = authKey[index][1];
		Content.SecretKey = authKey[index][2];
	}
	
	public static void authKeySetting(String sellerID) {
		int index = 0;
		
		for (String[] item :  authKey) {
			if (item[0].equals(sellerID)) {
				Content.SellerID = authKey[index][0];
				Content.Authorization = authKey[index][1];
				Content.SecretKey = authKey[index][2];
				break;
			}
			index++;
		}
	}
}
