package newegg.marketplace.sdk.datafeed.inner;


import newegg.marketplace.sdk.common.Content;
import newegg.marketplace.sdk.common.Content.PLATFORM;

public class ConfBack {

	private PLATFORM Platform;
	private String HostURL;
	private String SellerID;
	private String Authorization;
	private String SecretKey;
	
	public  ConfBack() {
		Platform=Content.Platform;
		HostURL=Content.HostURL;
		SellerID=Content.SellerID;
		Authorization=Content.Authorization;
		SecretKey=Content.SecretKey;
	}
	
	public void restore() {
		Content.Platform=Platform;
		Content.HostURL=HostURL;
		Content.SellerID=SellerID;
		Content.Authorization=Authorization;
		Content.SecretKey=SecretKey;
	}
}
