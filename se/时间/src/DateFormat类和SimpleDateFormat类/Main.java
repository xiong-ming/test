package DateFormat类和SimpleDateFormat类;
/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
作用：格式化（日期-》文本），解析（文本-》日期）
成员方法：
String format(Date date)：按照指定格式，把Date日期，格式化为符合模式的字符串
Date parse(String source):把符合格式的字符串，解析为Date日期。
DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类
java.text.SimpleDateFormat extends DateFormat

构造方法：
SimpleDateFormat(String pattern)用给定的模式和默认语言环境
的日期格式符号构造SimpleDateFormat。
参数：String pattern：传递指定模式，要区分大小写
"yyyy年MM月dd日 HH时mm分ss秒"  或者"yyyy-MM-dd HH:mm:ss"

格式化/解析 两步骤：
1.SimpleDateFormat sdf
                =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
2.1用对象调用格式化函数，参数为日期：
        Date date=new Date();
        String text=sdf.format(date);
        输出的到2020年07月02日 17时31分31秒
2.2用对象调用解析函数，参数为需要解析的文本：
        Date date=sdf.parse("2020年10月10日 11时12分13秒");
        输出得到Sat Oct 10 11:12:13 CST 2020
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) throws ParseException {
        demo01();//2020年07月02日 17时31分31秒       format方法格式化
        demo02();//Sat Oct 10 11:12:13 CST 2020    parse方法解析

    }

    private static void demo01(){
        SimpleDateFormat sdf=new//用子类创建对象
                SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();//给定时间
        String text=sdf.format(date);//调用对象里的格式化方法
        System.out.println(date);
        System.out.println(text);
    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf
                =new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=sdf.parse("2020年10月10日 11时12分13秒");
        System.out.println(date);

    }
}
