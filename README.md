## Development
 
### bootRun
```$xslt
$ ./gradlew bootRun
```

### Request Sample
```
$ curl -X GET http://localhost:8080/account

$ curl -X POST http://localhost:8080/account -d '{"name":"demo", "age": 10}' -H "Content-Type: application/json"
   
$ curl -X PUT http://localhost:8080/account -d '{"id": 1, "name":"demo", "age": 12}' -H "Content-Type: application/json"
   
$ curl -X DELETE http://localhost:8080/account -d '{"id": 1, "name":"demo", "age": 12}' -H "Content-Type: application/json"
```


## Build & Run
```
$ ./gradlew clean build
$ java -jar build/demo-versions-SNAPSHOT.jar
```