<%--
  Created by IntelliJ IDEA.
  User: antonioyu
  Date: 17/11/18
  Time: 08:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Ingreso</title>
    <link rel="stylesheet" href="<c:url value = "/styles/GeneralStyles.css"/>" type="text/css">

  <%--TODO: Add a detailed style for this page.
      <style type = "text/css">
      </style>--%>
  </head>
  <body>
    <div class = "navigation">
      <a href = "index.jsp">Inicio</a>
      <a href = "postgraduate">Posgrados</a>
      <a href = "login">Ingreso</a>
      <hr>
    </div>
    <div class = "login">
      <form action = "login" method = "post">
        <input type = "text" name = "username" placeholder="Usuario"
               title="Solo se permiten caracteres alfanuméricos, no distingue entre maysúculas y minúsculas"><br>
        <input type = "password" name = "password"placeholder="Contraseña"><br>
        <input type = "submit" value = "Ingresar">
        <br>
      </form>
    </div>
  </body>
</html>
