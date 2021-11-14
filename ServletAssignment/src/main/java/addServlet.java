import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class addServlet extends HttpServlet {

   /* public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
       int num1 = Integer.parseInt(request.getParameter("num"));
       int num2 = Integer.parseInt(request.getParameter("num2"));

       int sum = num1 + num2;

       PrintWriter out = response.getWriter();
       out.println("the total is: " + sum);
    }*/

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("this is get method of my servlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>addServlet is working</h1>");

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        try {
            int i = Integer.parseInt(num1);
            int j = Integer.parseInt(num2);

            int total = i + j;
            out.println(total);

        } catch (NumberFormatException e) {
            System.out.println("at least one invalid number in the given number: " + num1 + ", " + num2);
            request.setAttribute("error" , "your error msg");


        }
    }
}
