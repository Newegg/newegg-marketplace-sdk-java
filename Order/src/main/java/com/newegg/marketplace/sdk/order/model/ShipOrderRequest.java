package com.newegg.marketplace.sdk.order.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

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
 * 
 * @author Zack.J.Hung
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "UpdateOrderStatus")
//@JsonRootName("UpdateOrderStatus")
public class ShipOrderRequest implements ShipOrderImpl {

	@XmlElement(name = "Action", required = true)
    @JsonProperty("Action")
    private int action;
    @XmlElement(name = "Value", required = true)
    //@JsonProperty("Value")
    private ShipOrderRequest.Value value;
	
    public void setAction(int act) {
    	this.action = act;
    }
    
    public int getAction() {
    	return this.action;
    }
    
    @JsonProperty("Value")
    public ShipOrderRequest.Value getValue() {
    	return this.value;
    }
    
    @JsonProperty("Value")
    public void setValue(ShipOrderRequest.Value v) {
    	this.value = v;
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Value {
    	
	    @XmlElement(name = "Shipment", required = true)
	    @JsonProperty("Shipment")
	    protected ShipOrderRequest.Value.Shipment shipment;
		
	    public void setShipment(ShipOrderRequest.Value.Shipment v) {
	    	this.shipment = v;
	    }
	    
	    public ShipOrderRequest.Value.Shipment getShipment() {
	    	return this.shipment;
	    }
	    
	    @XmlAccessorType(XmlAccessType.FIELD)
	    @XmlType(name = "", propOrder = {

	    })
	    public static class Shipment {
	    	
		    @XmlElement(name = "Header", required = true)
		    @JsonProperty("Header")
		    protected ShipOrderRequest.Value.Shipment.Header header;
		    @XmlElement(name = "PackageList", required = true)
		    @JsonProperty("PackageList")
		    protected ShipOrderRequest.Value.Shipment.PackageList packageList;
		
		    /**
		     * 取得 header 特性的值.
		     * 
		     * @return
		     *     possible object is
		     *     {@link Shipment.Header }
		     *     
		     */
		    public ShipOrderRequest.Value.Shipment.Header getHeader() {
		        return header;
		    }
		
		    /**
		     * 設定 header 特性的值.
		     * 
		     * @param value
		     *     allowed object is
		     *     {@link Shipment.Header }
		     *     
		     */
		    public void setHeader(ShipOrderRequest.Value.Shipment.Header value) {
		        this.header = value;
		    }
		
		    /**
		     * 取得 packageList 特性的值.
		     * 
		     * @return
		     *     possible object is
		     *     {@link Shipment.PackageList }
		     *     
		     */
		    public ShipOrderRequest.Value.Shipment.PackageList getPackageList() {
		        return packageList;
		    }
		
		    /**
		     * 設定 packageList 特性的值.
		     * 
		     * @param value
		     *     allowed object is
		     *     {@link Shipment.PackageList }
		     *     
		     */
		    public void setPackageList(ShipOrderRequest.Value.Shipment.PackageList value) {
		        this.packageList = value;
		    }
		
		
		    @XmlAccessorType(XmlAccessType.FIELD)
		    @XmlType(name = "", propOrder = {
		
		    })
		    public static class Header {
		
		        @XmlElement(name = "SellerID", required = true)
		        @JsonProperty("SellerID")
		        protected String sellerID;
		        @XmlElement(name = "SONumber", required = true)
		        //@JsonProperty("SONumber")
		        protected int soNumber;
		
		        /**
		         * 取得 sellerID 特性的值.
		         * 
		         * @return
		         *     possible object is
		         *     {@link String }
		         *     
		         */
		        public String getSellerID() {
		            return sellerID;
		        }
		
		        /**
		         * 設定 sellerID 特性的值.
		         * 
		         * @param value
		         *     allowed object is
		         *     {@link String }
		         *     
		         */
		        public void setSellerID(String value) {
		            this.sellerID = value;
		        }
		
		        /**
		         * 取得 soNumber 特性的值.
		         * 
		         */
		        @JsonProperty("SONumber")
		        public int getSONumber() {
		            return this.soNumber;
		        }
		
		        /**
		         * 設定 soNumber 特性的值.
		         * 
		         */
		        @JsonProperty("SONumber")
		        public void setSONumber(int value) {
		            this.soNumber = value;
		        }
		
		    }
		
		    @XmlAccessorType(XmlAccessType.FIELD)
		    @XmlType(name = "", propOrder = {
		        "_package"
		    })
		    public static class PackageList {
		
		        @XmlElement(name = "Package", required = true)
		        //@JsonProperty("Package")
		        protected List<ShipOrderRequest.Value.Shipment.PackageList.Package> _package;
		
		        /**
		         * Gets the value of the package property.
		         * 
		         * <p>
		         * This accessor method returns a reference to the live list,
		         * not a snapshot. Therefore any modification you make to the
		         * returned list will be present inside the JAXB object.
		         * This is why there is not a <CODE>set</CODE> method for the package property.
		         * 
		         * <p>
		         * For example, to add a new item, do as follows:
		         * <pre>
		         *    getPackage().add(newItem);
		         * </pre>
		         * 
		         * 
		         * <p>
		         * Objects of the following type(s) are allowed in the list
		         * {@link Shipment.PackageList.Package }
		         * 
		         * 
		         */
		        @JsonProperty("Package")
		        public List<ShipOrderRequest.Value.Shipment.PackageList.Package> getPackage() {
		            if (_package == null) {
		                _package = new ArrayList<ShipOrderRequest.Value.Shipment.PackageList.Package>();
		            }
		            return this._package;
		        }
		
		        @XmlAccessorType(XmlAccessType.FIELD)
		        @XmlType(name = "", propOrder = {
		
		        })
		        public static class Package {
		
		            @XmlElement(name = "TrackingNumber", required = true)
		            @JsonProperty("TrackingNumber")
		            protected String trackingNumber;
		            @XmlElement(name = "ShipCarrier", required = true)
		            @JsonProperty("ShipCarrier")
		            protected String shipCarrier;
		            @XmlElement(name = "ShipService", required = true)
		            @JsonProperty("ShipService")
		            protected String shipService;
		            @XmlElement(name = "ItemList", required = true)
		            @JsonProperty("ItemList")
		            protected ShipOrderRequest.Value.Shipment.PackageList.Package.ItemList itemList;
		
		            /**
		             * 取得 trackingNumber 特性的值.
		             * 
		             * @return
		             *     possible object is
		             *     {@link String }
		             *     
		             */
		            public String getTrackingNumber() {
		                return trackingNumber;
		            }
		
		            /**
		             * 設定 trackingNumber 特性的值.
		             * 
		             * @param value
		             *     allowed object is
		             *     {@link String }
		             *     
		             */
		            public void setTrackingNumber(String value) {
		                this.trackingNumber = value;
		            }
		
		            /**
		             * 取得 shipCarrier 特性的值.
		             * 
		             * @return
		             *     possible object is
		             *     {@link String }
		             *     
		             */
		            public String getShipCarrier() {
		                return shipCarrier;
		            }
		
		            /**
		             * 設定 shipCarrier 特性的值.
		             * 
		             * @param value
		             *     allowed object is
		             *     {@link String }
		             *     
		             */
		            public void setShipCarrier(String value) {
		                this.shipCarrier = value;
		            }
		
		            /**
		             * 取得 shipService 特性的值.
		             * 
		             * @return
		             *     possible object is
		             *     {@link String }
		             *     
		             */
		            public String getShipService() {
		                return shipService;
		            }
		
		            /**
		             * 設定 shipService 特性的值.
		             * 
		             * @param value
		             *     allowed object is
		             *     {@link String }
		             *     
		             */
		            public void setShipService(String value) {
		                this.shipService = value;
		            }
		
		            /**
		             * 取得 itemList 特性的值.
		             * 
		             * @return
		             *     possible object is
		             *     {@link Shipment.PackageList.Package.ItemList }
		             *     
		             */
		            public ShipOrderRequest.Value.Shipment.PackageList.Package.ItemList getItemList() {
		                return itemList;
		            }
		
		            /**
		             * 設定 itemList 特性的值.
		             * 
		             * @param value
		             *     allowed object is
		             *     {@link Shipment.PackageList.Package.ItemList }
		             *     
		             */
		            public void setItemList(ShipOrderRequest.Value.Shipment.PackageList.Package.ItemList value) {
		                this.itemList = value;
		            }
		
		
		            @XmlAccessorType(XmlAccessType.FIELD)
		            @XmlType(name = "", propOrder = {
		                "item"
		            })
		            public static class ItemList {
		
		                @XmlElement(name = "Item", required = true)
		                @JsonProperty("Item")
		                protected List<ShipOrderRequest.Value.Shipment.PackageList.Package.ItemList.Item> item;
		
		                /**
		                 * Gets the value of the item property.
		                 * 
		                 * <p>
		                 * This accessor method returns a reference to the live list,
		                 * not a snapshot. Therefore any modification you make to the
		                 * returned list will be present inside the JAXB object.
		                 * This is why there is not a <CODE>set</CODE> method for the item property.
		                 * 
		                 * <p>
		                 * For example, to add a new item, do as follows:
		                 * <pre>
		                 *    getItem().add(newItem);
		                 * </pre>
		                 * 
		                 * 
		                 * <p>
		                 * Objects of the following type(s) are allowed in the list
		                 * {@link Shipment.PackageList.Package.ItemList.Item }
		                 * 
		                 * 
		                 */
		                public List<ShipOrderRequest.Value.Shipment.PackageList.Package.ItemList.Item> getItem() {
		                    if (item == null) {
		                        item = new ArrayList<ShipOrderRequest.Value.Shipment.PackageList.Package.ItemList.Item>();
		                    }
		                    return this.item;
		                }
		
		
		                @XmlAccessorType(XmlAccessType.FIELD)
		                @XmlType(name = "", propOrder = {
		
		                })
		                public static class Item {
		
		                    @XmlElement(name = "SellerPartNumber", required = true)
		                    @JsonProperty("SellerPartNumber")
		                    protected String sellerPartNumber;
		                    @XmlElement(name = "NeweggItemNumber")
		                    @JsonProperty("NeweggItemNumber")
		                    protected String neweggItemNumber;
		                    @XmlElement(name = "ShippedQty")
		                    @JsonProperty("ShippedQty")
		                    protected int shippedQty;
		
		                    /**
		                     * 取得 sellerPartNumber 特性的值.
		                     * 
		                     * @return
		                     *     possible object is
		                     *     {@link String }
		                     *     
		                     */
		                    public String getSellerPartNumber() {
		                        return sellerPartNumber;
		                    }
		
		                    /**
		                     * 設定 sellerPartNumber 特性的值.
		                     * 
		                     * @param value
		                     *     allowed object is
		                     *     {@link String }
		                     *     
		                     */
		                    public void setSellerPartNumber(String value) {
		                        this.sellerPartNumber = value;
		                    }
		
		                    /**
		                     * 取得 neweggItemNumber 特性的值.
		                     * 
		                     * @return
		                     *     possible object is
		                     *     {@link String }
		                     *     
		                     */
		                    public String getNeweggItemNumber() {
		                        return neweggItemNumber;
		                    }
		
		                    /**
		                     * 設定 neweggItemNumber 特性的值.
		                     * 
		                     * @param value
		                     *     allowed object is
		                     *     {@link String }
		                     *     
		                     */
		                    public void setNeweggItemNumber(String value) {
		                        this.neweggItemNumber = value;
		                    }
		
		                    /**
		                     * 取得 shippedQty 特性的值.
		                     * 
		                     */
		                    public int getShippedQty() {
		                        return shippedQty;
		                    }
		
		                    /**
		                     * 設定 shippedQty 特性的值.
		                     * 
		                     */
		                    public void setShippedQty(int value) {
		                        this.shippedQty = value;
		                    }
		
		                }
		
		            }
		
		        }
		
		    }
	    }
    }
}
