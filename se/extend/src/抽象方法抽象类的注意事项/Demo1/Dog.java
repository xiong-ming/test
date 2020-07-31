package 抽象方法抽象类的注意事项.Demo1;
//子类也是一个抽象类
public abstract class Dog extends Animal{


    //public abstract void sleep() ;//不进行覆盖重写，依旧选择抽象方法，对应抽象类

    @Override
    public void eat() {
        System.out.println("狗吃骨头");

    }
}
