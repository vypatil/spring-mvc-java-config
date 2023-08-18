<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<h2>How to iterate list on JSP in Spring MVC</h2>

	<p><b>Simple List:</b><p>
	
	${datalist}
	
	<p><b>Iterated List:</b><p>

	<ol>
		<c:forEach var="i" items="${datalist}">
		
			<li>${i}</li>
			
		</c:forEach>
	</ol>
<a href="index.jsp">Click here to return HOME Page</a>
</body>
</html>