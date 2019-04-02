package com.myself.geo.simplefactory;

public class Test {
    public static void main(String[] args) {
        Car byd = CarFactory.getCar("byd");
        Car audi = CarFactory.getCar("audi");
        byd.run();
        audi.run();
    }
}
