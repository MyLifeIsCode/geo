package com.myself.geo.singleton;

/**
 * 静态内部类实现
 * 这种方式线程安全，调用效率高，并且实现延迟加载
 * //线程安全
 *     //调用效率高
 *     //懒加载
 */
public class SingletonDemo4 {

    //初始化SingletonDemo4的时候不会立即加载SingletonClassInstance，只有在getInstance 的时候才会加载
    //1 私有构造方法
    //2 共有方法
    //3 静态内部类
    private static class SingletonClassInstance{
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4(){}

    //不需要同步
    public static SingletonDemo4 getInstance(){
        return SingletonClassInstance.instance;
    }
}
