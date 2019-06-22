FROM openjdk:latest AS clould-service

LABEL version="0.0.1"
LABEL description="This is a demo of springclould"
MAINTAINER tm_wmh@foxmail.com

COPY target/cloud-service-0.0.1-SNAPSHOT.jar /cloud-service-0.0.1.jar

ENTRYPOINT ["java","-jar","/cloud-service-0.0.1.jar","--server.port","7001"]

