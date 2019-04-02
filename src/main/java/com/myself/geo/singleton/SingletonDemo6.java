package com.myself.geo.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 懒汉式（基于反射破解）
 * 真正使用的时候在加载
 * 多个线程调用时需要等待，调用效率低
 */
public class SingletonDemo6 implements Serializable {
    //1 私有构造方法
    //2 静态属性
    //3 对外提供方法 synchronzed
    private static SingletonDemo6 instance;

    private SingletonDemo6(){
        if(instance != null){
            throw new RuntimeException();//防止反射
        }
    }

    //加sunchronized ，调用效率低
    public static synchronized SingletonDemo6 getInstance(){
        if(instance == null){
            instance = new SingletonDemo6();
        }
        return instance;
    }


    //反序列化时，如果定义了readResolve()则直接返回此方法的对象，而不需要单独再创建新对象
    private Object readResolve() throws ObjectStreamException{
        return instance;
    }

}
