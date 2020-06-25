package JavaBeans_in_JSP;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Assignmnet63")
public class Assignmnet63 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Connection conn = Assignment63DBConnection.getConnection();

		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO credintials VALUES(?, ?, ?)");
			pstmt.setString(1, request.getParameter("name"));
			pstmt.setInt(2, Integer.parseInt(request.getParameter("id")));
			pstmt.setString(3, request.getParameter("designation"));
			pstmt.executeUpdate();
			out.println("Success");
			request.setAttribute("result", "Success");
		} catch (SQLException e) {
			request.setAttribute("result", "Failed");
			out.println("Failed");
			e.printStackTrace();
		}
	}

}
