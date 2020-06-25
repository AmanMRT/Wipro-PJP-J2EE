package JavaBeans_in_JSP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment62")
public class Assignment62 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
				
		int number = Integer.parseInt(request.getParameter("num"));
				
		request.setAttribute("number", number);
		
		if (number < 10)
		{
			request.getRequestDispatcher("Page1.jsp").forward(request, response);
		}
		else if (number >= 10 && number < 99)
		{
			request.getRequestDispatcher("Page2.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
	}
}
