package com.atguigu.design.creational.builder;

public abstract class AbstractBuilder {
    Phone phone;

    abstract AbstractBuilder customCPU(String cpu);

    abstract AbstractBuilder customMem(String mem);

    abstract AbstractBuilder customDisk(String disk);

    abstract AbstractBuilder customCam(String cam);

    Phone getProduct() {
        return phone;
    }
}
