package AA;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.activation.DataSource;
import javax.annotation.Resource;

public class StudentDbutil {

	@Resource(name = "jdbc/web_student_tracker")
	private DataSource datasource;

	public StudentDbutil(DataSource thedatasource) {

		datasource = thedatasource;

	}

	public List<Student> getStundents() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		return null;

	}

}
