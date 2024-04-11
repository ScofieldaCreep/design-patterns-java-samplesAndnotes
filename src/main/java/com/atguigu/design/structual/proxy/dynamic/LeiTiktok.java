package com.atguigu.design.structual.proxy.dynamic;

public class LeiTiktok implements ManTikTok, Function2 {
    @Override
    public void tiktok() {
        System.out.println("正在直播");
    }

    public void printPrivate() {
        System.out.println("私有方法");
    }

    @Override
    public void function2() {
        System.out.println("another function");
    }
}
