package 包装类;
/*
1.概念：因为基本的数据类型好用但是没有办法进行调用的操作，将其变成包装类，里面定义
一些方法，用来操作基本数据类型。
基本类型          对应包装类(在lang包里，无需调用,自动装箱)
byte             Byte
short            Short
int              Integer
long             Long
float            Float
double           Bouble
char             Charecter
boolean          Boolean
例如：ArrayList集合无法直接粗储存整数，可以储存在Integer包装类，这样就转换方便、
2.基本类型和字符串的转换

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList集合无法直接粗储存整数，可以储存在Integer包装类，
        // 这样就转换方便
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int a=list.get(0);
        System.out.println(a);//1

        //基本类型--》字符串
        String s1=100+"";
        System.out.println(s1+200);//100200
        //数字字符串———》基本类型
        int i=Integer.parseInt("200");
        //调用Integer类的解析到int的方法，参数是数字字符串
        System.out.println(i+1000);

    }
}
