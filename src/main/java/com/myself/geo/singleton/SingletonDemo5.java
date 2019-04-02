package com.myself.geo.singleton;

/**
 * 枚举单利
 * 目前最为安全的实现单例的方法是通过内部静态enum的方法来实现，因为JVM会保证enum不能被反射并且构造器方法只执行一次。
 * 实现方法如下：
 * 但是这个不是懒加载
 */
public enum SingletonDemo5 {

    //这个枚举元素，本身就是单例对象！
    INSTANCE;

    //添加自己需要的操作！
    public void singletonOperation(){
    }


}
