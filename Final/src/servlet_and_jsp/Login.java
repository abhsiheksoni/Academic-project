package servlet_and_jsp;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
    


		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String  uname= request.getParameter("Username");
			String pass= request.getParameter("Password");
			 
			daologin Dao= new daologin();
			
			
			//if(uname.equals("telusko")&& pass.equals("soni28"))
			try {
				if(Dao.check(uname,pass))
				{
					HttpSession session= request.getSession();
					session.setAttribute("Username",uname);
					response.sendRedirect("welcome.jsp");
					
					
				}
				else
				{
					response.sendRedirect("Login.jsp");
					
					
					
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

