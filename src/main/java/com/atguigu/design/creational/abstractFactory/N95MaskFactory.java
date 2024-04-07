package com.atguigu.design.creational.abstractFactory;

public class N95MaskFactory extends MaskFactory {

    @Override
    AbstractMask newMask() {
        return new N95();
    }
}
