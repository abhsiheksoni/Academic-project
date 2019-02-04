package servlet_and_jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class daologin {
	
	String url= "jdbc:mysql://localhost:3306/dp";
	String username="root";
	String password="2828";
	String query="select * from login where uname=? and pass=?";
			

	public boolean check (String uname, String pass) throws ClassNotFoundException, SQLException
	
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,username,password);
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs= st.executeQuery();
		if(rs.next())
		{
			return true;
		}
		
		return false;
	
		
		
	}
	
	
}
