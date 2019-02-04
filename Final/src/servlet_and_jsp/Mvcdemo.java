package servlet_and_jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Mvcdemo")
public class Mvcdemo extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		//step 1 : Add data
		
		String[] students= {"Abhishek","Ashvin","Avinash","Aman","chirag"};
		request.setAttribute("students_list",students);
		
				
		//step 2: get request dispatcher
		RequestDispatcher dispatcher=
				request.getRequestDispatcher("/view_students.jsp");
		
		//step 3: forward the request to s
	
		 dispatcher.forward(request, response);
		 
	}
	
	
	
}