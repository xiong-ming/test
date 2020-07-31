//方法
//修饰符 返回值类型 方法名称（参数名称，参数名称，.... ）{
//  方法体
//   return 返回值
// }
//修饰符：现阶段固定写法public static
//参数：原料
//返回值：输出产品，停止方法，并将返回值还给调用处
public class Method {
    public static void main(String[] args) {
        int d=sum(10,20);
       // System.out.println(d);
        int e=sum1();
       // System.out.println(e);
        sum01(10,20);
        sum02();

    }

  //返回值:主函数可以对应值接收，然后打印（有人接）
    public static int sum(int a,int b)//返回值有参，不要给参数赋值，形参
    {
        int c=a+b;
        return c;

    }

    public static int sum1()//返回值无参
    {   int a=10;
        int b=20;
        int c=a+b;
        return c;
    }

//    无返回：void：是没办法接收的，所以内部要有打印语句（自己坐车来）
    public static void sum01(int a, int b)//不返回有参
    {
        int c=a+b;
        System.out.println(c);
    }

    public static void sum02()//不返回无参
    {
        int a=10;
        int b=20;
        int c=a+b;
       System.out.println(c);
    }
}



