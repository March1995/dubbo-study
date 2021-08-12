package com.wyb.dubbo;

import com.wyb.client.User;
import com.wyb.client.UserService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tommy
 * Created by Tommy on 2019/12/4
 **/
public class DubboClient {

    public static void main(String[] args) throws IOException {
        RegistryConfig registryConfig
                = new RegistryConfig("zookeeper://192.168.36.54:2181"); // 虚拟的注册中心 局域网

        ApplicationConfig applicationConfig
                = new ApplicationConfig("young-app");
        UserService userService1, userService2, userService3;
        {
            ReferenceConfig referenceConfig = new ReferenceConfig();
            referenceConfig.setRegistry(registryConfig);
            referenceConfig.setApplication(applicationConfig);
            referenceConfig.setTimeout(3000);
            referenceConfig.setInterface(UserService.class);
            referenceConfig.setFilter("-firstFilter");
//            referenceConfig.setGroup("wyb");
            userService1 = (UserService) referenceConfig.get();
        }
//        {
//            ReferenceConfig referenceConfig = new RReferenceConfig();
//            referenceConfig.setRegistry(registryConfig);
//            referenceConfig.setApplication(applicationConfig);
//            referenceConfig.setTimeout(3000);
//            referenceConfig.setInterface(UserService.class);
//            referenceConfig.setFilter("-firstFilter");
//            referenceConfig.setConnections(2);
//            userService2 = (UserService) referenceConfig.get();
//        }
//        {
//            ReferenceConfig referenceConfig = new ReferenceConfig();
//            referenceConfig.setRegistry(registryConfig);
//            referenceConfig.setApplication(applicationConfig);
//            referenceConfig.setTimeout(3000);
//            referenceConfig.setInterface(UserService.class);
//            referenceConfig.setFilter("-firstFilter");
//            userService3 = (UserService) referenceConfig.get();
//        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bufferedReader.readLine();
            if (line.equals("quit")) {
                break;
            }
            if (line.startsWith("1")) {
                System.out.println(userService1.getUser(1));
//            } else if (line.startsWith("2")) {
//                System.out.println(userService2.getUser(2));
//            } else if (line.startsWith("3")) {
//                System.out.println(userService3.getUser(3));
            } else {
                System.out.println(userService1.getUser(1));
            }
//            if (line.startsWith("findUser")) {
//                List<User> byCity = userService1.findUser(line.split(" ")[1], line.split(" ")[2]);
//                String s= Arrays.toString(byCity.toArray());
//                System.out.println(s);
//            } else {
//                System.out.println(userService1.getUser(1));
//            }
        }
    }
}
