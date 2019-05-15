# Common library
## properties
### newegg.simulation=true
- true : not really connect to server ,just response fixed data
- false : connect to server

### newegg.platform=USA
- USA
- USB
- CAN

### newegg.hosturl=http://xxx.xxx.xxx/marketplace
- https://api.newegg.com/marketplace

### newegg.sellerid=XXXX
- your seller ID

### newegg.authorization=none
- your authorization

### newegg.secretkey=none
- your secretkey

### newegg.retry.period=100
### newegg.retry.maxperiod=1000
### newegg.retry.maxattempts=5
### newegg.loglevel=FULL
- NONE : No logging
- BASIC : Log only the request method and URL and the response status code and execution time
- HEADERS : Log the basic information along with request and response headers
- FULL : Log the headers, body, and metadata for both requests and responses

### newegg.connectTimeoutMillis=10000
    Socket connect timeout (ms)
### newegg.readTimeoutMillis=60000
    Socket read timeout  (ms)