package Mini_Project_1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MiniProject1")
public class MiniProject1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String itemname = request.getParameter("itemname");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		int amount = Integer.parseInt(request.getParameter("amount"));
		boolean status = request.getParameter("status") != null;
		
		String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";

		out.println(docType +
			"<html>\n" +
	          "<head></head>\n" +
	          
	          "<body bgcolor = \"yellow\">\n" + 
	             "<h1 align = \"center\">Bid Submitted</h1>\n" +
	             "<h3 align = \"center\">Your Bid is now active. If your bid is successful, you will be notified within 24 hours of closing of bid.</h3>\n" +
	             "<table border = \"1\" align = \"center\">\n" +
	                
	                "<tr bgcolor = \"#0000\" color = \"#ffff\">\n" +"  <td>" + itemname + "</td></tr>\n" +
	                   
	                "<tr>\n" +"  <td>Item Id:" + id + "</td></tr>\n" +
	                
	                "<tr>\n" + "  <td>Name:" + username + "  </td></tr>\n" +
	                
	                "<tr>\n" +"  <td>Email Address:"+ email + "  </td></tr>\n" +
	                
	                "<tr>\n" + "  <td>Bid Price:" + amount + "  </td> </tr>\n" +
	                
 					"<tr>\n" + "  <td>Auto-Increment Price:" + status + "  </td> </tr>\n" +
	                
	             "</table>\n" +
	             "</body></html>" 
	    ); 
		
	}
}
