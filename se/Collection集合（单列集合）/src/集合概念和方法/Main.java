package 集合概念和方法;
/*
数组和集合的区别
1.数组的长度是固定的，集合的长度是可变的
2.数组储存同一类型的元素，可以实基本数据类型值。集合都是对象，对象类型可不一样。
注意：Collection的添加方法是add方法，Map的添加方法是put方法
 */

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();//多态，左接口右边实现类
        c.add("hello");//添加
        c.add("world");
        c.add("heima");
        c.add("java");
        System.out.println(c);

        boolean result=c.remove("hello");//删除
        System.out.println(result);//true
        System.out.println(c);

        /*c.clear();             //清除
        System.out.println(c);*/

        boolean s=c.contains("java");//判断包含
        System.out.println(s);
        System.out.println(c);

        System.out.println(c.isEmpty());//是否为空

        System.out.println(c.size());//长度

        Object[] arr =c.toArray();//将集合转为数组
        //遍历
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
