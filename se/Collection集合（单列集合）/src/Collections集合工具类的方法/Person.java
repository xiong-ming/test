package Collections集合工具类的方法;
/*
怎么创建一个类：（5个必备）
属性，
无参构造方法,全参构造方法，（ALT+ENTER）
getter/setter，
toString（用于输出属性，不然输出的是地址）
************************************************
（选择用）
1.equals() and hashCode();用于集合的set方法，用以确保元素不重复。
2.重写自定义升序排列
public class Person implements Comparable<Person>{},（ALT+ENTER）
@Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();//升序排序的写法
    }
    重写自定义升序排列

 */

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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


    @Override
    public int compareTo(Person o) {
        return this.getAge()-o.getAge();//升序排序的写法
        //return o.getAge()-this.getAge();降序排序的写法
    }
}
