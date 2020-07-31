package cesi;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Person;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class JacksonTest {
   /* java对象转json字符串*/
    @Test
    public  void test1() throws Exception {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");

        //2.创建Jackson的核心对象 new ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //3.调用对象的转换方法
        String json=mapper.writeValueAsString(p);
        System.out.println(json);//{"name":"张三","age":23,"gender":"男"}

        //writeValue将数据写到F：//a.txt文件中
        mapper.writeValue(new File("F://a.txt"),p);

        //writeValue将数据关联到write中
        mapper.writeValue(new FileWriter("F://b.txt"),p);
    }

    @Test
    public  void test2() throws Exception {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());//改前：1595988106368 改后：2020-07-29


        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);

    }

    //创建list集合
    @Test
    public  void test3() throws Exception {
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());

        Person p1 = new Person();
        p1.setName("李四");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("王五");
        p2.setAge(23);
        p2.setGender("男");
        p2.setBirthday(new Date());

        List<Person> list = new ArrayList<>();
        list.add(p);
        list.add(p1);
        list.add(p2);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);
//[{"name":"张三","age":23,"gender":"男","birthday":"2020-07-29"},
// {"name":"李四","age":23,"gender":"男","birthday":"2020-07-29"},
// {"name":"王五","age":23,"gender":"男","birthday":"2020-07-29"}
// ]
    }

    //创建map集合
    @Test
    public  void test4() throws Exception {
        Map<String,Object> map=new HashMap<>();
        map.put("name","李四");
        map.put("age",23);
        map.put("gender","男");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);//{"gender":"男","name":"李四","age":23}
    }

    /*演示：json字符串转为java对象（这种用的少）*/
    @Test
    public void test5() throws IOException {
        //1.初始化json字符串
        String json="{\"gender\":\"男\",\"name\":\"李四\",\"age\":23}";

        //2.创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        //3.将json对象转化为java对象
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);//Person{name='李四', age=23, gender='男'}
    }
}
