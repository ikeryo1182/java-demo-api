## Development
 
### bootRun
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

## Build
```$xslt
$ ./gradlew clean build
```
s
### Build image
```$xslt
# Build
$ docker build -t <docker-hub-account>/demo:v1 --build-arg VERSIONS='0.1.0' .

# Push
$ docker push <docker-hub-account>/demo:v1
```

### Minikube
```$xslt
# Setup
$ brew install virtualbox
$ brew install minikube
$ minikube start

# Deployment
$ kubectl create -f specs/postgres.yml
$ kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc postgres -o jsonpath="{.spec.clusterIP}")
$ kubectl create -f specs/spring-boot.yml
$ kubectl expose deployment demo-app --type=NodePort --port=8080

$ minikube service demo-app --url
```

### AWS, GCP and so on

```$xslt
# Deployment
$ kubectl create -f specs/postgres.yml
$ kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc postgres -o jsonpath="{.spec.clusterIP}")
$ kubectl create -f specs/spring-boot.yml
$ kubectl expose deployment demo-app --type=LoadBalancer --port=8080
$ kubectl get svc demo-app
```

### Deleteing

```$xslt
$ kubectl delete -f specs/spring-boot.yml
$ kubectl delete -f specs/postgres.yml
$ kubectl delete svc demo-app
$ kubectl delete cm hostname-config
```
