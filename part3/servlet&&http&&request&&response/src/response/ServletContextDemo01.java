package response;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*重定向*/

@WebServlet("/ServletContext")
public class ServletContextDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //1.通过request对象获取
        javax.servlet.ServletContext servletContext1 = request.getServletContext();
        //2.通过HttpServlet获取
        javax.servlet.ServletContext servletContext2 = this.getServletContext();
        System.out.println(servletContext1);
        System.out.println(servletContext2);
        System.out.println(servletContext1==servletContext2);

        /*org.apache.catalina.core.ApplicationContextFacade@3e81af
        org.apache.catalina.core.ApplicationContextFacade@3e81af
        true*/

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
