package com.atguigu.design.creational.abstractFactory;

public class CommonMaskFactory extends MaskFactory {

    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }
}
