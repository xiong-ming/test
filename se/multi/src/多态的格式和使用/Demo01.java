package 多态的格式和使用;
/*
对象的三大特性：封装，继承(类与类的继承，类与接口的实现，接口和接口的继承)，多态
（多态的前提是继承的那三种情况，extends和implements都可以）
多态里面：
变量的调用：编译看父，运行看父
方法的使用：编译看父，运行看子
 */

public class Demo01 {
    public static void main(String[] args) {
        //使用多态的写法：左侧父类的使用，指向了右侧子类的对象
        Fu obj=new Zi();
        obj.method();//new谁优先用谁，子类找不到，再往上找。
        obj.methodFu();
    }


}
