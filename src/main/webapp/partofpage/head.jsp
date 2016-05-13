<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<!-- 头部标题栏 -->
	<div id="header">
		<div class="wrapper">
			<div class="left">
				<span>欢迎来到二手商品网站</span>
			</div>
			<div class="right">
				<a href="http://localhost:8080/MyStore/shoopingCart.do?userId=${userId }&page=1">购物车</a> <a href="http://localhost:8080/MyStore/usermanager.do?userId=${userId }">卖家中心</a> <a href="http://localhost:8080/MyStore/login.jsp">登录</a> <a
					href="http://localhost:8080/MyStore/register.jsp">注册</a>
			</div>
		</div>
	</div>
	<!-- 搜索框和logo -->
	<div id="search">
		<div class="search_wrapper">
			<div class="logo">
				<a href="http://localhost:8080/MyStore/index.do"><img src="image/logo3.jpg" /></a>
			</div>
			<div class="search_1">
				<!-- 搜索框 -->
				<form action="search.do" method="post">
					<input class="search_1_input" type="text" name="search" /> <input
						class="search_1_button" type="submit" value="搜索" />
				</form>
			</div>
		</div>
	</div>
	<div id="navigation">
		<div class="nav">
			<div class="sort">
				<span>欢迎来到二货</span>
			</div>
		</div>
	</div>
</body>
</html>