package ArrayList;

import java.util.ArrayList;
/*
数组的长度不能发生改变，但ArrayList的集合长度是可以随意变化的(只有这个区别)
对于ArrayList<E>,<E>表示泛型
泛型：集合中的所有元素，全都是统一的类型
注意；泛型只能是引用类型，不能是基本类型
* */

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//[]
        list.add("1m");
        list.add("2m");
        list.add("3m");
        list.add("4m");
        System.out.println(list);//[1m, 2m, 3m, 4m]
    }
}
