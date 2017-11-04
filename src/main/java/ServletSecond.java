import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletSecond extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException {
        getServletContext().getRequestDispatcher("/second.jsp").forward(req, res);
    }
}
