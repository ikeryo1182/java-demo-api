## Development
 
### Development Server
```$xslt
$ ./gradlew bootRun
```

### Request Sample
```$xslt
$ curl -X GET http://localhost:8080/account
$ curl -X POST http://localhost:8080/account -d '{"name":"demo", "age": 10}' -H "Content-Type: application/json"
$ curl -X PUT http://localhost:8080/account -d '{"id": 1, "name":"demo", "age": 12}' -H "Content-Type: application/json"
$ curl -X DELETE http://localhost:8080/account -d '{"id": 1, "name":"demo", "age": 12}' -H "Content-Type: application/json"
```

## Production
### Build
```$xslt
$ ./gradlew clean build
```

### Build Image
```$xslt
# Build
$ docker build -t <docker-hub-account>/demo-api:v0.1.0 --build-arg VERSIONS='0.1.0' .

# Push
$ docker push <docker-hub-account>/demo-api:v0.1.0
```

### Kubernetes
### Create Deployment & Service
```$xslt
$ kubectl create -f specs/postgres.yml
$ kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc postgres -o jsonpath="{.spec.clusterIP}")
$ kubectl create -f specs/spring-boot.yml
```

if using minikube, you can check url and access.
```$xslt
$ minikube service demo-api-svc --url
```

#### Delete Deployment & Service
```$xslt
$ kubectl delete -f specs/spring-boot.yml
$ kubectl delete -f specs/postgres.yml
$ kubectl delete cm hostname-config
```
