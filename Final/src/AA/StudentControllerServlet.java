package AA;

import java.util.List;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Db db;

	@Resource(name = "jdbc/web_student_tracker")
	private DataSource datasource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			db = new Db(datasource);
		}

		catch (Exception exc) {
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			listStudents(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// get students from Db

		List<Student> students = Db.getStudents();
		// add students to the request
		request.setAttribute("STUDENT_LIST", students);
		// send to the jspp
		RequestDispatcher dis = request.getRequestDispatcher("/list-students.jsp");
		dis.forward(request, response);

	}

}
