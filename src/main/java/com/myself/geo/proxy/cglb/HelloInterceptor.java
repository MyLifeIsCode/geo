package com.myself.geo.proxy.cglb;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloInterceptor implements MethodInterceptor {

    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(clazz);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        methodProxy.invokeSuper(o,objects);
        System.out.println("after");
        return null;
    }
}
