package com.atguigu.design.creational.builder;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
public class Phone {
    public String cpu;
    protected String mem;
    protected String disk;
    protected String cam;

    public String getCPU() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getDisk() {
        return disk;
    }

    public String getCam() {
        return cam;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }
}
