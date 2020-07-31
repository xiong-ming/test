//JVM:虚拟机
//JRE；java程序运行时的环境，包含虚拟机
//JDK：Java程序开发工具包，包含jre和开发人员使用的工具。
//JDK>JRE>JVM;

//界面操作：
//Project>>module(模块命名小写字母)在下面的src【不要直接class】>>
// package（有两个包的包含关系，当包里面有东西时，可以建立子包，否则不行）[首字母要大写]>>class（文件）
//重新打开项目：open>>JAVA>>找寻里面带有黑方框的项目，打开即可。注意以项目为一个整体
//新建module:最上方的file>>new>>nodule>>下个页面直接next>>再下个页面改module名
//新建class；module下方的src>>new package>>new javaclass.顺序不能错，到了package
//删除module:选择对应的模块，选择remove moudule。
//导入module：删除一个module(remove module)之后，在文件夹里面仍然存在。
//
//           file>>project strucure>>module>>+号下面选择import
//           >>全部点击next,next,next，next，finish,ok
//           >>进去之后会发现语法错误，根据最上方提示添加jdk(因为新建的module是需要配jdk)

// 判断错误：右上角绿色对勾，黄色方框，红色！，分别表示对，警告，错误。具体改法alt+回车；
//
public class HelloWorld {

    public static void main(String[] args) {//简写main+回车
        System.out.println("Hellow,World!!!");//简写sout
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }


}

//在进行自动补全的时候，如果过了，删掉一个字母，再写上去，从新看下面。和手机一样
//小技巧：快捷键：
//1.alt+回车：自动修改代码，最重要的
//2.ctrl+Alt+l：快速将不齐的代码格式化，排整齐,但是由qq的时候锁解密码，第二重要

//3.ctrl+/：快速注销该行，或者将鼠标跨过几行就有注释几行，再次按下取消
//4.ctrl+shift+/：整齐地划过选定几行，要选其就可以进行多行注释，再次按下取消

//5.ctrl+y：快速删除该行
// 6.ctrl+d：快速复制该行

//7.Alt+insert：自动生成代码，string,get ,set等方法，之后再用
//8.Alt+shift+上下箭头：移动当前代码

//9.Alt+table:快速切屏
//10.ctrl+Alt+A：qq剪切图片
//11.运行：run主函数/ctrl+shift+F10；
//12.如果相同几个对象挨得很近，按住alt选中，删除后修改，就一起修改了。
//13.shift+f6：批量对参数名进行修改


/*
一.简写：
1.简写main--》public static void main(String[] args) {};
2.简写sout--》System.out.println();
3.简写fori-->for (int i = 0; i < ; i++) {};
4.父类有show方法，子类想覆盖重写show方法的话，打出show就会出现
覆盖重写的方法，连标志都会出来
5.增强for循环的简写：方法名.for-->for(数据类型 变量名：方法名){sout(i)}
以上是遍历，如果想操作的话，在外初始化sum=0，再接再循环里进行运算，
再return sum即可
二.小技巧
1.光标变成小方块怎么快速调回来：PrtSc+fn；
2.ctrl+鼠标点击关键词，就会显示他的详细信息
3.generate（生成构造方法和get，set方法）：(1)上方code》generate（2）右击》generate
4.重写/实现：在红线的地方alt+enter》implements
5.shift+点击：多选
6.快速创建未定义方法：alt+enter,然后enter进入。


三.易错点：
1.构造器和类的关系：
构造方法的构建和小类非常相似，new出来的对象其实是类里面构造方法（叫做构造器更加贴切）
里面的东西无需进行调用会自动执行。
2.对抽象方法进行覆盖重写时，alt+enter 选择inplements（实现），就可将所有的抽象
方法实现，然后往里面填东西。
3.对于子类实现父类的默认方法时，实现类没有报错，所有不能用alt+enter，但是可以对简写
method之后，就会自动为你扩充实现方法。
*/



