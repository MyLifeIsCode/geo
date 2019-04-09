package com.myself.geo.adapter;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void handleReq() {
        adaptee.handler();
    }
}
