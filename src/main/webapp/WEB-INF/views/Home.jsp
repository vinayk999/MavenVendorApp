<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Welcome to maven VendorApplication</h3>
 
 
<%--  <c:out value="${emp1.getEmpId()},${emp1.getEmpName()}"></c:out> --%>

 <%-- <c:forEach items="${data}" var="ob">
<c:out value="${ob}"/></br>
</c:forEach> --%>
 <%-- <c:forEach items="${emp}" var="e">
 <c:out value="${e}"/>
 </c:forEach> --%>
 <%--</br>
${data.toString()} --%>
<table border="1">
<tr>
<th>EID</th>
<th>ENAME</th>
<th>ESAL</th>
</tr>
<c:forEach items="${data}" var="ob">
<tr>
<td><c:out value="${ob.getEmpId()}"/></td>
<td><c:out value="${ob.getEmpName()}"/></td>
<td><c:out value="${ob.getEmpSal()}"/></td>
</tr>
</c:forEach>
</table>
<%-- <c:forEach items="${data}" var="ob">
<c:out value="${ob}"/></br>
</c:forEach>
 --%>
 
</body>
</html>