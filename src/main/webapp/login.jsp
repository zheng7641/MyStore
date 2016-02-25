<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<link href="style/register.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="nc-login-layout">
	<div class="nc-login">
		<div class="nc-login-title">
			<h3>用户登陆</h3>
		</div>
		<div class="nc-login-content">
			<form id="register_form" method="post" action="#">
				<dl>
					<dt>用户名</dt>
					<dd style="min-height:54px;">
					<input type="text" id="user_name" name="user_name" class="text tip" title="3-20位字符，可由中文、英文、数字及“_”、“-”组成" />
					<label></label></dd>
				</dl>
				<dl>
					<dt>设置密码</dt>
					<dd style="min-height:54px;">
					<input type="password" id="password" name="password" class="text tip" title="6-16位字符，可由英文、数字及标点符号组成" />
					<label></label></dd>
				</dl>
				<dl>
					<dt>确认密码</dt>
					<dd style="min-height:54px;">
					<input type="password" id="password_confirm" name="password_confirm" class="text tip" title="请再次输入您的密码" />
					<label></label></dd>
				</dl>
				<dl>
					<dt>&nbsp;</dt>
					<dd>
					<input type="submit" name="Submit" value="" class="submit fl" title="立即注册" style="background:url('image/login.png') no-repeat;" />
				</dl>
				<input type="hidden" value name="ref_url">
				<input name="nchash" type="hidden" value="206f94ec" />
			</form>
			<div class="clear">
			</div>
		</div>
		<div class="nc-login-bottom">
		</div>
	</div>
</div>
<script type="text/javascript" src="js/jquery.poshytip.min.js" charset="utf-8"></script>
<script>
//注册表单提示
$('.tip').poshytip({
	className: 'tip-yellowsimple',
	showOn: 'focus',
	alignTo: 'target',
	alignX: 'center',
	alignY: 'top',
	offsetX: 0,
	offsetY: 5,
	allowTipHover: false
});

//注册表单验证
$(function(){
		jQuery.validator.addMethod("lettersonly", function(value, element) {
			return this.optional(element) || /^[^:%,'\*\"\s\<\>\&]+$/i.test(value);
		}, "Letters only please"); 
		jQuery.validator.addMethod("lettersmin", function(value, element) {
			return this.optional(element) || ($.trim(value.replace(/[^\u0000-\u00ff]/g,"aa")).length>=3);
		}, "Letters min please"); 
		jQuery.validator.addMethod("lettersmax", function(value, element) {
			return this.optional(element) || ($.trim(value.replace(/[^\u0000-\u00ff]/g,"aa")).length<=15);
		}, "Letters max please");
    $("#register_form").validate({
        errorPlacement: function(error, element){
            var error_td = element.parent('dd');
            error_td.find('label').hide();
            error_td.append(error);
        },
        submitHandler:function(form){
            ajaxpost('register_form', '', '', 'onerror') 
        },
        rules : {
            user_name : {
                required : true,
                lettersmin : true,
                lettersmax : true,
                lettersonly : true,
                remote   : {
                    url :'index.php?act=login&op=check_member&column=ok',
                    type:'get',
                    data:{
                        user_name : function(){
                            return $('#user_name').val();
                        }
                    }
                }
            },
            password : {
                required : true,
                minlength: 6,
				maxlength: 20
            },
            password_confirm : {
                required : true,
                equalTo  : '#password'
            },
            email : {
                required : true,
                email    : true,
                remote   : {
                    url : 'index.php?act=login&op=check_email',
                    type: 'get',
                    data:{
                        email : function(){
                            return $('#email').val();
                        }
                    }
                }
            },
			            captcha : {
                required : true,
                minlength: 4,
                remote   : {
                    url : 'index.php?act=seccode&op=check&nchash=206f94ec',
                    type: 'get',
                    data:{
                        captcha : function(){
                            return $('#captcha').val();
                        }
                    }
                }
            },
			            agree : {
                required : true
            }
        },
        messages : {
            user_name : {
                required : '用户名不能为空',
                lettersmin : '用户名必须在3-15个字符之间',
                lettersmax : '用户名必须在3-15个字符之间',
				lettersonly: '用户名不能包含敏感字符',
				remote	 : '该用户名已经存在'
            },
            password  : {
                required : '密码不能为空',
                minlength: '密码长度应在6-20个字符之间',
				maxlength: '密码长度应在6-20个字符之间'
            },
            password_confirm : {
                required : '请再次输入您的密码',
                equalTo  : '两次输入的密码不一致'
            },
            email : {
                required : '电子邮箱不能为空',
                email    : '这不是一个有效的电子邮箱',
				remote	 : '该电子邮箱已经存在'
            },
			            captcha : {
                required : '请输入验证码',
                minlength: '验证码不正确',
				remote	 : '验证码不正确'
            },
			            agree : {
                required : '请阅读并同意该协议'
            }
        }
    });
});
</script>
</body>
</html>