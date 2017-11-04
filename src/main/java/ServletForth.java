import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class ServletForth extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String var=req.getParameter("idValue");
       Statement statement;
       Connection connection = DBConnection.createConnection();
        String str = null;
        try {
            String sql = "SELECT * FROM \"User\" WHERE id=" + var;
            statement = connection.createStatement();
            ResultSet temp=statement.executeQuery(sql);
            while(temp.next())
            {
                str=temp.getString(1) + " " + temp.getString(2) + " " + temp.getString(3);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        req.getSession().setAttribute("atr",str);

        getServletContext().getRequestDispatcher("/third.jsp").forward(req, resp);

    }
}
