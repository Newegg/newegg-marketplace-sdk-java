# Newegg Shipping Label Service
## Shipping
### properties
- newegg.shipping.simulation
- newegg.shipping.retry.period
- newegg.shipping.retry.maxperiod
- newegg.shipping.retry.maxattempts
- newegg.shipping.loglevel

### Exp
```
APIConfig.load(ShipConfig.class);
ShippingCall call=new ShippingCall();
GetSellerAccountStatusResponse r=call.GetSellerAccountStatus();
GetIndustryResponse r1=call.GetIndustryList(Optional.empty());
//do something...
```

## Change log
### 0.1.0
- implement