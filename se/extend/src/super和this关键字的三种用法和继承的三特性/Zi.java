package super和this关键字的三种用法和继承的三特性;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种：
1.在本类成员方法中，访问本类的成员变量；
2.在本类成员方法中，访问本类的另一个成员方法；
3.在本类构造方法中，访问本类的另一个构造方法；
注意：
1.this(...)调用也必须是构造方法中的第一句，唯一一个
2.supeu和this两种构造调用，不能同时使用。因为都需要第一，唯一
 */

public class Zi extends Fu {
    int num=20;
    public Zi(){
        this(123);//本来无参构造，调用本类有参构造
       //this(1,123);只能调一个
    }

    public Zi(int n){

    }

    public Zi(int n,int m){
        this(3);//两参构造方法调用一参构造方法

    }

    public void shownum(){
        int num=10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
