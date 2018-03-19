<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.cnfantasia.server.api.pub.header.HeaderConstant"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimal-ui">
<link rel="dns-prefetch" href="//jiefangqu.com">

<title>商品详情</title>
<link rel="stylesheet" href="../css/groupbuying.css" type="text/css">
</head>

<body>
<section id="tabBox" class="tabBox">
    <div class="hd tab-head borderbottom">
        <ul>
            <li class="wp50"><a href="javascript:void(0)">介绍</a></li>
            <li class="wp50"><a href="javascript:void(0)">参数</a></li>
        </ul>
    </div>
    <div class="bd" id="tabBox-bd">  
        <div class="con bgwhite">
            <div id="tabOne" class="p010">
               <div class="info pt10 lineheight0">
               <c:forEach var="picUrl" items="${picList}">
                    <img class="item-pic-big scrollLoading" data-url="${picserverUrl}${picUrl.urlMini}<c:choose><c:when test="${fn:contains(picUrl.urlMini, '?')}">&</c:when><c:otherwise>?</c:otherwise></c:choose>x-oss-process=image/resize,w_560/format,jpg/quality,q_80/interlace,1" style="background:url(../images/loading01.gif) no-repeat center; background-size:26px;" src="../images/pixel.gif"  />
                    <div class="img-desc-text-box">${picUrl.textDesc}</div>
               </c:forEach>
                </div>
            </div>
        </div>
        <div class="con bgwhite">
            <div id="tabTwo" class="p010">
               <div class="info pt10">
                    <table class="bordered grey">
                      <c:forEach var="paramete" items="${parameteList}">
	                      <tr>
	                        <td>${paramete.tPropName}</td>
	                        <td>${paramete.tPropValue}</td>
	                      </tr>
                      </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<div id="gotop" class="go-top dsn"><img src="../images/icon-gotop.png" /><br/>顶部</div>
<script src="../js/jquery-1.11.2.min.js"></script>
<script src="../js/fastclick.js"></script>
<script>
	$(function(){
		new FastClick(document.body);
	})
</script>

<script src="../js/groupBuy.common.js"></script>
<script src="../js/TouchSlide.1.1.js"></script>

<script src="../js/jquery.scrollLoading.js"></script>
<script src="../js/imgPreloading.js"></script>
<script>
	TouchSlide( { slideCell:"#tabBox",
		endFun:function(i){ //高度自适应
			var bd = document.getElementById("tabBox-bd");
			bd.parentNode.style.height = bd.children[i].children[0].offsetHeight+"px";
			if(i>0)bd.parentNode.style.transition="100ms";//添加动画效果
		}
	});
</script>

</body>
</html>