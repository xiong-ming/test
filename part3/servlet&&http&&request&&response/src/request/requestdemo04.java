package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/requestdemo04")
public class requestdemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据：referce
        String referer = request.getHeader("referer");
        System.out.println(referer);
        //防盗链
        if(referer!=null){
            if (referer.contains("/servlet__http__request_war_exploded")){
                //正常访问
                System.out.println("播放电影。。。");
            }else{
                //盗链
                System.out.println("想看电影吗？来优酷吧");

            }
        }else {
            System.out.println("哪里有问题");
        }
    }
}
