package com.wmh.cloudservice.service.impl;

import com.wmh.cloudservice.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
