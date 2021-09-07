package com.wyb.spi.service.dubbo.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

@SPI
public interface Driver {

    void driveCar(URL url);
}
