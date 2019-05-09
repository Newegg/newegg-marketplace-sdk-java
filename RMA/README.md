# RMA Management
How to create, retrieve and update RMA (e.g. refund and replacement), as well as how to issue a courtesy refund.

Please see: [https://developer.newegg.com/newegg_marketplace_api/rma_management/](https://developer.newegg.com/newegg_marketplace_api/rma_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>RMA</artifactId>
    <version>0.1.0</version>
</dependency>
```

- Or you can set pom.xml of project using SDK-ALL dependency import all sdk modules
```xml
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>SDK-ALL</artifactId>
    <version>0.0.1</version>
    <type>pom</type>
</dependency>
```

### Setup properties
Write your newegg.properties file
```properties
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

# RMA Management
newegg.rma.simulation=false
newegg.rma.retry.period=100
newegg.rma.retry.maxperiod=1000
newegg.rma.retry.maxattempts=2
newegg.rma.loglevel=FULL
```

### Sample code
- Get RMA Information: Get RMA information by keyword
```java
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create RequestBody
GetRMAInformationRequest.RequestBody body = new GetRMAInformationRequest.RequestBody();
body.setKeywordsType(1); // RMANumber
body.setKeywordsValue("xxxx");
body.setStatus(0);
body.setRmaDateFrom("2019-05-01");
body.setRmaDateTo("2019-05-31");
body.setRmaType(0);
body.setProcessedBy(0);

// Create Request
GetRMAInformationRequest request = new GetRMAInformationRequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
GetRMAInformationResponse response = caller.getRMAInformation(request, "307");

//do something...
```

- Get Courtesy Refund Request Status: Get Status of special Courtesy Refund Request by request id
```java
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create RequestID of List
GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList requestIDList = new GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus.RequestIDList();
requestIDList.getRequestID().add("xxxxxxxx-xx-xx-xx-xxxxxxxxx");
// more request id

// Create RequestStatus
GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus requestStatus = new GetCourtesyRefundRequestStatusRequest.RequestBody.GetRequestStatus();
requestStatus.setRequestIDList(requestIDList);
requestStatus.setMaxCount(100);
requestStatus.setRequestStatus("ALL");

// Create RequestBody
GetCourtesyRefundRequestStatusRequest.RequestBody body = new GetCourtesyRefundRequestStatusRequest.RequestBody();
body.setGetRequestStatus(requestStatus);

// Create Request
GetCourtesyRefundRequestStatusRequest request = new GetCourtesyRefundRequestStatusRequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
GetCourtesyRefundRequestStatusResponse response = caller.getCourtesyRefundRequestStatus(request);

//do something...
```
	
- Get Courtesy Refund Information: Get information of Courtesy Refund
```java
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create RequestBody
GetCourtesyRefundInformationRequest.RequestBody body = new GetCourtesyRefundInformationRequest.RequestBody();
body.setKeywordsType(0);
body.setStatus(0);
body.setDateFrom("2019-05-01 00:00:00");
body.setDateTo("2019-05-31 00:00:00");

// Create Request
GetCourtesyRefundInformationRequest request = new GetCourtesyRefundInformationRequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
GetCourtesyRefundInformationResponse response = caller.getCourtesyRefundInformation(request);

//do something...
```
