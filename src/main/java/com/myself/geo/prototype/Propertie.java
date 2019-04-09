package com.myself.geo.prototype;

import lombok.Data;

@Data
public class Propertie implements Cloneable{
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
