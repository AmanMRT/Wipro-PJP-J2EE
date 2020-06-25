package Mini_Project_2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MP2ChangePasswordServlet
 */
@WebServlet("/MP2ChangePasswordServlet")
public class MP2ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String passwordold = request.getParameter("passwordold");
		String passwordnew = request.getParameter("passwordnew");
		
		MP2ChangePasswordDAO dao = new MP2ChangePasswordDAO();
		
		//check credentials if correct or not
		try {
			if(dao.check(username, passwordold))
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBName", "Username", "Password");
					PreparedStatement stmt = con.prepareStatement("UPDATE `credentials` SET `Username`=?,`Password`=? WHERE Username=? ");
					
					stmt.setString(1, username);
					stmt.setString(2, passwordnew);
					stmt.setString(3, username);
					
					stmt.executeUpdate();
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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
