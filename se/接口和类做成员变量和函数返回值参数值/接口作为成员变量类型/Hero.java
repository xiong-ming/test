package 接口作为成员变量类型;

public class Hero {
    private String name;
    private Skill skill;//接口作为成员变量

    public void attact(){
        //System.out.println(name+"用弓"+skill.use()+"攻击敌人");错误
        System.out.print(name+"用弓");
        skill.use();
        System.out.print("攻击敌人");
    }
    public Hero() {
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
