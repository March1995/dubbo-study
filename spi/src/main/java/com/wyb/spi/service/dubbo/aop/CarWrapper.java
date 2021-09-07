/*
 * @(#)CarWapper    Created on 2021/9/7
 * Copyright (c) 2021 ZDSoft Networks, Inc. All rights reserved.
 * $$ Id$$
 */
package com.wyb.spi.service.dubbo.aop;

import org.apache.dubbo.common.URL;

public class CarWrapper implements Car{

    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void getColor(URL url) {
        System.out.println("before");
        car.getColor(url);
        System.out.println("after");
    }
}
