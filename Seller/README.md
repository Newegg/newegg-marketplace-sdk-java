# Seller Management
## Seller
### properties
- newegg.seller.simulation
- newegg.seller.retry.period
- newegg.seller.retry.maxperiod
- newegg.seller.retry.maxattempts
- newegg.seller.loglevel

### Exp
```
APIConfig.load(SellerConfig.class);
SellerCall call=new SellerCall();
GetSellerAccountStatusResponse r=call.GetSellerAccountStatus();
GetIndustryResponse r1=call.GetIndustryList(Optional.empty());
//do something...
```

## Change log
### 0.1.0
- implement