package AA;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class AA
 */
@WebServlet("/AA")
public class AA extends HttpServlet {

	@Resource(name = "jdbc/web_student_tracker")
	private DataSource datasource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// set up a print Writer
		PrintWriter out = response.getWriter();
		response.setContentType("Text/plain");

		// 2 get a connnection to a database
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String query = "select * from student";

		// 3 Create a sql query
		try {
			con = datasource.getConnection();

			st = con.createStatement();

			rs = st.executeQuery(query);

			while (rs.next()) {
				int i = rs.getInt("id");
				String f = rs.getString("first_name");
				String e = rs.getString("email");

				out.println(i + f + e);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4 Execute a sql query

		// process the result set

	}

}