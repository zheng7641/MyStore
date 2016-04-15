<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script>
	function sendJson1() {
		$.post('JsonController/get.do',{
			name:$('#tb_name').val(),
			password:$('#tb_password').val()
			}, 
			function(data, status) {
			alert("Data: " + data + "\nStatus: " + status);
			var obj = eval('(' + data + ')'); 
			alert(obj[0].a);
		});
	};
</script>


</head>
<body>
		<input type="text" name="name" id="tb_name" /> 
		<input type="text" name="password" id="tb_password" />
		<button id="btn1" onclick="return sendJson1();">send</button>
</body>
</html>