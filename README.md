# NewEgg SDK for java

Newegg Marketplace SDK(Java) is a library to help Java programmer easily integrates with Newegg Marketplace API. It provides the definition of the data objects models to help coder create the request and resolve the response. It also provides customize of logger and retry mechanism.  
To use the SDK to communicate with the Newegg API, you need to be a registered seller and get the 'API Key(Authorization)' and 'Secret Key'  by mail Datafeeds@newegg.com. You can put this information into a 'newegg.properties' file. Without the Authorization Token and Secret Key, you can run the test project with Simulation Mode. This mode is to help you understand the SDK before actual use.
## Technology
- java 1.8+
- openfeign
- log4j2
- commons-configuration2

## build
- mvn package

## How to use it in your project
### Maven
- Set pom.xml of project

```
  <parent>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>SDK-ALL</artifactId>
    <version>0.0.1</version>
  </parent>
	
	and other that you used
```
### Project 
- Write your property   (newegg.properties)

```
newegg.simulation=false
newegg.platform=USA
newegg.hosturl=https://apis.newegg.org/marketplace
newegg.sellerid=XXX
newegg.authorization=XXXXXXXXXXXX
newegg.secretkey=XXXX-XXXXX-XXXX-XXXX-XXXX
newegg.retry.period=100
newegg.retry.maxperiod=1000
newegg.retry.maxattempts=2
newegg.loglevel=NONE
newegg.connectTimeoutMillis=10000
newegg.readTimeoutMillis=60000
newegg.item.simulation=false
newegg.item.retry.period=100
newegg.item.retry.maxperiod=1000
newegg.item.retry.maxattempts=2
newegg.item.loglevel=FULL
```
- Write your code

```
APIConfig.load(ItemConfig.class);	
ItemCall call=new ItemCall();
GetVolumeDiscountRequest request=new GetVolumeDiscountRequest();
GetVolumeDiscountRequest.RequestBody body=new GetVolumeDiscountRequest.RequestBody();                          
body.setNeweggItemNumber("XXXXXXXXXXXXXX");
request.setRequestBody(body);		
GetVolumeDiscountResponse r=call.getVolumeDiscountRequestResult(request);

Do something
```

## How to get the API key and Secret Key?
    1. Send the request to Datafeeds@newegg.com from the seller default email address.
    2. The message should include seller name or default email address.
    Newegg Marketplace team will process all requests in 24 hours.

## Note
- There is a file  "newegg.properties" at same directory.
- The jar of common module must be have.
- The properties of common module must be set up.
- If the APP not load the configuration ,the simulation will be enabled 

```
How to load configuration ?
APIConfig.load(SellerConfig.class);

```
- Log4j configuration file location

```
By default, Log4j looks for a configuration file named log4j2.xml (not log4j.xml) in the classpath.
You can also specify the full path of the configuration file with this system property: -Dlog4j.configurationFile=path/to/log4j2.xml
Web applications can specify the Log4j configuration file location with a servlet context parameter.
```

## Modules
### common
- used for other modules

### Item
- Item Management  
https://developer.newegg.com/newegg_marketplace_api/item_management/

### Seller
- Seller Management  
https://developer.newegg.com/newegg_marketplace_api/seller_management/


### Order
- Order Management  
https://developer.newegg.com/newegg_marketplace_api/order_management/

### Shipping
- Newegg Shipping Label Service  
https://developer.newegg.com/newegg_marketplace_api/newegg_shipping_label_service/

### Other
- Verify Service Status  
https://developer.newegg.com/newegg_marketplace_api/verify_service_status/

### SBN
- Shipped by Newegg Management  
https://developer.newegg.com/newegg_marketplace_api/sbn_shipped_by_newegg_management/

### DataFeed
- DataFeed Management  
https://developer.newegg.com/newegg_marketplace_api/datafeed_management/

### Report
- Reports Management  
https://developer.newegg.com/newegg_marketplace_api/reports_management/

### RMA
- RMA(Return Merchandise Authorization) Management  
https://developer.newegg.com/newegg_marketplace_api/rma_management/

## Change log
### 0.0.1
- initial
