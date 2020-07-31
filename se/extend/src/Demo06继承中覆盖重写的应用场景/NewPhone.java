package Demo06继承中覆盖重写的应用场景;

public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();// 把父类的show方法拿过来重复利用
        //子类自己再来添加更多
        System.out.println("显示图像");
        System.out.println("显示姓名");
    }
}
