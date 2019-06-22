FROM store/oracle/serverjre:8 AS cloud-discover

LABEL version="0.0.1"
LABEL description="This is a demo of springclould"
MAINTAINER tm_wmh@foxmail.com

COPY target/cloud-discover-0.0.1-SNAPSHOT.jar /cloud-discover-0.0.1.jar

ENTRYPOINT ["java","-jar","/cloud-discover-0.0.1.jar"]

