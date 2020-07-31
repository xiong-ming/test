package xml解析Jsoup根据选择器查询;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //1.获取student.xml的path
        String path=Main.class.getClassLoader().getResource("student.xml").getPath();
        //2.获取Document对象
        Document document= Jsoup.parse(new File(path),"utf-8");
        //3.查询name标签
        Elements elements=document.select("name");
        System.out.println(elements);
        System.out.println("------------------------------");
        //4.查询id值为1的元素
        Elements elements1=document.select("#1");//注意：要带#号
        System.out.println(elements1);
        //5.获取student标签并且number属性值为heima_0001的age子标签
        //5.1获取student标签并且number属性为heima_0001
        Elements elements2=document.select("student[number=\"heima_0002\"]");//[]里面选择复制粘贴
        System.out.println(elements2);
        System.out.println("-------------------------------------");
        //5.2获取student标签并且number属性值为heima_0001的age子标签
        Elements elements3=document.select("student[number=\"heima_0002\"]>age");//[]里面选择复制粘贴
        System.out.println(elements3);
    }
}
