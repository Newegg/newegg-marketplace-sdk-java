# SBN (Shipped by Newegg) Management
The SBN (Shipped by Newegg) Management service group is designed to help you send your inventory to one of Newegg’s warehouse. Once your inventory is in a Newegg’s warehouse, you will be able to sell your items on Newegg, or you can sell the products on different channels then use Shipped by Newegg to ship your orders.

Please see: [https://developer.newegg.com/newegg_marketplace_api/sbn_shipped_by_newegg_management/](https://developer.newegg.com/newegg_marketplace_api/sbn_shipped_by_newegg_management/)

## How to use
### Maven
- Set pom.xml of project using module dependency
```xml
<dependency>
    <groupId>com.newegg.marketplace</groupId>
    <artifactId>sdk-sbn</artifactId>
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

# SBN Management
newegg.sbn.simulation=false
newegg.sbn.retry.period=100
newegg.sbn.retry.maxperiod=1000
newegg.sbn.retry.maxattempts=2
newegg.sbn.loglevel=FULL
```


