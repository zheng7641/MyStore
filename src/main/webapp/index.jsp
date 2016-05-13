<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货 - 嘉人的二手市场</title>
<link href="style/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/index_js.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>



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
				<div class="nav_left">
					<div class="nav_item" onmouseover="mouseOver()" onmouseout="mouseOut()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=家用电器">家用电器</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver1()" onmouseout="mouseOut1()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=手机">手机、数码</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver2()" onmouseout="mouseOut2()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=办公">电脑、办公</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver3()" onmouseout="mouseOut3()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=厨具">家居、厨具</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver4()" onmouseout="mouseOut4()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=男装">男装、女装</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver5()" onmouseout="mouseOut5()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=化妆品">化妆品</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver6()" onmouseout="mouseOut6()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=鞋">鞋靴、箱包、钟表</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver7()" onmouseout="mouseOut7()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=自行车">运动、骑行</a>
						</div>
					</div>
					<div class="nav_item" onmouseover="mouseOver8()" onmouseout="mouseOut8()">
						<div class="nav_item_a">
							<a href="http://localhost:8080/MyStore/list.do?type=书">图书、音像</a>
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
									<a href="http://localhost:8080/MyStore/list.do?type=大家电">大家电</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=冰箱">冰箱</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=洗衣机">洗衣机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=音响">音响</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=热水器">热水器</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=家电配件">家电配件</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="type.do?typeName=生活电器">生活电器</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=加湿器">加湿器</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=熨斗">熨斗</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=小插座">小插座</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=除湿机">除湿机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=干衣机">干衣机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=收音机">收音机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=取暖电器">取暖电器</a>

								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=厨房电器">厨房电器</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=电饭煲">电饭煲</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=豆浆机">豆浆机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=面包机">面包机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=咖啡机">咖啡机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=榨汁机">榨汁机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=电烤箱">电烤箱</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=电磁炉">电磁炉</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=煮蛋器">煮蛋器</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=酸奶机">酸奶机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=热水壶">热水壶</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=多用途锅">多用途锅</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=其他厨房电器">其他厨房电器</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem1" class="subitem" onmouseover="mouseOver1()"
						onmouseout="mouseOut1()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=手机配件">手机配件</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=电池">电池</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=蓝牙耳机">蓝牙耳机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=数据线">数据线</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=耳机">耳机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=手机支架">手机支架</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=贴膜">贴膜</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=保护套">保护套</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=创意配件">创意配件</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=音响">音响</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=手机饰品">手机饰品</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=拍照配件">拍照配件</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=其他手机配件">其他手机配件</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=摄影摄像">摄影摄像</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=数码相机">数码相机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=微单相机">微单相机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=单反相机">单反相机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=拍立得">拍立得</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=摄像机">摄像机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=镜头">镜头</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=户外器材">户外器材</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=影棚器材">影棚器材</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=冲印服务">冲印服务</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=数码配件">数码配件</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=存储卡">存储卡</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=读卡器">读卡器</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=支架">支架</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=滤镜">滤镜</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=自拍神器">自拍神器</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=三脚架">三脚架</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=相机包">相机包</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=其他配件">其他配件</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem2" class="subitem" onmouseover="mouseOver2()"
						onmouseout="mouseOut2()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=电脑整机">电脑整机</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=笔记本">笔记本</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=超极本">超极本</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=游戏本">游戏本</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=平板电脑">平板电脑</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=平板电脑配件">平板电脑配件</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=台式机">台式机</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=一体机">一体机</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=办公设备">办公设备</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=摄影机">摄影机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=投影配件">投影配件</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=打印机">打印机</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=点钞机">点钞机</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=文具耗材">文具耗材</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=纸类">纸类</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=办公文具">办公文具</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=计算器">计算器</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=笔类">笔类</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=画具画材">画具画材</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=其他耗材">其他耗材</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem3" class="subitem" onmouseover="mouseOver3()"
						onmouseout="mouseOut3()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=厨具">厨具</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=烹饪锅具">烹饪锅具</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=到剪菜板">到剪菜板</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=茶具">茶具</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=咖啡具">咖啡具</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=灯具">灯具</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=台灯">台灯</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=LED灯">LED灯</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=落地灯">落地灯</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=手电">手电</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=其他灯具">其他灯具</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=生活日用">生活日用</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=收纳用品">收纳用品</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=雨伞雨具">雨伞雨具</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=遮阳伞">遮阳伞</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=浴室用品">浴室用品</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=针织用品">针织用品</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=清洁工具">清洁工具</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem4" class="subitem" onmouseover="mouseOver4()"
						onmouseout="mouseOut4()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=男装">男装</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=男装">男装</a> 
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=女装">女装</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=女装">女装</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=配饰">配饰</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=丝巾">丝巾</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=腰带">腰带</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=围巾">围巾</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=帽子">帽子</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=手套">手套</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=太阳镜">太阳镜</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=游泳镜">游泳镜</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=遮阳伞">遮阳伞</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem5" class="subitem" onmouseover="mouseOver5()"
						onmouseout="mouseOut5()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=面部护肤">面部护肤</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=清洁">清洁</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=护肤">护肤</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=面膜">面膜</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=剃须">剃须</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=洗发护发">洗发护发</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=洗发">洗发</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=护发">护发</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=造型">造型</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=假发">假发</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=香水彩妆">香水彩妆</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=香水">香水</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=底妆">底妆</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=腮红">腮红</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=眼部">眼部</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=唇部">唇部</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=美甲">美甲</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem6" class="subitem" onmouseover="mouseOver6()"
						onmouseout="mouseOut6()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=鞋">鞋</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=男鞋">男鞋</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=女鞋">女鞋</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=包">包</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=男包">男包</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=女包">女包</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=功能箱包">功能箱包</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=表">表</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=钟表">钟表</a> 
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem7" class="subitem" onmouseover="mouseOver7()"
						onmouseout="mouseOut7()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=骑行运动">骑行运动</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=山地车">山地车</a> 
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=公路车">公路车</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=小标题">小标题</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=电动车">电动车</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=平衡车">平衡车</a>
								</dd>
							</dl>
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=体育用品">体育用品</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=乒乓球">乒乓球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=羽毛球">羽毛球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=篮球">篮球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=足球">足球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=轮滑滑板">轮滑滑板</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=网球">网球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=高尔夫">高尔夫</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=台球">台球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=排球">排球</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=钓鱼">钓鱼</a>
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=游泳镜">游泳镜</a>
								</dd>
							</dl>
						</div>
					</div>
					<div id="subitem8" class="subitem" onmouseover="mouseOver8()"
						onmouseout="mouseOut8()">
						<div class="subitems">
							<dl class="subitems_dl">
								<dt class="subitems_dt">
									<a href="http://localhost:8080/MyStore/list.do?type=图书">图书</a>
								</dt>
								<dd class="subitems_dd">
									<a class="subitems_dd_a" href="http://localhost:8080/MyStore/list.do?type=音像制品">音像制品</a>

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
						<span>消息快报</span> <a href="#">更多&nbsp;></a>
					</div>
					<div class="nc">
						<ul>
							 <c:forEach items="${noticeList }" var="notice">
							<li><a href="${pageContext.request.contextPath}/notice.do?noticeId=${notice.noticeId }">【通知】${notice.noticeTitle }</a></li>
							</c:forEach>
						</ul>
					</div>
				</div>
				<div class="nav_button">
					<div class="nav_btn_1">
						<a href="http://localhost:8080/MyStore/publish.jsp"> <span class="btn_title">发布闲置</span> <span
							class="btn_subtitle">闲置换钱&nbsp;快速出售</span>
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
				<a href="${pageContext.request.contextPath}/good.do?goodId=${specialGoods[0].goodsId}" class="content_tiantian_left">
					<img src="${specialGoods[0].imagesList[0].imagesUrl}">
				</a>
				<div class="content_tiantian_right">
				 <c:forEach items="${specialGoods}" var="goods" begin="1" end ="6">
					<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}" class="content_tiantian_right_a">
						<div class="content_tiantian_right_title">
							<h3>${goods.goodsName }</h3><!-- 五个字 -->
							<h6>${goods.goodsDescription }</h6><!-- 七个字 -->
							<h6>￥：${goods.price }</h6>
						</div>
						<img src="${goods.imagesList[0].imagesUrl }">
					</a>
				</c:forEach>
					
				</div>
			</div>
			<div class="content_tiantian_title">
				<div class="tiantian_title">
					新品上架
				</div>
				<b class="title_decoration"></b>
			</div>
			<div class="content_push">
				<!-- 新品上架 -->
				<c:forEach items="${newGoods}" var="goods" begin="0" end ="4">
				<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}" class="content_push_sub">
					<img class="content_push_sub_img" src="${goods.imagesList[0].imagesUrl }" />
					<span class="content_push_sub_title">${goods.goodsName }</span>
					<span class="content_push_sub_price">￥：${goods.price }</span>
				</a>
				</c:forEach>
			</div>
			<div class="content_tiantian_title">
				<div class="tiantian_title">
					猜你喜欢
				</div>
				<b class="title_decoration"></b>
			</div>
			<div class="content_push">
				<!-- 推荐栏 -->
				<c:forEach items="${loveGoods}" var="goods" begin="0" end ="4">
				<a href="${pageContext.request.contextPath}/good.do?goodId=${goods.goodsId}" class="content_push_sub">
					<img class="content_push_sub_img" src="${goods.imagesList[0].imagesUrl }" />
					<span class="content_push_sub_title">${goods.goodsName }</span>
					<span class="content_push_sub_price">￥：${goods.price }</span>
				</a>
				</c:forEach>
			</div>
		</div>
	</div>
	<!-- 尾部 -->
	<%@ include file="partofpage/foot.jsp" %>
</body>
</html>