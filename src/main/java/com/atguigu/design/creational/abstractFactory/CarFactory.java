package com.atguigu.design.creational.abstractFactory;

public abstract class CarFactory extends TopFactory {
    @Override
    abstract AbstractCar newCar();

    @Override
    AbstractMask newMask() {
        return null;
    }
}
