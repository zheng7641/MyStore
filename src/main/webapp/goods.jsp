<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货 - 嘉人的二手市场</title>
<link href="style/css.css" rel="stylesheet" type="text/css" />
<link href="style/goods.css" rel="stylesheet" type="text/css" />
<link href="style/flexslider.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<%@ include file="partofpage/head.jsp"%>
	<div id="content_wapper">
		<div class="content">
			<div class="left_image">
				<div id="slider" class="flexslider">
					<ul class="slides">
						<c:forEach items="${goods.imagesList}" var="images" begin="0" end="10">
						<li><img src="${images.imagesUrl }" /></li>
						</c:forEach>
					</ul>
				</div>
			</div>
			<div class="right_intro">
				<ul class="right_intro_property">
					<h1 class="right_intro_title">${goods.goodsName}</h1>
					<li class="right_intro_detailed"><span
						class="right_intro_detailed_span1">价&nbsp;&nbsp;&nbsp;格:</span> <span
						class="right_intro_detailed_span2">￥</span> <span
						class="right_intro_detailed_span2">${goods.price }</span></li>
					<li class="right_intro_detailed1"><span
						class="right_intro_detailed_span1">成&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;色：</span>
						<span class="right_intro_detailed_span1">${goods.quality }</span><br /></li>
					<li class="right_intro_detailed1"><span
						class="right_intro_detailed_span1">地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;点：</span>
						<span class="right_intro_detailed_span1">${goods.tradingPosition }</span><br /></li>
					<li class="right_intro_detailed1"><span
						class="right_intro_detailed_span1">联系方式：&nbsp;&nbsp;${goods.contactInformation }</span> <!-- <a href="#">点击获取</a> -->
					</li>
					<li class="right_intro_detailed1"><span
						class="right_intro_detailed_span1">交易方式：</span> <span
						class="right_intro_detailed_span1">${goods.businessDeal }</span></li>
				</ul>
				<div class="right_intro_buynow">
					<a class="right_intro_buynow_btn" href="http://localhost:8080/MyStore/order/addOrder.do?userId=${userId }&goodId=${goodId}"></a>
				</div>
			</div>
		</div>
	</div>
	<div id="content_wapper">
		<div class="content">
			<div class="goods_left_intro_list">
					<div class="goods_left_intro_btn">
						<a class="goods_left_intro_btn_1" href="#">商品详情</a> <a
							class="goods_left_intro_btn_1" href="#">留言</a>
					</div>
				</div>
		</div>
	</div>
	<div id="content_wapper">
		<div class="content">
			<div class="goods_left_intro">
				<div class="goods_left_intro_detailed">
					<h3 class="glid_title">商品详情</h3>
					<div class="glid_word">${goods.goodsDescription }</div>
				</div>
				<div class="goods_left_intro_message">
					<h3 class="glid_title">图片</h3>
					<div class="glid_img">
						<c:forEach items="${goods.imagesList}" var="images" begin="0" end="10">
						<p>
						<img src="${images.imagesUrl }"
							onload='if (this.width>728 || this.height>556) if (this.width/this.height>728/556) this.width=728; else this.height=556;'>
						</p>
						</c:forEach>
					</div>
				</div>
			</div>
			<div class="goods_right_othergoods">
				<h4 class="glid_title">卖家其他商品</h4>
				<ul>
					<c:forEach items="${otherGoodsList}" var="goods" begin="0" end="4">
					<li class="gro_sub">
						<div class="gro_sub_1">
							<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}"> 
								<img src="${goods.imagesList[0].imagesUrl }" onload='if (this.width>80 || this.height>62) if (this.width/this.height>80/62) this.width=80; else this.height=62;'>
							</a>
						</div>
						<div class="gro_sub_2">
							<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}" class="gro_sub_title"> 
								<span>${goods.goodsName}</span>
							</a>
						</div>
					</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- FlexSlider -->
	<script defer src="js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function() {
			$('#slider').flexslider({
				animation : "slide",
				controlNav : false,
				animationLoop : false,
				slideshow : false,
				sync : "#carousel",
				start : function(slider) {
					$('body').removeClass('loading');
				}
			});
		});
	</script>
	<%@ include file="partofpage/foot.jsp"%>
</body>
</html>