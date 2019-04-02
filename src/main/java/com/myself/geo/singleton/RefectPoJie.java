package com.myself.geo.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射，反序列化破解
 */
public class RefectPoJie {
    public static void main(String[] args) throws Exception {
        SingletonDemo6 s1 = SingletonDemo6.getInstance();
        SingletonDemo6 s2 = SingletonDemo6.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        //通过反射直接调用私有构造器
//        Class<SingletonDemo6> clazz = (Class<SingletonDemo6>)Class.forName("com.myself.geo.singleton.SingletonDemo6");
//        Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);//设置可以访问私有方法
//        SingletonDemo6 s3 = c.newInstance();
//        SingletonDemo6 s4 = c.newInstance();
//        System.out.println(s3);
//        System.out.println(s4);

        //通过反序列化构造多个兑现

        FileOutputStream fos = new FileOutputStream("D:/a.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();
        fos.close();

        ObjectInputStream pos = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        SingletonDemo6 s5 = (SingletonDemo6)pos.readObject();
        System.out.println(s5);
    }

}
