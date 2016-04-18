<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货 - 嘉人的二手市场</title>
<link href="style/css.css" rel="stylesheet" type="text/css" />
<link href="style/goodlist.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- 头部标题栏和搜索框和导航标题 -->
	<%@ include file="partofpage/head.jsp"%>
	<div id="crumb-bar">
		<div class="crumb-bar">
			<div class="crumbs">
				<span>个人闲置</span> <span>></span> <a href="#">手机</a>
			</div>
		</div>
	</div>
	<div id="listcontent">
		<div class="listcontent">
			<div class="list-left">
				<div class="list-left-title">
					<h4>今日最火</h4>
				</div>
				<div class="list-left-content">
					<ul>
					<c:forEach items="${hotList}" var="goods" begin="0" end ="3">
						<li class="llc-li">
							<div class="llc-img">
								<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> <img width="190" height="190"
									src="${goods.imagesList[0].imagesUrl }">
								</a>
							</div>
							<div class="llc-name">
								<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> <em>${goods.goodsName }</em>
								</a>
							</div>
							<div class="llc-price">
								<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> <span class="llc-price-num">￥</span> <span
									class="llc-price-num">${goods.price }</span>
								</a>
							</div>
						</li>
					</c:forEach>
					</ul>
				</div>
			</div>
			<div class="list-right">
				<div class="lr-filter">
					<div class="lrf-sort">
						<a href="#">上架时间</a> <a href="#">价格</a>
					</div>
				</div>
				<div class="lr-conent">
					<ul>
					<c:forEach items="${goodsList}" var="goods" begin="0" end ="16">
						<li class="lr-content-items">
							<div class="lrc-items">
								<div class="lrc-img">
									<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> <img width="220" height="220"
										src="${goods.imagesList[0].imagesUrl}">
									</a>

								</div>
								<div class="lrc-name">
									<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> <em>${goods.goodsName }</em>
									</a>
								</div>
								<div class="lrc-price">
									<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> <span class="lrc-price-num">￥</span> <span
										class="lrc-price-num">${goods.price }</span>
									</a>
								</div>
								<div class="lrc-views">
									<span>已有200人评论 </span>
								</div>
								<div class="lrc-views">
									<span>${goods.createTime}</span>
									<span>发表</span>
								</div>
							</div>
						</li>
						</c:forEach>
					</ul>
				</div>
				<div class="bottompage">
					<div class="jogger">
						<span class="disabled">&lt; </span> 
						<span class="current">1</span>
						<a href="#?page=2">2</a> 
						<a href="#?page=3">3</a> 
						<a href="#?page=4">4</a> 
						<a href="#?page=5">5</a> 
						<a href="#?page=6">6</a>
						<a href="#?page=7">7</a>
						... 
						<a href="#?page=199">199</a> 
						<a href="#?page=200">200</a> 
						<a href="#?page=2"> &gt; </a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="partofpage/foot.jsp"%>
</body>
</html>