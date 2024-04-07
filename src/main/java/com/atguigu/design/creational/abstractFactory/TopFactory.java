package com.atguigu.design.creational.abstractFactory;

public abstract class TopFactory {
    // List<String> rules， 这里抽象工厂可以让后面的工厂集成这个规章制度，这就是比Interface多出来的功能
    abstract AbstractCar newCar();

    abstract AbstractMask newMask();
}
