<%@page import="com.cnfantasia.server.common.utils.StringUtils"%>
<%@page import="com.cnfantasia.server.common.json.JsonResponse"%>
<%@page import="com.cnfantasia.server.common.exception.FocRuntimeException"%>
<%@page import="com.cnfantasia.server.common.exception.FocException"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset = "UTF-8">
<meta name="viewport" content="width=device-width; initial-scale=1.0">
<title><%=request.getAttribute("title") %></title>
<link href="<%=basePath%>/htmlPages/notice/css/main.css?v=1.0.1" rel="stylesheet" type="../text/css">
</head>
<body>

<header>
	<h1><%=request.getAttribute("title") %></h1>
	<p><%=request.getAttribute("time") %> 解放区</p>
</header>
<%
if(!StringUtils.isEmpty(request.getAttribute("picUrl"))){
	%>
	<section>
		<figure><img src="<%=request.getAttribute("picUrl") %>" /></figure>
	</section>
	<%
}
%>
<section>
	<p><%=request.getAttribute("content") %>
</section>

<footer>
	<p>Copyright <span>&copy;</span> 2014 深圳前海邻里乐科技服务有限公司 <br />All rights reserved.</p>
</footer>

</body>
</html> 