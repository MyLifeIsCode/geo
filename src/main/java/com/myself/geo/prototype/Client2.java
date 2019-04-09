package com.myself.geo.prototype;

import java.util.Date;

public class Client2 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        ProtoType2 protoType2 = new ProtoType2();
        protoType2.setName("name2");
        protoType2.setBirthday(date);
        Propertie propertie = new Propertie();
        propertie.setName("haha");
        protoType2.setPropertie(propertie);
        ProtoType2 protoType3 = (ProtoType2)protoType2.clone();
        propertie.setName("hehe");

        System.out.println(protoType2.getPropertie().getName());
        System.out.println(protoType3.getPropertie().getName());

    }
}
