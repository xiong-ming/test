package 类作为成员变量;
//主函数：1.new对象调用类 2.对类的参数进行设置set
//3.（调用类）对参数进行获得get 4.对象.方法，调用赋值的方法

public class Main {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("盖伦");
        hero.setAge(20);
        //hero.setWeapon("多兰剑");错误，主函数中，调用类通过对象
        Weapon weapon=new Weapon();
        weapon.setCode("多兰剑");
        hero.setWeapon(weapon);
        hero.attact();//年龄为20的盖伦用多兰剑攻击敌方


    }
}
