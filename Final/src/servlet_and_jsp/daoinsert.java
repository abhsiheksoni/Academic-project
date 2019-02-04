package servlet_and_jsp;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class daoinsert extends HttpServlet {
	
	
	
		
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		PrintWriter out=response.getWriter();
		
		String url="jdbc:mysql://localhost:3306/dp";
		
		String user="root";
		String password="2828";
		String uname=request.getParameter("Username");
		String pass= request.getParameter("Password");
		String insert="insert into login values ?,?";
		
				
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		PreparedStatement st= con.prepareStatement(insert);
		st.setString(1, uname);
		st.setString(2, pass);
		
		st.executeUpdate();
		
	
		
		
		
		
			
			 
		
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	
		

	
	
	
	
	
	
	}

}
