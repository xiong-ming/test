package Demo02继承中成员变量的访问特点;

public class fu {
    int numfu=10;
    int num=100;
    public void methodfu(){
        System.out.println(num);//本类之中，不会向下找子类
    }
}
