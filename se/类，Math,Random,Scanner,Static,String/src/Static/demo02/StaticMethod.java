package Static.demo02;
/*
静态方法属于类，不属于对象。
如果没有static关键字，必须首先得创建对象。然后通过对象来使用它。
如果有static关键字，就不要创建对象，直接就能通过类名称来调用它。(成员变量/方法)
格式：类名称.静态变量/静态方法();
注意事项：
1.静态不能访问非静态（秦始皇和毛泽东的关系）
2.静态方法当中不能用this。因为this表示当前对象，但是静态方法默认调用类。
 */

public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.method();
        obj.methodstatic();
        MyClass.methodstatic();//推荐使用，将静态方法的地位凸显出来

        //对于静态方法来说，可以通过对象名来调用，也可以通过直接通过类名来调用
        System.out.println();
        //对于本类当中的静态方法，可以省略类名称。普通方法不行
        mymethod();
        //System.out.println(this);静态方法不能调用this关键字
    }

    public static void mymethod(){
        System.out.println("自己的方法");
    }
}
