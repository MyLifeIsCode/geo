package com.myself.geo.prototype;


import java.util.Date;

public class Client1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        ProtoType1 protoType1 = new ProtoType1();
        protoType1.setName("name1");
        protoType1.setBirthday(date);
        Propertie propertie = new Propertie();
        propertie.setName("haha");
        protoType1.setPropertie(propertie);
        ProtoType1 protoType2 =(ProtoType1) protoType1.clone();
        propertie.setName("hehe");

        System.out.println(protoType1.getPropertie().getName());
        System.out.println(protoType2.getPropertie().getName());
//        protoType1.setBirthday(new Date(111111111L));
//        System.out.println(protoType1);
//        System.out.println(protoType2);

    }
}
