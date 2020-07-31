package 默认方法的定义和使用;
/*
1.接口默认的方法，可以通过接口实现类对象（即可不改实现类方法），直接调用
2.接口默认的方法，也可以被接口实现类进行覆盖重写。
 */

public class Demo01 {
    public static void main(String[] args) {
        //创建实现类对象
        InterDefaultA a=new InterDefaultA();
        a.methodAbs();//调用抽象方法，实际运行的实现类
        a.methodDefault();//调用默认方法，如果实现类里面没有，会向上找接口
        InterDefaultB b=new InterDefaultB();
        b.methodAbs();
        b.methodDefault();
    }
}
