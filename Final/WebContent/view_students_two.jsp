<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table border="1">
<tr>
<th>FirsName</th>
<th>SecondName</th>
<th>Email</th>
</tr>

<c:forEach var="temp" items="student_list">
<tr>
<td>${temp.firstname}</td>
<td>${temp.lastname}</td>
<td>${temp.email}</td>
 </tr>

</c:forEach>
</table>
</body>
</html>