package com.atguigu.design.creational.factory.simplefactory;

/*
 * 简单工厂
 * 1. 产品数量极少
 * */
public class WulinSimpleFactory {
    public AbstractCar newCar(String type) {
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }
        return null;
    }
}
