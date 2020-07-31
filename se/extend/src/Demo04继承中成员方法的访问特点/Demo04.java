package Demo04继承中成员方法的访问特点;
/*
在父子类关系继承中，如果成员方法重名，则创建子类对象时，
等号左边是谁,就优先用谁，没有则往上找
注意事项：无论是成员变量还是成员方法，如果没有都上往上找父类的，绝对不会向下找子类。
重写(override):方法的名称一样，参数列表也一样。【覆盖重写】
重载(overload):方法的名称一样，参数列表不一样。
方法覆盖重写特点：创建的是子类对象，则优先使用子类方法
 */
public class Demo04 {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.methodFu();
        zi.methodZi();
        zi.method();
    }
}
