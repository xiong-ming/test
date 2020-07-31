package 继承父类并实现多个接口;

public interface MyInterfaceA {
  //  static{ }   错误，不能有静态方法
  //public MyInterface(){}   错误，不能有构造方法

    public abstract void methodA();
    public abstract void method();
    public default  void methoddefault(){
        System.out.println("AAA");
    }
}
