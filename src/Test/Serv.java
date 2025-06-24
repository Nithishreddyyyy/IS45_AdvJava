package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv extends HttpServlet {
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String email = getServletConfig().getInitParameter("Email");
        String website = getServletContext().getInitParameter("Website Name");
        PrintWriter out = response.getWriter();
        out.println("<center><h1>"+website+"</h1></center>");
    }
}
