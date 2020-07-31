package 抽象方法抽象类的注意事项;

public class DemoMain {
    public static void main(String[] args) {
        Zi zi=new Zi();//注意：一旦创建了新对象，对应的类的构造方法会自动实行
        Zi zi1=new Zi(1);//所以说，对象是通过构造方法new出来的。
        zi.eat();
    }
}
/*
抽象类构造方法执行！
子类方法执行
抽象类构造方法执行！
熊鸣
吃饭
 */