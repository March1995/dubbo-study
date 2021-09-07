package com.wyb.spi.service.dubbo.aop;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Car {

    @Adaptive(value = "carType")
    void getColor(URL url);
}
