/*
 * @(#)BlackCar    Created on 2021/9/7
 * Copyright (c) 2021 ZDSoft Networks, Inc. All rights reserved.
 * $$ Id$$
 */
package com.wyb.spi.service.dubbo.aop;

import org.apache.dubbo.common.URL;

public class BlackCar implements Car {
    @Override
    public void getColor(URL url) {
        System.out.println("black");
    }
}
