package com.atguigu.design.creational.factory.factorymethod;

public class MainTest {
    public static void main(String[] args) {
        // 实现了多态
        AbstractCarFactory carFactory = new RacingCarFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();

        carFactory = new VanCarFactory();
        abstractCar = carFactory.newCar();
        abstractCar.run();
    }
}
