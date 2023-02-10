package newegg.marketplace.sdk.item.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetInternationalItemPriceListResponse {

	@JsonProperty("IsSuccess")
	protected boolean success;

	@JsonProperty("OperationType")
	protected String operationType;

	@JsonProperty("SellerID")
	protected String sellerID;

	
	@JsonProperty("ResponseDate")
	protected String responseDate;

	@JsonProperty("ResponseBody")
	protected ResponseBody responseBody;

	public static class ResponseBody {

		@JsonProperty("TotalCount")
		protected int totalCount;
		
		@JsonProperty("ItemList")
		protected List<GetInternationalItemPriceListResponse.Item> itemList;

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}

		public List<GetInternationalItemPriceListResponse.Item> getItemList() {
			return itemList;
		}

		public void setItemList(List<GetInternationalItemPriceListResponse.Item> itemList) {
			this.itemList = itemList;
		}

		
	}

	public static class Item {
		@JsonProperty("ItemNumber")
		protected String itemNumber;
		@JsonProperty("SellerPartNumber")
		protected String sellerPartNumber;
		@JsonProperty("PriceList")
		protected List<Price> priceList;
		public String getItemNumber() {
			return itemNumber;
		}
		public void setItemNumber(String itemNumber) {
			this.itemNumber = itemNumber;
		}
		public String getSellerPartNumber() {
			return sellerPartNumber;
		}
		public void setSellerPartNumber(String sellerPartNumber) {
			this.sellerPartNumber = sellerPartNumber;
		}
		
		public static class Price{
			@JsonProperty("CountryCode")
			protected String countryCode;
			@JsonProperty("Currency")
			protected String currency;
			@JsonProperty("Active")
			protected int active;
			@JsonProperty("MAP")
			protected BigDecimal map;
			@JsonProperty("CheckoutMAP")
			protected BigDecimal checkoutMAP;
			@JsonProperty("SellingPrice")
			protected BigDecimal sellingPrice;
			@JsonProperty("EnableFreeShipping")
			protected int enableFreeShipping;
			@JsonProperty("OnPromotion")
			protected int onPromotion;
			@JsonProperty("ShipByNewegg")
			protected int shipByNewegg;
			@JsonProperty("LimitQuantity")
			protected int limitQuantity;
			public String getCountryCode() {
				return countryCode;
			}
			public void setCountryCode(String countryCode) {
				this.countryCode = countryCode;
			}
			public String getCurrency() {
				return currency;
			}
			public void setCurrency(String currency) {
				this.currency = currency;
			}
			public int getActive() {
				return active;
			}
			public void setActive(int active) {
				this.active = active;
			}
			public BigDecimal getMap() {
				return map;
			}
			public void setMap(BigDecimal map) {
				this.map = map;
			}
			public BigDecimal getCheckoutMAP() {
				return checkoutMAP;
			}
			public void setCheckoutMAP(BigDecimal checkoutMAP) {
				this.checkoutMAP = checkoutMAP;
			}
			public BigDecimal getSellingPrice() {
				return sellingPrice;
			}
			public void setSellingPrice(BigDecimal sellingPrice) {
				this.sellingPrice = sellingPrice;
			}
			public int getEnableFreeShipping() {
				return enableFreeShipping;
			}
			public void setEnableFreeShipping(int enableFreeShipping) {
				this.enableFreeShipping = enableFreeShipping;
			}
			public int getOnPromotion() {
				return onPromotion;
			}
			public void setOnPromotion(int onPromotion) {
				this.onPromotion = onPromotion;
			}
			public int getShipByNewegg() {
				return shipByNewegg;
			}
			public void setShipByNewegg(int shipByNewegg) {
				this.shipByNewegg = shipByNewegg;
			}
			public int getLimitQuantity() {
				return limitQuantity;
			}
			public void setLimitQuantity(int limitQuantity) {
				this.limitQuantity = limitQuantity;
			}
		}

		public List<Price> getPriceList() {
			return priceList;
		}
		public void setPriceList(List<Price> priceList) {
			this.priceList = priceList;
		} 
	}

	

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getSellerID() {
		return sellerID;
	}

	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}

	public String getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(String responseDate) {
		this.responseDate = responseDate;
	}

	public ResponseBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(ResponseBody responseBody) {
		this.responseBody = responseBody;
	}

}
