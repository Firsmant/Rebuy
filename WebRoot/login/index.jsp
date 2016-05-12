<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
 <body>
  <table bgcolor="#71CABF" align="center">
  	<tr>
   	<td height="360" valign="top">
   		<table border="1" align="center" width="570" cellpadding="10" cellspacing="0" bgcolor="#71CABF" class="font1">
   			<tr bgcolor="#E9EDF5">
   				<th>照片</th><th>标题</th><th>价格</th><th>描述</th>
   			</tr>
   			<s:iterator value="#request.list" id="updata">
   			<tr>
   				<!--  <td><img id="image" src="getImage.acion?updata.upid=<s:property value="#updata.upid"/>" width="100" height="80"  ></td> -->
   				<td><img alt="未上传头像" width="100;" height="80;" src="<%=path%>${updata.upphoto}"></td>
   				<td><s:property value="#updata.title"/></td>
   				<td><s:property value="#updata.price"/></td>
   				<td><s:property value="#updata.describe"/></td>
   			</tr>
   			</s:iterator>
   		</table>
   	</td>
   </tr>
   <tr><td align="center"><font color="red">
   		<s:property value="message"/></font></td>
   </tr>
   <tr bgcolor="#E9EDF5" class="font1">
   		<td align="right">
   		<!-- 取出 page -->
   			<s:set name="page" value="#request.page"></s:set>
   			<!-- 首页始终显示第一页 -->
   			<a href="selectUpdata.action?pageNow=1">首页</a>
   			<!-- 如果有前一页就提交前一页的pageNow值 -->
   			<s:if test="#page.hasPre">
   				<a href="selectUpdata.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
   			</s:if>
   			<!-- 如果没有就提交第一页的pageNow值 -->
   			<s:else>
   				<a href="selectUpdata.action?pageNow=1">上一页</a>
   			</s:else>
   			<!-- 如果有下一页就提交下一页的pageNow值 -->
   			<s:if test="#page.hasNext">
   				<a href="selectUpdata.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
   			</s:if>
   			<!-- 如果没有就提交最后一页的pageNow值 -->
   			<s:else>
   				<a href="selectUpdata.action?pageNow=<s:property value="#page.totalPage"/>">下一页</a>
   			</s:else>
   				<a href="selectUpdata.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
   		</td>
   </table>
  </body>
</html>
