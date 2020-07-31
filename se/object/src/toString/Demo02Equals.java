package toString;
/*
1.基本数据类型：比较的是值
引用数据类型：比较的是地址
object类的equals方法默认比较的是两个地址的值，没有意义
所以要重写equals方法，比较两个对象的属性值（name,age）
问题：隐含着一个多态
Object obj=p2=new person("B",18);
多态的弊端：无法使用子类特有的内容（属性，方法）
解决：向下转型（强转）：把Object类型转为person

 */

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1=new Person("A",18);
        Person p2=new Person("B",18);
        p1=p2;
        boolean b=p1.equals(p2);
        System.out.println(b);

    }

}
