package Arrays;

import java.util.Arrays;

/*
import java.util.Arrays是一个与数组相关的类，里面提供了大量的静态方法，
来实现数组的常用操作。

1.public static String toString(数组)，将参数组数改为字符串：[e1,e2,e3]
2.public static void sort(数组)，按照从小到大的顺序对数组元素进行排列。
备注:
1.数字升序，字母升序
2.如果是自定义类型，那么这个自定义的类需要有Comparable和Comparator接口支持。（今后学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        //将int[]数组按照默认格式变成字符串
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);//[10, 20, 30]

        int[] array1 = {3, 2, 5, 10, 4};
        Arrays.sort(array1);
        System.out.println(array1);//[I@1540e19d
        System.out.println(Arrays.toString(array1));//[2, 3, 4, 5, 10]
        String[] array2={"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        //进行倒序排列
        String str="asv76agfsahdauh";
        //String-->数组；用toCharArray();
        char[] chars=str.toCharArray();//将字符串转化为字符数组
        Arrays.sort(chars);//升序排列
        for (int i = chars.length-1; i>=0 ; i--) {//倒序
            System.out.print(chars[i]);//vusshhgfdaaaa76

        }

    }
}