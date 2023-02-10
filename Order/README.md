# Order Management
The Order Management service group contains functions that will allow you to perform order related operations such as get order info, status, update order status, remove items, confirm orders… etc.

Please see: [https://developer.newegg.com/newegg_marketplace_api/order_management/](https://developer.newegg.com/newegg_marketplace_api/order_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>newegg.marketplace</groupId>
    <artifactId>sdk-order</artifactId>
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
```Properties
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

# Order Management
newegg.order.simulation=false
newegg.order.retry.period=100
newegg.order.retry.maxperiod=1000
newegg.order.retry.maxattempts=2
newegg.order.loglevel=FULL
```

- loglevel
```
NONE: No logging
BASIC: Log only the request method and URL and the response status code and execution time
HEADERS: Log the basic information along with request and response headers
FULL: Log the headers, body, and metadata for both requests and responses
```

### Sample code
- Get Order Information: Get Unshipped Order during a time period
```java
// Load Configuration
APIConfig.load(OrderConfig.class);

// Create RequestCriteria
GetOrderInformationRequest.RequestBody.RequestCriteria criteria = new GetOrderInformationRequest.RequestBody.RequestCriteria();
criteria.setStatus(0); // Unshipped
criteria.setType(0);
criteria.setOrderDateFrom("2019-05-01 00:00:00");
criteria.setOrderDateTo("2019-05-31 00:00:00");
criteria.setOrderDownloaded(0);

// Create RequestBody
GetOrderInformationRequest.RequestBody body = new GetOrderInformationRequest.RequestBody();
body.setRequestCriteria(criteria);

// Create Request
GetOrderInformationRequest request = new GetOrderInformationRequest();
request.setRequestBody(body);

// Send your request and get response
OrderCall caller = new OrderCall();
GetOrderInformationResponse response = caller.getOrderInformation(request,"304");

//do something...
```

- Get Order Status: Get the status of special order
```java
// Load Configuration
APIConfig.load(OrderConfig.class);

// Send your request and get response
OrderCall caller = new OrderCall();
GetOrderStatusResponse response = caller.getOrderStatus("xxxxxxxxx","304");

//do something...
```

- Get Additional Order Information: Get additional Information of order.
```java
// Load Configuration
APIConfig.load(OrderConfig.class);

// Create RequestCriteria
GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria criteria = new GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria();
criteria.setOrderDateFrom("2019-05-01 00:00:00");
criteria.setOrderDateTo("2019-05-31 00:00:00");

// Create RequestBody
GetAdditionalOrderInformationRequest.RequestBody body = new GetAdditionalOrderInformationRequest.RequestBody();
body.setRequestCriteria(criteria);

// Create Request
GetAdditionalOrderInformationRequest request = new GetAdditionalOrderInformationRequest();
request.setRequestBody(body);

// Send your request and get response
OrderCall caller = new OrderCall();		
GetAdditionalOrderInformationResponse response = caller.getAdditionalOrderInformation(request);

//do something...
```
