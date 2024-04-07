package com.atguigu.design.creational.abstractFactory;

public class RacingCarFactory extends CarFactory {
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }

}
