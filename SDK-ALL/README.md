# Newegg SDK for Java - All Modules
Newegg Marketplace SDK(Java) is a library to help Java programmer easily integrates with Newegg Marketplace API. It provides the definition of the data objects models to help coder create the request and resolve the response. It also provides customize of logger and retry mechanism.

## How to use it in your project
### Maven
- Set pom.xml of project

```
  <parent>
    <groupId>com.newegg.marketplace</groupId>
    <artifactId>sdk-all</artifactId>
    <version>1.0.0</version>
  </parent>
	
	and other that you used
```
### Project 
- Write your property (newegg.properties)

```
newegg.simulation=false
newegg.platform=USA
newegg.hosturl=https://apis.newegg.org/marketplace
newegg.sellerid=XXX
newegg.authorization=XXXXXXXXXXXX
newegg.secretkey=XXXX-XXXXX-XXXX-XXXX-XXXX
newegg.retry.period=100
newegg.retry.maxperiod=1000
newegg.retry.maxattempts=2
newegg.loglevel=NONE
newegg.connectTimeoutMillis=10000
newegg.readTimeoutMillis=60000
newegg.item.simulation=false
newegg.item.retry.period=100
newegg.item.retry.maxperiod=1000
newegg.item.retry.maxattempts=2
newegg.item.loglevel=FULL
```
- Write your code

```
APIConfig.load(ItemConfig.class);	
ItemCall call=new ItemCall();
GetVolumeDiscountRequest request=new GetVolumeDiscountRequest();
GetVolumeDiscountRequest.RequestBody body=new GetVolumeDiscountRequest.RequestBody();
body.setNeweggItemNumber("XXXXXXXXXXXXXX");
request.setRequestBody(body);		
GetVolumeDiscountResponse r=call.getVolumeDiscountRequestResult(request);

Do something
```

## Note
- There is a file  "newegg.properties" at same directory.
- The jar of common module must be have.
- The properties of common module must be set up.
- If the APP not load the configuration ,the simulation will be enabled 

```
How to load configuration ?
APIConfig.load(SellerConfig.class);

```
- Log4j configuration file location

```
By default, Log4j looks for a configuration file named log4j2.xml (not log4j.xml) in the classpath.
You can also specify the full path of the configuration file with this system property: -Dlog4j.configurationFile=path/to/log4j2.xml
Web applications can specify the Log4j configuration file location with a servlet context parameter.
```

## Change log
### 1.0.0
- initial
