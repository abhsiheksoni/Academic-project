
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<body>


<c:forEach var="s" items="${students_list}">
	
	${s}
	<br></br>

</c:forEach>


<body>

</html>