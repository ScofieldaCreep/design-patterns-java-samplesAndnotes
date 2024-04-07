package com.atguigu.design.creational.abstractFactory;


public class MainTest {
    public static void main(String[] args) {
        TopFactory topFactory = new N95MaskFactory();
        AbstractCar abstractCar = topFactory.newCar();
        System.out.println(abstractCar == null);
        AbstractMask abstractMask = topFactory.newMask();
        abstractMask.protectMe();

        topFactory = new CommonMaskFactory();
        abstractMask = topFactory.newMask();
        abstractMask.protectMe();

    }
}
