package List集合;
/*
java.util.list接口 extends Collection接口
list接口的特点：
1.有序的集合，储存元素和取出的元素的顺序是一致的（储存123 取出123）
2.有索引，包含了一些带索引的方法。
3.允许储存重复元素。

list中带索引的方法（特有）：如下所示。

 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        System.out.println(list);//输出的不是地址，说明重写了toString方法
        for (String i:list){
            System.out.println(i);
        }
       //在索引位置添加元素的方法
        list.add(3,"熊鸣");
        System.out.println(list);

        //移除c元素：
        String s=list.remove(2);
        System.out.println("被移除的元素："+s);
        System.out.println(list);

        //将最后的a替换成A
        String s1=list.set(4,"AAA");
        System.out.println(s1);
        System.out.println(list);

        //遍历list，有三种方式，普通for循环，迭代器。增强for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String i:list){
            System.out.println(i);
        }



    }
}
