import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException,IOException

    {
        getServletContext().getRequestDispatcher("/first.jsp").forward(req, resp);
        //res.setContentType("text/html;charset=utf-8");//setting the content type
       // PrintWriter pw=res.getWriter();//get the stream to write the data
        //writing html in the stream
       //pw.println("<H1>Hello, world! Servlet 1</H1>");


        //pw.close();//closing the stream
    }


}