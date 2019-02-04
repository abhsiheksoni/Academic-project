package servlet_and_jspMvc;

import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AA.Student;

@WebServlet("/MvcDemoServlet")
public class MvcDemoServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		// step1 get the data from the helper class
		List<Student> students= StudentDataUtil.getStudents();
		
		
		// step 2 add this list to the request object 
		req.setAttribute("student_list",students);
		
		
		// step 3 get request dispatcher
		RequestDispatcher dispatcher=
				req.getRequestDispatcher("view_students_two.jsp ");
		// step 4 now forward it to the jsp
		
	dispatcher.forward(req, res);
	
	}
	
}
