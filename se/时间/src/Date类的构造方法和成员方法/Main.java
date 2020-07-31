package Date类的构造方法和成员方法;
import java.util.Date;
/*
1.Date类的空参数构造方法，Date()获取的是当前系统的日期和时间
2.Date类的带参数构造方法，Date(long date)：传递毫秒值，把毫秒转化为Date日期
3.Date类的成员方法，long getTime()：将日期转化为毫秒
*/

public class Main {
    public static void main(String[] args) {
        demo01();//Thu Jul 02 15:47:56 CST 2020
        demo02();//Thu Jan 01 08:00:00 CST 1970
        demo03();//1593676962811,和下面的函数是一个意思
        System.out.println(System.currentTimeMillis());//1593676962811
    }

    public static void demo01(){
        Date date=new Date();
        System.out.println(date);
    }
    public static void demo02(){
        Date d1=new Date(0L);
        System.out.println(d1);

    }
    public static void demo03(){
        Date date=new Date();
        long time=date.getTime();
        System.out.println(time);
    }

}
