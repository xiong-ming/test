package 继承父类并实现多个接口;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void method();
    public default  void methoddefault(){
        System.out.println("BBB");
    }
}
