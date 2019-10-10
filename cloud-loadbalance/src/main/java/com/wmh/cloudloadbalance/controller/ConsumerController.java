package com.wmh.cloudloadbalance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://HELLO-CLI/web/hello",String.class).getBody();
    }

    @RequestMapping(value="/index",method=RequestMethod.GET)
    public String indexConsumer(){
        return restTemplate.getForEntity("http://HELLO-CLI/web/index",String.class).getBody();
    }
}
