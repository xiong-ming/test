package ArrayList;
/*
ArrayList里面常用的方法：
public boolean add(E e);向集合中添加元素，参数的类型和泛型一致
public E
* */

import java.util.ArrayList;

public class 常见方法和遍历 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        //向集合中添加元素
        boolean a=list.add("11");
        System.out.println(list);
        System.out.println("添加是否成功："+a);
        list.add("22");
        list.add("33");
        list.add("44");
        System.out.println(list);
        //从集合中获取元素 list.et();
        String name=list.get(1);
        System.out.println("2号索引位置是："+name);
        //从集合中删除元素 list.remove();
        String rname=list.remove(2);
        System.out.println("被删除的人是："+rname);
        System.out.println(list);
        //长度：array.length ；ArrayList.size();
        int size=list.size();
        System.out.println("集合长度为："+size);

        //list遍历：简写形式list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
