package HashMap储存自定义类型键值;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
注意：为什么String的天然不重复，而自己定义的类可以重复？
因为前者是系统方法，帮我们重写了hashmap和equals方法，而后者属于自定义类，要自己重写toString
和hashmap及equals方法
 */

public class Main {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        HashMap<Person,String> map=new HashMap<>();
        map.put(new Person("女皇",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女皇",18),"毛里求斯");
        Set<Person> set=map.keySet();
        for (Person person : set) {
            String value=map.get(person);
            System.out.println(person+"--->"+value);
            //注意里面的key（Person）重复了，但是依旧输出了，在Person类里面要加
            //hashmap方法和equals方法（Set方法不可重复，要用此法）。
        }
    }

    /*
    HashMap储存自定义类型键值
    key：String类型
         String类型储存了hashcode方法和equals方法，可以确保key唯一
    value：Person类型，value可以重复（同名，同年龄的人视为同一个）
     */
    private static void show01() {
        HashMap<String,Person> map=new HashMap<>();//创建容器
        Person p1=new Person("张三",18);
        Person p2=new Person("李四",19);
        Person p3=new Person("王五",20);
        Person p4=new Person("赵六",21);
        map.put("北京",p1);
        map.put("上海",p2);
        map.put("广州",p3);
        map.put("北京",p4);
        //遍历
        Set<String> set=map.keySet();
        for (String key : set) {
            Person value=map.get(key);
            System.out.println(key+"--->"+value);
        }


    }
}
