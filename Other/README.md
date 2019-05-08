# Verify Service Status
Newegg Marketplace API provides an interface in every major service group to allow you to check whether the service you are invoking is available or not. Each major service group is listed in the Parameters section, domain field description.  Return each major service group’s availability.

Please see: [https://developer.newegg.com/newegg_marketplace_api/verify_service_status/](https://developer.newegg.com/newegg_marketplace_api/verify_service_status/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```
<dependency>
    <groupId>com.newegg.marketplace.sdk</groupId>
    <artifactId>Other</artifactId>
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

# Other - Verify Service Status
newegg.other.simulation=false
newegg.other.retry.period=100
newegg.other.retry.maxperiod=1000
newegg.other.retry.maxattempts=2
newegg.other.loglevel=FULL
```

### Sample code
- Verify Service Status:
```
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
VerifyServiceStatusResponse response = call.verifyServiceStatus(ServiceDomain.contentmgmt);
	
//do something...
```
