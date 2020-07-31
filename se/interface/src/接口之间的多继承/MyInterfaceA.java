package 接口之间的多继承;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("AAA");
    }
}
