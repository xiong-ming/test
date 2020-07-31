package response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*重定向*/

@WebServlet("/ServletContextDemo02")
public class ServletContextDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //2.通过HttpServlet获取
        javax.servlet.ServletContext servletContext = this.getServletContext();
        //3.定义文件名称
        String filename="a.jpg";
        //4.获取MiMe类型
        String mimeType = servletContext.getMimeType(filename);
        System.out.println(mimeType);//image/jpeg


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);
    }
}
