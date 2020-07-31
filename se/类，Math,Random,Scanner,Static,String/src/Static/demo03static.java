package Static;
/*
静态代码块的格式：
public class 类名称{
    static{
    //静态代码块内容
    }
}
特点：当第一次用到本类，静态代码块执行唯一一次；
静态内容总是优先于非静态，所以静态块总是比构造方法先执行。
典型用途：用一次性地对静态成员变量进行赋值。
*/

public class demo03static {
    public static void main(String[] args) {
        Person one=new Person();
        Person two=new Person();
        System.out.println();
    }
}
