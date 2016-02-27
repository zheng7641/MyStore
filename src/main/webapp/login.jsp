<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link href="style/register.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="nc-login-layout">
	<div class="nc-login">
		<div class="nc-login-title">
			<h3>用户登陆</h3>
		</div>
		<div class="nc-login-content">
			<form id="register_form" method="post" action="user/login.do">
				<dl>
					<dt>用户名</dt>
					<dd style="min-height:54px;">
					<input type="text" id="user_name" name="userName" class="text tip" title="3-20位字符，可由中文、英文、数字及“_”、“-”组成" />
					<label></label></dd>
				</dl>
				<dl>
					<dt>密码</dt>
					<dd style="min-height:54px;">
					<input type="password" id="password" name="password" class="text tip" title="6-16位字符，可由英文、数字及标点符号组成" />
					<label></label></dd>
				</dl>
				<dl>
					<dt>&nbsp;</dt>
					<dd>
					<input type="submit" name="Submit" value="" class="submit fl" title="立即注册" style="background:url('image/login.png') no-repeat;" />
					<dt>&nbsp;</dt>
					<dd>
				</dl>
				<input type="hidden" value name="ref_url">
				<input name="nchash" type="hidden" value="206f94ec" />
			</form>
			<div class="clear">
			</div>
		</div>
		<div class="nc-login-bottom">
		</div>
	</div>
</div>
</body>
</html>