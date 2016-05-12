<%@ page contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>Login Page</title>
	</head>
	<body style="text-align: center">
		<h2>用户登录</h2>
		<hr>
		<s:form method="post" action="login"  cssStyle="width: 350" >
			<hr>
			<s:actionerror cssStyle="color: red"/>
			<s:fielderror cssStyle="color: red" />
			<s:textfield key="login.username"  label="用 户 名" cssStyle="width:160" />
			<s:password key="login.password"  label="密 	码" cssStyle="width:160" />
			<s:submit value=" 提交 " />
		</s:form>
	</body>
</html>
