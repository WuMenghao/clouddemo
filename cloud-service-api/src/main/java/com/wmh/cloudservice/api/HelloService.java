package com.wmh.cloudservice.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@FeignClient(value="hello-service")
public interface HelloService {
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    String hello();

    @RequestMapping(value="/index",method=RequestMethod.GET)
    String index();
}
