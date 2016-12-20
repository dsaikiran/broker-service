### HashMap Broker Service

#### Local setup
##### Build
```
  cd broker-service
  mvn clean install
```
##### Run
```
  mvn spring-boot:run
```

#### PCF serup

##### Build
```
  cd broker-service
  mvn clean install
```
##### Push into PCF
```
  cf push hashbroker -p target/hashservicebroker-0.0.1-SNAPSHOT.jar
```
##### Create CUPS in PCF
```
  cf cups hash-service-broker -p '{"uri":"https://hashbroker-spicier-verrucoseness.cfapps.io"}'
```
##### Approach
* Implemented a hashmap service
* Broker service accepts rest requests with key-value and save in map
* Client will use this broker by sending an rest requests inorder to save data in to map
