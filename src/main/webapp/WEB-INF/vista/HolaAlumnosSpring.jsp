<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href= "${pageContext.request.contextPath}/recursos/css/miestilo.css">
</head>
<body>

Hola ${param.nombreAlumno}. Bienvenido al curso de Spring

<h1>Atención a todos</h1>
<p><br>
${mensajeClaro}

</p>

<img alt="imagen" src= "${pageContext.request.contextPath}/recursos/imagenes/cuy.png">


</body>
</html>