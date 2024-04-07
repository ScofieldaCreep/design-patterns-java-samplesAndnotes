package com.atguigu.design.creational.abstractFactory;

public class CommonMask extends AbstractMask {
    public CommonMask() {
        price = 1;
    }

    @Override
    public void protectMe() {
        System.out.println("普通口罩，及时更换！！");
    }
}
