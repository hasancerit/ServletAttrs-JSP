<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>

<%@page import="java.util.List"%>
<%@page import="attrp.Kisi"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RequestDispatcher</title>
</head>
<body>
	<h1>RequestDispatcher</h1>

	<%
		List<Kisi> kList = (List<Kisi>) request.getAttribute("KisiList");
	%>

	<table style="width: 300px">
		<%
			for (Kisi person : kList) {
		%>
		<tr>
			<td><%=person.getIsim()%></td>
			<td><%=person.getSoyisim()%></td>
			<td><%=person.getYas()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>