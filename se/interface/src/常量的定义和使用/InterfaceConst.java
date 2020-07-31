package 常量的定义和使用;
/*
接口当中也可以定义"成员变量"，但是必须用public static final三个关键字修饰。
从效果上来看，就是接口的常量
public static final 数据类型 常量名称=数据值;
注意事项：
1.接口中的常量，可以省略public static final，不写也照样是这样。
2.必须进行赋值。
3.接口中的常量名称，使用完全大写的字母，用下划线表示分割。（推荐命名规则）
 */

public class InterfaceConst {
    public static final int NUM_OF_MY_CLASS=12;
}
