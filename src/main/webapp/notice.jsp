<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货 - 嘉人的二手市场</title>
<link href="style/css.css" rel="stylesheet" type="text/css" />
<link href="style/notice.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- 头部标题栏和搜索框和导航标题 -->
	<%@ include file="partofpage/head.jsp"%>
	<div id="content_wapper">
		<div class="content">
			<div class="noticetitle">
				<h1>${notice.noticeTitle }</h1>
			</div>
			<div class="noticecontent">
				${notice.content }
			</div>
		</div>
	</div>
	<%@ include file="partofpage/foot.jsp"%>
</body>
</html>