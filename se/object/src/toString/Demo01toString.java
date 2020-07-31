package toString;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
直接打印对象的地址值没有意义，需要重写Object的toString方法。 打印对象属性(name,age )
直接打印对象的名字，其实就是调对象的toString方法
看一个类是否重写了toString方法，直接打印这个类对应的名字即可
如过重写了，就会按照重写的方式打印，否者打印出的是地址
 */

public class Demo01toString {
    public static void main(String[] args) {
        Person person=new Person("张三",18);
        String s=person.toString();

        System.out.println(s);//toString.Person@7c30a502
        System.out.println(person);//toString.Person@7c30a502
        Random r=new Random();
        System.out.println(r);//java.util.Random@dfd3711（没有重写）
        Scanner scanner=new Scanner(System.in);
        System.out.println(scanner);
        ArrayList<Integer> list=new ArrayList<>();//很长，但不是字符串（重）
        list.add(1);
        list.add(2);
        System.out.println(list);//[1, 2]（重）


    }
}
