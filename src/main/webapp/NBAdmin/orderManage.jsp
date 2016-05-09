<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>二货后台</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.4.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery-easyui-1.4.5/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.4.5/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript">
	

	function searchOrder(){
		$("#dg").datagrid('load',{
			"s_order.orderNo":$("#s_orderNo").val(),
			"s_order.user.userName":$("#s_userName").val()
		});
	}
	
	function formatUserId(val,row){
		return row.user.id;
	}
	
	function formatUserName(val,row){
		return row.user.userName;
	}
	
	function formatStatus(val,row){
		if(val==1){
			return "待审核";
		}else if(val==2){
			return "审核通过";
		}else if(val==3){
			return "卖家已发货";
		}else if(val==4){
			return "交易已完成";
		}
		return "";
	}
	
	function formatProPic(val,row){
		return "<img width=100 height=100 src='${pageContext.request.contextPath}/"+val+"'>";
	}
	
	
	function openOrderDetailDialog(){
		var selectedRows=$("#dg").datagrid('getSelections');
		if(selectedRows.length!=1){
			$.messager.alert("系统提示","请选择一条要查看的数据！");
			return;
		}
		var row=selectedRows[0];
		$("#dg2").datagrid('load',{
			"id":row.id
		});
		$("#orderNo").val(row.orderNo);
		$("#user").val(row.user.userName+"(ID:"+row.user.id+")");
		$("#cost").val(row.cost+"(元)");
		var v=row.status;
		if(v==1){
			$("#status").val("待审核");
		}else if(v==2){
			$("#status").val("审核通过");
		}else if(v==3){
			$("#status").val("卖家已发货");
		}else if(v==4){
			$("#status").val("交易已完成");
		}
		$("#dlg").dialog("open").dialog("setTitle","订单详情");
	}
	
	function closeOrderDetailDialog(){
		$("#dlg").dialog("close");
	}
	
	function modifyOrderStatus(status){
		var selectedRows=$("#dg").datagrid('getSelections');
		if(selectedRows.length==0){
			$.messager.alert("系统提示","请选择要处理的数据！");
			return;
		}
		var orderNosStr=[];
		for(var i=0;i<selectedRows.length;i++){
			orderNosStr.push(selectedRows[i].orderNo);
		}
		var orderNos=orderNosStr.join(",");
		$.messager.confirm("系统提示","您确认要处理这<font color=red>"+selectedRows.length+"</font>条数据吗？",function(r){
			if(r){
				$.post("order_modifyOrderStatus.action",{orderNos:orderNos,status:status},function(result){
					if(result.success){
						$.messager.alert("系统提示","数据已成功处理！");
						$("#dg").datagrid("reload");
					}else{
						$.messager.alert("系统提示","数据处理失败！");
					}
				},"json");
			}
		});
	}

</script>
</head>
<body style="margin:1px;">
	<table id="dg" title="订单管理" class="easyui-datagrid"
	 fitColumns="true" pagination="true" rownumbers="true"
	 url="../order/getOrderList.do" fit="true" toolbar="#tb">
	 <thead>
	 	<tr>
	 		<th field="cb" checkbox="true" align="center"></th>
	 		<th field="orderId" width="50" align="center">编号</th>
	 		<th field="goodsName" width="100" align="center">商品名</th>
	 		<th field="userId" width="50" align="center">订单人ID</th>
	 		<th field="nickName" width="100" align="center">订单人用户名</th>
	 		<th field="price" width="50" align="center">总金额</th>
	 	</tr>
	 </thead>
	</table>
</body>
</html>