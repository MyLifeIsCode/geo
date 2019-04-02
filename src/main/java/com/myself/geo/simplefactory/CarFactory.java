package com.myself.geo.simplefactory;

public class CarFactory {

    public static Car getCar(String type){
        if(type.equals("audi")){
            return new Audi();
        }else {
            return new Byd();
        }
    }
}
