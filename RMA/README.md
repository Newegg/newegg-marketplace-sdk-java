# RMA Management
How to create, retrieve and update RMA (e.g. refund and replacement), as well as how to issue a courtesy refund.

Please see: [https://developer.newegg.com/newegg_marketplace_api/rma_management/](https://developer.newegg.com/newegg_marketplace_api/rma_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>RMA</artifactId>
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

# RMA Management
newegg.rma.simulation=false
newegg.rma.retry.period=100
newegg.rma.retry.maxperiod=1000
newegg.rma.retry.maxattempts=2
newegg.rma.loglevel=FULL
```

### Sample code
- Get RMA Information: Get RMA information by specified query conditions.
```
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create Request PageInfo
GetRMAInformationRequest.RequestBody.PageInfo pageInfo = new GetRMAInformationRequest.RequestBody.PageInfo();
pageInfo.setPageIndex(1);
pageInfo.setPageSize(100);

// Create RequestBody
GetRMAInformationRequest.RequestBody body = new GetRMAInformationRequest.RequestBody();
body.setPageInfo(pageInfo);
body.setStatus(0);
body.setRmaDateFrom("2019-05-01");
body.setRmaDateTo("2019-05-31");
body.setRmaType(0);
// Keywords
// body.setKeywordsType(0);
// body.setKeywordsValue("xxxx");

// Create Request
GetRMAInformationRequest request = new GetRMAInformationRequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
GetRMAInformationResponse response = caller.getRMAInformation(request, "307");

//do something...
```

- Submit RMA: Issue a Refund or Replacement RMA for an invoiced order.
```
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create RMATransaction
SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList.RMATransaction rma = new SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList.RMATransaction();
rma.setSellerPartNumber("xxxxxxxxxx");
rma.setReturnQuantity(new BigInteger("1"));
rma.setReturnUnitPrice(new BigDecimal("1.00"));
rma.setRefundShippingPrice(new BigDecimal("1.00"));
rma.setRmaReason(2);

// Create RMATransactionList
SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList rmaList = new SubmitRMARequest.RequestBody.IssueRMA.RMATransactionList();
rmaList.getRmaTransaction().add(rma);

// Create Issue RMA
SubmitRMARequest.RequestBody.IssueRMA issueRMA = new SubmitRMARequest.RequestBody.IssueRMA();
issueRMA.setRmaType(2);
issueRMA.setSourceSONumber(123456789);
issueRMA.setSellerRMANumber("E12345678");
issueRMA.setAutoReceiveMark(1);
issueRMA.setRmaNote("This is a test RMA");

// Create RequestBody
SubmitRMARequest.RequestBody body = new SubmitRMARequest.RequestBody();
body.setIssueRMA(issueRMA);

// Create Request
SubmitRMARequest request = new SubmitRMARequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
SubmitRMAResponse response = caller.submitRMA(request, "307");

//do something...
```

- Edit RMA: Edit existing RMA.
```
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create RMATransaction
EditRMAInfo.RMATransactionList.RMATransaction rmaTranscation = new EditRMAInfo.RMATransactionList.RMATransaction();
rmaTranscation.setSellerPartNumber("xxxxxxxxxx");
rmaTranscation.setReturnQuantity(1);
rmaTranscation.setReturnUnitPrice(new BigDecimal("200"));
rmaTranscation.setRefundShippingPrice(new BigDecimal("20"));
rmaTranscation.setRmaReason(5);

// Create RMATransactionList
EditRMAInfo.RMATransactionList rmaTranscationList = new EditRMAInfo.RMATransactionList();
rmaTranscationList.getRmaTransaction().add(rmaTranscation);

// Create EditRMAInfo
EditRMAInfo editRMAInfo = new EditRMAInfo();
editRMAInfo.setRmaTransactionList(rmaTranscationList);
editRMAInfo.setRmaNumber(123456789);
editRMAInfo.setRmaType(2);
editRMAInfo.setSellerRMANumber("E12345678");
editRMAInfo.setRmaNote("your new note");

// Create RequestBody
EditRMARequest.RequestBody body = new EditRMARequest.RequestBody();
body.setEditRMAInfo(editRMAInfo);

// Create Request
EditRMARequest request = new EditRMARequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
EditRMAResponse response = caller.editRMA(request, "307");

//do something...
```
	
- Issue Courtesy Refund: Submit a Courtesy Refund Request.
```
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create IssueCourtesyRefund
IssueCourtesyRefundRequest.RequestBody.IssueCourtesyRefund issueCourtesyRefund = new IssueCourtesyRefundRequest.RequestBody.IssueCourtesyRefund();
issueCourtesyRefund.setSourceSONumber(12345678);
issueCourtesyRefund.setRefundReason(1);
issueCourtesyRefund.setTotalRefundAmount(new BigDecimal(2.01));
issueCourtesyRefund.setNoteToCustomer("this is your note");

// Create RequestBody
IssueCourtesyRefundRequest.RequestBody body = new IssueCourtesyRefundRequest.RequestBody();
body.setIssueCourtesyRefund(issueCourtesyRefund);

// Create Request
IssueCourtesyRefundRequest request = new IssueCourtesyRefundRequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
IssueCourtesyRefundResponse response = caller.issueCourtesyRefund(request);

//do something...
```
	
- Get Courtesy Refund Request Status: Get the status of specified courtesy refund request by specified query conditions.
```
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
	
- Get Courtesy Refund Information: Get the specified courtesy refund information by specified query conditions.
```
// Load Configuration
APIConfig.load(RMAConfig.class);

// Create Request PageInfo
GetCourtesyRefundInformationRequest.RequestBody.PageInfo pageInfo = new GetCourtesyRefundInformationRequest.RequestBody.PageInfo();
pageInfo.setPageIndex(1);
pageInfo.setPageSize(10);

// Create RequestBody
GetCourtesyRefundInformationRequest.RequestBody body = new GetCourtesyRefundInformationRequest.RequestBody();
body.setPageInfo(pageInfo);
body.setStatus(0);
body.setDateFrom("2019-05-01 00:00:00");
body.setDateTo("2019-05-31 00:00:00");
// Keywords
// body.setKeywordsType(0);
// body.setKeywordsValue("xxxx");

// Create Request
GetCourtesyRefundInformationRequest request = new GetCourtesyRefundInformationRequest();
request.setRequestBody(body);

// Send your request and get response
RMACall caller = new RMACall();
GetCourtesyRefundInformationResponse response = caller.getCourtesyRefundInformation(request);

//do something...
```
