package 成员内部类的定义和使用;
/*
如果出现重名现象，格式是：外部类名称.this.外部成员变量名
 */

public class Outer {
    int num=10;
    public class Inner{
        int num=20;
        public void methodInner(){
            int num=30;
            System.out.println(num);//30,局部变量就近原则
            System.out.println(this.num);//内部类的成员变量
            System.out.println(Outer.this.num);//外部类的成员变量
        }
    }
}
