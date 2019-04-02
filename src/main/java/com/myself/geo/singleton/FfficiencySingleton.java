package com.myself.geo.singleton;

import java.util.concurrent.CountDownLatch;

public class FfficiencySingleton {

    public static void main(String[] args) throws Exception{

        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        Long startTime = System.currentTimeMillis();
        for (int j = 0;j<10;j++){
            new Thread(()->{
                for (int i=0 ;i<1000000;i++){
                    Object o = SingletonDemo2.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        Long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime);
    }
}
