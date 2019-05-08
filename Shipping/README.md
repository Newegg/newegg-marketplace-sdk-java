# Newegg Shipping Label Service
Newegg marketplace sellers can take advantage of discounted shipping rates by using the Newegg Shipping Label Service for Newegg Marketplace orders.

Please see: [https://developer.newegg.com/newegg_marketplace_api/newegg_shipping_label_service/](https://developer.newegg.com/newegg_marketplace_api/newegg_shipping_label_service/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>Shipping</artifactId>
    <version>0.1.0</version>
</dependency>
```

- Or you can set pom.xml of project using SDK-ALL dependency import all sdk modules
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>SDK-ALL</artifactId>
    <version>0.0.1</version>
    <type>pom</type>
</dependency>
```

### Setup properties
Write your newegg.properties file
```
# basic
newegg.simulation=false
newegg.platform=USA
newegg.hosturl=https://apis.newegg.org/marketplace
newegg.sellerid=XXXX
newegg.authorization=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
newegg.secretkey=XXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX
newegg.retry.period=100
newegg.retry.maxperiod=1000
newegg.retry.maxattempts=2
newegg.loglevel=NONE
newegg.connectTimeoutMillis=10000
newegg.readTimeoutMillis=60000

# Shipping - Newegg Shipping Label Service
newegg.shipping.simulation=false
newegg.shipping.retry.period=100
newegg.shipping.retry.maxperiod=1000
newegg.shipping.retry.maxattempts=2
newegg.shipping.loglevel=FULL
```

### Sample code
- Submit Shipping Request: Submit the shipping request for your Newegg order to receive the estimation of shipping cost using Newegg Shipping Label Service.
```
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create ItemList1
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList1 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList();

// Create 2 Item in Package1
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item1 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
item1.setQuantity(4);
item1.setSellerPartNumber("item1");
itemList1.getItem().add(item1);

SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item2 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
item2.setQuantity(1);
item2.setSellerPartNumber("item2");
itemList1.getItem().add(item2);

// Create Package1 and Add ItemList
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package pack1 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package();
pack1.setPackageWeight(new BigDecimal("5"));
pack1.setPackageLength(new BigDecimal("5.00"));
pack1.setPackageWidth(new BigDecimal("3.00"));
pack1.setPackageHeight(new BigDecimal("4.00"));
pack1.setItemList(itemList1);

// Create ItemList2
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList2 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList();

// Create 1 Item in Package2
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item3 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
item3.setQuantity(3);
item3.setSellerPartNumber("item3");
itemList2.getItem().add(item3);

// Create Package2 and Add ItemList
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package pack2 = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package();
pack2.setPackageWeight(new BigDecimal("1.5"));
pack2.setPackageLength(new BigDecimal("2.00"));
pack2.setPackageWidth(new BigDecimal("4.00"));
pack2.setPackageHeight(new BigDecimal("3.00"));
pack2.setItemList(itemList2);

// Create PackageList
SubmitShippingRequest.RequestBody.Shipment.PackageList packageList = new SubmitShippingRequest.RequestBody.Shipment.PackageList();
packageList.getPackage().add(pack1);
packageList.getPackage().add(pack2);

// Create Shipment and Add PackageList
SubmitShippingRequest.RequestBody.Shipment shipment = new SubmitShippingRequest.RequestBody.Shipment();
shipment.setOrderNumber(1234567890);
shipment.setShippingCarrierCode(100);
shipment.setShippingServiceCode(101);
shipment.setShipFromFirstName("Xxxx");
shipment.setShipFromLastName("Xxx");
shipment.setShipFromAddress1("xxxxx Rowland Street");
shipment.setShipFromPhoneNumber("xxx-xxx-xx");
shipment.setShipFromCityName("City Of Industry");
shipment.setShipFromStateCode("CA");
shipment.setShipFromZipCode("91748");
shipment.setShipFromCountryCode("USA");
shipment.setPackageList(packageList);

// Create RequestBody
SubmitShippingRequest.RequestBody body = new SubmitShippingRequest.RequestBody();
body.setShipment(shipment);

// Create Request
SubmitShippingRequest request = new SubmitShippingRequest();
request.setRequestBody(body);

// Send your request and get response
ShippingCall caller = new ShippingCall();
SubmitShippingResponse response = caller.submitShippingRequest(request);

//do something...
```

- Get Shipping Request Detail: Retrieving the processing result of Submit Shipping Request.
```
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create RequestBody
GetShippingDetailRequest.RequestBody body = new GetShippingDetailRequest.RequestBody();
body.setRequestID("xxxxxxxxxxxxx");
body.setOrderNumber("123456789");

// Create Request
GetShippingDetailRequest request = new GetShippingDetailRequest();
request.setRequestBody(body);

// Send your request and get response
ShippingCall caller = new ShippingCall();
GetShippingDetailResponse response = caller.getShippingRequestDetail(request);

//do something...
```

- Confirm Shipping Request: Once shipping estimate is available, you must confirm it when you are ready to ship.
```
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create RequestIDList
ConfirmShipRequest.RequestBody.RequestIDList requestIDList = new ConfirmShipRequest.RequestBody.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxxxx");
// can more request id

// Create Body
ConfirmShipRequest.RequestBody body = new ConfirmShipRequest.RequestBody();
body.setRequestIDList(requestIDList);

//Create Request
ConfirmShipRequest request = new ConfirmShipRequest();
request.setRequestBody(body);

// Send your request and get response
ShippingCall caller = new ShippingCall();
ConfirmShipResponse response = caller.confirmShippingRequest(request);

//do something...
```

- Void Shipping Request: An unconfirmed shipping request is applicable for void using this function.
```
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create RequestIDList
VoidShippingRequest.RequestBody.RequestIDList requestIDList = new VoidShippingRequest.RequestBody.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxxxx");
// can more request id

// Create Body
VoidShippingRequest.RequestBody body = new VoidShippingRequest.RequestBody();
body.setRequestIDList(requestIDList);

//Create Request
VoidShippingRequest request = new VoidShippingRequest();
request.setRequestBody(body);

// Send your request and get response
ShippingCall caller = new ShippingCall();
VoidShippingResponse response = caller.voidShippingRequest(request);
```