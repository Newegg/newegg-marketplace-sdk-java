package com.newegg.marketplace.sdk.item.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetItemInternationalInventoryListResponse {

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
		protected List<GetItemInternationalInventoryListResponse.Item> itemList;

		public int getTotalCount() {
			return totalCount;
		}

		public void setTotalCount(int totalCount) {
			this.totalCount = totalCount;
		}

		public List<GetItemInternationalInventoryListResponse.Item> getItemList() {
			return itemList;
		}

		public void setItemList(List<GetItemInternationalInventoryListResponse.Item> itemList) {
			this.itemList = itemList;
		}

		
	}

	public static class Item {
		@JsonProperty("ItemNumber")
		protected String itemNumber;
		@JsonProperty("SellerPartNumber")
		protected String sellerPartNumber;
		@JsonProperty("Condition")
		protected String condition;
		@JsonProperty("InventoryAllocation")
		protected List<GetItemInternationalInventoryListResponse.InventoryAllocation> inventoryAllocation;
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
		public String getCondition() {
			return condition;
		}
		public void setCondition(String condition) {
			this.condition = condition;
		}
		public List<GetItemInternationalInventoryListResponse.InventoryAllocation> getInventoryAllocation() {
			return inventoryAllocation;
		}
		public void setInventoryAllocation(List<GetItemInternationalInventoryListResponse.InventoryAllocation> inventoryAllocation) {
			this.inventoryAllocation = inventoryAllocation;
		}

		
	}

	public static class InventoryAllocation {
		@JsonProperty("WarehouseLocation")
		protected String warehouseLocation;
		@JsonProperty("FulfillmentOption")
		protected String fulfillmentOption;
		@JsonProperty("AvailableQuantity")
		protected int availableQuantity;
		public String getWarehouseLocation() {
			return warehouseLocation;
		}
		public void setWarehouseLocation(String warehouseLocation) {
			this.warehouseLocation = warehouseLocation;
		}
		public String getFulfillmentOption() {
			return fulfillmentOption;
		}
		public void setFulfillmentOption(String fulfillmentOption) {
			this.fulfillmentOption = fulfillmentOption;
		}
		public int getAvailableQuantity() {
			return availableQuantity;
		}
		public void setAvailableQuantity(int availableQuantity) {
			this.availableQuantity = availableQuantity;
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
