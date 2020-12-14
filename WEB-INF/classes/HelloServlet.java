import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HelloServlet extends HttpServlet {

public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("<h4> Welcome to Servlet App </h4>");
	}
}