package Mini_Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MP2logindao {
	public boolean check(String username,  String password) throws SQLException
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBName", "Username", "Password");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM credentials WHERE username = ? and password = ?");
			
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return false;
	}
}
