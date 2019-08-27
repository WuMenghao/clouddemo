package com.wmh.cloudcli.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    private final Logger logger =LoggerFactory.getLogger(getClass());

    @Resource
    private DiscoveryClient client;

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String index(HttpServletRequest request){
        ServiceInstance instance=client.getInstances(client.getServices().get(0)).get(0);
        logger.info("/hello, host: {} , service_id: {}",instance.getHost(),instance.getServiceId());
        return "<h1>Hello word</h1>" +
                "<p>service_id:"+instance.getServiceId()+"</p>" +
                "<p>host:"+request.getLocalName()+"</p>" +
                "<p>port:"+request.getLocalPort()+"</p>";
    }
}
