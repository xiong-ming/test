package 接口作为方法的参数和返回值;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> list1=new ArrayList<>();
        ArrayList类点进去发现实现接口List<E>等接口，拿List举例*/
        List<String> list=new ArrayList<>();//多态写法
        List<String> result=addNames(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(result.get(i));
        }
    }
    public static  List<String> addNames(List<String> list){//接口既做返回值也做参数
        list.add("1111");
        list.add("2222");
        list.add("3333");
        return list;
    }



}
