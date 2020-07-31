package 类;


public class demo03Person {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="xm";
      //  p.age=20;直接访问private内容，写法错误！
        p.setAge(-20);
        p.show();


        System.out.println();
    }
}
