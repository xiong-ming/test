<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取域中的数据</title>
</head>
<body>
<%
    request.setAttribute("name","李四");
request.setAttribute("name","张三");
request.setAttribute("age","23");
%>

<h3>el获取值</h3>

${requestScope.name}
${requestScope.age}
${requestScope.hahha}

${name}

</body>
</html>
