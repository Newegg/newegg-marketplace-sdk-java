# Verify Service Status
Newegg Marketplace API provides an interface in every major service group to allow you to check whether the service you are invoking is available or not. Each major service group is listed in the Parameters section, domain field description. Return each major service group’s availability.

Please see: [https://developer.newegg.com/newegg_marketplace_api/verify_service_status/](https://developer.newegg.com/newegg_marketplace_api/verify_service_status/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
    <artifactId>sdk-other</artifactId>
    <version>{version}</version>
</dependency>
```

- Or you can set pom.xml of project using sdk-all dependency import all sdk modules
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
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

# Other - Verify Service Status
newegg.other.simulation=false
newegg.other.retry.period=100
newegg.other.retry.maxperiod=1000
newegg.other.retry.maxattempts=2
newegg.other.loglevel=FULL
```

- loglevel
```
NONE: No logging
BASIC: Log only the request method and URL and the response status code and execution time
HEADERS: Log the basic information along with request and response headers
FULL: Log the headers, body, and metadata for both requests and responses
```

### Sample code
- Verify Service Status: Check the status of Newegg Marketplace API
```java
// Load Configuration
APIConfig.load(OtherConfig.class);

// Send your request and get response
OtherCall call = new OtherCall();

// ServiceDomain.contentmgmt
// ServiceDomain.ordermgmt
// ServiceDomain.datafeedmgmt
// ServiceDomain.servicemgmt
// ServiceDomain.reportmgmt
// ServiceDomain.sellermgmt
// ServiceDomain.sbnmgmt
// ServiceDomain.shippingservice
VerifyServiceStatusResponse response = call.verifyServiceStatus(ServiceDomain.ordermgmt);
	
//do something...
```
