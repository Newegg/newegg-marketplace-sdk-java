# NewEgg SDK for java

## Technology
- java 1.8+
- openfeign
- log4j2
- commons-configuration2

## build
- mvn package

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

## Modules
### common
- used for other modules

### Item
- Item Management

### Seller
- Seller Management

### Order
- Order Management

### Shipping
- Newegg Shipping Label Service

### Other
- Verify Service Status

### SBN
- Shipped by Newegg Management

### DataFeed
- DataFeed Management

### Report
- Reports Management

### RMA
- RMA(Return Merchandise Authorization) Management

## Change log
### 0.0.1
- initial
