<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="cleartype" content="on">
<meta name="HandheldFriendly" content="True">
<meta name="MobileOptimized" content="320">
<meta name="viewport" content="width=device-width, user-scalable=no, minimal-ui">
<link rel="dns-prefetch" href="//jiefangqu.com">

<title>设置密码</title>
<link rel="stylesheet" href="../css/merchant/shopping.common.css">
</head>

<body class="bggrey">
<header class="sectionBox fantasia-header order-top-bg">
	<a class="disblock mleft15 left" href="passwordChangeStep01.html"><img class="back-arrow" src="../images/back-arrow.png" /></a>
    <div class="header-title">设置密码</div>
</header>
<section class="sectionBox password-mind-box borderbottomgrey">
    <div class="mleft15">密码由6-14位，建议数字、字母任意组成</div>
</section>
<form id="inputform" class="inputform" action="doRegister.html" onsubmit="return false;">
<input type="hidden" name="mobile" value="${param.mobile }">
<input type="hidden" name="verifyCode" value="${param.verifyCode }">
<section class="sectionBox borderbottomgrey">
    <ul class="register-list">
        <li class="borderbottomgrey"><input class="input-text password-box wp100 left" type="password" name="password" placeholder="设置密码" datatype="EnglishAndNumber6-14" nullmsg="请输入新密码！" errormsg="密码由6-14位数字或字母组成！"  /></li>
        <li><input class="input-text password-box wp100" type="password" name="password" placeholder="确认密码" name="repassword" datatype="EnglishAndNumber6-14" recheck="password" nullmsg="请再次输入密码！" errormsg="您两次输入的账号密码不一致！" /></li>
    </ul>
</section>
<section class="sectionBox bggrey">
    <div class="m010 mtop10 password-check-wrap"><div class="password-check-box show-password"></div>显示密码</div>
    <div class="m010 mtop10"><input class="btn-submit bgred" type="submit" name="submit" value="确定" /></div>
    <div class="m010 mtop10 t-center"><span class="password-check-wrap"><div class="password-check-box accept"></div>我已阅读并同意</span> <a class="red" href="http://api.jiefangqu.com:8080/API/htmlPages/purchaseInfo/index.htm">《解放区商户平台电子服务协议》</a></div>
</section>
</form>
</body>
<script src="../js/merchant/jquery-1.11.2.min.js"></script>
<script src="../js/merchant/fastclick.js"></script>
<script>
	$(function(){
		new FastClick(document.body);
	})
</script>
<script src="../js/merchant/shopping.common.js"></script>
<script src="../js/merchant/Validform_v5.3.2.js"></script>
<script src="../js/jquery.form.js"></script>
<script type="text/javascript">
	$(function(){
		var issubmited = false;
		//表单验证
		$(".inputform").Validform({
			tiptype:1,
			postonce:false,
			beforeSubmit:function(){
				if(!$('.password-check-box.accept').hasClass('on')){
					$.Showmsg('须同意《解放区商户平台电子服务协议》');
					return false;
				}
				
				$.Showmsg("请稍候…");
				
				if(issubmited){
					return false;
				}
			},
			callback:function(){
				issubmited = true;
				//验证成功，提交表单
				$("#inputform").ajaxSubmit(function(data) {
					try {
						if (data.status == '0000') {
							window.location.href = "toPage.html?page=registerStep03";
						} else {
							$.Showmsg(data.message);
							issubmited = false;
							return;
						}
					} catch (e) {
						$.Showmsg(e);
						issubmited = false;
					}
				});
			}
		});
	});
</script>
</html>