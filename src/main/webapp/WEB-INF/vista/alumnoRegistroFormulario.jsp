<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  MVC tags -->
<form:form action="procesarFormulario" modelAttribute="elAlumno">
	Nombre: <form:input path="nombre"/>  <!-- getNombre -->
	<br><br>
	Apellidos: <form:input path="apellido"/>  <!-- getNombre -->
	</br></br></br>
	Asignaturas optativas
	<br>
	<form:select path="optativa" multiple="true">
		<form:option value="Dise�o" label="Dise�o"/>
		<form:option value="Karate" label="Karate"/>
		<form:option value="Comercio" label="Comercio"/>
		<form:option value="Danza" label="Danza"/>
	</form:select>
	<input type="submit" value="Enviar">
</form:form>

</body>
</html>