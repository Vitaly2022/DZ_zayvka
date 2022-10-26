<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <c:if test="${alarm == true}">
    <p>REINPUT</p>
  </c:if>

  <form action="/sPost" method="post">
    Name: <input name="name" />
    <br><br>
    Number: <input name="num" type="number" min="1"/>
    <br><br>
    <input type="submit" value="Submit"/>
  </form>
  </body>
</html>


