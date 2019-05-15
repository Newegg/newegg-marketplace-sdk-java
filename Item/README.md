# Item Management
The Item Management service group contains functions that will allow you to perform simple item related updates such as Update Item Inventory, Price, Shipping and Status.

Please see: [https://developer.newegg.com/newegg_marketplace_api/item_management/](https://developer.newegg.com/newegg_marketplace_api/item_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
    <artifactId>sdk-item</artifactId>
    <version>{version}</version>
</dependency>
```

- Or you can set pom.xml of project using sdk-all dependency import all sdk modules
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
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

# Item Management
newegg.item.simulation=false
newegg.item.retry.period=100
newegg.item.retry.maxperiod=1000
newegg.item.retry.maxattempts=2
newegg.item.loglevel=FULL
```

- loglevel
```
NONE: No logging
BASIC: Log only the request method and URL and the response status code and execution time
HEADERS: Log the basic information along with request and response headers
FULL: Log the headers, body, and metadata for both requests and responses
```

### Sample code
- Get Item Price(newegg.com): Get Item price for multiple countries.
```java
// Load Configuration
APIConfig.load(ItemConfig.class);

// Create Request CountryList can set more country...
GetInternationalItemPriceRequest.CountryList counties = new GetInternationalItemPriceRequest.CountryList();

// Create Request
GetInternationalItemPriceRequest request = new GetInternationalItemPriceRequest();
request.setType(0); //NE Item#
request.setValue("9SIxxxxxxx");
request.setCountryList(counties);

// Send your request and get response
ItemCall caller = new ItemCall();
GetInternationalItemPriceResponse response = caller.getInternationalItemPrice(request);

//do something...
```

- Update Item Price(newegg.com): Update item price
```java
// Load Configuration
APIConfig.load(ItemConfig.class);

// Create Request Price List
UpdateItemPriceRequest.PriceList priceList = new UpdateItemPriceRequest.PriceList();

// AUS Price
UpdateItemPriceRequest.PriceList.Price priceAUS = new UpdateItemPriceRequest.PriceList.Price();
priceAUS.setCountryCode("AUS");
priceAUS.setCurrency("USD");
priceAUS.setActive(0);
priceAUS.setMSRP(new BigDecimal("3500"));
priceAUS.setMAP(new BigDecimal("0"));
priceAUS.setCheckoutMAP(0);
priceAUS.setSellingPrice(new BigDecimal("1149.98"));
priceList.getPrice().add(priceAUS);

// Create Request
UpdateItemPriceRequest request = new UpdateItemPriceRequest();
request.setType(0); //NE Item#
request.setValue("9SIxxxxxxx");
request.setPriceList(priceList);

// Send your request and get response
ItemCall caller = new ItemCall();
UpdateItemPriceResponse response = caller.updateItemPrice(request);

//do something...
```
