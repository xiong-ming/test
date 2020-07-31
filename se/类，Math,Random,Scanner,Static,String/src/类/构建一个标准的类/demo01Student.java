package 类.构建一个标准的类;

public class demo01Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名："+stu1.getName()+"，年龄；"+stu1.getAge());
        Student stu2=new Student("熊鸣",25);
        System.out.println("姓名："+stu2.getName()+"，年龄；"+stu2.getAge());
        stu2.setAge(22);
        System.out.println("姓名："+stu2.getName()+"，年龄；"+stu2.getAge());
    }

}
