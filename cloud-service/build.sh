#!/usr/bin bash
mvn clean install package -DskipTests=true -f pom.xml

docker build ./ -t cloud-sevice:0.0.1
