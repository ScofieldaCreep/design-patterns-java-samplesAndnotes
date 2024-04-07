package com.atguigu.design.creational.singleton;

public class Person {
    private String name;
    private String age;

    /**
     * 在Java中，volatile是一个特殊的修饰符，主要用于确保多线程环境下变量的可见性和顺序性。
     * 可见性：当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去主存中读取新值。而普通的共享变量不能保证可见性，因为线程有自己的工作内存，线程操作共享变量时会先把共享变量的值存储到自己的工作内存，然后进行操作，操作完成后再写回主存，这样如果有多个线程同时操作一个变量，就可能会出现读脏数据的问题。
     * 顺序性：Java内存模型中，允许编译器和处理器对指令进行重排序，但是介入volatile变量的指令不能进行重排序。这个特性也被称为happens-before原则，即在一个volatile变量前的写操作都不会被编译器和处理器重排序到volatile变量后的写操作。
     * 在你的代码中，private volatile static Person instance = new Person();这行代码中的volatile关键字用于确保instance在多线程环境下的可见性和顺序性，这是实现双重检查锁定（Double-Checked Locking）单例模式的关键
     */
    private volatile static Person instance = new Person();
    // 这也是一种方法    private final static Person instance = new Person();

    // 构造器私有，外部不能实例化
    private Person() {
        System.out.println("创建了Person");
    }

    /**
     * Static的意义：
     * 在Java中，static关键字有几个主要的用途：
     * 创建类级别的变量和方法：static关键字可以用于创建类级别的变量和方法。这意味着，这些变量和方法不是属于任何特定的实例，而是属于类本身。因此，即使没有创建类的实例，也可以访问它们。
     * 实现单例模式：static关键字在实现单例模式时非常有用。单例模式是一种设计模式，它确保一个类只有一个实例，并提供一个全局访问点。在这种情况下，static关键字用于创建一个只有一个实例的类。
     */
    // 方法一：synchronized 确保多个人同时调用这个方法时不会同时创建多个对象
    // 但是锁太大，效率很低，synchronized锁的是整个类？不确定
    public static synchronized Person singlePerson1() {
        return instance;
    }

    // 双重检查锁，只有在多个人真的同时到了instance == null 这一步之后才触发锁，触发后只有第一个人创建instance = new Person()，其余人在进入他们的锁后检查 instance == null
    // 失败后就退出了
    // 但是这个操作不是atomic？可能因为这个，所以要加volatile
    public static Person singlePerson() {
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }
}
