package com.atguigu.design.creational.abstractFactory;

public class VanCarFactory extends CarFactory {
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
