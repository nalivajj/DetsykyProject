import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class ServletThird extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userPassword = req.getParameter("userPassword");
        String userEmail = req.getParameter("userEmail");
        User temp = new User(userEmail, userPassword);
        PreparedStatement statement;
        Connection connection = DBConnection.createConnection();
        try {
            String sql = "INSERT INTO \"User\"(email, password) " + " VALUES (?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, temp.getEmail());
            statement.setString(2, temp.getPassword());
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getServletContext().getRequestDispatcher("/third.jsp").forward(req, resp);
    }

}
