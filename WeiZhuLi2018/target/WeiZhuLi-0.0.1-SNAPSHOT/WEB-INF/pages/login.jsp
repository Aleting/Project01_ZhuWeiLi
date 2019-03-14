<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/8
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()   + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="author" content="order by dede58.com"/>
    <title>LarryCMS后台登录</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- load css -->

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <!-- <link href="${pageContext.request.contextPath}/static/css/login.css" rel="stylesheet"> -->
    <link href="${pageContext.request.contextPath}/static/css/login.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/layui/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/css/login.css" media="all">
    <link rel="shortcut icon" href="<%=basePath%>/static/image/favicon.ico" type="image/x-icon" />

</head>
<body>
<form action="" method="post" class="layui-form">
    <div class="layui-canvs">
    </div>
    <div class="layui-layout layui-layout-login">
        <h1>
            <strong>助微力微商管理系统</strong>
            <em>Microbusiness Management System</em>
        </h1>
        <label for="inputEmail" class="sr-only">用户名</label>
        <input type="text" id="inputEmail" class="form-control" placeholder="用户名" name="username" required autofocus>
        <br>
        <label for="inputPassword" class="sr-only">密码</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="密码" name="password" required>
        <p class="bg-warning">${error}</p>
        <br>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit" onclick="return check_state()">登录</button>
        <div class="layui-login-text">
            <p>© 2018青理工助微力团队版权所有</p>
            <a href="${pageContext.request.contextPath}/home/register"><p>马上注册</p></a>


        </div>
    </div>
</form>
<script type="text/javascript" src="<%=basePath%>/static/common/layui/lay/dest/layui.all.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/login.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/jsplug/jparticle.jquery.js"></script>
<script type="text/javascript">
    $(function () {
        $(".layui-canvs").jParticle({
            background:"#141414",
            color:"#E6E6E6"
        })
    });
</script>
</body>
</html>