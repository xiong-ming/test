package System的常用类;

import java.util.Arrays;
/*
1.long s=System.currentTimeMillis();获取当前时间
2.System.arraycopy(a,0,b,0,3);理解数组a从0开始复制数字数组b，也是从0开始。
复制的长度为3
注意：将数组进行输出的的方法：
1.for循环进行遍历
2.System.out.println(Arrays.toString(数组名));
 */

public class Main {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(b));
        System.arraycopy(a,0,b,0,3);
        System.out.println("复制后："+ Arrays.toString(b));

    }

    private static void demo01() {
        long s=System.currentTimeMillis();
        for (int i = 0; i <9999 ; i++) {
            System.out.println(i);
        }
        long t=System.currentTimeMillis();
        long a=t-s;
        System.out.println("程序一共耗时："+a+"毫秒");
    }
}
