package 继承父类并实现多个接口.Demo02;

public interface MyInterface {
public default void method(){
    System.out.println("接口的默认方法");
}
}
