package com.myself.geo.singleton;

/**
 * 饿汉式模式
 * 线程安全，加载类的时候是一个天然线程安全模式，饿汉式在类初始化的时候立即加载
 */
public class SingletonDemo1 {
    //1 构造器私有
    //2 提供一个静态私有属性
    //3 对外暴漏一个公共方法

    private SingletonDemo1(){}

    private static SingletonDemo1 instance = new SingletonDemo1();//类初始化时立即加载

    //方法，没有同步，效率高
    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
