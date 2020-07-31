package 局部内部类的定义和使用;
/*
从Java8+开始，只要局部变量事实不变，那么final关键字可以省略。
原因：
1.局部变量随着方法走，在栈内当中，方法运行后出栈，局部变量立即消失
2.类通过对象进行调用，new出来的对象在堆中持续存在，知道垃圾回收消失
3.所有内部类类将外部变量copy进来，应该保证变量不变。
 */

public class Myouter {//外部内
    public void methodOuter(){
        int num=10;
        class MyInner{//局部内部类
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
