package com.concurrent;

public class TimeWaitingStatusExample {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("正在运行的线程名称："+Thread.currentThread().getName()+" 开始");
            try {
                Thread.sleep(20000);    //延时2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("正在运行的线程名称："+Thread.currentThread().getName()+" 结束");
        },"TIME_WAITING").start();
    }
}
