package com.atguigu.design.structual.proxy.cglib;

import com.atguigu.design.structual.proxy.cglib.LeiTiktok;

public class MainTest {
    // 跑不通是因为没有允许反射：--add-opens java.base/java.lang=ALL-UNNAMED
    public static void main(String[] args) {
        LeiTiktok tikTok = new LeiTiktok();
        LeiTiktok proxy = CglibProxy.createProxy(tikTok);
        proxy.haha();
        tikTok.haha();
    }
}
