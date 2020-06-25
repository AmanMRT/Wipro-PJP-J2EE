package Introduction_to_JSP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment51")
public class Assignment51 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	    PrintWriter out = response.getWriter();
		int num = Integer.parseInt(request.getParameter("num"));
		
		int i=0,j=0;
       
		ArrayList<Integer> al = new ArrayList<>();

			//Prime number logic starts
	       for (i = 1; i <num; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(j =i; j>=1; j--)
	          {
	             if(i%j==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter == 2)
	          {
	        	  al.add(i);
	          }	
	       }//Prime number logic ends
			
			request.setAttribute("al", al);
			RequestDispatcher rd = request.getRequestDispatcher("Assignment51index.jsp");
			rd.forward(request, response);
	}
}
