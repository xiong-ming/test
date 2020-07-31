package 私有方法的定义和使用;
/*
问题描述：抽取一个共有的方法，用来解决两个默认方法之间重复代码的问题。
但是这个共有方法不应该让实现类使用，应该是私有化的。
注意：private的方法只有接口自己才能调用，不能被实现类和别人调用

解决方案：
1.普通私有方法，解决多个默认方法之间的重复代码的问题
private 返回值类型 方法名称（参数列表）{
           方法体
}

2.静态私有方法，解决多个静态方法之间的重复代码的问题
private static 返回值类型 方法名称(参数列表){
          方法体
}
 */

public interface InterfaceprivateA {
    public default void methodDefault1(){
        System.out.println("默认方法1");
        methodCommen();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
        methodCommen();
    }
    private void methodCommen(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");

    }
}
