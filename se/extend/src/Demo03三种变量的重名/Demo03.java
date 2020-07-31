package Demo03三种变量的重名;
/*
1.局部变量         直接写
2.本类的成员变量    this.成员变量名
3.父类的成员变量    super.成员变量名
总体而言默认的就是就近原则
 */

public class Demo03 {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.method();
    }
}
