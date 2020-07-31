package Demo1;
/*
父类的格式：(一个普通类定义)：public class 父类名称{...};
子类的格式：public class 子类名称 extend 父类名称{...};
继承父类的好处是每个子类都可以调用父类的属性和方法，一个可以解决多个的问题
同时子类也可以有自己单独的特性：所有子拥有父类的内容，也有专属于自己的内容
*/

public class Demo01 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.method();//方法执行！!
        Assistant assistant=new Assistant();
        assistant.method();//方法执行！！
    }



}
