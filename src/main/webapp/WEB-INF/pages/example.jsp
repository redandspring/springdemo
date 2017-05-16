<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css">
</head>
<body>
<div style="padding: 100px;">
<h1>GREETING</h1>
HELLO ${message} 1
<br />
<br />
<br />
PreMessage:
<pre>${preMessage}</pre>
</div>
</body>
</html>
