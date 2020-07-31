package 抽象方法抽象类的注意事项;

public  class Zi extends Fu{//alt+回车:选择implement，就自动覆盖重写抽象方法

    public Zi(){
        System.out.println("子类方法执行");
    }
    public Zi(int num ){
        System.out.println("熊鸣");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");

    }
}
