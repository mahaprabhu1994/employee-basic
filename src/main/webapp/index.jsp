<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%ArrayList<Object> nameArray = (ArrayList<Object>)request.getAttribute("nameArray")  ; %>


</head>
<body>
	<h1>Employee Registraion Form</h1>

	<html:form action="empreg" method="post">

		<table>
			<thead></thead>
			<tbody>
				<tr>
					<td>ID:</td>
					<td><html:text property="empid" /></td>
					<td><html:errors property="empid_e" /></td>
				</tr>
				<tr>
					<td>Name:</td>
					<td><html:text property="empname" /></td>
					<td><html:errors property="empname_e" /></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><html:text property="empaddress" /></td>
					<td><html:errors property="empaddress_e" /></td>
				</tr>
				<tr>
					<td>Gender: Male</td>
					<td><html:radio property="empgender" value="male" /></td>
					<td><html:errors property="empgender_e" /></td>
				</tr>
				<tr>
					<td>Gender: Female</td>
					<td><html:radio property="empgender" value="female" /></td>
					<td></td>
				</tr>
				<tr>
					<td>Hobbies:</td>
					<td><html:checkbox property="emphobbies" value="hobbie1" />Playing
						Cricket</td>
					<td><html:errors property="emphobbies_e" /></td>
				</tr>
				<tr>
					<td>Hobbies:</td>
					<td><html:checkbox property="emphobbies" value="hobbie2" />Internet
						Surfing</td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td><html:submit value="Submit" /></td>
					<td></td>
				</tr>
			</tbody>
		</table>

	</html:form>
	
	<div>
	<h1>Result</h1>
	<table>
	<tbody>
	<div>
<% if (nameArray != null) { %>
    <ul>
        <% for (Object obj : nameArray) { %>
            <li><%= (obj instanceof String) ? (String) obj : obj.toString() %></li>
        <% } %>
    </ul>
<% } else { %>
    <p>Names list is empty or not defined.</p>
<% } %>


	</div>

	
	</tbody>
	
	</table>
	
	</div>
</body>
</html>