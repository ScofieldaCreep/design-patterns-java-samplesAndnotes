package com.atguigu.design.creational.abstractFactory;

public class N95 extends AbstractMask {
    public N95() {
        this.price = 2;
    }

    @Override
    public void protectMe() {
        System.out.println("N95 nb");
    }
}
