# Report Management
You can submit API requests to generate business reports.

Request and Retrieve report is as follows Submit Report Request > Get Report Status > Get Report Result
Please see: [https://developer.newegg.com/newegg_marketplace_api/reports_management/](https://developer.newegg.com/newegg_marketplace_api/reports_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>Report</artifactId>
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

# Report Management
newegg.report.simulation=false
newegg.report.retry.period=100
newegg.report.retry.maxperiod=1000
newegg.report.retry.maxattempts=2
newegg.report.loglevel=FULL
```

### Sample code for Daily Price Report
- Submit Report Request: The available reports in Newegg Marketplace to submit:
[https://developer.newegg.com/newegg_marketplace_api/reports_management/submit_report_request/](https://developer.newegg.com/newegg_marketplace_api/reports_management/submit_report_request/)
```
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
DailyPriceReportResponse response = caller.submitDailyPriceReport(request,"301");

//do something...
```

- Get Report Status: Get the status of specified report request.
```
// Load Configuration
APIConfig.load(ReportConfig.class);

// Create RequestIDList
GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList = new GetReportStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxxxxxx");

// Create RequestStatus
GetReportStatusRequest.RequestBody.GetRequestStatus requestStatus = new GetReportStatusRequest.RequestBody.GetRequestStatus();
requestStatus.setRequestIDList(requestIDList);
requestStatus.setMaxCount(100);
requestStatus.setRequestStatus("ALL");

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

- Get Report Result: Get report when Get Report Status result is FINISHED for the following:
[https://developer.newegg.com/newegg_marketplace_api/reports_management/get_report_result/](https://developer.newegg.com/newegg_marketplace_api/reports_management/get_report_result/)
```
// Load Configuration
APIConfig.load(ReportConfig.class);

// Create PageInfo
GetDailyPriceReportRequest.RequestBody.PageInfo pageInfo = new GetDailyPriceReportRequest.RequestBody.PageInfo();
pageInfo.setPageIndex(1);
pageInfo.setPageSize(10);

// Create RequestBody
GetDailyPriceReportRequest.RequestBody body = new GetDailyPriceReportRequest.RequestBody();
body.setPageInfo(pageInfo);
body.setRequestID("xxxxxxxxxxxx");

// Create Request
GetDailyPriceReportRequest request = new GetDailyPriceReportRequest();
request.setRequestBody(body);

// Send your request and get response
ReportCall caller = new ReportCall();
GetDailyPriceReportResponse response = caller.getDailyPriceReport(request);

//do something...
```

