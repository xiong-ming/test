package Calendar;
/*
1.Calendar类（日历类）是一个抽象方法，理念包含了很多操作日历字段的方法
（YEAR,MONTH,DAY_OF_MONTH,HOUR），无法直接创建对象使用，里面有一个
静态方法叫getInstance(),该方法返回了Calendar类的子类对象。
static Calendar getInstance()使用默认时区和语言环境获得一个日历。
Calendar c=Calendar.getInstance();最重要的一点，获取对象
2.Calendar的成员方法
（1）public int get(int field);返回给定日历字段的值
（2）public int set(int field,int value);将给定的日历字段设置为给定值
（3）public abstract void add(int field,int amount);根据日历的规则，
为给定的日历字段添加或减去指定的时间量。
（4）public Date getTime();返回一个表示Calendar时间值（从元历到现在毫秒的偏移值）的Date对象


 */

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();//多态的写法，因为后者返回子类
        System.out.println(c);
        demo01();
        demo02();
        demo03();
        demo04();
    }

    private static void demo04() {
        Calendar calendar=Calendar.getInstance();
        Date date=calendar.getTime();
        System.out.println(date);
    }

    private static void demo03() {
        Calendar calendar=Calendar.getInstance();
        calendar.add(calendar.YEAR,3);
        calendar.add(calendar.MONTH,-2);
        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH);
        int date=calendar.get(calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
    }

    private static void demo02() {
        Calendar calendar=Calendar.getInstance();
        calendar.set(calendar.YEAR,9999);
        ////也可以同时进行设置:写入三个数字，用逗号隔开即可
        calendar.set(888,8,8);
        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH);
        int date=calendar.get(calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);


    }

    private static void demo01() {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH);
        int date=calendar.get(calendar.DATE);
        System.out.println(year);
        System.out.println(month+1);
        System.out.println(date);

    }
}
