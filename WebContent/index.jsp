<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货 - 嘉人的二手市场</title>
<link href="style/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/index_js.js"></script>
</head>
<body>
	<!-- 头部标题栏和搜索框和导航标题 -->
	<%@ include file="partofpage/head.jsp" %>
	<!-- 导航和图片墙 -->
	<div id="wall">
		<div class="wall">
			<!-- 导航全部 -->
			<div class="nav_full">
				<!-- 左边的竖向导航 -->
				<div class="nav_left" onmouseout="mouseOut()">
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">家用电器</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">手机、数码</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">电脑、办公</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">家居、厨具</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">男装、女装</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">化妆品</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">鞋靴、箱包、钟表</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()">
						<div class="nav_item_a">
							<a href="#">运动、骑行</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver()"
						onmouseout="mouseOut()">
						<div class="nav_item_a">
							<a href="#">图书、音像</a>
						</div>
					</div>
				</div>
				<div id="nav_right" class="nav_right">
					<!-- 详细导航栏 -->
					<div id="subitem" class="subitem" onmouseover="mouseOver()"
						onmouseout="mouseOut()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="#">大标题</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="#">小标题</a> <a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a> <a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a> <a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a> <a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a>

								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="#">大标题</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a>

								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="#">大标题</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="#">小标题</a> <a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a><a class="subitems_dd_a" href="#">小标题</a><a
										class="subitems_dd_a" href="#">小标题</a><a class="subitems_dd_a"
										href="#">小标题</a>

								</dd>
							</dl>
						</div>
					</div>
					<!-- 照片墙 -->
					<div class="slider_container">
						<div class="slider_containers">
							<img src="image/image1.jpg">
						</div>
						<div class="slider_containers">
							<img src="image/image2.jpg">
						</div>
						<div class="slider_containers">
							<img src="image/image3.jpg">
						</div>
						<div class="slider_containers">
							<img src="image/image4.jpg">
						</div>
						<div class="slider_containers">
							<img src="image/image5.jpg">
						</div>
					</div>
				</div>
			</div>
			<div class="wall_right">
				<div class="notify">
					<div class="nt">
						<span>消息快报</span> <a href="#">更多&nbsp></a>
					</div>
					<div class="nc">
						<ul>
							<li><a href="#">【通知】通知的标题</a></li>
							<li><a href="#">【通知】通知的标题</a></li>
							<li><a href="#">【通知】通知的标题</a></li>
							<li><a href="#">【通知】通知的标题</a></li>
							<li><a href="#">【通知】通知的标题</a></li>
							<li><a href="#">【通知】通知的标题</a></li>
						</ul>
					</div>
				</div>
				<div class="nav_button">
					<div class="nav_btn_1">
						<a href="#"> <span class="btn_title">发布闲置</span> <span
							class="btn_subtitle">闲置换钱&nbsp快速出售</span>
						</a>
					</div>
					<div class="app_intro">
						<a href="#"> <span class="app_download_title">二货客户端</span> <span
							class="app_download_sub">让你的闲置变成钱</span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 商品展示 -->
	<div id="content_wapper">
		
		<div class="content">
			<div class="content_tiantian_title">
				<div class="tiantian_title">
					特色市场
				</div>
				<b class="title_decoration"></b>
			</div>
			<div class="content_tiantian">
				<a href="#" class="content_tiantian_left">
					<img src="goods/left.jpg">
				</a>
				<div class="content_tiantian_right">
					<a href="#" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>啊啊啊啊啊</h3><!-- 五个字 -->
							<h6>啊啊啊啊啊啊啊</h6><!-- 七个字 -->
							<h6>啊啊啊</h6>
						</div>
						<img src="goods/right.jpg">
					</a>
					<a href="#" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>啊啊啊啊啊</h3><!-- 五个字 -->
							<h6>啊啊啊啊啊啊啊</h6><!-- 七个字 -->
							<h6>啊啊啊</h6>
						</div>
						<img src="goods/right.jpg">
					</a>
					<a href="#" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>啊啊啊啊啊</h3><!-- 五个字 -->
							<h6>啊啊啊啊啊啊啊</h6><!-- 七个字 -->
							<h6>啊啊啊</h6>
						</div>
						<img src="goods/right.jpg">
					</a>
					<a href="#" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>啊啊啊啊啊</h3><!-- 五个字 -->
							<h6>啊啊啊啊啊啊啊</h6><!-- 七个字 -->
							<h6>啊啊啊</h6>
						</div>
						<img src="goods/right.jpg">
					</a>
					<a href="#" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>啊啊啊啊啊</h3><!-- 五个字 -->
							<h6>啊啊啊啊啊啊啊</h6><!-- 七个字 -->
							<h6>啊啊啊</h6>
						</div>
						<img src="goods/right.jpg">
					</a>
					<a href="#" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>啊啊啊啊啊</h3><!-- 五个字 -->
							<h6>啊啊啊啊啊啊啊</h6><!-- 七个字 -->
							<h6>啊啊啊</h6>
						</div>
						<img src="goods/right.jpg">
					</a>
				</div>
			</div>
			<div class="content_tiantian_title">
				<div class="tiantian_title">
					推荐产品
				</div>
				<b class="title_decoration"></b>
			</div>
			<div class="content_push">
				<!-- 推荐栏 -->
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub_last">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
			</div>
			<div class="content_tiantian_title">
				<div class="tiantian_title">
					猜你喜欢
				</div>
				<b class="title_decoration"></b>
			</div>
			<div class="content_push">
				<!-- 推荐栏 -->
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub_last">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<!-- 一行 -->
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
				<a href="#" class="content_push_sub_last">
					<img class="content_push_sub_img" src="goods/lanqiu.jpg" />
					<span class="content_push_sub_title">非常非常非常非常非常非常非常非常</span>
					<span class="content_push_sub_price">$11111</span>
				</a>
			</div>
		</div>
	</div>
	<!-- 尾部 -->
	<%@ include file="partofpage/foot.jsp" %>
</body>
</html>