package AA;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int i = Integer.parseInt(req.getParameter("first"));
		int k = Integer.parseInt(req.getParameter("second"));

		int l = i + k;

		PrintWriter out = res.getWriter();
		out.println("addition is=" + l);

	}

}
