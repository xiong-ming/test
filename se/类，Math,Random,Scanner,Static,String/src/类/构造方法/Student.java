package 类.构造方法;
/*
(构造方法是专门来创建对象的方法，当我们通过new关键字来创建对象，其实就是在调用构造方法)
细品：为何要将构造方法和类的名字完全一样，就是故意混淆，可以两者都用：类的方法调用，构造函数的参数的输出
格式：public 类名称（参数类型 参数名称）{
方法体
}
注意事项：
1.构造方法名称必须和所在类名称完全一样
2.构造方法不要写返回值类型，连void都不要写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，会默认赠送一个
5.构造方法重载：方法名称相同，参数列表不同

*/

public class Student {
    //成员变量
    private String name;
    private int age;
    //无参数构造方法
    public Student(){
        System.out.println("无参构造方法执行啦！！！" );
    }
    //全参数构造方法
    public Student(String name,int age){
        System.out.println("全参构造方法执行啦！！！" );
        this.name=name;
        this.age=age;
    }
    //getter/setter
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
