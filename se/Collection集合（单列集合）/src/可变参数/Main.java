package 可变参数;
/*
可变参数原理：可变参数底层就是一个数组，根据传递参数个数不同，会创建不同
            长度的数组，来储存这些参数。
前提：参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数。
格式：修饰符 返回值类型 方法名（数据类型...变量名）{}
注意事项：(要和增强for循环搭配使用)
1.一个方法的参数列表，只能有一个可变参数
2.如果方法的参数有多个，那么可变参数必须放在参数列表的末尾
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(add());
        System.out.println(add(10));
        System.out.println(add(10,20,30,40,50,60,70,80,90,100));
        method("daj",2.00,222,4,2,2,2);


    }

    public static int add(int...arr){
        int sum=0;
        for (int i : arr) {//增强for循环的简写：参数名.for
            sum+=i;
        }
        return sum;
    }

    /*public static int add(int...a,String...b){}
    错误，只能有一个可变参数*/

    public static void method(String d, double c, int... a){
        for (int i : a) {
            System.out.println(d+c+i);
        }


    }


}
