<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布商品</title>
<link href="style/usermanager.css" rel="stylesheet" type="text/css" />
<link href="style/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/publish.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script>
	function sendJson1() {
		$.post('addgoods.do',{
			goodsName: "1"
			}, 
			function(data, status) {
			alert("Data: " + data + "\nStatus: " + status);
		});
	};
</script>
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
					<a href="#">我的订单</a> <a href="#">卖家中心</a> <a href="#">登录</a> <a
						href="#">注册</a>
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
					<form action="addgoods.do">
						<input class="search-form-input" type="text" name="goodsName" /> 
						<input class="search-form-button" type="submit" value="搜索" />
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
								<li class="um-left-wrapper-category"><a href="#">发布商品</span></a>
								<li class="um-left-wrapper-category"><a href="#">已发布列表</span></a>
							</ul>
						</div>
					</div>
				</div>
				<div class="um-right">
					<div class="um-right-title">
						<span>发布商品</span>
					</div>
					<div class="um-right-wrapper">
						<div class="um-right-publish">
							<form id="uploadForm" action="addgoods.do">
								<div class="um-right-publish-content">
									<span class="um-right-publish-title">标题</span> 
									<input name="goodsName" type="text" class="um-right-publish-input">
								</div>
								<div class="um-right-publish-content">
									<span class="um-right-publish-title">商品类型</span> 
									<input id="goodsType" type="hidden" class="um-right-publish-input">
									<select class="um-right-publish-typebtn">
										<option value="冰箱">冰箱</option>
										<option value="洗衣机">洗衣机</option>
										<option value="音响">音响</option>
										<option value="热水器">热水器</option>
										<option value="家电配件">家电配件</option>
										<option value="加湿器">加湿器</option>
										<option value="熨斗">熨斗</option>
										<option value="插座">插座</option>
										<option value="除湿机">除湿机</option>
										<option value="干衣机">干衣机</option>
										<option value="收音机、录音机">收音机、录音机</option>
										<option value="取暖电器">取暖电器</option>
										<option value="其他生活电器">其他生活电器</option>
										<option value="电饭煲">电饭煲</option>
										<option value="豆浆机">豆浆机</option>
										<option value="面包机">面包机</option>
										<option value="咖啡机">咖啡机</option>
										<option value="榨汁机">榨汁机</option>
										<option value="电烤箱">电烤箱</option>
										<option value="电磁炉">电磁炉</option>
										<option value="煮蛋器">煮蛋器</option>
										<option value="酸奶机">酸奶机</option>
										<option value="热水壶">热水壶</option>
										<option value="锅">锅</option>
										<option value="其他厨房电器">其他厨房电器</option>
										<option value="剃须刀">剃须刀</option>
										<option value="脱毛器">脱毛器</option>
										<option value="电吹风">电吹风</option>
										<option value="卷、直发器">卷、直发器</option>
										<option value="足浴盆">足浴盆</option>
										<option value="其他健康电器">其他健康电器</option>
										<option value="电动工具">电动工具</option>
										<option value="手动工具">手动工具</option>
										<option value="仪器仪表">仪器仪表</option>
										<option value="插座">插座</option>
										<option value="其他五金家装">其他五金家装</option>
										<option value="电池、移动电源">电池、移动电源</option>
										<option value="蓝牙耳机">蓝牙耳机</option>
										<option value="数据线">数据线</option>
										<option value="耳机">耳机</option>
										<option value="手机支架">手机支架</option>
										<option value="贴膜">贴膜</option>
										<option value="保护套">保护套</option>
										<option value="配件">配件</option>
										<option value="音响">音响</option>
										<option value="手机饰品">手机饰品</option>
										<option value="其他手机配件">其他手机配件</option>
										<option value="数码相机">数码相机</option>
										<option value="单电、微单相机">单电、微单相机</option>
										<option value="单反相机">单反相机</option>
										<option value="拍立得">拍立得</option>
										<option value="摄像机">摄像机</option>
										<option value="镜头">镜头</option>
										<option value="户外器材">户外器材</option>
										<option value="影棚器材">影棚器材</option>
										<option value="冲印服务">冲印服务</option>
										<option value="存储卡">存储卡</option>
										<option value="读卡器">读卡器</option>
										<option value="支架">支架</option>
										<option value="滤镜">滤镜</option>
										<option value="自拍神器">自拍神器</option>
										<option value="三脚架">三脚架</option>
										<option value="相机包">相机包</option>
										<option value="其他配件">其他配件</option>
										<option value="耳机">耳机</option>
										<option value="音响">音响</option>
										<option value="收音机">收音机</option>
										<option value="麦克风">麦克风</option>
										<option value="MP3、MP4">MP3、MP4</option>
										<option value="录音笔">录音笔</option>
										<option value="其他">其他</option>
										<option value="智能手环">智能手环</option>
										<option value="智能手表">智能手表</option>
										<option value="其他配件">其他配件</option>
										<option value="笔记本">笔记本</option>
										<option value="超极本">超极本</option>
										<option value="游戏本">游戏本</option>
										<option value="平板电脑">平板电脑</option>
										<option value="平板电脑配件">平板电脑配件</option>
										<option value="台式机">台式机</option>
										<option value="一体机">一体机</option>
										<option value="CPU">CPU</option>
										<option value="主板">主板</option>
										<option value="显卡">显卡</option>
										<option value="硬盘">硬盘</option>
										<option value="SSD固态硬盘">SSD固态硬盘</option>
										<option value="内存">内存</option>
										<option value="机箱">机箱</option>
										<option value="电源">电源</option>
										<option value="显示器">显示器</option>
										<option value="光驱、刻录机">光驱、刻录机</option>
										<option value="声卡">声卡</option>
										<option value="散热器">散热器</option>
										<option value="装机配件">装机配件</option>
										<option value="鼠标">鼠标</option>
										<option value="键盘">键盘</option>
										<option value="U盘">U盘</option>
										<option value="移动硬盘">移动硬盘</option>
										<option value="鼠标垫">鼠标垫</option>
										<option value="摄像头">摄像头</option>
										<option value="电玩">电玩</option>
										<option value="手写板">手写板</option>
										<option value="电脑工具">电脑工具</option>
										<option value="游戏机">游戏机</option>
										<option value="游戏耳麦">游戏耳麦</option>
										<option value="手柄、方向盘">手柄、方向盘</option>
										<option value="游戏软件">游戏软件</option>
										<option value="游戏周边">游戏周边</option>
										<option value="其他游戏设备">其他游戏设备</option>
										<option value="路由器">路由器</option>
										<option value="网卡">网卡</option>
										<option value="交换机">交换机</option>
										<option value="打印机">打印机</option>
										<option value="点钞机">点钞机</option>
										<option value="纸类">纸类</option>
										<option value="办公文具">办公文具</option>
										<option value="计算器">计算器</option>
										<option value="笔类">笔类</option>
										<option value="画具画材">画具画材</option>
										<option value="财会用品">财会用品</option>
										<option value="其他耗材">其他耗材</option>
										<option value="烹饪锅具">烹饪锅具</option>
										<option value="刀剪菜板">刀剪菜板</option>
										<option value="茶具">茶具</option>
										<option value="台灯">台灯</option>
										<option value="LED灯">LED灯</option>
										<option value="落地灯">落地灯</option>
										<option value="应急灯">应急灯</option>
										<option value="手电">手电</option>
										<option value="其他灯具">其他灯具</option>
										<option value="收纳用品">收纳用品</option>
										<option value="雨伞雨具">雨伞雨具</option>
										<option value="遮阳伞">遮阳伞</option>
										<option value="浴室用品">浴室用品</option>
										<option value="针织用品">针织用品</option>
										<option value="清洁工具">清洁工具</option>
										<option value="宠物主粮">宠物主粮</option>
										<option value="宠物零食">宠物零食</option>
										<option value="猫砂">猫砂</option>
										<option value="洗护美容">洗护美容</option>
										<option value="出行装备">出行装备</option>
										<option value="宠物玩具">宠物玩具</option>
										<option value="宠物牵引">宠物牵引</option>
										<option value="宠物驱虫">宠物驱虫</option>
										<option value="男装">男装</option>
										<option value="女装">女装</option>
										<option value="丝巾、围巾、披肩">丝巾、围巾、披肩</option>
										<option value="腰带">腰带</option>
										<option value="围巾">围巾</option>
										<option value="帽子">帽子</option>
										<option value="手套">手套</option>
										<option value="太阳镜">太阳镜</option>
										<option value="游泳镜">游泳镜</option>
										<option value="遮阳伞">遮阳伞</option>
										<option value="清洁">清洁</option>
										<option value="护肤">护肤</option>
										<option value="面膜">面膜</option>
										<option value="剃须">剃须</option>
										<option value="套装">套装</option>
										<option value="洗发">洗发</option>
										<option value="护发">护发</option>
										<option value="造型">造型</option>
										<option value="假发">假发</option>
										<option value="套装">套装</option>
										<option value="香水">香水</option>
										<option value="底妆">底妆</option>
										<option value="腮红">腮红</option>
										<option value="眼部">眼部</option>
										<option value="唇部">唇部</option>
										<option value="美甲">美甲</option>
										<option value="美甲工具">美甲工具</option>
										<option value="套装">套装</option>
										<option value="女鞋">女鞋</option>
										<option value="男鞋">男鞋</option>
										<option value="女包">女包</option>
										<option value="男包">男包</option>
										<option value="功能箱包">功能箱包</option>
										<option value="山地车">山地车</option>
										<option value="公路车">公路车</option>
										<option value="电动车">电动车</option>
										<option value="平衡车">平衡车</option>
										<option value="乒乓球">乒乓球</option>
										<option value="羽毛球">羽毛球</option>
										<option value="篮球">篮球</option>
										<option value="足球">足球</option>
										<option value="轮滑滑板">轮滑滑板</option>
										<option value="网球">网球</option>
										<option value="高尔夫">高尔夫</option>
										<option value="台球">台球</option>
										<option value="排球">排球</option>
										<option value="钓鱼">钓鱼</option>
										<option value="游泳镜">游泳镜</option>
										<option value="音像制品">音像制品</option>
										<option value="啊篮球啊">啊篮球啊</option>
									</select>
								</div>
								<div class="um-right-publish-content">
									<span class="um-right-publish-title">价格</span> 
									<input id="goodsPrice" type="text" class="um-right-publish-price">
								</div>
								<div class="um-right-publish-content">
									<span class="um-right-publish-title">新旧</span> 
									<input type="radio" name="new_old">全新 &nbsp;&nbsp; 
									<input type="radio" name="new_old">非全新
								</div>
								<div class="um-right-publish-content">
									<span class="um-right-publish-title">联系方式</span> 
									<input id="contact" type="text" class="um-right-publish-input">
								</div>
								<div class="um-right-publish-content">
									<span class="um-right-publish-title">所在地</span> 
									<input id="place" type="text" class="um-right-publish-input">
								</div>
								<div class="imgupload">
									<span class="um-right-publish-title">上传图片</span>
									<table border="0" cellspacing="1" class="fu_list">
										<thead>
											<tr>
												<td colspan="2"><b>上传文件</b></td>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td align="right" width="15%" style="line-height: 35px;">添加文件：</td>
												<td><a href="javascript:void(0);" class="files"
													id="idFile"></a> <img id="idProcess" style="display: none;"
													src="image/loading.gif" /></td>
											</tr>
											<tr>
												<td colspan="2"><table border="0" cellspacing="0">
														<thead>
															<tr>
																<td>文件路径</td>
																<td width="100"></td>
															</tr>
														</thead>
														<tbody id="idFileList">
														</tbody>
													</table></td>
											</tr>
											<tr>
												<td colspan="2" style="color: gray">温馨提示：最多可同时上传 <b
													id="idLimit"></b> 个文件，只允许上传 <b id="idExt"></b> 文件。
												</td>
											</tr>
											<tr>
												<td colspan="2" align="center" id="idMsg"><input
													type="button" value="开始上传" id="idBtnupload"
													disabled="disabled" /> &nbsp;&nbsp;&nbsp; <input
													type="button" value="全部取消" id="idBtndel"
													disabled="disabled" /></td>
											</tr>
										</tbody>
									</table>
								</div>
								<div class="imgupload">
									<span class="um-right-publish-title">商品描述</span>
									<div class="goodsdescription">
										<textarea id="testArear" name="textfield3" cols="75" rows="8">1. 使用时长：
