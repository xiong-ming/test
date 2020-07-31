package 多态的使用特点;
/*
变量的调用：编译看父，运行看父
方法的调用：编译看父，运行看子
*/

public class Demo01 {
    public static void main(String[] args) {
        Fu obj=new Zi();//多态
        obj.method();//父有，优先用子
        obj.methodFu();//父有，优先用子，子没有再往上用父
        //obj.methodZi();父没有，报错，编译都有问题
        //System.out.println(num1);变量都是父，没有，报错
    }
}
