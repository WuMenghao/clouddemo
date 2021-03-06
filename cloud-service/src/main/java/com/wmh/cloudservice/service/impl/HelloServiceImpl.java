package com.wmh.cloudservice.service.impl;


import com.wmh.cloudservice.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloServiceImpl implements HelloService {

    private final Logger logger =LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public String index(){
        ServiceInstance instance=client.getInstances(client.getServices().get(0)).get(0);
        logger.info("/hello, host: {} , service_id: {}",instance.getHost(),instance.getServiceId());
        return "<h1>Hello word</h1>" +
                "<p>service_id:"+instance.getServiceId()+"</p>";
//                "<p>host:"+request.getLocalName()+"</p>" +
//                "<p>port:"+request.getLocalPort()+"</p>";
    }

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    @Override
    public String hello() {
        return "hello";
    }
}
