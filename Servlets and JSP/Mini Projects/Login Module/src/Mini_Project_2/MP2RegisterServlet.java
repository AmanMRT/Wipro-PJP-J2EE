package Mini_Project_2;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MP2RegisterServlet")
public class MP2RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//fetch parameters from login.jsp
		String username = request.getParameter("username");
		String passwordtype = request.getParameter("passwordtype");
		String passwordconfirm = request.getParameter("passwordconfirm");
		
				try 
				{
					if(passwordtype.equals(passwordconfirm))
					{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBName", "Username", "Password");
					PreparedStatement stmt = con.prepareStatement("INSERT INTO `credentials`(`Username`, `Password`) VALUES (?,?)");
					
					stmt.setString(1, username);
					stmt.setString(2, passwordconfirm);
										
					stmt.execute(); 
					
					response.sendRedirect("Mini_Project_2Login.jsp");
					}
					else
					{
						response.sendRedirect("Mini_Project_2Register.jsp");
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.print(e);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.print(e);
				}
	}

}
