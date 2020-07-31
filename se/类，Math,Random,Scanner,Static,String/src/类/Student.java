package 类;
/*成员变量（属性），成员方法（行为）
注意事项：
1.成员变量是直接定义在类当中，在方法外
2.成员方法不要写static关键字
类的使用：通常情况下一个类不能直接使用，需要更加类创建一个对象，才能使用
1.导包：一般需要指出使用的类，在什么位置
格式：import 包名称.类名称;
和当前类属于同一包的情况下，可以省略包语句不写
2.创建：类名称 对象名=new 类名称();  eg:Student stu=new Student();
3.使用:
使用成员变量：对象名.成员变量名
使用成员方法：对象名。成员方法名(参数)
（也就是用谁点谁）

*/

public class Student {
    //属性
    int age;
    String name;
    //方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("学习");
    }
}
