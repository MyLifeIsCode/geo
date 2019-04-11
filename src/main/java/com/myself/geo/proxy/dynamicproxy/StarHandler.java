package com.myself.geo.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {
    Star realStart;

    public StarHandler(Star realStart) {
        this.realStart = realStart;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before something");
        method.invoke(realStart,args);
        System.out.println("after something");
        return null;
    }
}
