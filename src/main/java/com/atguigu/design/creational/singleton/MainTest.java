package com.atguigu.design.creational.singleton;

public class MainTest {
    public static void main(String[] args) {
        Person p1 = Person.singlePerson();
        Person p2 = Person.singlePerson();
        System.out.println(p1 == p2);
        return;
    }
}
