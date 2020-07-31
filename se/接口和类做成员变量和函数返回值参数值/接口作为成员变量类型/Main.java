package 接口作为成员变量类型;
/*
主函数：1.new对象调用类 2.对类的参数进行设置set
       3.（调用类）对参数进行获得get 4.对象.方法，调用赋值的方法
注意：输出接口.方法();单独一行出来，不得联字串一起出来
*/
public class Main {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾希");
       // hero.setSkill("111");接口和类一样，通过对象调用类
        SkillImpl impl=new SkillImpl();
        hero.setSkill(impl);
        hero.attact();

    }
}
