package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*演示request对象获取请求行数据*/
@WebServlet("/requestdemo01")
public class requestdemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.获取请求方式：GET
        String method = request.getMethod();
        System.out.println(method);

        //（*）2.获取虚拟目录：servlet__http__request_war_exploded
        String contextPath = request.getContextPath();
        System.out.println(contextPath);

        //3.获取servlet路径：/requestdemo01
        String servletPath = request.getServletPath();
        System.out.println(servletPath);

        //4.获取get方式请求参数：name=zhangsan
        String queryString = request.getQueryString();
        System.out.println(queryString);

        //(*)5.获取请求URI和URL：
        String requestURI = request.getRequestURI();
        StringBuffer requestURL = request.getRequestURL();
        System.out.println(requestURI);
        //servlet__http__request_war_exploded/requestdemo01
        System.out.println(requestURL);
        //http://localhost:8081/servlet__http__request_war_exploded/requestdemo01

        //6.获取协议和版本：HTTP/1.1
        String protocol = request.getProtocol();
        System.out.println(protocol);

        //7.获取客户机的ip地址：0:0:0:0:0:0:0:1
        String remoteAddr = request.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
