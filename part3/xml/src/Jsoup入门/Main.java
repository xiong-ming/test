package Jsoup入门;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {
        //1.导入jar包
        //1.5通过类加载获取路径
        String path=Main.class.getClassLoader().getResource("student.xml").getPath();
        //2.Jsoup解析路径和字符集得到文件对象document（解析1）
        Document document= Jsoup.parse(new File(path),"utf-8");
        //3.通过文件方法获得Element对象
        Elements elements=document.getElementsByTag("name");
        System.out.println(elements.size());
        Element element= elements.get(0);
        //4.获取element对象
        String name=element.text();
        System.out.println(name);

        //解析（2）
        String str="<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "\n" +
                "<students>\n" +
                "    <student number=\"heima_0001\">\n" +
                "        <name>tom</name>\n" +
                "        <age>18</age>\n" +
                "        <sex>male</sex>\n" +
                "    </student>\n" +
                "\n" +
                "    <student number=\"heima_0002\">\n" +
                "        <name>jack</name>\n" +
                "        <age>18</age>\n" +
                "        <sex>remale</sex>\n" +
                "    </student>\n" +
                "</students>\n";
        Document document2=Jsoup.parse(str);
        System.out.println(document2);

        //解析（3）
        URL url=new URL("https://www.bilibili.com/video/BV1uJ411k7wy?p=670");
        Document document1=Jsoup.parse(url,10000);
        System.out.println(document1);
        System.out.println("------------------------------------------------------");


        //3.Document对象
        //3.1获取所有student对象们
        Elements elements2=document.getElementsByTag("student");
        System.out.println(elements2);
        System.out.println("##########################");

        //3.2获取属性名为id的元素对象们
       Elements elements3= document.getElementsByAttribute("id");
        System.out.println(elements3);
        System.out.println("------------------------------------------------------");

        //3.3获取number属性值为heima_0001的元素对象
        Elements elements4= document.getElementsByAttributeValue("number","heima_0001");
        System.out.println(elements4);
        System.out.println("*******************************************");

        //3.4获取id属性值的元素对象
         Element element1=document.getElementById("1");
        System.out.println(element1);

        //4.Element对象
        //通过document对象获取name标签，获取所有的name标签，可以获得2个
        Elements elements10=document.getElementsByTag("name");
        System.out.println(elements10.size());//2

        //通过Element对象获取子标签对象
        Element element10=document.getElementsByTag("student").get(0);
         Elements a=element10.getElementsByTag("name");
        System.out.println(a.size());//1

        //获取element10对象的属性值
        String num=element10.attr("number");
        System.out.println(num);//heima_0001

        //获取element10的文本内容
        String text=a.text();
        String html=a.html();
        System.out.println(text);//张 三
        System.out.println(html);//<xing>张</xing>   <ming>三</ming>



    }
}
