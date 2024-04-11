package com.atguigu.design.structual.proxy.dynamic;

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        ManTikTok leiTiktok = new LeiTiktok();
        ManTikTok proxy = JdkTiktokProxy.getProxy(leiTiktok);
        proxy.tiktok();
        System.out.println(Arrays.asList(proxy.getClass().getInterfaces()));
        ((Function2) proxy).function2();

        ((LeiTiktok) proxy).printPrivate(); // 不能代理 被代理的对象 它自己的方法, 因为proxy只能转成接口类型
    }
}
