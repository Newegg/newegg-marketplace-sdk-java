# Item Management
The Item Management service group contains functions that will allow you to perform simple item related updates such as Update Item Inventory, Price, Shipping and Status.

Please see: [https://developer.newegg.com/newegg_marketplace_api/item_management/](https://developer.newegg.com/newegg_marketplace_api/item_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>Item</artifactId>
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

# Item Management
newegg.item.simulation=false
newegg.item.retry.period=100
newegg.item.retry.maxperiod=1000
newegg.item.retry.maxattempts=2
newegg.item.loglevel=FULL
```

### Sample code
- Get Item Price(newegg.com): Tracking the price related information of items for destination countries, including the United States.
```
// Load Configuration
APIConfig.load(ItemConfig.class);

// Create Request CountryList
GetInternationalItemPriceRequest.CountryList counties = new GetInternationalItemPriceRequest.CountryList();
counties.getCountryCode().add("USA");
counties.getCountryCode().add("AUS");
// more country...

// Create Request
GetInternationalItemPriceRequest request = new GetInternationalItemPriceRequest();
request.setType(0);
request.setValue("9SIxxxxxxx");
request.setCountryList(counties);

// Send your request and get response
ItemCall caller = new ItemCall();
GetInternationalItemPriceResponse response = caller.getInternationalItemPrice(request);

//do something...
```

- Update Item Price(newegg.com): Maintaining the price information, shipping, and/or status of items in all eligible countries, including the United States.
```
// Load Configuration
APIConfig.load(ItemConfig.class);

// Create Request Price List
UpdateItemPriceRequest.PriceList priceList = new UpdateItemPriceRequest.PriceList();

// USA Price
UpdateItemPriceRequest.PriceList.Price priceUSA = new UpdateItemPriceRequest.PriceList.Price();
priceUSA.setCountryCode("USA");
priceUSA.setCurrency("USD");
priceUSA.setSellingPrice(new BigDecimal("98.99"));
priceUSA.setActive(0);
priceList.getPrice().add(priceUSA);

// AUS Price
UpdateItemPriceRequest.PriceList.Price priceAUS = new UpdateItemPriceRequest.PriceList.Price();
priceAUS.setCountryCode("AUS");
priceAUS.setCurrency("USD");
priceAUS.setSellingPrice(new BigDecimal("98.98"));
priceAUS.setActive(0);
priceList.getPrice().add(priceAUS);

// Create Request
UpdateItemPriceRequest request = new UpdateItemPriceRequest();
request.setType(0);
request.setValue("9SIxxxxxxx");
request.setPriceList(priceList);

// Send your request and get response
ItemCall caller = new ItemCall();
UpdateItemPriceResponse response = caller.updateItemPrice(request);

//do something...
```
