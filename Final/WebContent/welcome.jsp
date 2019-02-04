<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
{
box-sizing: border-box;
}


body{


  font-family: Arial, Helvetica, sans-serif;


background-color:lightblue;

}

.header{
background-color: white;
padding: 10px;
text-align: center;
font-size: 10px;
}

	
	
	.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  
}

/* Change color on hover */
.topnav a:hover {
  background-color: white;
  color: black;
}
	
form{

text-align: center;

}
h1{

text-align: center;
color: black;
}
h3{
float: right;
background-color: navy;

color: white;
text-align: right;
padding-right: 10px;
padding-left: 10px;
border: 3px;

}
</style>
<body>

<div class="topnav">
<a href="welcome.jsp">Home</a>

<a href="Logout.jsp">Logout</a>

<a href="#">About us </a>
<a href="Login.jsp">Feedback</a>

 <h3>Welcome ${Username}  
 

 </h3>
</div>
<br></br>
<br>



<%
	response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

	if(session.getAttribute("Username")==null)
	{
		
		response.sendRedirect("Login.jsp");
		
	}
%>

 <div class="header">
 <h1>Welcome To E-Learning
 <iframe width="200" height="200" src="https://www.youtube.com/embed/7TOmdDJc14s" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
 </h1>
 </div>
 
 
 
 

 </form>
</body>
</html>