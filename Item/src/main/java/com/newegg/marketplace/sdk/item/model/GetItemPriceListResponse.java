package com.newegg.marketplace.sdk.item.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetItemPriceListResponse {
	@JsonProperty("IsSuccess")
	protected boolean success;

	@JsonProperty("OperationType")
	protected String operationType;

	@JsonProperty("SellerID")
	protected String sellerID;

	@JsonProperty("ResponseDate")
	protected String responseDate;

	@JsonProperty("ResponseBody")
	protected GetItemPriceListResponse.ResponseBody responseBody;

	public static class ResponseBody {

		@JsonProperty("TotalCount")
		private int totalCount;
		@JsonProperty("ItemList")
		private List<GetItemPriceListResponse.Item> itemList;
		public int getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}
		public List<GetItemPriceListResponse.Item> getItemList() {
			return itemList;
		}
		public void setItemList(List<GetItemPriceListResponse.Item> itemList) {
			this.itemList = itemList;
		}
	}

	public static class Item {
		@JsonProperty("ItemNumber")
		private String itemNumber;
		@JsonProperty("SellerPartNumber")
		private String sellerPartNumber;
		@JsonProperty("PriceList")
		private List<GetItemPriceListResponse.Price> priceList;
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
		public List<GetItemPriceListResponse.Price> getPriceList() {
			return priceList;
		}
		public void setPriceList(List<GetItemPriceListResponse.Price> priceList) {
			this.priceList = priceList;
		}
	}
	
	public static class Price{
		@JsonProperty("CountryCode")
		private String countryCode;
		@JsonProperty("Currency")
		private String currency;
		@JsonProperty("Active")
		private int active;
		@JsonProperty("MAP")
		private BigDecimal map;
		@JsonProperty("CheckoutMAP")
		private BigDecimal checkoutMAP;
		@JsonProperty("SellingPrice")
		private BigDecimal sellingPrice;
		@JsonProperty("EnableFreeShipping")
		private int enableFreeShipping;
		@JsonProperty("OnPromotion")
		private int onPromotion;
		@JsonProperty("ShipByNewegg")
		private int shipByNewegg;
		@JsonProperty("LimitQuantity")
		private int limitQuantity;
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

	public GetItemPriceListResponse.ResponseBody getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(GetItemPriceListResponse.ResponseBody responseBody) {
		this.responseBody = responseBody;
	}

}
