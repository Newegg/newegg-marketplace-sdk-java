# Item Management
## Volume Discount
### properties
- newegg.item.simulation
- newegg.item.retry.period
- newegg.item.retry.maxperiod
- newegg.item.retry.maxattempts
- newegg.item.loglevel

### Exp

```
APIConfig.load(ItemConfig.class);
VolumeDiscount call=new VolumeDiscount();
GetVolumeDiscountRequest body =new GetVolumeDiscountRequest();
// setting object...
GetVolumeDiscountResponse r=call.getVolumeDiscountRequestResult(body);
//do something...
```

## Change log
### 0.1.0
- implement