2. 新旧程度描述：
3. 存在的问题：
4. 到手时间/有效期/适用条件： </textarea>
									</div>
								</div>
								<div class="um-right-publish-content">
									<input type="submit" class="publish-btn" value="input"/>
									<!-- <button id="btn1" class="publish-btn" onclick="return sendJson1();">提交</button> -->
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="partofpage/foot.jsp"%>

	<script type="text/javascript">
		var isIE = (document.all) ? true : false;

		var $ = function(id) {
			return "string" == typeof id ? document.getElementById(id) : id;
		};

		var Class = {
			create : function() {
				return function() {
					this.initialize.apply(this, arguments);
				}
			}
		}

		var Extend = function(destination, source) {
			for ( var property in source) {
				destination[property] = source[property];
			}
		}

		var Bind = function(object, fun) {
			return function() {
				return fun.apply(object, arguments);
			}
		}

		var Each = function(list, fun) {
			for (var i = 0, len = list.length; i < len; i++) {
				fun(list[i], i);
			}
		};

		//文件上传类
		var FileUpload = Class.create();
		FileUpload.prototype = {
			//表单对象，文件控件存放空间
			initialize : function(form, folder, options) {

				this.Form = $(form);//表单
				this.Folder = $(folder);//文件控件存放空间
				this.Files = [];//文件集合

				this.SetOptions(options);

				this.FileName = this.options.FileName;
				this._FrameName = this.options.FrameName;
				this.Limit = this.options.Limit;
				this.Distinct = !!this.options.Distinct;
				this.ExtIn = this.options.ExtIn;
				this.ExtOut = this.options.ExtOut;

				this.onIniFile = this.options.onIniFile;
				this.onEmpty = this.options.onEmpty;
				this.onNotExtIn = this.options.onNotExtIn;
				this.onExtOut = this.options.onExtOut;
				this.onLimite = this.options.onLimite;
				this.onSame = this.options.onSame;
				this.onFail = this.options.onFail;
				this.onIni = this.options.onIni;

				if (!this._FrameName) {
					//为每个实例创建不同的iframe
					this._FrameName = "uploadFrame_"
							+ Math.floor(Math.random() * 1000);
					//ie不能修改iframe的name
					var oFrame = isIE ? document
							.createElement("<iframe name=\"" + this._FrameName + "\">")
							: document.createElement("iframe");
					//为ff设置name
					oFrame.name = this._FrameName;
					oFrame.style.display = "none";
					//在ie文档未加载完用appendChild会报错
					document.body.insertBefore(oFrame,
							document.body.childNodes[0]);
				}

				//设置form属性，关键是target要指向iframe
				this.Form.target = this._FrameName;
				this.Form.method = "post";
				//注意ie的form没有enctype属性，要用encoding
				this.Form.encoding = "multipart/form-data";

				//整理一次
				this.Ini();
			},
			//设置默认属性
			SetOptions : function(options) {
				this.options = {//默认值
					FileName : "filename",//文件上传控件的name，配合后台使用
					FrameName : "",//iframe的name，要自定义iframe的话这里设置name
					onIniFile : function() {
					},//整理文件时执行(其中参数是file对象)
					onEmpty : function() {
					},//文件空值时执行
					Limit : 10,//文件数限制，0为不限制
					onLimite : function() {
					},//超过文件数限制时执行
					Distinct : true,//是否不允许相同文件
					onSame : function() {
					},//有相同文件时执行
					ExtIn : [ "gif", "jpg", "rar", "zip", "iso", "swf" ],//允许后缀名
					onNotExtIn : function() {
					},//不是允许后缀名时执行
					ExtOut : [],//禁止后缀名，当设置了ExtIn则ExtOut无效
					onExtOut : function() {
					},//是禁止后缀名时执行
					onFail : function() {
					},//文件不通过检测时执行(其中参数是file对象)
					onIni : function() {
					}//重置时执行
				};
				Extend(this.options, options || {});
			},
			//整理空间
			Ini : function() {
				//整理文件集合
				this.Files = [];
				//整理文件空间，把有值的file放入文件集合
				Each(this.Folder.getElementsByTagName("input"), Bind(this,
						function(o) {
							if (o.type == "file") {
								o.value && this.Files.push(o);
								this.onIniFile(o);
							}
						}))
				//插入一个新的file
				var file = document.createElement("input");
				file.name = this.FileName;
				file.type = "file";
				file.onchange = Bind(this, function() {
					this.Check(file);
					this.Ini();
				});
				this.Folder.appendChild(file);
				//执行附加程序
				this.onIni();
			},
			//检测file对象
			Check : function(file) {
				//检测变量
				var bCheck = true;
				//空值、文件数限制、后缀名、相同文件检测
				if (!file.value) {
					bCheck = false;
					this.onEmpty();
				} else if (this.Limit && this.Files.length >= this.Limit) {
					bCheck = false;
					this.onLimite();
				} else if (!!this.ExtIn.length
						&& !RegExp("\.(" + this.ExtIn.join("|") + ")$", "i")
								.test(file.value)) {
					//检测是否允许后缀名
					bCheck = false;
					this.onNotExtIn();
				} else if (!!this.ExtOut.length
						&& RegExp("\.(" + this.ExtOut.join("|") + ")$", "i")
								.test(file.value)) {
					//检测是否禁止后缀名
					bCheck = false;
					this.onExtOut();
				} else if (!!this.Distinct) {
					Each(this.Files, function(o) {
						if (o.value == file.value) {
							bCheck = false;
						}
					})
					if (!bCheck) {
						this.onSame();
					}
				}
				//没有通过检测
				!bCheck && this.onFail(file);
			},
			//删除指定file
			Delete : function(file) {
				//移除指定file
				this.Folder.removeChild(file);
				this.Ini();
			},
			//删除全部file
			Clear : function() {
				//清空文件空间
				Each(this.Files, Bind(this, function(o) {
					this.Folder.removeChild(o);
				}));
				this.Ini();
			}
		}

		var fu = new FileUpload(
				"uploadForm",
				"idFile",
				{
					onIniFile : function(file) {
						file.value ? file.style.display = "none" : this.Folder
								.removeChild(file);
					},
					onEmpty : function() {
						alert("请选择一个文件");
					},
					onLimite : function() {
						alert("超过上传限制");
					},
					onSame : function() {
						alert("已经有相同文件");
					},
					onNotExtIn : function() {
						alert("只允许上传" + this.ExtIn.join("，") + "文件");
					},
					onFail : function(file) {
						this.Folder.removeChild(file);
					},
					onIni : function() {
						//显示文件列表
						var arrRows = [];
						if (this.Files.length) {
							var oThis = this;
							Each(this.Files, function(o) {
								var a = document.createElement("a");
								a.innerHTML = "取消";
								a.href = "javascript:void(0);";
								a.onclick = function() {
									oThis.Delete(o);
									return false;
								};
								arrRows.push([ o.value, a ]);
							});
						} else {
							arrRows.push([ "<font color='gray'>没有添加文件</font>",
									"&nbsp;" ]);
						}
						AddList(arrRows);
						//设置按钮
						$("idBtnupload").disabled = $("idBtndel").disabled = this.Files.length <= 0;
					}
				});

		$("idBtnupload").onclick = function() {
			//显示文件列表
			var arrRows = [];
			Each(fu.Files, function(o) {
				arrRows.push([ o.value, "&nbsp;" ]);
			});
			AddList(arrRows);

			fu.Folder.style.display = "none";
			$("idProcess").style.display = "";
			$("idMsg").innerHTML = "正在添加文件到您的网盘中，请稍候……<br />有可能因为网络问题，出现程序长时间无响应，请点击“<a href='?'><font color='red'>取消</font></a>”重新上传文件";

			fu.Form.submit();
		}

		//用来添加文件列表的函数
		function AddList(rows) {
			//根据数组来添加列表
			var FileList = $("idFileList"), oFragment = document
					.createDocumentFragment();
			//用文档碎片保存列表
			Each(rows, function(cells) {
				var row = document.createElement("tr");
				Each(cells, function(o) {
					var cell = document.createElement("td");
					if (typeof o == "string") {
						cell.innerHTML = o;
					} else {
						cell.appendChild(o);
					}
					row.appendChild(cell);
				});
				oFragment.appendChild(row);
			})
			//ie的table不支持innerHTML所以这样清空table
			while (FileList.hasChildNodes()) {
				FileList.removeChild(FileList.firstChild);
			}
			FileList.appendChild(oFragment);
		}

		$("idLimit").innerHTML = fu.Limit;

		$("idExt").innerHTML = fu.ExtIn.join("，");

		$("idBtndel").onclick = function() {
			fu.Clear();
		}

		//在后台通过window.parent来访问主页面的函数
		function Finish(msg) {
			msg = msg.replace(/<br[^>]*>/ig, "\n").replace(/&nbsp;/ig, "   ");
			alert(msg);
			location.href = location.href;
		}
	</script>
</body>
</html>