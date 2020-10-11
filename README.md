# Getting Started

Calls to that service (`curl localhost:8080/hello/<name>`) starts failling once the name `medusa` is passed in

```
docker pull huypuma/springboot-helloapi:0.0.1-MEDUSA
```

## Docker Image

https://hub.docker.com/repository/docker/huypuma/springboot-helloapi

## Build Docker Image

```
mvn spring-boot:build-image -DskipTests
```


