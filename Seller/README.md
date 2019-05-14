# Seller Management
The Seller Management service group contains functions that will allow you to get reference information you may need to use some of the functions in Newegg API.

Please see: [https://developer.newegg.com/newegg_marketplace_api/seller_management/](https://developer.newegg.com/newegg_marketplace_api/seller_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
    <artifactId>sdk-seller</artifactId>
    <version>1.0.0</version>
</dependency>
```

- Or you can set pom.xml of project using sdk-all dependency import all sdk modules
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
    <artifactId>sdk-all</artifactId>
    <version>1.0.0</version>
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

# Seller Management
newegg.seller.simulation=false
newegg.seller.retry.period=100
newegg.seller.retry.maxperiod=1000
newegg.seller.retry.maxattempts=2
newegg.seller.loglevel=FULL
```

### Sample code
- Seller Status Check
```java
// Load Configuration
APIConfig.load(SellerConfig.class);

// Send your request and get response
SellerCall caller = new SellerCall();
SellerStatusCheckResponse response = caller.sellerStatusCheck();

//do something...
```

- Get Subcategory Properties: Get the properties of special subcategory.
```java
// Load Configuration
APIConfig.load(SellerConfig.class);

// Create RequestBody
GetSubcategoryPropertiesRequest.RequestBody body = new GetSubcategoryPropertiesRequest.RequestBody();
body.setSubcategoryID(000);

// Create Request
GetSubcategoryPropertiesRequest request = new GetSubcategoryPropertiesRequest();
request.setRequestBody(body);

// Send your request and get response
SellerCall caller = new SellerCall();
GetSubcategoryPropertiesResponse response = caller.getSubcategoryProperties(request);

//do something...
```

- Get Subcategory Status: Get Subcategory of special Industry.
```java
// Load Configuration
APIConfig.load(SellerConfig.class);

// Create IndustryCodeList
GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory.IndustryCodeList industoryCodeList = new GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory.IndustryCodeList();
industoryCodeList.getIndustryCode().add("XX");

// Create GetItemSubcategory
GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory itemSubcategory = new GetSubcategoryStatusRequest.RequestBody.GetItemSubcategory();
itemSubcategory.setIndustryCodeList(industoryCodeList);

// Create RequestBody
GetSubcategoryStatusRequest.RequestBody body = new GetSubcategoryStatusRequest.RequestBody();
body.setGetItemSubcategory(itemSubcategory);

// Create Request
GetSubcategoryStatusRequest request = new GetSubcategoryStatusRequest();
request.setRequestBody(body);

// Send your request and get response
SellerCall caller = new SellerCall();
GetSubcategoryStatusResponse response =  caller.getSubcategoryStatus(request);

//do something...
```

