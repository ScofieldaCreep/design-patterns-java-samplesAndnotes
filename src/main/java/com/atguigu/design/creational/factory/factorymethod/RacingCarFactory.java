package com.atguigu.design.creational.factory.factorymethod;

public class RacingCarFactory extends AbstractCarFactory {
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
