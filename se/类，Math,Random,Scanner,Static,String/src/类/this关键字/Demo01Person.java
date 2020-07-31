package 类.this关键字;
/*
当方法的局部变量和类的成员变量重名的时候，根据就近原则，优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式：this.成员变量名
通过谁调用的方法，谁就是this（就是对象）
this就是在重名的时候，起到区分的作用
*/
public class Demo01Person {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="熊明";
        p.sayHello("嫣然");//@1540e19d
        System.out.println(p);//@1540e19d
    }
}
