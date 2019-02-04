<%@page import="java.util.*,AA.*" %>
<!Doctype html>

<html>
<head>
</head>

<% 
// get the students list from the  request object (sent by servlet)


List<Student>theStudents=(List<Student>) request.getAttribute("STUDENT_LIST");			

%>

<body>
<div id="wrapper">
	<div id="header">
		<h2>VIT UNIVERSITY</h2>
		</div>
		</div>
		
	<div id="container">
		<div id="content">
		
			<table>
			<tr>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL</th> 
				
			</tr>	
			<% for(Student s:theStudents) {%>
			
			<tr>
			<td> <%=  s.getfirstname() %></td>
			<td> <%=  s.getlastname()  %></td>
			<td> <%=  s.getemail()     %></td>
			 
			</tr>
			<%}%>
			
			</table>
</body>

</html>