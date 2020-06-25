package JavaBeans_in_JSP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assignment63DBConnection 
{
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBName", "Username", "Password");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
		
		return conn;
	}
}
