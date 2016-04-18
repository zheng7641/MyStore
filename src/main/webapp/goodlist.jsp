<%@ page language="java" contentType="text/html; charset=UTF-8"  import="java.util.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货 - 嘉人的二手市场</title>
<link href="style/css.css" rel="stylesheet" type="text/css" />
<link href="style/goodlist.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.min.js"></script>
<script src="js/jquery.page.js"></script>
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
					 <div class="tcdPageCode">
   					 </div>
				</div>
			</div>
		</div>
	</div>
	<script>
	$(document).ready(function(){
	    $(".tcdPageCode").createPage({
	        pageCount:${pageNum },
	        current:${page },
	        backFn:function(p){
	        	window.location.href="http://localhost:8080/MyStore/list.do?type=${type}&page="+p;
	        }
	    })
	});
</script>
	<%@ include file="partofpage/foot.jsp"%>
</body>
</html>