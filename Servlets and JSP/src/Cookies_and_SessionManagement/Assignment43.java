package Cookies_and_SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Assignment43")
public class Assignment43 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Create a session object if it is already not  created.
	    HttpSession session = request.getSession(true);
	       
	    // Get session creation time.
	    Date createTime = new Date(session.getCreationTime());
		
	    PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("num")); 	//this value is retrieved from Index.jsp

		// Cookie Management 
		Cookie cookie = new Cookie("cookie", num+"");		//create object of Cookie class
		response.addCookie(cookie);							//add cookie with response object
	 
		Cookie cookies[] = request.getCookies();
		for(Cookie c: cookies) 
		{
			String name = c.getName();
		   	String value = c.getValue();
		
		String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";

		out.println(docType +
			"<html>\n" +
	          "<head></head>\n" +
	          
	          "<body>\n"
	         +
	             "<h2 align = \"center\">Cookie Infomation</h2>\n" +
	             "<table border = \"1\" align = \"center\">\n" +
	                
	                "<tr bgcolor = \"#949494\">\n" +"  <th>Cookie info</th><th>value</th></tr>\n" +
	                   
	                "<tr>\n" +"  <td>id</td>\n" +"  <td>" + session.getId() + "</td></tr>\n" +
	                
	                "<tr>\n" + "  <td>Creation Time</td>\n" +"  <td>" + createTime + "  </td></tr>\n" +
	                
	                "<tr>\n" +"  <td>Name</td>\n" +"  <td>" + name + "  </td></tr>\n" +
	                
	                "<tr>\n" + "  <td>Value</td>\n" + "  <td>" + value + "  </td> </tr>\n" +
	                
	             "</table>\n" +
	             "</body></html>"
	    );
		}
	}
}
