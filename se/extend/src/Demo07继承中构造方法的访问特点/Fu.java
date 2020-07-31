package Demo07继承中构造方法的访问特点;


public class Fu {

    public Fu(){//默认的是不带参数的
        System.out.println("父类无参构造方法");
    }

    public Fu(int num){
        System.out.println("父类有参构造方法");
    }
}
