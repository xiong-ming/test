package Math;
/*
是java.util.Math类数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作。
public static double abs(double num):获取绝对值
public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入
*/
public class demo01Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.ceil(3.14));//4.0
        System.out.println((int)Math.ceil(3.14));//4,进行强制转换了
        System.out.println(Math.floor(3.14));//3.0
        System.out.println(Math.round(3.14));//3

    }
}
