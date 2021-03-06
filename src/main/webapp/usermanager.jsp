<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已发布列表</title>
<link href="style/usermanager.css" rel="stylesheet" type="text/css" />
<link href="style/css.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.min.js"></script>
<script src="js/jquery.page.js"></script>
</head>
<body>
	<!-- 头部标题栏 -->
	<div id="content">
		<div class="content-wrapper">
			<div class="header">
				<div class="left">
					<span>欢迎来到二手商品网站</span>
				</div>
				<div class="right">
					<a href="http://localhost:8080/MyStore/shoopingCart.do?userId=${userId }&page=1">购物车</a> <a href="http://localhost:8080/MyStore/usermanager.do?userId=${userId }">卖家中心</a> <a href="http://localhost:8080/MyStore/login.jsp">登录</a> <a
						href="http://localhost:8080/MyStore/register.jsp">注册</a>
				</div>
			</div>
		</div>
	</div>

	<div id="content">
		<div class="content-wrapper">
			<div class="search">
				<div class="search-img">
					<img src="image/logo3.jpg">
				</div>
				<div class="search-form">
					<!-- 搜索框 -->
					<form action="search.do" method="post">
						<input class="search-form-input" type="text" name="search" /> <input
							class="search-form-button" type="submit" value="搜索" />
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="content">
		<div class="content-wrapper">
			<div class="um">
				<div class="um-left">
					<div class="um-left-wrapper">
						<div class="um-left-wrapper-title">
							<span>我的应用</span>
						</div>
						<div class="um-left-wrapper-entry">
							<ul>
								<li class="um-left-wrapper-category"><a href="http://localhost:8080/MyStore/shoopingCart.do?userId=${userId }&page=1">购物车</span></a>
								<li class="um-left-wrapper-category"><a href="http://localhost:8080/MyStore/publish.jsp">发布商品</span></a>
								<li class="um-left-wrapper-category"><a href="http://localhost:8080/MyStore/usermanager.do?userId=${userId }">已发布列表</span></a>
							</ul>
						</div>
					</div>
				</div>
				<div class="um-right">
					<div class="um-right-title">
						<span>已发布列表</span>
					</div>
					<div class="um-right-wrapper">
					<c:forEach items="${goodsList}" var="goods" begin="0" end ="5">
						<div class="um-right-items">
							<div class="um-right-items-top">
								<span class="um-right-items-top-item">${goods.createTime }</span> <span
									class="um-right-items-top-item">商品号:</span> <span>${goods.goodsId*98113223 }</span>

								<a class="um-right-items-top-item2" href="${pageContext.request.contextPath}/umdelete.do?goodsId=${goods.goodsId}">删除</a> <a
									class="um-right-items-top-item2" href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"></a>
							</div>
							<div class="um-right-items-body">
								<div class="um-right-items-img">
									<img src="${goods.imagesList[0].imagesUrl}"
										onload='if (this.width>100 || this.height>100) if (this.width/this.height>100/100) this.width=100; else this.height=100;'>
								</div>
								<div class="um-right-items-intro">
									<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}">${goods.goodsName }</a>
								</div>
								<div class="um-right-items-watch">
									<span>已有</span>
									<span>300</span>
									<span>人浏览</span>
								</div>
								<div class="um-right-items-money">
									<span>￥</span>
									<span>${goods.price }</span>
								</div>
							</div>
						</div>
						</c:forEach>
					</div>
				</div>
			</div>
			<div class="bottompage">
					 <div class="tcdPageCode">
   					 </div>
				</div>
		</div>
	</div>
	<script>
	$(document).ready(function(){
	    $(".tcdPageCode").createPage({
	        pageCount:${allPage},
	        current:${page},
	        backFn:function(p){
	        	window.location.href="http://localhost:8080/MyStore/usermanager.do?userId=${userId}&page="+p;
	        }
	    })
	});
</script>
	<%@ include file="partofpage/foot.jsp" %>
</body>
</html>