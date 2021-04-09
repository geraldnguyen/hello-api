# Getting Started

## Docker Image

https://hub.docker.com/repository/docker/huypuma/springboot-helloapi

## Build Docker Image

```
mvn spring-boot:build-image -DskipTests
```

## Run the image, expose port 2020 on host machine

```
docker run -p 2020:8080 huypuma/springboot-helloapi
```

On another terminal

```
$ curl localhost:2020/hello/world
Hello world
```

