package 泛型.泛型的通配符;
/*
?:代表任意的数据类型。
使用方式：
1.不能创建对象使用
2.只能作为方法的参数使用
注意：在用for循环进行遍历的时里面的数据类型不能写？，应该写Object。
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(111);
        list01.add(222);

        ArrayList<String>list02=new ArrayList<>();
        list02.add("aaa");
        list02.add("bbb");

        printArray(list01);
        printArray(list02);
    }

    //定义一个方法，能遍历所有类型的ArrayList集合。
    public static void printArray(ArrayList<?> list){
        for(Object i:list){
            System.out.println(i);
        }





    }
}
