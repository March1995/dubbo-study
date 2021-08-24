package com.wyb.dubbo;

import com.wyb.client.User;
import com.wyb.client.UserService;
import org.apache.dubbo.rpc.RpcContext;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tommy
 * Created by Tommy on 2019/12/4
 **/
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(Integer id) {
        System.out.println(RpcContext.getContext().getAttachment("这是一个隐藏的参数"));
        User user = new User();
        user.setId(id);
        user.setName("luban:" + ManagementFactory.getRuntimeMXBean().getName());
        user.setSex("man");
        return user;
    }

    @Override
    public List<User> findUser(String city, String sex) {
        return Arrays.asList(getUser(1));
    }
}
