package HashSet集合储存元素不重合原理;
/*
1.计算字符串的hash值，然后将其放在对应的横向数组中，挂在对应的链表下
继续计算下一个hash值，
2.如果hash值不同，放在横向数组另一个内存中
  如果hash值相同，看元素是不是一样。
  如果元素不一样，放在对应的的横向数组中，继续往后挂在链表的下一个。
  如果元素一样，直接舍弃。
 */

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]

    }
}
