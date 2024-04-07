package com.atguigu.design.creational.builder;

public class MainTest {
    public static void main(String[] args) {
        AbstractBuilder builder = new XiaomiBuider();
//        builder.customMem("16G");
//        builder.customDisk("1T");
//        builder.customCam("2亿");
//        builder.customCPU("晓龙888");

        builder.customCPU("晓龙888").customMem("16G").customCam("200亿").customDisk("1T");

        Phone product = builder.getProduct();
        System.out.println(product);

        Phone.PhoneBuilder phoneBuilder = Phone.builder();
        Phone build = phoneBuilder.cpu("1")
                .mem("2")
                .cam("3")
                .disk("4").build();
        System.out.println(build);
    }
}
