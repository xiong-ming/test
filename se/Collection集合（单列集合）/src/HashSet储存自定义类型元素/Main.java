package HashSet储存自定义类型元素;

import java.util.HashSet;
/*
HashSet储存自定义类型元素
set集合报错元素唯一：
储存元素（String,Integer,...,Student,Person）,
前面两个是非自定义，无需重写hashCode方法和equals方法
后面两个是自定义类型,必须重写hashCode方法和equals方法，
如果储存的是对象，(new进堆)输出的都会是地址，还要重写toString方法。
 */

public class Main {
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();//先创建容器HashSet
        Person p1=new Person("小美女",18);//创建对象
        Person p2=new Person("小美女",18);
        Person p3=new Person("小美女",19);
        System.out.println(p1.hashCode());//1239731077
        System.out.println(p2.hashCode());//557041912
        System.out.println(p3.hashCode());//1134712904
        System.out.println(p1==p2);//false,比较的是地址值
        System.out.println(p1.equals(p2));
        //false，没有重写比较的也是地址值（重写equals和hashCode之前）
        //ture，重写之后比较的是属性值了。
        set.add(p1);//将对象储存在哈希表里面
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        /*
        没有重写toString的方法的时候：
        [HashSet储存自定义类型元素.Person@49e4cb85,
         HashSet储存自定义类型元素.Person@7c30a502,
         HashSet储存自定义类型元素.Person@2133c8f8]
         */

        /*
        重写了toString方法后：
        [Person{name='小美女', age=18},
        Person{name='小美女',age=18},
        Person{name='小美女', age=19}]*/

        /*
        重写了equals()和hashcCode方法后
        [Person{name='小美女', age=19},
        Person{name='小美女', age=18}]
        */
}
}
