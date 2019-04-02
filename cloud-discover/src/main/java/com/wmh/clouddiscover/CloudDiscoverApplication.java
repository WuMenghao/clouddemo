package com.wmh.clouddiscover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudDiscoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudDiscoverApplication.class,args);
    }

}
