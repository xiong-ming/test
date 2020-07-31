package Thread类的常用方法;

public class Main {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        new MyThread().start();
        new MyThread().start();
        //睡眠执行
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
