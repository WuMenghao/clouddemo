package com.wmh.cloudservice.service.impl;


import com.wmh.cloudservice.service.IHelloService;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello() {
        return "hello";
    }
}
