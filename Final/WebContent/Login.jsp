<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Insert title here</title>
</head>

<style>
body{

background-color: lightblue;


}

.textbox{
position: absolute;
top: 100px;
left: 370px;
bordor-color: black;
padding: 80px;
background-color: white;
}

h3{
text-align: center;
color: blue;

}
h1{
text-align: center;
color: blue;

}
.button {

  position: absolute;
  left: 280px;
  top: 180px;
  display: outline-block;
 
  background-color: Navy;
  border-style:round ;
  color: white;

  font-size:18px;
 
  width: 100px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 1px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '\00bb';
  position: absolute;
  opacity: 0;
  top: 10;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 30px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}

</style>
</head>
<body>



<form action="Login" method="post">
<div class="textbox">

<h3>
Enter Username	<input type="text" name="Username">
<br></br>
<br></br>

Enter Password	<input type="password" name="Password">
</h3>
</div>
<div class="button">
<button class="button" text-align="center"><span>Log in </span></button>
</div>


</form>

</body>


</html>