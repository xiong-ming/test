package 多态的格式和使用;
/*
代码当中体现多态性，其实就是一句话，父类引用指向子类对象。（把猫当动物用）
格式：(说白了就是要有一个至下而上的关系)
父类名称 对象名=new 子类名称();
或者
接口名称 对象名=new 实现类名称();
 */

public class Zi extends Fu {
    @Override
    public void method() {
        System.out.println("子类方法");
    }
}
