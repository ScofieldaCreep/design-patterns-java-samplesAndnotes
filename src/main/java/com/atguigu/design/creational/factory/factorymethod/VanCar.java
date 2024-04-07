package com.atguigu.design.creational.factory.factorymethod;

public class VanCar extends AbstractCar {
    public VanCar() {
        this.engine = "单杠柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + "-->> 哒哒哒");
    }
}
