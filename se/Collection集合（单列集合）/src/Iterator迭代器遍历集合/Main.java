package Iterator迭代器遍历集合;
/*
概念：
1.Interator迭代器，是一个接口，无法直接使用，Collection接口有一个方法，
叫interator(),这个方法返回的就是就是迭代器的实现类方法。
2.使用集合方法interator()获取迭代器的实现类对象使用Interator接收。（多态）
3.interator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
注意：
迭代器里面String e=it.next();next有两层含义：
1.获取当前位置的对象 2.将指针指向下一个位置
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("111");
        coll.add("222");
        coll.add("333");
        coll.add("444");
        coll.add("555");
         //接口                 方法获取迭代器实现类    多态
        Iterator<String> it=coll.iterator();
        while(it.hasNext()){
            String e=it.next();//next有两层含义：1.获取当前位置的对象
            //将指针指向下一个位置2.
            System.out.println(e);
        }
        //也可以用增强for循环简化迭代器，同样可以实现
        for(String i:coll){
            System.out.println(i);
        }
    }
}
