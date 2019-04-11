package com.myself.geo.proxy.cglb;

public class Client {
    public static void main(String[] args) {

        HelloInterceptor interceptor = new HelloInterceptor();
        HelloImpl instance = (HelloImpl)interceptor.getInstance(HelloImpl.class);
        instance.say();
    }
}
