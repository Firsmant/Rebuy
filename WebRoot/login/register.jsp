<%@ page contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>Register Page</title>
	</head>
	<body style="text-align: center">
		<h2 align="center">新用户注册</h2>
		<s:form method="post" action="register"  cssStyle="width: 350" >
			<hr>
			<s:textfield key="login.username"  label="用 户 名" cssStyle="width:160" />
			<s:password key="login.password"  label="密	码" cssStyle="width:160" />
			<s:password key="login.repassword"  label="重输密码" cssStyle="width:160" />
			<s:submit value=" 提交 " />
		</s:form>
	</body>
</html>
