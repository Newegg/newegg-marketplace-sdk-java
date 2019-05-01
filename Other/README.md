# Verify Service Status
## Other
### properties
- newegg.other.simulation
- newegg.other.retry.period
- newegg.other.retry.maxperiod
- newegg.other.retry.maxattempts
- newegg.other.loglevel

### Exp
```
APIConfig.load(OtherConfig.class);
OtherCall call=new OtherCall();
GetServiceStatusResponse r=call.verifyServiceStatus("contentmgmt")
//do something...
```

## Change log
### 0.1.0
- implement