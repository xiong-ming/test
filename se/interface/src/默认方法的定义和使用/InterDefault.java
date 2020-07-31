package 默认方法的定义和使用;
/*
从Java8开始，接口里允许定义默认方法
格式：（默认方法是可以有方法体的）
public default 返回值类型 方法名称（参数列表）{
        方法体
}
备注：接口当中的默认方法，可以解决接口升级的方法。
实现类覆盖重写接口的抽象方法，这些方法通过对象来调用到其他的用处。但是后来在接口里面增加了
一些抽象方法的话，因为实现类没有完全覆盖重写，就会报错。
 */
public interface InterDefault {
    //抽象方法
    public abstract void methodAbs();
    //public abstract void methodAbs2();
    //新添加的方法，改为默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    };
}
