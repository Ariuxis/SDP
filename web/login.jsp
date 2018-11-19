<%--
  Created by IntelliJ IDEA.
  User: antonioyu
  Date: 17/11/18
  Time: 08:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Ingreso</title>
    <style type = "text/css">
      .navigation {
        clear: both;
        width: 100%;
      }

      .navigation a {
        float: left;
        display: block;
        text-align: center;
        padding: 1.4em 2em;
        margin: 0;
      }

      .login {
        display: block;
        width: 100%;
      }
    </style>
  </head>
  <body>
    <div class = "navigation">
      <a href = "#">Inicio</a>
      <a href = "postgraduate.jsp">Posgrados</a>
      <a href = "login.jsp">Ingreso</a>
    </div>
    <div class = "login">
      <form action = "login" method = "get">
        <input type = "text" name = "username" placeholder="Usuario"><br>
        <input type = "password" name = "password"placeholder="Contraseña"><br>
        <input type = "submit" value = "Ingresar">
      </form>
    </div>
  </body>
</html>
