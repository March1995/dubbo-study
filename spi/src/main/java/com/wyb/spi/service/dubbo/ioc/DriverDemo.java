package com.wyb.spi.service.dubbo.ioc;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class DriverDemo {
    public static void main(String[] args) {
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = extensionLoader.getExtension("trucker");

        Map<String, String> map= new HashMap<String, String>();
        map.put("carType", "red");
        URL url = new URL("", "", 0,  map);
        driver.driveCar(url);
    }
}
