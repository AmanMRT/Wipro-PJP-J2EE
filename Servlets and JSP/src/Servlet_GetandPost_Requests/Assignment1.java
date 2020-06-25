package Servlet_GetandPost_Requests;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Assignment21", urlPatterns = { "/Assignment21" })
public class Assignment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		Enumeration<String> reqHeaders = request.getHeaderNames();
		
		out.println("Name" + "\t" + "Value");
		while(reqHeaders.hasMoreElements())
		{
			String name = (String) reqHeaders.nextElement();
			String value = request.getHeader(name);
			
			out.println(name + "\t" + value);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
