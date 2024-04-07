package com.atguigu.design.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class MyMybatis {
    private Map<String, User> userCache = new HashMap<>();

    public User getUser(String userName) throws CloneNotSupportedException {
        User user = null;
        if (!userCache.containsKey(userName)) {
            user = getUserFromDB(userName);
        } else {
            user = userCache.get(userName);
            System.out.println("从缓存中拿到:" + user);
            user = (User) user.clone();
        }
        return user;
    }

    private User getUserFromDB(String userName) {
        System.out.println("从数据库查到:" + userName);
        User user = new User();
        user.setUserName(userName);
        user.setAge(18);
        userCache.put(userName, user);
        return user;
    }
}
