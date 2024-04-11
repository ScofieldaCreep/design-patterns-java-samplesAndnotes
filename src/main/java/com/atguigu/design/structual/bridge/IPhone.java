package com.atguigu.design.structual.bridge;

public class IPhone extends AbstractPhone {

    @Override
    String getPhone() {
        return "IPhone：" + sale.getSaleInfo();
    }
}
