package Thread创建多线程程序;
/*
创建多线程的第一种方式：创建Thread类的子类
java.util.Thread类：是描述线程的类，我们要实现多线程程序，就必须继承Tread类
实现步骤：
1.创建一个Thread类的子类
2.在Thread类的子类中重写Thread类中的run方法，设置线程任务（开启线程要做什么）
3.创建Thread的类的子类对象
4.调用Thread类中的start方法，开启新的线程，执行run方法
void start()使该线程开始执行，java虚拟机调用该方法的run方法。
结果是两个线程并发进行，当前线程（main线程）和另一个线程（创建的新线程，执行其run方法）
多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动。
java程序中属于抢占式调度，哪个线程优先级高，哪个线程优先执行；同一优先级，随机选一个执行。
 */

public class Main {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main:"+i);
        }
    }
}
