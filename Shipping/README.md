# Newegg Shipping Label Service
Newegg marketplace sellers can take advantage of discounted shipping rates by using the Newegg Shipping Label Service for Newegg Marketplace orders.

Please see: [https://developer.newegg.com/newegg_marketplace_api/newegg_shipping_label_service/](https://developer.newegg.com/newegg_marketplace_api/newegg_shipping_label_service/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>newegg.marketplace</groupId>
    <artifactId>sdk-shipping</artifactId>
    <version>{version}</version>
</dependency>
```

- Or you can set pom.xml of project using sdk-all dependency import all sdk modules
```xml
<dependency>
    <groupId>newegg.marketplace</groupId>
    <artifactId>sdk-all</artifactId>
    <version>{version}</version>
    <type>pom</type>
</dependency>
```

### Setup properties
Write your newegg.properties file
```properties
# basic
newegg.simulation=false
newegg.platform=USA
newegg.hosturl=https://api.newegg.com/marketplace
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

- loglevel
```
NONE: No logging
BASIC: Log only the request method and URL and the response status code and execution time
HEADERS: Log the basic information along with request and response headers
FULL: Log the headers, body, and metadata for both requests and responses
```

### Sample code
- Submit Shipping Request: Submit the shipping request for your Newegg order to receive the estimation of shipping cost using Newegg Shipping Label Service.
```java
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create Item
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item item = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList.Item();
item.setQuantity(1);
item.setSellerPartNumber("xxxxxxxxxxx");

// Create ItemList and Add Item
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList itemList = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package.ItemList();
itemList.getItem().add(item);

// Create Package and Add ItemList
SubmitShippingRequest.RequestBody.Shipment.PackageList.Package pakg = new SubmitShippingRequest.RequestBody.Shipment.PackageList.Package();
pakg.setPackageWeight(new BigDecimal("5"));
pakg.setPackageLength(new BigDecimal("5.00"));
pakg.setPackageWidth(new BigDecimal("3.00"));
pakg.setPackageHeight(new BigDecimal("4.00"));
pakg.setItemList(itemList);

// Create PackageList
SubmitShippingRequest.RequestBody.Shipment.PackageList packageList = new SubmitShippingRequest.RequestBody.Shipment.PackageList();
packageList.getPackage().add(pakg);

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
```java
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create RequestBody
GetShippingDetailRequest.RequestBody body = new GetShippingDetailRequest.RequestBody();
body.setRequestID("xxxxxxxxxxxxx");

// Create Request
GetShippingDetailRequest request = new GetShippingDetailRequest();
request.setRequestBody(body);

// Send your request and get response
ShippingCall caller = new ShippingCall();
GetShippingDetailResponse response = caller.getShippingRequestDetail(request);

//do something...
```

- Void Shipping Request: An unconfirmed shipping request is applicable for void using this function.
```java
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

//do something...
```

- Confirm Shipping Request: Once shipping estimate is available, you must confirm it when you are ready to ship.

Note: Once a shipping request is confirmed, Newegg will continue to process the order and the status of order will soon become "Shipped".  Also, the shipping information will be displayed in Order Detail under the customer's My Account section, and Newegg will send the customer an email notification with all of the shipping information.  When shipping request is confirmed, the revoke of the operation is not available.
```java
// Load Configuration
APIConfig.load(ShipConfig.class);

// Create RequestIDList
ConfirmShipRequest.RequestBody.RequestIDList requestIDList = new ConfirmShipRequest.RequestBody.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxx");

// Create Body
ConfirmShipRequest.RequestBody body = new ConfirmShipRequest.RequestBody();
body.setRequestIDList(requestIDList);

// Create Request
ConfirmShipRequest request = new ConfirmShipRequest();
request.setRequestBody(body);

// Send your request and get response
ShippingCall caller = new ShippingCall();
ConfirmShipResponse response = caller.confirmShippingRequest(request);

//do something...
```