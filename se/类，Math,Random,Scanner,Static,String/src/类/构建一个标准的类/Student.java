package 类.构建一个标准的类;
/*一个标准的类通常要分为4个部分
1.所有的成员变量都要用private关键字修饰
2.为每一个成员变量编写一个Getter/Setter方法：上方code>>generate
>>getterandsetter>>shift+选择就可以全选了>>ok
3.编写一个无参的构造方法:code>>generate>>struct>>里面进行选择
4.编写一个全参的构造方法
这样一个标准的类e也叫java bean
*/
////////////////////////////////////////////////////////////
/*
怎么创建一个类：（5个必备）
属性，
无参构造方法,全参构造方法，（ALT+ENTER）
getter/setter，
toString（用于输出属性，不然输出的是地址）
************************************************
（2个选用）
1.equals() and hashCode();用于集合的set方法，用以确保元素不重复。
2.重写自定义升序排列
public class Person implements Comparable<Person>{},（ALT+ENTER）
@Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();//升序排序的写法
    }
    重写自定义升序排列

 */


public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
