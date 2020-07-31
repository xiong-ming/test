package LinkedHashmap;
/*
java.util.linkedHashMap<k,v>extends HashMap<k,v>
底层原理：
哈希表+链表（记录元素的顺序）
 */

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);//{a=d, b=b, c=c}无序，key不重复
        LinkedHashMap<String,String> linked=new LinkedHashMap<>();
        linked.put("a","a");
        linked.put("c","c");
        linked.put("b","b");
        linked.put("a","d");
        System.out.println(linked);

    }
}
