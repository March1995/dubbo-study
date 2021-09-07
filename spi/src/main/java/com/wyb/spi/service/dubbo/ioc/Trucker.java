package com.wyb.spi.service.dubbo.ioc;

import com.wyb.spi.service.dubbo.aop.Car;
import org.apache.dubbo.common.URL;

public class Trucker implements Driver {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public void driveCar(URL url) {
        car.getColor(url);
    }
}
