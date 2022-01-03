<%--
  Created by IntelliJ IDEA.
  User: KimJiyeon
  Date: 2021/12/30
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/grid.css">
    <link rel="stylesheet" href="css/index.css">
    <script src="script/validation.js"></script>
    <title>join</title>
</head>
<body>
<header><c:import url="header.jsp"/></header>
<form method="get" action="">
    <h1>JOIN</h1><br>
    <span>id:&#9;</span><input type="text"><br><br>
    <span>pw:&#9;</span><input type="text"><br><br><br>
    <input type="button" onclick="checkInfo(form)" value="join">
</form>
<c:import url="footer.jsp"/>
</body>
</html>