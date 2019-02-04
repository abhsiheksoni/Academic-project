package AA;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class Db {

	private static DataSource datasource;

	public Db(DataSource thedatasource) {
		datasource = thedatasource;

	}

	public static List<Student> getStudents() throws Exception {
		List<Student> students = new ArrayList<>();
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			// 1 get a connection
			con = datasource.getConnection();
			// 2 create sql statement
			String query = "select * from student order by last_name";

			st = con.createStatement();

			// 3 execute query
			rs = st.executeQuery(query);

			// 4 process result
			while (rs.next()) {

				// retrieve data form result set row
				int id = rs.getInt("id");
				String firstname = rs.getString("first_name");
				String lastname = rs.getString("last_name");
				String email = rs.getString("email");

				// create new student object
				Student tempstudent = new Student(id, firstname, lastname, email);

				// add it to the list of student
				students.add(tempstudent);
			}

			// 5 close connection

			return students;
		}

		finally {

		}

	}

}
