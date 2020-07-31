package 增强for循环;
/*
增强for循环：底层使用的也是迭代器，使用for循环格式，简化了迭代器的格式。
public interface Iterable<T>实现这个接口允许成为增强for语句循环的目标。
Collection<E> extends Iterable<E>;所有单列集合都可以使用for循环。

增强for循环；遍历所有的集合和数组。
格式：
for(集合/数组的数据类型 变量名:集合名/数组名){
         sout(变量名);
}
 */

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("111");
        coll.add("222");
        coll.add("333");
        coll.add("444");
        coll.add("555");
        for (String s:coll){
            System.out.println(s);
        }

       int[] arr={1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);
        }
    }
}
