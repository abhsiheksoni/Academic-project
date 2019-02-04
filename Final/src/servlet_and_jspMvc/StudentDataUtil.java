package servlet_and_jspMvc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;
import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

import AA.Student;

public class StudentDataUtil {
	@Resource(name="jdbc/web_student_tracker")
	
	private DataSource datasource;
	
	public StudentDataUtil(DataSource theDataSource)
	{
		datasource= theDataSource;
		
		
		
	}
	
	public  List<Student> getStudents() throws Exception
	{
		List<Student> students = new ArrayList<>();
		
	
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		String query="";
		
		con=datasource.getConnection();
		
		st= con.createStatement();
		
		rs=st.executeQuery(query);
		
		
		
		
		
		return students;
		
		
		
		
	}

}
