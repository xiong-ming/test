package Random;
import java.util.Random;
/*
Random类用来生成随机数字，有如下三步：
1.导包：
import java.util.Random;
2.创建：Random r=new Random();
3.使用：
随机获取一个int数字；（范围是int所有的范围，有正负两种）int num=r.nextInt();
随机获取一个int数字；（参数代表了范围，左闭右开区间）int num=r.nextInt(3);
实际上代表的含义是[0，3）
* */

public class Demo01Anonymous {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt();
        int a=r.nextInt(3);
        System.out.println("随机数是："+num);
        System.out.println("0到3的随机数是："+a);
    }
}
