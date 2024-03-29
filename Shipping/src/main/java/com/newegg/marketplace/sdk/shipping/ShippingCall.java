package com.newegg.marketplace.sdk.shipping;

import com.newegg.marketplace.sdk.common.Content;
import com.newegg.marketplace.sdk.common.Content.PLATFORM;
import com.newegg.marketplace.sdk.common.PlatformException;
import com.newegg.marketplace.sdk.shipping.inner.ShipODCaller;
import com.newegg.marketplace.sdk.shipping.inner.ShipOPCaller;
import com.newegg.marketplace.sdk.shipping.inner.ShipOTCaller;
import com.newegg.marketplace.sdk.shipping.model.ConfirmShipRequest;
import com.newegg.marketplace.sdk.shipping.model.ConfirmShipResponse;
import com.newegg.marketplace.sdk.shipping.model.GetPackageListRequest;
import com.newegg.marketplace.sdk.shipping.model.GetPackageListResponse;
import com.newegg.marketplace.sdk.shipping.model.GetShippinLabelResponse;
import com.newegg.marketplace.sdk.shipping.model.GetShippingDetailRequest;
import com.newegg.marketplace.sdk.shipping.model.GetShippingDetailResponse;
import com.newegg.marketplace.sdk.shipping.model.GetShippingLabelRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelEstimateRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelEstimateResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelReprintRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingLabelReprintResponse;
import com.newegg.marketplace.sdk.shipping.model.ShippingNewLabelSubmitRequest;
import com.newegg.marketplace.sdk.shipping.model.ShippingNewLabelSubmitResponse;
import com.newegg.marketplace.sdk.shipping.model.SubmitShippingRequest;
import com.newegg.marketplace.sdk.shipping.model.SubmitShippingResponse;
import com.newegg.marketplace.sdk.shipping.model.VoidShippingRequest;
import com.newegg.marketplace.sdk.shipping.model.VoidShippingResponse;

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
 * Only for USA,USB
 * 
 * @author QB
 *
 */
public class ShippingCall {

	private ShipOPCaller shipOPCaller;
	private ShipOTCaller shipOTCaller;
	private ShipODCaller shipODCaller;

	public ShippingCall() {
		this(Content.MEDIA_TYPE.XML);
	}

	private ShippingCall(Content.MEDIA_TYPE mrdiaType) {
		switch (mrdiaType) {
		case JSON:
			shipOPCaller = ShipOPCaller.buildJSON();
			shipOTCaller = ShipOTCaller.buildJSON();
			shipODCaller = ShipODCaller.buildJSON();
			break;
		case XML:
			shipOPCaller = ShipOPCaller.buildXML();
			shipOTCaller = ShipOTCaller.buildXML();
			shipODCaller = ShipODCaller.buildXML();
			break;
		default:
			throw new RuntimeException("Never Happened!");
		}
	}

	/**
	 * <pre>
	 * Submit the shipping request for your Newegg order to receive the estimation of shipping cost using Newegg Shipping Label Service.
	 * Note: Unconfirmed shipping request will void automatically within 15 days after submitting the request.
	 * </pre>
	 * 
	 * @param body
	 *            {@linkplain SubmitShippingRequest}
	 * @return {@linkplain SubmitShippingResponse}
	 */
	@Deprecated
	public SubmitShippingResponse submitShippingRequest(SubmitShippingRequest body) {
		if (Content.Platform == Content.PLATFORM.USB || Content.Platform == Content.PLATFORM.USA)
			return shipOPCaller.submitShippingRequest(body);
		else
			throw new PlatformException(PLATFORM.CAN.name());
	}

	/**
	 * <pre>
	 * Retrieving the processing result of Submit Shipping Request.
	 * </pre>
	 * 
	 * @param body
	 *            {@linkplain GetShippingDetailRequest}
	 * @return {@linkplain GetShippingDetailResponse}
	 */
	@Deprecated
	public GetShippingDetailResponse getShippingRequestDetail(GetShippingDetailRequest body) {
		if (Content.Platform == Content.PLATFORM.USB || Content.Platform == Content.PLATFORM.USA)
			return shipOPCaller.getShippingRequestDetail(body);
		else
			throw new PlatformException(PLATFORM.CAN.name());
	}

