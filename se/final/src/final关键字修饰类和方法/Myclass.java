package final关键字修饰类和方法;
/*
格式：
public final class{
    //...
}
含义：当前这个类不能有任何子类（太监类）：有父无子，香火断了
没有子类来继承这个类，所有不会有任何的覆盖重写。

修饰方法可以类比，一个意思
 */

public final class Myclass extends Object {
    public void method(){
        System.out.println("方法执行");
    }
}
