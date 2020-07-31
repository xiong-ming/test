package 泛型.含有泛型的类;

import 泛型.含有泛型的类.GenericClass;

public class Main {
    public static void main(String[] args) {
        //不写泛型默认为是object类型,只能存储一种数据类型
        GenericClass gc=new GenericClass();
        gc.setName("只能是字符串类型");
        System.out.println(gc.getName());

        GenericClass<Integer> gc1=new GenericClass<>();
        gc1.setName(1);
        System.out.println(gc1.getName());

        GenericClass<String> gc2=new GenericClass<>();
        gc2.setName("xiong");
        System.out.println(gc2.getName());


    }
}
