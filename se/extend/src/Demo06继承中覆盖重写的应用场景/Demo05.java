package Demo06继承中覆盖重写的应用场景;

public class Demo05 {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("====================");
        NewPhone newphone=new NewPhone();
        newphone.call();
        newphone.send();
        newphone.show();
    }

}
