package Array和java内存分布;
/*
数组两种常见的初始化方式：
动态初始化（指定内容），格式：数据类型[] 数组名称=new 数据类型[数组长度]
静态初始化（指定长度），格式：数据类型[] 数据名称=new 数据类型[]{元素1，元素2，...}
静态初始化的省略格式：数据类型[] 数组名称={元素1，元素2，...};
个人觉得静态初始化可以省事，边定义边赋值，而动态初始化之后还有赋值
*/

/*
1.栈（Stack）：方法的运行一定要在栈当中运行
局部变量：方法的参数，或方法{}内部的变量
作用域：一旦超出作用域，立即从栈内存中消失
2.堆（Heap）：凡是new出来的东西都在里面
地址值：16进制
数据的默认值，规则：
整数：0， 浮点数：0.0 ，字符：‘\u0000’，布尔：false，引用类型：null
3.方法区：存储class相关信息，包含方法的信息
4.本地方法栈：与操作系相关
5.寄存器（pc Register）：与cpu相关
*/
public class Array {
    public static void main(String[] args) {
        //动态初始化
        int[] arrayA=new int[300];
        double[] arrayB=new double[10];
        String[] arrayC=new String[3];

        //静态初始化
        int[] array01=new int[]{3,4,5};
        String[] ARRAY02=new String[]{"hello","world","java"};

        //静态初始化省略格式
        int[] array1={1,2,3 };
        System.out.println();

        //索引
        int array[]={1,2,3};

        //数组长度
        int len=array.length;

        //遍历数组
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println(array);//[I@1540e19d:I表示int，后面表示16进制数
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(len);
    }
}
