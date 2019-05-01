# SBN (Shipped by Newegg) Management
## SBN
### properties
- newegg.sbn.simulation
- newegg.sbn.retry.period
- newegg.sbn.retry.maxperiod
- newegg.sbn.retry.maxattempts
- newegg.sbn.loglevel

### Exp
```
APIConfig.load(SbnConfig.class);
SbnCall call=new SbnCall();
GetShipmentStatusRequest body=new GetShipmentStatusRequest();
//set object
GetShipmentStatusResponse r=call.getInboundShipmentStatusRequest(body);
//do something...
```

## Change log
### 0.1.0
- implement