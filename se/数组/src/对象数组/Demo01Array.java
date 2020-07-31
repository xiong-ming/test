package 对象数组;
/*
定义一个数组，来储存三个person对象；
数组缺点：一旦被确定，程序运行期间长度不变
* */

public class Demo01Array {
    public static void main(String[] args) {
        Person P1=new Person("小明",18);
        Person P2=new Person("啊明",28);
        Person P3=new Person("大明",38);
        Person[] array={P1,P2,P3};
        System.out.println(array[0]);//@1540e19d
        System.out.println(array[0].getName()+array[0].getAge());//小明18
        for(int i=0;i<array.length;i++){
            System.out.println(array[i].getName()+array[i].getAge());
        }

    }
}
