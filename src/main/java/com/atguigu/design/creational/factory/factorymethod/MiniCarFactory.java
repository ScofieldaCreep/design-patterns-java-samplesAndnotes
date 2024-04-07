package com.atguigu.design.creational.factory.factorymethod;

public class MiniCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
