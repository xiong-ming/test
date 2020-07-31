package Set;

import java.util.HashSet;
import java.util.Set;

/*
java.util.set接口 extends Collection接口
set接口的特点：
1.不允许储存重复的元素
2.没有索引，没有带索引的方法，也不能用普通的for循环进行遍历
3.有两个实现类：HashSet和HashMap；
java.util.HashSet接口 implements Set接口
HashSet的特点：
1.不允许储存重复的元素
2.没有索引，没有带索引的方法，也不能用普通的for循环进行遍历
3.是一个无序的集合，储存和取出元素可能不一致
4.底层是一个Hash表结构(查询速度非常快)


*/
public class Main {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(111);
        set.add(333);
        set.add(222);
        set.add(111);

        for (Integer i:set){
            System.out.println(i);
        }
    }
}
