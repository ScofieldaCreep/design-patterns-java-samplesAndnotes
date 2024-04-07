package com.atguigu.design.creational.prototype;

public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyMybatis mybatis = new MyMybatis();
        User z1 = mybatis.getUser("zhangsan");
        System.out.println("1-->" + z1);
        z1.setUserName("lisi");
        System.out.println("z1 changed name");
        System.out.println("1-->" + z1);

        User z2 = mybatis.getUser("zhangsan");
        System.out.println("2-->" + z2);
        z2.setUserName("wangwu");
        System.out.println("z2 changed name");
        System.out.println("2-->" + z2);
        User z3 = mybatis.getUser(z2.getUserName());
        System.out.println("3-->" + z3);
        User z4 = mybatis.getUser(z3.getUserName());
        System.out.println("4-->" + z4);

    }
}
