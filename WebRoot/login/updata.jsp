<%@ page contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title>Register Page</title>
	</head>
	<body style="text-align: center">
	  			<s:iterator value="#setMessage" id="message">message</s:iterator>
		<h2 align="center">上传</h2>
		<s:form method="post" action="addupdata"  cssStyle="width: 350" theme="simple" enctype="multipart/form-data" validate="true">
			用户名：<s:textfield key="updata.username"  label="用 户 名" cssStyle="width:160" /><br>
			标题：<s:textfield key="updata.title"  label="标题" cssStyle="width:160" /><br>
			价格：<s:textfield key="updata.price"  label="价格" cssStyle="width:160" /><br>
			描述：<s:textfield key="updata.describe"  label="描述" cssStyle="width:160" /><br>
			类型：<s:textfield key="updata.type"  label="类型" cssStyle="width:160" /><br>
			
	<tr>
	   <td align="right">请选择文件:</td>
	   <td align="left"><input type="file" name="myFile"/></td>   
	</tr><br>
			电话：<s:textfield key="updata.phone"  label="电话" cssStyle="width:160" /><br>
			QQ：<s:textfield key="updata.qqnum"  label="QQ" cssStyle="width:160" /><br>
			发布者姓名：<s:textfield key="updata.upname"  label="发布者姓名" cssStyle="width:160" /><br>
		<td align="center" colspan="2"><input type="submit" value="上传" /></td>
		</s:form>
	</body>
</html>
