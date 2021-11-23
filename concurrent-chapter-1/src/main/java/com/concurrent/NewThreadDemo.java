package com.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class NewThreadDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<String> futureTask = new FutureTask<>(()-> {
            String result = "执行结果：SUCCESS";
            System.out.printf("当前线程为：%s,执行结果：SUCCESS%n",Thread.currentThread().getName());
           return  result;
        });
        Thread thread1 = new Thread(futureTask);
        thread1.start();
        System.out.println(String.format("result:{}",futureTask.get()));

        System.out.println("主线程执行完毕...");
    }
}