	/**
	 * <pre>
	 * Once shipping estimate is available, you must confirm it when you are ready to ship.
	 * Note: 
	 * Once a shipping request is confirmed, Newegg will continue to process the order and the status of order will soon become “Shipped”.
	 * Also, the shipping information will be displayed in Order Detail under the customer’s My Account section, 
	 * and Newegg will send the customer an email notification with all of the shipping information.
	 * When shipping request is confirmed, the revoke of the operation is not available.
	 * </pre>
	 * 
	 * @param body
	 *            {@linkplain ConfirmShipRequest}
	 * @return {@linkplain ConfirmShipResponse}
	 */
	@Deprecated
	public ConfirmShipResponse confirmShippingRequest(ConfirmShipRequest body) {
		if (Content.Platform == Content.PLATFORM.USB || Content.Platform == Content.PLATFORM.USA)
			return shipOPCaller.confirmShippingRequest(body);
		else
			throw new PlatformException(PLATFORM.CAN.name());
	}

	/**
	 * <pre>
	 * An unconfirmed shipping request is applicable for void using this function.
	 * </pre>
	 * 
	 * @param body
	 *            {@linkplain VoidShippingRequest}
	 * @return {@linkplain VoidShippingResponse}
	 */
	@Deprecated
	public VoidShippingResponse voidShippingRequest(VoidShippingRequest body) {// TODO
		if (Content.Platform == Content.PLATFORM.USB || Content.Platform == Content.PLATFORM.USA)
			return shipOPCaller.voidShippingRequest(body);
		else
			throw new PlatformException(PLATFORM.CAN.name());
	}

	/**
	 * <pre>
	 * When you are ready to ship an order, you can request a package list using this function.
	 * </pre>
	 * @param body
	 *            {@linkplain GetPackageListRequest}
	 * @return {@linkplain GetPackageListResponse}
	 */
	@Deprecated
	public GetPackageListResponse getPackageLis(GetPackageListRequest body) {
		if (Content.Platform == Content.PLATFORM.USB || Content.Platform == Content.PLATFORM.USA)
			return shipOTCaller.getPackageLis(body);
		else
			throw new PlatformException(PLATFORM.CAN.name());
	}

	/**
	 * <pre>
	 * When you are ready to ship an order, you can request a shipping label for a confirmed shipping request.
	 * </pre>
	 * @param body
	 *            {@linkplain GetShippingLabelRequest}
	 * @return {@linkplain GetShippinLabelResponse}
	 */
	@Deprecated
	public GetShippinLabelResponse getShippingLabel(GetShippingLabelRequest body) {
		if (Content.Platform == Content.PLATFORM.USB || Content.Platform == Content.PLATFORM.USA)
			return shipOTCaller.getShippingLabel(body);
		else
			throw new PlatformException(PLATFORM.CAN.name());
	}

	/**
	 * <pre>
	 * Confirm/ship orders using Newegg Shipping Label Services.
	 * </pre>
	 * 
	 * @param body {@linkplain ShippingNewLabelSubmitRequest}
	 * @return {@linkplain ShippingNewLabelSubmitResponse}
	 */
	public ShippingNewLabelSubmitResponse createShippingLabel(ShippingNewLabelSubmitRequest body) {
        return shipODCaller.shippingNewLabelSubmitRequest(body);
	}
	
	/**
     * <pre>
     * Submit a request for an estimation of the shipping cost for the order using Newegg Shipping Label Service.
     * </pre>
     * 
     * @param body {@linkplain ShippingLabelEstimateRequest}
     * @return {@linkplain ShippingLabelEstimateResponse}
     */
    public ShippingLabelEstimateResponse estimateShippingLabel(ShippingLabelEstimateRequest body) {
           return shipODCaller.shippingLabelEstimateRequest(body);
    }
    
    /**
     * <pre>
     * Reprint the shipping labels and package lists for confirmed orders.
     * </pre>
     * 
     * @param body {@linkplain ShippingLabelReprintRequest}
     * @return {@linkplain ShippingLabelReprintResponse}
     */
    public ShippingLabelReprintResponse reprintShippingLabel(ShippingLabelReprintRequest body) {
           return shipODCaller.shippingLabelReprintRequest(body);
    }
}
