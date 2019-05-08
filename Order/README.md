# Order Management
The Order Management service group contains functions that will allow you to perform order related operations such as get order info, status, update order status, remove items, confirm orders… etc.

Please see: [https://developer.newegg.com/newegg_marketplace_api/order_management/](https://developer.newegg.com/newegg_marketplace_api/order_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>Order</artifactId>
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

# Order Management
newegg.order.simulation=false
newegg.order.retry.period=100
newegg.order.retry.maxperiod=1000
newegg.order.retry.maxattempts=2
newegg.order.loglevel=FULL
```

### Sample code
- Get Order Information: Retrieve order information by specified order number.
```
// Load Configuration
APIConfig.load(OrderConfig.class);

// Create RequestCriteria
GetOrderInformationRequest.RequestBody.RequestCriteria criteria = new GetOrderInformationRequest.RequestBody.RequestCriteria();
criteria.setStatus(4); // Void
criteria.setType(0);
criteria.setOrderDateFrom("2019-05-01 00:00:00");
criteria.setOrderDateTo("2019-05-31 00:00:00");
criteria.setOrderDownloaded(0);

// Create RequestBody
GetOrderInformationRequest.RequestBody body = new GetOrderInformationRequest.RequestBody();
body.setPageIndex(1);
body.setPageSize(100);
body.setRequestCriteria(criteria);

// Create Request
GetOrderInformationRequest request = new GetOrderInformationRequest();
request.setRequestBody(body);

// Send your request and get response
OrderCall caller = new OrderCall();

//do something...
```

- Get Order Status: Get the order status by specified the order number of existing order.
```
// Load Configuration
APIConfig.load(OrderConfig.class);

// Send your request and get response
OrderCall caller = new OrderCall();
GetOrderStatusResponse response = caller.getOrderStatus("xxxxxxxxx","304");

//do something...
```

- Get Additional Order Information: Retrieve the additional information for Newegg Global order including:

1. Additional order requirement for certain countries.
2. The original recipient information for orders shipped by NISP service.
3. The original recipient information inputted by international customers.
```
// Load Configuration
APIConfig.load(OrderConfig.class);

// Create RequestCriteria
GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria criteria = new GetAdditionalOrderInformationRequest.RequestBody.RequestCriteria();
criteria.setType(0);
criteria.setStatus(5);
criteria.setOrderDateFrom("2019-05-01 00:00:00");
criteria.setOrderDateTo("2019-05-31 00:00:00");
criteria.setOrderDownloaded(0);

// Create RequestBody
GetAdditionalOrderInformationRequest.RequestBody body = new GetAdditionalOrderInformationRequest.RequestBody();
body.setPageIndex(1);
body.setPageSize(100);
body.setRequestCriteria(criteria);

// Create Request
GetAdditionalOrderInformationRequest request = new GetAdditionalOrderInformationRequest();
request.setRequestBody(body);

// Send your request and get response
OrderCall caller = new OrderCall();		
GetAdditionalOrderInformationResponse response = caller.getAdditionalOrderInformation(request);

//do something...
```
