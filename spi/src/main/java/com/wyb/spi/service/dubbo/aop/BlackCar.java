package com.wyb.spi.service.dubbo.aop;

import org.apache.dubbo.common.URL;

public class BlackCar implements Car {
    @Override
    public void getColor(URL url) {
        System.out.println("black");
    }
}
