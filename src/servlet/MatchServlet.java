package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MatchServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("Servlet reached.");
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<h1>Hello Servlet Get</h1>");
//		out.println("</body>");
//		out.println("</html>");	
	}
	
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
//		int i = 4;
//	}
}
