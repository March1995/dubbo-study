package com.wyb.service.impl;

import com.wyb.api.HelloService;

/**
 * @author Marcher丶
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String message) {
        return "hello_" + message;
    }
}
