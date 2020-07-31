package of方法往及合作添加元素;
/*
jdk9新特性：
list接口，set接口，map接口：里面增加了一个静态方法of，可以给集合一次性添加多个元素，
list/set/map.of();
使用前提：
当集中储存的元素个数已经确定，不再改变时使用。
注意：
1.of方法只适用于list接口，set接口，map接口，不能适用于其他接口。
2.不能再添加add方法和put方法添加元素，会抛出异常。
3.set接口和map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list=List.of("a","b","a","c","d");
        System.out.println(list);
        /*list.add("w");抛出异常
        System.out.println(list);*/

        Set<String> set= Set.of("a","b","c","d");
        System.out.println(set);
       /* set.add("a");会抛出异常
        System.out.println(set);*/

        Map<Integer,String> map= Map.of(1,"one",2,"two");
        System.out.println(map);
        /*map.put(3,"three");
        System.out.println(map);*/
    }
}
