package Scanner;
import java.util.Scanner;
/*
Scanner类的功能：可以实现键盘输入数据，到程序当中
引用类的一般步骤：
1.导包：
import 包路径 类名称；
若使用的目标类，和当前类在同一包下，则可以省略导包语句不写，
只有java.lang包下的内容不需要导包，其他的都需要import语句
2.创建：
类名称 对象名=new 类名称();
3.使用：对象名.成员方法名
* */

public class demo01Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//固定写法
        //其实所有的next输入的都是字符串类型，后面加什么就是强制转型成该类型
        int num=sc.nextInt();
        String str=sc.next();
        System.out.println("输入的int数是："+num);
        System.out.println("输入的字符串是："+str);

    }
}
