package Demo05继承中覆盖重写的注意事项;
/*
1.必须保证父子类之间的名称相同，参数列表也相同
@Override：写在方法前面，用来检测是不是有效正确的覆盖重写。
这个注解就算不写，只要满足要求，也是正确的覆盖重写。
2.子类方法的返回值范围必须小于或等于父类方法的返回值：，
Object类是所以类的公共最高父类(祖宗类)，java.lang.String就是Object的子类。
3.子类方法的权限必须大于或等于父类方法的权限修饰符：因为子类包含的更多，权限范围更大
扩展：public>protected>(default)>private;
备注：(default)不是关键字default，而是什么都不写，留空。
 */

public class Demo05 {
}
