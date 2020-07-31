package 泛型.含有泛型的方法;

public class Main {
    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        gm.method01(10);
        gm.method01("abc");
        gm.method01(8.8);
        gm.method01(true);

        gm.method02("静态方法不建议创建的对象使用");
        //静态方法通过  类名.方法名
        GenericMethod.method02("真心好累");
    }
}
