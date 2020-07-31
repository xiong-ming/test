package 静态方法的定义和调用;
/*
注意：一个类可以实现多个接口，静态方法可能产生冲突。不能通过接口实现类的对象来调用接口当中的静态方法
 正确用法，通过接口名称，直接调用其中的静态方法：接口名称.静态方法名（参数）;
 */
public class Demo01 {
    public static void main(String[] args) {
        /*InterStaticImpl impl=new InterStaticImpl();静态和对象没有关系，和类有。
        impl.methodstatic();错误，要通过接口直接调用静态方法*/
        InterStatic.methodStatic();

    }
}
