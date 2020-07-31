package Demo01接口定义的基本格式和抽象方法的定义和使用;
/*
接口就是多个类的公共规范
接口是一种引用数据类型，最重要的内容就是其中的抽象方法
格式：
pubilc interface 接口名称{//就是将class换成interface
      //接口内容
}
备注：换成了关键字interface之后，编译生成的字节码文件仍然是：java.class
1.常量
2.抽象方法
3.默认方法
4.静态方法
5.私有方法
接口的使用步骤：
1.创建接口，写上抽象方法。（interface）
接口不能直接使用,必须要有一个实现类来实现接口，格式：
public class 实现类名称 implements 接口名称{
...
}
2.创建接口实现类。（class）
接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
实现：去掉abstract关键字，加上方法体大括号。
3.创建main函数的类。（class）
创建实现类的对象，进行使用。
注意事项：如果实现类没有覆盖重写接口中所有的抽象方法，那么这个实现类直接就必须时抽象类
        抽象类不能直接new对象出来。
 */

public class Interface {
    public static void main(String[] args) {
         //错误写法，不能直接new接口对象使用
         //MyinterfaceAbstract inter=new MyinterfaceAbstract();
        //创建实现类的对象使用
        MyinterfaceAbstractImpl impl=new MyinterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
