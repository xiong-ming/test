<%@ page import="domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
</head>
<body>
   <%
       User user = new User();
       user.setName("张三");
       user.setAge(23);
       user.setBirthday(new Date());
       request.setAttribute("u",user);

       List list = new ArrayList();
       list.add("aaa");
       list.add("bbb");
       list.add(user);
       request.setAttribute("list",list);

       Map map = new HashMap();
       map.put("name","李四");
       map.put("gender","男");
       map.put("user",user);
       request.setAttribute("map",map);
   %>
<h3>获取对象中的值</h3>
${requestScope.u}<br>
${requestScope.u.name}<br>
${requestScope.u.age}<br>
${requestScope.u.birthday}<br><%--Mon Jul 27 21:12:03 CST 2020--%>
${requestScope.u.birStr}<br><%--2020-07-27 21:22:54--%>

${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[2].name}<br>

${map}<br>
${map.name}<br>
${map["gender"]}<br>
${map.user.name}<br>




</body>
</html>
