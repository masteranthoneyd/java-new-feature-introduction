package com.yangbingdong.java.newfeat.introduction;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Java21VirtualThread {
    public static void main(String[] args) {

        // 1、通过 Thread.ofVirtual() 创建
        Runnable fn = () -> {
            // your code here
        };

        Thread thread = Thread.ofVirtual()
                .start(fn);

        // 2、通过 Thread.startVirtualThread() 、创建
        Thread thread2 = Thread.startVirtualThread(() -> {
            // your code here
        });

        // 3、通过 Executors.newVirtualThreadPerTaskExecutor() 创建
        var executorService = Executors.newVirtualThreadPerTaskExecutor();

        executorService.submit(() -> {
            // your code here
        });

        class CustomThread implements Runnable {
            @Override
            public void run() {
                System.out.println("CustomThread run");
            }
        }

        //4、通过 ThreadFactory 创建
        CustomThread customThread = new CustomThread();
        // 获取线程工厂类
        ThreadFactory factory = Thread.ofVirtual().factory();
        // 创建虚拟线程
        Thread thread3 = factory.newThread(customThread);
        // 启动线程
        thread3.start();

    }
}
