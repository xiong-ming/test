package LinkedHashSet;
/*
java.util.linkedHashSet集合 extends HashSet
LinkedHashSet集合特点：
底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素储存
顺序，保证元素有序。）
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MAIN {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("yyy");
        System.out.println(set);//[abc, www, yyy]无序且不允许重合

        LinkedHashSet<String> linked =new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("yyy");
        System.out.println(linked);//[www, abc, yyy]有序且不重合

    }
}
