package com.myself.geo.adapter;

public class Client {

    public void handlerReq(Target target){
        target.handleReq();
    }

    public static void main(String[] args) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        client.handlerReq(adapter);
    }
}
