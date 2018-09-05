<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<body>
<h2>Hello World!</h2>
click here for Home page<a href="mvc/show">click here</a>
Click Here for Customer reg<a href="mvc/custReg">Customer Reg</a>

<%

String s=request.getContextPath();
		int i=request.getContentLength();
		String s1=request.getContentType();
		String s3=request.getContextPath();
		out.print(s+i+s1+s3);
		%>
</body>
</html>
