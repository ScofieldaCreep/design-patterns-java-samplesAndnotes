package com.atguigu.design.creational.abstractFactory;

public abstract class MaskFactory extends TopFactory {
    @Override
    AbstractCar newCar() {
        return null;
    }

    abstract AbstractMask newMask();
}
