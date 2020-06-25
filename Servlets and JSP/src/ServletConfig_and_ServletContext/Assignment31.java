package ServletConfig_and_ServletContext;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment31")
public class Assignment31 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		//ServletContext used when same thing to be used for many servlet.
		// this will execute name specified in a particular servlet tag.
//		ServletContext ctx = getServletContext();
//		String str = ctx.getInitParameter("homename");
//		out.println(str);
		String name = request.getParameter("name");
		out.println("My name is "  + name); 
		
		//ServletConfig is used when each servlet has different value.
		//this will execute name written outside servlet tag.
		ServletConfig cg = getServletConfig();
		String strr = cg.getInitParameter("homename");
		out.println(strr);
		String name2 = request.getParameter("name");
		out.println("My name is "  + name2);	

	}

}
