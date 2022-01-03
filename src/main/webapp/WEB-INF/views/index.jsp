<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="css/grid.css">
    <link rel="stylesheet" href="css/index.css">
    <script src="script/validation.js"></script>
    <title>index</title>
</head>
<body>
<header><c:import url="header.jsp"/></header>
<main>

    <form method="get" action="main">
        <h1>LOGIN</h1><br>
        <span>id:&#9;</span><input type="text" name="id"><br><br>
        <span>pw:&#9;</span><input type="text" name="pw"><br><br><br>

        <input type="button" onclick="checkInfo(form)" value="login">
        <input type="button" onclick="location.href='join'" value="join">
    </form>
</main>
<footer><c:import url="footer.jsp"/></footer>
</body>
</html>