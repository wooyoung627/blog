<%--
  Created by IntelliJ IDEA.
  User: wooyoung
  Date: 21. 2. 23.
  Time: 오후 3:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/loginAsk" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    이름 : <label>
    <input type="text" name="userId">
</label><br>
    비밀번호 : <label>
    <input type="text" name="userPw">
</label><br>
    <input type="submit" value="전송">
</form>
</body>
</html>
