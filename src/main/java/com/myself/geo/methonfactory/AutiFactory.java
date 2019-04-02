package com.myself.geo.methonfactory;

public class AutiFactory implements CarFactory{

    public Car getCar(){
        return new Audi();
    }
}
