<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>隐式对象</title>
</head>
<body>
${pageContext.request}<br><%--org.apache.catalina.connector.RequestFacade@41188f44--%>
${pageContext.request.contextPath}<br><%--获取动态虚拟目录--%><%--/el_jstl_war_exploded--%>



</body>
</html>
