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

##### Sample curl requests
```
	PUT - https://hashclients-nonconcentric-consolation.cfapps.io/TechoHash/name
		provide request body as {saikiran}
	GET - https://hashclients-nonconcentric-consolation.cfapps.io/TechoHash/name
		OutPut : saikiran
```
