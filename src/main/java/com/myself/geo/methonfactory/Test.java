package com.myself.geo.methonfactory;

public class Test {
    public static void main(String[] args) {
        Car car = new BydFactory().getCar();
        Car car2 = new AutiFactory().getCar();

        car.run();
        car2.run();
    }
}
