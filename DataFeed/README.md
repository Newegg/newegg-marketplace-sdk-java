# DataFeed Management
## DataFeed
### properties
- newegg.datafeed.simulation
- newegg.datafeed.retry.period
- newegg.datafeed.retry.maxperiod
- newegg.datafeed.retry.maxattempts
- newegg.datafeed.loglevel

### Exp
```
APIConfig.load(DataFeedConfig.class);
DataFeedCall call=new DataFeedCall();

//set object

//do something...
```

## How to generate java code of SubCategory
- Download the XSD of SubCategory.(exp : 122_Microphone.xsd)
- If the file does not exist,created that file.(name : limit.xjb)

```
<jxb:bindings 
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:jxb="http://java.sun.com/xml/ns/jaxb"
    version="2.1">
   <jxb:bindings >
       <jxb:globalBindings typesafeEnumMaxMembers="2000"/>
   </jxb:bindings>
</jxb:bindings>
```
 
- Running JAXB xjc Compiler With JDK.

```
xjc -p your.package.name -b limit.xjb  download_sub_category.xsd

```

- Now ,the source code was generated and you could used it.
- Lastly,open the SDK project and reference SubCategory.

```
To modify "XmlRootElement" in the source code of SubCategory 

@XmlRootElement(name = "Propertys")
public class Microphone {

To modify the source code (ItemfeedRequest.java)

				public static class SubCategoryProperty {
					@XmlElementRefs(value = { @XmlElementRef(type = SUB_CATEGORY_CLASS_NAME.class),
							@XmlElementRef(type = Propertys.class) })
					protected Object any;
```

## Change log
### 0.1.0
- implement