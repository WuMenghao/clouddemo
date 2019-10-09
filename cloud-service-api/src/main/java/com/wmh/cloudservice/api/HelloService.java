package com.wmh.cloudservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="hello-service")
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}
