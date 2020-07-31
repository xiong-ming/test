package final关键字修饰局部变量;
/*
不可变：
对于基本类型来说，是变量当中的数据不能改变
对于引用类型来说，是变量当中的地址不能改变
 */
public class Demo01 {
    public static void main(String[] args) {
        final int num2=20;//final修饰的局部变量，不能改变。"一次赋值，终生不变"
       // num2=10;错误写法，不能改变
        Student stu1=new Student("赵丽颖");
        System.out.println(stu1.getName());//赵丽颖
        System.out.println(stu1);//@7c30a502
        stu1=new Student("霍建华");
        System.out.println(stu1.getName());//霍建华
        System.out.println(stu1);//@49e4cb85,地址值发生了改变

        final Student stu2=new Student("高圆圆");
        //stu2=new Student("赵又廷");错误，final的引用类型变量，其中地址不可改变
        System.out.println(stu2.getName());
        stu2.setName("小高");
        System.out.println(stu2.getName());
    }
}

