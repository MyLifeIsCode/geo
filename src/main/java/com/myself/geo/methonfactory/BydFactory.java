package com.myself.geo.methonfactory;

public class BydFactory implements CarFactory{

    public Car getCar(){
        return new Byd();
    }
}
