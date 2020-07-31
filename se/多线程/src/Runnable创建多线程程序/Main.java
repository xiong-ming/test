package Runnable创建多线程程序;
/*
创建多线程程序的第二种方式：实现Runable接口
java.lang.Runnable
实现步骤：
1.创建一个Runnable接口的实现类
2.再实现类中重写Runnable接口的run方法，设置线程任务。
3.创建一个Runnable接口的实现类对象
4.创建Thread类对象，构造方法中传递Runnable接口的实现对象
5.调用Thread类中的start方法，开启新的线程执行run方法。

区别：
实现Runnable接口创建多线程的好处
1.避免了单继承的局限性：
一个类只能继承一个类，类继承了Thread类就不能在继承其他的类了，
但是实现了Runnable接口，还可以实现其他的接口，继承其他的类
2.增强了程序的扩展，降低了程序的耦合性
实现Runnable接口的方式，吧设置线程任务和开启线程进行了分解（解耦）
实现类中，重写了run方法，用来设置线程任务
创建Thread类对象，调用s'tart方法，用来开启新线程
 */

public class Main {
    public static void main(String[] args) {
        RunnableImpl run=new RunnableImpl();
        RunnableImpl2 run2=new RunnableImpl2();
        Thread t=new Thread(run);
        Thread t2=new Thread(run2);
        t.start();
        t2.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);

        }
        for (int i = 0; i <20 ; i++) {
            System.out.println("hellojava");

        }
    }
}
