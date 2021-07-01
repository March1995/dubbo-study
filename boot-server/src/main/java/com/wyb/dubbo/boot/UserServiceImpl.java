package com.wyb.dubbo.boot;

import com.wyb.client.User;
import com.wyb.client.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * @author Tommy
 * Created by Tommy on 2019/12/4
 **/
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("luban:" + ManagementFactory.getRuntimeMXBean().getName());
        user.setSex("man");
        return user;
    }

    @Override
    public List<User> findUser(String city, String sex) {
        return null;
    }
}
