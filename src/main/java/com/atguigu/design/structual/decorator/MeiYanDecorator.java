package com.atguigu.design.structual.decorator;

/**
 * 美颜装饰器
 * 装饰谁？
 * <p>
 * 装饰器只关系增强这个类的方法。
 */
public class MeiYanDecorator implements TiktokDecorator {

//    private Framework framework;  适配器

    private ManTikTok manTikTok;

    public MeiYanDecorator(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void tiktok() {
        //开启美颜
        enable();
        //
//        framework.enableMeiYan(); 如果这样引用外部框架，他就是属于适配器了。而装饰器的方法是在这个类的里面，只对内部的变量manTikTok负责，别人调用它没有用。

        //我开始直播
        manTikTok.tiktok();
    }


    /**
     * 定义的增强功能
     */
    @Override
    public void enable() {
        System.out.println("看这个美女.....");
        System.out.println("花花花花花花花花花花花");
    }
}
