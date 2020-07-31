package 继承父类并实现多个接口;

public class MyInterfaceImpl
        /*extends Object*/ implements MyInterfaceA,MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void method() {
        System.out.println("覆盖了AB接口都有的抽象方法");
    }

    @Override
    public void methodB() {

        System.out.println("覆盖重写了B方法");
    }

    @Override
    public void methoddefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }
}
