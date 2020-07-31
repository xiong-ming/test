package Static;
/*
如果成员变量使用了static关键字，那么这个变量不再属于自己，而属于所在的类，
多个对象共享一份数据
*/

public class Demo01StaticField {
    public static void main(String[] args) {
        Student one=new Student("小小",18);
        one.room="101";
        Student two=new Student("大大",20);
        System.out.println("姓名："+one.getName()+",年龄："
                +one.getAge()+",教室："+one.room+",学号："+one.getId());
        System.out.println("姓名："+two.getName()+",年龄："
                +two.getAge()+",教室："+two.room+",学号："+two.getId());
        //姓名：小小,年龄：18,教室：101   姓名：大大,年龄：20,教室：101
    }
}
