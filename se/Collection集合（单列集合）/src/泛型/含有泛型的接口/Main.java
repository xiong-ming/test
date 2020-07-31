package 泛型.含有泛型的接口;
/*
有两种方式进行实现:因为  接口-->实现类-->对象
1.接口到实现类时，对实现类定义好泛型的数据类型，重写方法也会带有相同的数据类型。
2.接口到实现类时，让实现类和接口保持同步泛型，在创建类对象时，确定好数据类型。
两种方法都可以，都是创建完一个对象后，对应一种数据类型。
第二种从实现类到对象和类的泛型一样，我选择第二种，对象再用。
 */

public class Main {
    public static void main(String[] args) {
        GenericInterfaceimpl1 gi1=new GenericInterfaceimpl1();
        gi1.method("字符串");
        //gi1.method(1);
        GenericInterfaceimpl2<Integer> gi2=new GenericInterfaceimpl2<>();
        gi2.method(1);
        //gi2.method("s");
    }
}
