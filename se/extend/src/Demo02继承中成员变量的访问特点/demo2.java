package Demo02继承中成员变量的访问特点;
/*
在父子类关系继承中，如果成员变量重名，则创建子类对象时，访问有两种方式：
直接通过子类对象访问成员变量：
等号左边是谁,就优先用谁，没有则往上找
间接通过成员方法访问成员变量:
该方法在哪，就优先用谁，没有就往上找
 */

public class demo2 {
    public static void main(String[] args) {
        fu f=new fu();
        System.out.println(f.numfu);//10
        zi z=new zi();
        System.out.println(z.numfu);//10
        System.out.println(z.numzi);//20
        System.out.println("===================");

//        等号左边是谁就优先用谁
        System.out.println(z.num);//优先子类，200
//        System.out.println(z.abc);到处都没有，编译出错
        z.methodzi();//200
        z.methodfu();//100

    }
}
