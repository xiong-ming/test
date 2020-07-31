package Collections集合工具类的方法;

import java.util.ArrayList;
import java.util.Collections;
/*
java.utils.Collections是集合工具类，用来对集合进行操作
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);//[a, b, c, d, e]

        //集体添加一些元素
        ArrayList<Integer> list1=new ArrayList<>();
        Collections.addAll(list1,3,2,1,4,5);
        System.out.println(list1);//[ 3, 2, 1, 4, 5]

        //打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list);//[a, e, d, b, c]

        //默认（升序）排列
        Collections.sort(list1);
        System.out.println(list1);//[1, 2, 3, 4, 5]

        //自定义排序，先创建一个类，在里面
        ArrayList<Person> list3=new ArrayList<>();
        list3.add(new Person("张三",21));
        list3.add(new Person("李四",19));
        list3.add(new Person("王五",20));
        System.out.println(list3);

        Collections.sort(list3);
        System.out.println(list3);





    }
}
