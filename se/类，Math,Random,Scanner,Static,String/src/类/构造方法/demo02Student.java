package 类.构造方法;

public class demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student("熊鸣",25);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
        //如果需要改变对象中的成员变量，仍然需要使用setXxx方法
        stu2.setAge(21);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }
}
