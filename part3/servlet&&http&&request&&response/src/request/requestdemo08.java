package request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/requestdemo08")
public class requestdemo08 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post 获取请求参数
        request.setCharacterEncoding("utf-8");
        System.out.println("demo8888被访问了");
        request.setAttribute("a","hello");
        ServletContext servletContext = request.getServletContext();
        System.out.println(servletContext);

        //转发到demo09资源
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("/requestdemo09");
        requestDispatcher.forward(request,response);*/
        request.getRequestDispatcher("/requestdemo09").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
