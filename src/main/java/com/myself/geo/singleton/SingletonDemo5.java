package com.myself.geo.singleton;

/**
 * 枚举单利
 * 目前最为安全的实现单例的方法是通过内部静态enum的方法来实现，因为JVM会保证enum不能被反射并且构造器方法只执行一次。
 * 实现方法如下：
 * 但是这个不是懒加载
 */
public class SingletonDemo5 {

    private SingletonDemo5(){}
    public static SingletonDemo5 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton{
        INSTANCE;

        private SingletonDemo5 singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new SingletonDemo5();
        }
        public SingletonDemo5 getInstance(){
            return singleton;
        }
    }
}
