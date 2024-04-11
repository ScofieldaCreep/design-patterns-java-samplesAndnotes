package com.atguigu.design.structual.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {
    public static <T> T createProxy(T t) {
        // 创建一个增强器
        Enhancer enhancer = new Enhancer();
        // 设置要增强哪个类的功能，增强器为这个类动态创建一个子类
        enhancer.setSuperclass(t.getClass());
        // 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj,
                                    Method method,
                                    Object[] args,
                                    MethodProxy proxy) throws Throwable {
                // 编写拦截的逻辑
                System.out.println("cglib闪亮登场！");
                // 目标方法执行
                Object invoke = proxy.invokeSuper(obj, args);
                return invoke;
            }
        });
        Object o = enhancer.create();
        return (T) o;
    }
}
