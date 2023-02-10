# Report Management
You can submit API requests to generate business reports.

Request and Retrieve report is as follows Submit Report Request > Get Report Status > Get Report Result
Please see: [https://developer.newegg.com/newegg_marketplace_api/reports_management/](https://developer.newegg.com/newegg_marketplace_api/reports_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>newegg.marketplace</groupId>
    <artifactId>sdk-report</artifactId>
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

# Report Management
newegg.report.simulation=false
newegg.report.retry.period=100
newegg.report.retry.maxperiod=1000
newegg.report.retry.maxattempts=2
newegg.report.loglevel=FULL
```

- loglevel
```
NONE: No logging
BASIC: Log only the request method and URL and the response status code and execution time
HEADERS: Log the basic information along with request and response headers
FULL: Log the headers, body, and metadata for both requests and responses
```

### Sample code for Daily Price Report
- Submit Daily Inventory Report Request: Get item's available inventory quantity, price information, shipping, and activation status for defaulted warehouse.
```java
// Load Configuration
APIConfig.load(ReportConfig.class);

// Create Daily Inventory WarehouseList
DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria.WarehouseList warehouseList = new DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria.WarehouseList();
warehouseList.getWarehouseLocation().add("USA");

// Create Daily Inventory Criteria
DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria criteria = new DailyInventoryReportRequest.RequestBody.DailyInventoryReportCriteria();
criteria.setFulfillType(0); // All
criteria.setFileType("XLS");
criteria.setWarehouseList(warehouseList);
// Create RequestBody
DailyInventoryReportRequest.RequestBody body = new DailyInventoryReportRequest.RequestBody();
body.setDailyInventoryReportCriteria(criteria);		

// Create Request
DailyInventoryReportRequest request = new DailyInventoryReportRequest();
request.setRequestBody(body);

// Send your request and get response
ReportCall caller = new ReportCall();
DailyInventoryReportResponse response = caller.submitDailyInventoryReport(request,"301");

//do something...
```

- Submit Daily Price Report Request: Get item's price information, shipping, and activation status for targeted countries, including United States.
```java
// Load Configuration
APIConfig.load(ReportConfig.class);

// Create Daily Price Country List
DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList countryList = new DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria.CountryList();
countryList.getCountryCode().add("USA");
countryList.getCountryCode().add("AUS");

// Create Daily Price Criteria
DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria criteria = new DailyPriceReportRequest.RequestBody.DailyPriceReportCriteria();
criteria.setCountryList(countryList);

// Create RequestBody
DailyPriceReportRequest.RequestBody body = new DailyPriceReportRequest.RequestBody();
body.setDailyPriceReportCriteria(criteria);		

// Create Request
DailyPriceReportRequest request = new DailyPriceReportRequest();
request.setRequestBody(body);

// Send your request and get response
ReportCall caller = new ReportCall();
DailyPriceReportResponse response = caller.submitDailyPriceReport(request, "301");

//do something...
```

- Get Report Status: Get the status of specified report request.
```java
// Load Configuration
APIConfig.load(ReportConfig.class);

// Create RequestIDList
GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList = new GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxxx");

// Create RequestStatus
GetReportStatusRequest.RequestBody.GetRequestStatus requestStatus = new GetReportStatusRequest.RequestBody.GetRequestStatus();
requestStatus.setRequestIDList(requestIDList);
requestStatus.setMaxCount(20);

// Create RequestBody
GetReportStatusRequest.RequestBody body = new GetReportStatusRequest.RequestBody();
body.setGetRequestStatus(requestStatus);

// Create Request
GetReportStatusRequest request = new GetReportStatusRequest();
request.setRequestBody(body);

// Send your request and get response
ReportCall caller = new ReportCall();
GetReportStatusResponse response = caller.getReportStatus(request);

//do something...
```

- Get Daily Inventory Report Result: Get report when Get Report Status result is FINISHED.
```java
// Load Configuration
APIConfig.load(ReportConfig.class);

// Create PageInfo
GetDailyPriceReportRequest.RequestBody.PageInfo pageInfo = new GetDailyPriceReportRequest.RequestBody.PageInfo();
pageInfo.setPageIndex(1);
pageInfo.setPageSize(10);

// Create RequestBody
GetDailyPriceReportRequest.RequestBody body = new GetDailyPriceReportRequest.RequestBody();		
body.setRequestID("xxxxxxxxxxxx");
body.setPageInfo(pageInfo);

// Create Request
GetDailyPriceReportRequest request = new GetDailyPriceReportRequest();
request.setRequestBody(body);

// Send your request and get response
ReportCall caller = new ReportCall();
GetDailyPriceReportResponse response = caller.getDailyPriceReport(request);

//do something...
```
