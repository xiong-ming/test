package Demo02继承中成员变量的访问特点;

public class zi extends fu {
    int numzi=20;
    int num=200;
    public void methodzi(){
        System.out.println(num);//本类之中有num，所以这里用本类的num

    }
}
