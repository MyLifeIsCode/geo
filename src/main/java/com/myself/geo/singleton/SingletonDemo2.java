package com.myself.geo.singleton;

/**
 * 懒汉式
 * 真正使用的时候在加载
 * 多个线程调用时需要等待，调用效率低
 */
public class SingletonDemo2 {
    //1 私有构造方法
    //2 静态属性
    //3 对外提供方法 synchronzed

    private SingletonDemo2(){}
    private static SingletonDemo2 instance;

    //加sunchronized ，调用效率低
    public static synchronized SingletonDemo2 getInstance(){
        if(instance == null){
            instance =  new SingletonDemo2();
        }
        return instance;
    }


}
