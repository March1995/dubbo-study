/*
 * @(#)Driver    Created on 2021/9/7
 * Copyright (c) 2021 ZDSoft Networks, Inc. All rights reserved.
 * $$ Id$$
 */
package com.wyb.spi.service.dubbo.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Driver {

    void driveCar(URL url);
}
