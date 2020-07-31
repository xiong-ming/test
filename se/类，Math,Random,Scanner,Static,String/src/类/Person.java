package 类;
/*
问题描述：定义person年龄时，无法阻止不合理的值设置进来
解决方案：用private关键字将需要保护的成员变量进行修饰
一旦使用了private进行修饰，那么本类当中仍可以随意访问，g'hi's但是超出了本类之外就不能再进行访问了
间接访问private成员变量，就是定义一对setter/getter方法，间接的方式可以阻止不合理
的数据设置进来，提高代码的安全性
命名规则：setXxx和getXxx
对于setter来说，不能有返回值，参数类型和成员变量对应
对于getterthis来说，不能有参数，返回值类型和成员变量对应
*/

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫"+name+",年龄："+age);
    }

    public void setAge(int num){//往里放
        if(0<num&&num<=100){//不可以连着写
            age=num;
        }else{
            System.out.println("数据不合理！");
        }

    }

    public int getAge(){//往外拿
        return age;
    }
}
