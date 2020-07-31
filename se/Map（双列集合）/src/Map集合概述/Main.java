package Map集合概述;
/*
java.util.Map<K,V>接口
Map集合的特点
1.Map集合是一个双列集合，一个元素包含两个值（一个key值，一个value值）
2.Map集合中的元素，key和value的数据类型可以相同，也可以不同。
3.Map集合中的元素，key值不可以重复，value可以重复
4.Map集合中的元素，key和value一一对应。
Map常用的子类
java.util.HashMap<k,v>集合implements Map<k,v>接口
HashMap集合的特点：
1.HashMap集合的底层是哈希表，查询速度特别快。
2.HashMap集合是一个无序集合，储存元素和取出元素的顺序可能不一致。

Java.util.linkedHashMap<k,v>集合extends HashMap<k,v>集合
linkedHashMap的特点：
1.linkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
2.linkedHashMap集合是一个有序集合，储存元素和取出元素是一致的。


 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        medo01();
        medo02();
    }

    private static void medo02() {
        Map<String,Integer> map=new HashMap<>();

    }

    private static void medo01() {
        //put
        Map<String,String> map=new HashMap<>();
        map.put("a","1");
        map.put("a","2");//key值不能相同，要将前一个覆盖
        map.put("b","2");
        map.put("c","3");
        System.out.println(map);
        //remove
      String s1=map.remove("b");
      String s2=map.remove("d");
        System.out.println(s1);
        System.out.println(s2);//没有找到key值就是null
        System.out.println(map);
        //get
        String v1=map.get("a");
        System.out.println(v1);
        //containkey
        boolean b1=map.containsKey("a");
        boolean b2=map.containsKey("b");
        boolean b3=map.containsValue("2");
        boolean b4=map.containsValue("4");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        //keyset遍历,更喜欢这个
        Set<String> set=map.keySet();//将map里的key全部取出，放入set集合中
        for (String key : set) {
            String value=map.get(key);
            System.out.println(key+"="+value);
        }
        //entryset遍历
        Set<Map.Entry<String,String>> set1=map.entrySet();
        for (Map.Entry<String,String> entry:set1){
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
