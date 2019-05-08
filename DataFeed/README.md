# DataFeed Management
The Newegg DataFeed API lets you batch manage items which consist of creating items, updating items and shipping orders. In addition, batch manage other applicable Newegg services.

The process in the following order is Submit Feed > Get Feed Status > Get Feed Result
Please see: [https://developer.newegg.com/newegg_marketplace_api/datafeed_management/](https://developer.newegg.com/newegg_marketplace_api/datafeed_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>DataFeed</artifactId>
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

# DataFeed Management
newegg.datafeed.simulation=false
newegg.datafeed.retry.period=100
newegg.datafeed.retry.maxperiod=1000
newegg.datafeed.retry.maxattempts=2
newegg.datafeed.loglevel=FULL
```

### Sample code
- Submit feed: The available feeds in Newegg Marketplace to submit: [https://developer.newegg.com/newegg_marketplace_api/datafeed_management/submit_feed/](https://developer.newegg.com/newegg_marketplace_api/datafeed_management/submit_feed/)
```
// Load Configuration
APIConfig.load(DataFeedConfig.class);

// Create Price Item List
PriceUpdateFeedRequest.Message.Price prices = new PriceUpdateFeedRequest.Message.Price();

// Item for USA
PriceUpdateFeedRequest.Message.Price.Item itemUSA = new PriceUpdateFeedRequest.Message.Price.Item();
itemUSA.setSellerPartNumber("xxxx");
itemUSA.setNeweggItemNumber("9SIxxxxxxxx");
itemUSA.setCountryCode("USA");
itemUSA.setCurrency("USD");
itemUSA.setMSRP(new BigDecimal("199.00"));
itemUSA.setSellingPrice(new BigDecimal("99.99"));
itemUSA.setActivationMark("False");
prices.getItem().add(itemUSA);

// Item for AUS
PriceUpdateFeedRequest.Message.Price.Item itemAUS = new PriceUpdateFeedRequest.Message.Price.Item();
itemAUS.setSellerPartNumber("xxxx");
itemAUS.setNeweggItemNumber("9SIxxxxxxxx");
itemAUS.setCountryCode("AUS");
itemAUS.setCurrency("USD");
itemAUS.setMSRP(new BigDecimal("199.00"));
itemAUS.setSellingPrice(new BigDecimal("99.99"));
itemAUS.setActivationMark("False");
prices.getItem().add(itemAUS);

// Create Message
PriceUpdateFeedRequest.Message message = new PriceUpdateFeedRequest.Message();
message.setPrice(prices);

// Create Request
PriceUpdateFeedRequest request = new PriceUpdateFeedRequest();
request.setMessage(message);

// Send your request and get response
DataFeedCall caller = new DataFeedCall();
PriceUpdateFeedResponse response = caller.submitFeed_PriceUpdateFeed(request);

//do something...
```

- Get Feed Status: Get the status of specified feed request by specified query conditions.
```
// Load Configuration
APIConfig.load(DataFeedConfig.class);

// Create RequestIDList
GetFeedStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList = new GetFeedStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxxx");

// Create RequestStatus
GetFeedStatusRequest.RequestBody.GetRequestStatus requestStatus = new GetFeedStatusRequest.RequestBody.GetRequestStatus();
requestStatus.setRequestIDList(requestIDList);
requestStatus.setMaxCount(100);
requestStatus.setRequestStatus("ALL");

// Create RequestBody
GetFeedStatusRequest.RequestBody body = new GetFeedStatusRequest.RequestBody();
body.setGetRequestStatus(requestStatus);

// Create Request
GetFeedStatusRequest request = new GetFeedStatusRequest();
request.setRequestBody(body);

// Send your request and get response
DataFeedCall caller = new DataFeedCall();
GetFeedStatusResponse response = caller.getFeedStatus(request);

//do something...
```

- Get Feed Result: When “Get Feed Status” result is FINISHED, use this request to get the ready/completed processing report for review.
```
// Load Configuration
APIConfig.load(DataFeedConfig.class);

// Send your request and get response
DataFeedCall caller = new DataFeedCall();
ProcessingReportResponse response = caller.getFeedResult("xxxxxxxxxxxx");

//do something...
```

