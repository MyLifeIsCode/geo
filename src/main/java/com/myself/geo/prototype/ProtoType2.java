package com.myself.geo.prototype;

import lombok.Data;

import java.util.Date;

@Data
public class ProtoType2 implements Cloneable {

    private String name;
    private Date birthday;

    private Propertie propertie;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        ProtoType2 protoType2 = (ProtoType2)super.clone();
        protoType2.birthday =(Date) this.birthday.clone();
        protoType2.propertie =(Propertie) this.propertie.clone();
        return protoType2;
    }
}
