# springboot-docker
Springboot with Docker generated with [start.spring.io](https://start.spring.io)


## Options

Running the service

`mvn spring-boot:run`


Generating the image

`mvn clean package docker:build`

Running the containner

`docker run -it -p 8020:8020 --name test-sb test-sb`


## Tecnologies in this sample
* Java 8
* JUnit 5
* REST
* Spring Boot
* Docker