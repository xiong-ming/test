package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*案例*/
@WebServlet("/CookiedemoTest")
public class CookiedemoTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //设置响应的消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");
        //1.获取所有的cookie
        Cookie[] cookies = request.getCookies();
        boolean flag=false;//没有cookie为lastTime
        //2.遍历cookie数组
        if(cookies!=null&&cookies.length>0){
            for (Cookie cookie : cookies) {
                //3.获取cookie名称
                String name = cookie.getName();
                //4.判断名称是否是：lastTime
                if ("lastTime".equals(name)){
                    //有该cookie，不是第一次访问

                    flag=true;//有lastTime的cookie

                     //设置cookie的value
                    //获取当前的时间字符串，重新设置cookie的值，重新发送cookie
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
                    String str_date = sdf.format(date);
                    cookie.setValue(str_date);
                    //设置cookie的存活时间
                    cookie.setMaxAge(60*60*24*30);//一个月
                    response.addCookie(cookie);


                    //响应数据
                    //获取cookie的value，时间
                    String value = cookie.getValue();
                    response.getWriter().write("<h1>欢迎回来，您上次访问的时间为："+value+"</h1>");
                    break;
                }
                if (cookies==null || cookies.length==0||flag==false){

                    //没有该名称的cookie，第一次访问

                    //设置cookie的value
                    //获取当前的时间字符串，重新设置cookie的值，重新发送cookie
                    Date date=new Date();
                    SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
                    String str_date = sdf.format(date);
                    Cookie cookie1=new Cookie("lastTime",str_date);
                    //设置cookie的存活时间
                    cookie1.setMaxAge(60*60*24*30);//一个月
                    response.addCookie(cookie1);

                    response.getWriter().write("<h1>您好，欢迎首次访问</h1>");
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
