package ArrayList;

import java.util.ArrayList;
/*
注意：泛型只能是引用类型，不能是基本类型
* 如果希望集合ArrayList当中储存基本数据类型，必须使用基本类型对应的包
* 基本类型       包装类(引用类型：都位于java.lang包下，不需要导包)
* byte           Byte
* short          Short
* int            Integer【特殊】
* long           Long
* float          Float
* double         Double
* char           Character【特殊】
* boolean        Boolean
支持自动装箱和自动拆箱
自动装箱：基本类型-->包装类型
自动拆箱：包装类型-->基本类型
* */

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA=new ArrayList<>();
        //ArrayList<int> listB=new ArrayList<>();
        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(200);
        System.out.println(listB);
        int num=listB.get(1);
        System.out.println("第一号元素是"+num);
    }
}
