package com.atguigu.design.structual.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkTiktokProxy<T> implements InvocationHandler {
    private T target;

    JdkTiktokProxy(T target) {
        this.target = target;
    }

    public static <T> T getProxy(T t) {
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(),
                new JdkTiktokProxy<T>(t));
        return (T) o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射执行
        System.out.println("在这里被拦截并执行");
        Object invoke = method.invoke(target, args);
        System.out.println("执行完毕");
        System.out.println("代理还想加点别的功能");
        return null;
    }
}
