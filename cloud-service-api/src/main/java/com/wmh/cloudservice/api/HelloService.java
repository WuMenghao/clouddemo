package com.wmh.cloudservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface HelloService {

    @GetMapping("hello")
    String hello();
}
