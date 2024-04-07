package com.atguigu.design.creational.factory.factorymethod;

public class RacingCar extends AbstractCar {
    public RacingCar() {
        this.engine = "F1赛车发动机";
    }

    @Override
    public void run() {
        System.out.println(engine + "-->>咻！！！");
    }
}
