package com.myself.geo.proxy.dynamicproxy;

import com.myself.geo.proxy.staticproxy.ProxyStar;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Star realStart = new RealStar();
        StarHandler starHandler = new StarHandler(realStart);
        Star proxy = (Star)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);

        proxy.bookTicket();
        proxy.sign();
    }
}
