package com.myself.geo.prototype;

import lombok.Data;

import java.util.Date;

@Data
public class ProtoType1 implements Cloneable {
    private String name;
    private Date birthday;
    private Propertie propertie;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
