<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KimJiyeon
  Date: 2021/12/30
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="css/grid.css">
    <link rel="stylesheet" href="css/index.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script src="script/main.js"></script>
    <title>main</title>
</head>
<body>
<header><c:import url="header.jsp"/></header>
<main>
    <h1>MAIN</h1><br>

    <span id="log"></span><br>
    <img src="img/sample.png" width="150px"><br>

    <button onclick="logout()">로그아웃</button>

</main>
<footer><c:import url="footer.jsp"/></footer>
</body>
</html>
