package 主线程;
/*
主线程：执行主方法（main）的线程
单线程程序：java程序中只有一个线程
执行从main方法开始，从上到下依次执行
 */

public class Main {
    public static void main(String[] args) {
        Person p1=new Person("小强");
        p1.run();
        System.out.println(0/0);//单线程一旦中间报错，后面的就不能执行，所以要用多线程。
        Person p2=new Person("旺财");
        p2.run();

    }
}
