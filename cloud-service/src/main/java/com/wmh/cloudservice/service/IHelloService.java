package com.wmh.cloudservice.service;

import com.wmh.cloudservice.api.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("hello-service")
public interface IHelloService extends HelloService {
}
