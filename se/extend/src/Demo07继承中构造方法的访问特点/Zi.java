package Demo07继承中构造方法的访问特点;

public class Zi extends Fu{

    public Zi(){
        //super();在调用父类无参构造方法(如果没有就默认调它，一定要调父类构造方法)
        super(20);//调用父类重载的构造方法
        System.out.println("子类构造方法");
    }
}
