package 多态的好处;
/*
好处：无论右边new的时候换成那个对象，等号左边的调用方法都不会改变
 */

public class  Demo01 {
    public static void main(String[] args) {
        Empl a1=new Assitance();
        Empl a2=new Teacher();
        a1.work();
        a2.work();
    }


}
