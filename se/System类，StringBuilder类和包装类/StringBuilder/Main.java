package StringBuilder;
/*
1.String和StringBuilder的区别：
String：底层是被final修饰的数组，不能改变。"a"+"b"+"c","ab","abc"占据5个内存
StringBuilder：没有beofinal修饰，长度可变。始终是一个数组，空间小，效率高，自动扩容。
2.StringBuilder的常用方法：
（1）//StringBuilder b3=b1.append("123");
append方法返回值是this，也就是b1，所以b1也变了。所以b1和b3地址值和数值都相等
所以无需接收返回值，直接b1.append("123");
甚至b1.append(5).append("a").append("#");这样串联调用，链式编程。
注意：传入的添加参数可以是任何数据类型的字符串
 */

public class Main {
    public static void main(String[] args) {
        medo01();
        medo02();


    }

    private static void medo02() {
        StringBuilder b1=new StringBuilder();
        StringBuilder b3=b1.append("123");
        System.out.println(b1);//123
        System.out.println(b3);//123
        System.out.println(b1==b3);//true,==比较的时地址值，同一个对象
        b1.append("456");
        b1.append("kipk@#13d");
        //或者串联调用,基于返回值给自身的特性
        b1.append(5).append("a").append("#");
        System.out.println(b1);
        System.out.println(b1.reverse());
    }

    private static void medo01() {
        StringBuilder b1=new StringBuilder();
        StringBuilder b2=new StringBuilder("abc");
        System.out.println(b1);//什么都没有
        System.out.println(b2);//abc
    }
}
