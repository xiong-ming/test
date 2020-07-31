package 类;

public class demo01Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="熊鸣";
        stu.age=25;
        stu.study();
        stu.eat();
        method(stu);
        Student a=f();
        System.out.println(a.name);
    }

/*
将一切皆对象用到了极致，任何数据类型都可以都能作为方法的参数类型，或返回值类型
int a;int[] array;Student param.其中Student（类）和int，String，一样而已
 */
    public static void method(Student param){//类做参数类型
        System.out.println(param.name);
        System.out.println(param.age);
    }

    public static Student f(){//类做参数类型,对象做返回值
        Student s=new Student();
        s.name="xm";
        s.age=18;
        return s;
    }
}
