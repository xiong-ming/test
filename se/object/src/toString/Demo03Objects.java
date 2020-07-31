package toString;

import java.util.Objects;
//Objects是一个工具类，不是object。object是一个超类。

public class Demo03Objects {
    public static void main(String[] args) {
        String s1=null;
        String s2="abc";
        String s3="abc";
        boolean b=s2.equals(s3);////这种方式不可以判断空指针
        System.out.println(b);
        boolean b2= Objects.equals(s1,s2);//这种方式可以判断空指针
        System.out.println(b2);

    }
}
