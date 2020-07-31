package 匿名内部类多线程的创建;
/*
匿名内部类的作用：简化代码
把子类继承父类，重写父类方法，创建子类对象一步合成
把实现类实现接口，重写接口的方法，创建实现类对象合成一步完成
格式：
new 父类/接口(){
重复父类/接口中的方法
}；

 */

import Thread类的常用方法.MyThread;

public class Main {
    public static void main(String[] args) {
        /*之前的做法：
          线程的父类是Thread
                new MyThread().start();*/
        new Thread(){
            //重写run方法，设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"黑马");
                }
            }
        }.start();

        //线程的接口Runnable
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"程序员");
                }
            }
        };
        new Thread(r).start();

        //接口的简化方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"-->"+"程序员");
                }
            }
        }).start();
    }
}
