package Thread类的常用方法;
/*
获取线程名称：
1.使用Thread类中的方法getName()
  String name=getName();
2.可以先获取当前到当前正在执行的线程，使用线程中的方法getName()获取线程名称
 */

import jdk.swing.interop.SwingInterOpUtils;

public class MyThread extends Thread {
    @Override
    public void run() {
        String name=getName();
        System.out.println(name);
        //或者第二种方法
        Thread t=Thread.currentThread();
        System.out.println("a"+t);
    }
}
