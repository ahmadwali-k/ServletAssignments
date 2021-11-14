import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome to Register Servlet<h1>");

        String name = request.getParameter("user_name");
        String email = request.getParameter("user_email");
        String password = request.getParameter("password");
        String number = request.getParameter("number");

        String country = request.getParameter("country");
        String gender = request.getParameter("gender");
        String interest = request.getParameter("interest");

        out.println("Name: " + name + "==>Email: " + email +
                "==>Password: " + password + "==>Phone: " + number
                + "==>Country: " + country + "==>Gender " + gender + "==>Interest: " + interest);

    }
}
