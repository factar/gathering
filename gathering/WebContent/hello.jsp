<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello,ervery body</title>
<script type="text/javascript" src="scripts/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="scripts/keydownhandler.js"></script>
<script type="text/javascript">
function login(){
	var name = $("#username").val();
	var pwd = $("#password").val();
	var url = "<%=path%>/system/usermgmt/Login.action";
	var user = {name:name,pwd:pwd};
	$.post(url,user,loginResult,"String");
}
function loginResult(data){
	alert(data);
}
</script>
</head>
<body  onkeydown="KeyDownListener()">
  <table width="100%" height="100%">
		<tr>
			<td align="center" valign="middle">
				<form name="loginFrom" action="system/usermgmt/Login.action" method="post" >
				<table border=0>
				   	<tr align="center" height="50">
				   		<td colspan="2"><h3>hello ervery body</h3></td>
				   	</tr>
					<tr>
						<td align="right">用户名：</td>
						<td><input type="text" name="username" id="username" style="width:100px"/></td>
					</tr>
				    <tr>
				    	<td align="right">密&nbsp;&nbsp;&nbsp; 码：</td>
				    	<td><input id="password" type="password" name="password" style="width:100px"/></td>
				    </tr>
				    <tr>
				    	<td colspan="2" align="center">
				    		<input type="submit" value="登录" onclick="login()"/>
				    	</td>
				    </tr>
   				</table>
      			</form>
   			</td>
   		</tr>
   	</table>
  </body>
</html>