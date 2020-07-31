package Debug追踪;
/*
Debug调式程序：
可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug。
使用方式：
在行号的右边，鼠标左键单击，添加断点（每个方法的第一行，哪里有bug添加到哪里）
右键，选择Debug执行程序
程序就会停留在第一个断点处
执行程序：
f8：逐行执行程序
f7：进入到方法
shift+f8：跳出方法
f9：跳到下一个断点，如果没有下一个断点，那么就结束程序
ctrl+f2：退出Debug模式，停止程序
constsole：切换到控制台
 */

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
        print();
    }

    private static void print() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
}
