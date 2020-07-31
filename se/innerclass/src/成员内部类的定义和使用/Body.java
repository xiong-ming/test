package 成员内部类的定义和使用;

public class Body {//外部类
    public class Heart{//成员内部类
        //内部类方法
        public void beat(){
            System.out.println("心脏跳动：砰砰砰");
            System.out.println("我叫："+name);//内部类可以调用外部类
        }

    }

    //外部类的成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //外部类方法
    public void methodBody(){
        System.out.println("外部类方法");
    }
}
