package com.wmh.cloudcli.controller;

import com.wmh.cloudcli.vo.ResponseVo;
import com.wmh.cloudservice.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/web")
public class HelloController {

    private final Logger logger =LoggerFactory.getLogger(getClass());

    @Autowired
    private HelloService helloService;

    @RequestMapping(value="/index",method=RequestMethod.GET)
    @ResponseBody
    public ResponseVo index(){
        return ResponseVo.success(helloService.index());
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public ResponseVo Hello(){
        return ResponseVo.success(helloService.hello());
    }
}
