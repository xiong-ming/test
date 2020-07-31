package 接口之间的多继承;
/*
有四个抽象方法：methodA，methodB，method，methodCommon
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();


    @Override
    default void methodDefault() {

    }
}
