package 泛型.含有泛型的方法;
/*
定义含有泛型的方法：泛型定义在方法的修饰符和返回值之间
格式：
修饰符 <E> 返回值类型 方法名称(参数列表(使用泛型)){
       方法体;
}
在调用方法的时候确定泛型的数据类型。
 */

public class GenericMethod {
    public <E> void method01(E e){
        System.out.println(e);
    }

    //含义泛型的静态方法
    public static <E>void method02(E e){
        System.out.println(e);
    }
}
