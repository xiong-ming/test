package LinkedList和ArrayList;

import java.util.LinkedList;

/*
java.util.ArrayList集合 implements list接口
java.util.LinkedList集合 implements list接口
Arraylist集合的特点：
1.底层是一个可以扩充数组结构：查询快，增减慢
2.可以用索引的方式获取元素
Linkedlist集合的特点：
1.底层是一个链表结构：查询慢，增删快
2.里面包含着大量操作首尾元素的方法
注意：使用LinkedList集合特有的方法，不能使用多态
     ArrayList的方法和linkedList方法一样
 */
public class Main {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        LinkedList<String> linked=new LinkedList<>();

        //添加方法
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);


        //添加首尾的方法
        linked.addFirst("www");
        linked.push("yyy");//等效于上一句
        linked.addLast("xxx");
        System.out.println(linked);

        //获取链表首位的方法
        String first=linked.getFirst();
        String last=linked.getLast();
        System.out.println(first+last);



       //移除链表相关元素的方法
        String first1=linked.removeFirst();
        String first2=linked.pop();//等效于上一句
        String last1=linked.removeLast();
        System.out.println(first1+last1);
        System.out.println(linked);

        //是否为空
        System.out.println(linked.isEmpty());

        //索引的方式
        linked.add(2,"熊鸣");
        linked.remove(3);
        System.out.println(linked);



        //遍历
        for(String i:linked){
            System.out.println(i);
        }

        //清空链表的方法
        linked.clear();
        System.out.println(linked);


    }
}
