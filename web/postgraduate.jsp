<%--
  Created by IntelliJ IDEA.
  User: antonioyu
  Date: 18/11/18
  Time: 11:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>Posgrados</title>
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
    <p> This is the postgraduate page</p>
    <div>
      <table>
        <c:forEach items = "${postgrads}" var = "postgrad">
          <tr>
            <td><c:out value = "${postgrad.name}"/></td>
          </tr>
        </c:forEach>
      </table>
    </div>

  </body>
</html>
