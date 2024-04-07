package com.atguigu.design.creational.builder;

public class XiaomiBuider extends AbstractBuilder {

    public XiaomiBuider() {
        phone = Phone.builder().build();
    }

    @Override
    AbstractBuilder customCPU(String cpu) {
        phone.cpu = cpu;
        // return phone; 这样不行
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }
}
