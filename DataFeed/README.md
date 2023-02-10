# DataFeed Management
The Newegg DataFeed API lets you batch manage items which consist of creating items, updating items and shipping orders. In addition, batch manage other applicable Newegg services.

The process in the following order is Submit Feed > Get Feed Status > Get Feed Result
Please see: [https://developer.newegg.com/newegg_marketplace_api/datafeed_management/](https://developer.newegg.com/newegg_marketplace_api/datafeed_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>newegg.marketplace</groupId>
    <artifactId>sdk-datafeed</artifactId>
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

# DataFeed Management
newegg.datafeed.simulation=false
newegg.datafeed.retry.period=100
newegg.datafeed.retry.maxperiod=1000
newegg.datafeed.retry.maxattempts=2
newegg.datafeed.loglevel=FULL
```

- loglevel
```
NONE: No logging
BASIC: Log only the request method and URL and the response status code and execution time
HEADERS: Log the basic information along with request and response headers
FULL: Log the headers, body, and metadata for both requests and responses
```

### Sample code
- Submit feed: Submit Item Subscription Feed

The available feeds in Newegg Marketplace to submit: [https://developer.newegg.com/newegg_marketplace_api/datafeed_management/submit_feed/](https://developer.newegg.com/newegg_marketplace_api/datafeed_management/submit_feed/)
```java
// Load Configuration
APIConfig.load(DataFeedConfig.class);

// Create item1 for add
ItemSubscriptionFeedRequest.Message.Item item1 = new ItemSubscriptionFeedRequest.Message.Item();
item1.setSellerPartNumber("item1");
item1.setAction("Add");

// Create item2 for remove
ItemSubscriptionFeedRequest.Message.Item item2 = new ItemSubscriptionFeedRequest.Message.Item();
item1.setSellerPartNumber("item2");
item2.setAction("Remove");

// Create Message
ItemSubscriptionFeedRequest.Message message = new ItemSubscriptionFeedRequest.Message();
message.getItem().add(item1);
message.getItem().add(item2);

// Create Request
ItemSubscriptionFeedRequest request = new ItemSubscriptionFeedRequest();
request.setMessage(message);

// Send your request and get response
DataFeedCall caller = new DataFeedCall();
ItemSubscriptionFeedResponse response = caller.submitFeed_ItemSubscriptionFeed(request);

//do something...
```

- Get Feed Status: Get the status of the submitted datafeed.
```java
// Load Configuration
APIConfig.load(DataFeedConfig.class);

// Create RequestIDList
GetFeedStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList = new GetFeedStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxxx1");
requestIDList.getRequestID().add("xxxxxxxxxxxx2");

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

- Get Feed Result: Get the result of the submitted datafeed.
```java
// Load Configuration
APIConfig.load(DataFeedConfig.class);

// Send your request and get response
DataFeedCall caller = new DataFeedCall();
ProcessingReportResponse response = caller.getFeedResult("xxxxxxxxxxxx");

//do something...
```

