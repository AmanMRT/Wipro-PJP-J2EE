package Mini_Project_2;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MP2LoginServlet")
public class MP2LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//fetch parameters from login.jsp
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				MP2logindao dao = new MP2logindao();
				
				//check credentials if correct or not
				try {
					if(dao.check(username, password))
					{
						HttpSession session = request.getSession();
						session.setAttribute("username", username);
						
						//if correct credentials goto welcome.jsp
						response.sendRedirect("welcome.jsp");
					}
					else
					{
						//else login.jsp
						response.sendRedirect("Mini_Project_2Login.jsp");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
