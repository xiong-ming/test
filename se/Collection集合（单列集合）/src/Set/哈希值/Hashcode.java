package Set.哈希值;
/*
哈希值：是一个十进制整数，由系统随机给出（就是对象的地址值，是一个逻辑地址
不是数据实际储存的物理地址）
在Object类有一个方法，可以获取对象的哈希值。
int hashCode()返回该对象的哈希码值。
Person类继承了Object类，所以可以使用Object类的HashCode方法。

 */

public class Hashcode {
    public static void main(String[] args) {
        Person p1=new Person();
        int h1=p1.hashCode();
        System.out.println(h1);//2083562754//重写之后为1
        Person p2=new Person();
        int h2=p2.hashCode();
        System.out.println(h2);//1239731077//重写之后为1
        //直接输出对象就是该对象的地址值，是16进制的表现形式和上面的对应
        System.out.println(p1);//Set.哈希值.Person@7c30a502
        System.out.println(p2);//Set.哈希值.Person@49e4cb85
        System.out.println(p1==p2);//faulse,地址不相等，
        //本身地址不相同，但是返回的哈希值都是1，所以逻辑地址相同但是
        //实际的物理地址不相同
    }
}
