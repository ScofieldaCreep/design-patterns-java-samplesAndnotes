package com.atguigu.design.creational.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        WulinSimpleFactory factory = new WulinSimpleFactory();
        AbstractCar van = factory.newCar("van");
        AbstractCar mini = factory.newCar("mini");
        AbstractCar zz = factory.newCar("zz");
        van.run();
        mini.run();
//        zz.run();
    }
}
