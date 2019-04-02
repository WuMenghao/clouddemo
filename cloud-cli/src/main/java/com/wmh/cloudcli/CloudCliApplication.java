package com.wmh.cloudcli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.wmh.cloudcli")
@EnableDiscoveryClient
public class CloudCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudCliApplication.class,args);
    }

}
