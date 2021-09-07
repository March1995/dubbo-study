package com.wyb.spi.service;

import com.wyb.spi.service.dubbo.aop.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * https://www.bilibili.com/video/BV1Wt411u7sG?p=6
 */
public class Main {
    public static void main(String[] args) {
        // java spi
        Iterator<UserService> iterator = ServiceLoader.load(UserService.class).iterator();
        UserService service = iterator.next();
        System.out.println(service.getName(11));

        // dubbo spi
        ExtensionLoader<Car> extensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
        Car redCar = extensionLoader.getExtension("red");
        redCar.getColor(null);
//        Class.forName("com.mysql.jdbc.Driver");
//        DriverManager.getConnection("");
    }
}
